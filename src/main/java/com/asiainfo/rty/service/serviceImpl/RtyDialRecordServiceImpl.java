package com.asiainfo.rty.service.serviceImpl;

import com.asiainfo.rty.bean.RtyDialRecord;
import com.asiainfo.rty.bean.SequenceValueItem;
import com.asiainfo.rty.bean.extend.RtyDialRecordExtend;
import com.asiainfo.rty.mapper.RtyDialRecordMapper;
import com.asiainfo.rty.mapper.SequenceValueItemMapper;
import com.asiainfo.rty.mapper.extend.RtyDialRecordExtendMapper;
import com.asiainfo.rty.service.IRtyDialRecordService;
import com.asiainfo.rty.utils.OperationResult;
import com.asiainfo.rty.utils.StringUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class RtyDialRecordServiceImpl implements IRtyDialRecordService {

    @Autowired
    private SequenceValueItemMapper sequenceValueItemMapper;

    @Autowired
    private RtyDialRecordMapper rtyDialRecordMapper;

    @Autowired
    private RtyDialRecordExtendMapper rtyDialRecordExtendMapper;

    @Override
    public OperationResult<Boolean> insertRecord(RtyDialRecord record) throws Exception {
        // 找出主键
        SequenceValueItem seq = sequenceValueItemMapper.selectByPrimaryKey("RtyDialRecord");
        Integer id = seq.getSeqId();
        System.out.println("id: " + id.toString());
        record.setVpnDialRecordId(id.toString());
        Date d = new Date();
        record.setCreatedDate(d);
        record.setCreatedStamp(d);
        record.setLastUpdatedStamp(d);

        rtyDialRecordMapper.insert(record);

        // 更新主键
        SequenceValueItem sequenceValueItem = new SequenceValueItem();
        sequenceValueItem.setSeqName("RtyDialRecord");
        sequenceValueItem.setLastUpdatedStamp(d);
        sequenceValueItem.setSeqId(id + 1);
        sequenceValueItemMapper.updateByPrimaryKeySelective(sequenceValueItem);

        OperationResult<Boolean> or = new OperationResult<>();
        or.setStatus(OperationResult.STATUS_SUCCESS);
        or.setData(true);
        or.setMessage("插入成功!");

        return or;
    }


    @Override
    public OperationResult<List<RtyDialRecordExtend>> getRtyDialRecord(RtyDialRecord record, Date startDate, Date endDate,
                                                                       int size, int pageSize) throws Exception {

        PageHelper.startPage(size, pageSize);
//        List<RtyDialRecord> records = rtyDialRecordMapper.selectByExample(example);
        List<RtyDialRecordExtend> records = rtyDialRecordExtendMapper.selectVpnDialRecordsWithExtra(record, startDate, endDate);
        PageInfo<RtyDialRecordExtend> info = new PageInfo<>(records);

        OperationResult<List<RtyDialRecordExtend>> or = new OperationResult<>();
        or.setStatus(OperationResult.STATUS_SUCCESS);
        or.setData(records);
        or.setTotal(info.getTotal());
        or.setMessage("查询成功.");

        return or;
    }

    @Override
    public OperationResult<Boolean> deleteDialRecordById(String id) throws Exception {
        if (StringUtil.isEmpty(id)) {
            throw new Exception("主键不能为空.");
        }
        rtyDialRecordMapper.deleteByPrimaryKey(id);

        OperationResult<Boolean> or = new OperationResult<>();
        or.setStatus(OperationResult.STATUS_FAILURE);
        or.setMessage("删除记录成功.");
        or.setData(true);
        return or;
    }
}
