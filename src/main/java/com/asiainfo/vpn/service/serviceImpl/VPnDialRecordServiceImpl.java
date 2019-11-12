package com.asiainfo.vpn.service.serviceImpl;

import com.asiainfo.vpn.bean.SequenceValueItem;
import com.asiainfo.vpn.bean.VpnDialRecord;
import com.asiainfo.vpn.bean.extend.VpnDialRecordExtend;
import com.asiainfo.vpn.mapper.SequenceValueItemMapper;
import com.asiainfo.vpn.mapper.VpnDialRecordMapper;
import com.asiainfo.vpn.mapper.extend.VpnDialRecordExtendMapper;
import com.asiainfo.vpn.service.IVpnDialRecordService;
import com.asiainfo.vpn.utils.OperationResult;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class VPnDialRecordServiceImpl implements IVpnDialRecordService {

    @Autowired
    private SequenceValueItemMapper sequenceValueItemMapper;

    @Autowired
    private VpnDialRecordMapper vpnDialRecordMapper;

    @Autowired
    private VpnDialRecordExtendMapper vpnDialRecordExtendMapper;

    @Override
    public OperationResult<Boolean> insertRecord(VpnDialRecord record) throws Exception {
        // 找出主键
        SequenceValueItem seq = sequenceValueItemMapper.selectByPrimaryKey("VpnDialRecord");
        Integer id = seq.getSeqId();
        System.out.println("id: " + id.toString());
        record.setVpnDialRecordId(id.toString());
        Date d = new Date();
        record.setCreatedDate(d);
        record.setCreatedStamp(d);
        record.setLastUpdatedStamp(d);

        vpnDialRecordMapper.insert(record);

        // 更新主键
        SequenceValueItem sequenceValueItem = new SequenceValueItem();
        sequenceValueItem.setSeqName("VpnDialRecord");
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
    public OperationResult<List<VpnDialRecordExtend>> getVpnDialRecord(VpnDialRecord record, Date startDate, Date endDate,
                                                                       int size, int pageSize) throws Exception {

//        VpnDialRecordExample example = new VpnDialRecordExample();
//        VpnDialRecordExample.Criteria criteria = example.createCriteria();
//        if (!StringUtil.isEmpty(record.getFirstName())) {
//            criteria.andFirstNameEqualTo(record.getFirstName());
//        }
//        if (startDate != null) {
//            criteria.andLastUpdatedStampGreaterThanOrEqualTo(startDate);
//        }
//        if (endDate != null) {
//            criteria.andLastUpdatedStampLessThanOrEqualTo(endDate);
//        }


        PageHelper.startPage(size, pageSize);
//        List<VpnDialRecord> records = vpnDialRecordMapper.selectByExample(example);
        List<VpnDialRecordExtend> records = vpnDialRecordExtendMapper.selectVpnDialRecordsWithExtra(record, startDate, endDate);
        PageInfo<VpnDialRecordExtend> info = new PageInfo<>(records);

        OperationResult<List<VpnDialRecordExtend>> or = new OperationResult<>();
        or.setStatus(OperationResult.STATUS_SUCCESS);
        or.setData(records);
        or.setTotal(info.getTotal());
        or.setMessage("查询成功.");

        return or;
    }
}
