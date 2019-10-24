package com.asiainfo.vpn.service.serviceImpl;

import com.asiainfo.vpn.bean.SequenceValueItem;
import com.asiainfo.vpn.bean.SequenceValueItemExample;
import com.asiainfo.vpn.bean.VpnDialRecord;
import com.asiainfo.vpn.bean.VpnDialRecordExample;
import com.asiainfo.vpn.mapper.SequenceValueItemMapper;
import com.asiainfo.vpn.mapper.VpnDialRecordMapper;
import com.asiainfo.vpn.service.IVpnDialRecordService;
import com.asiainfo.vpn.utils.OperationResult;
import com.asiainfo.vpn.utils.StringUtil;
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

    @Override
    public OperationResult<Boolean> insertRecord(VpnDialRecord record) throws Exception {
        // 找出主键
        SequenceValueItemExample example1 = new SequenceValueItemExample();
        SequenceValueItemExample.Criteria criteria = example1.createCriteria();
        criteria.andSeqNameEqualTo("VpnDialRecord");
        List<SequenceValueItem> seq = sequenceValueItemMapper.selectByExample(example1);
        Integer id = seq.get(0).getSeqId();

        record.setVpnDialRecordId(id.toString());
        Date d = new Date();
        record.setCreatedDate(d);
        record.setCreatedStamp(d);
        record.setLastUpdatedStamp(d);
        record.setLastUpdatedTxStamp(d);

        vpnDialRecordMapper.insert(record);

        // 更新主键
        SequenceValueItem sequenceValueItem = new SequenceValueItem();
        sequenceValueItem.setSeqName("VpnDialRecord");
        sequenceValueItem.setLastUpdatedStamp(d);
        sequenceValueItem.setLastUpdatedTxStamp(d);
        sequenceValueItemMapper.updateByPrimaryKey(sequenceValueItem);

        OperationResult<Boolean> or = new OperationResult<>();
        or.setStatus(OperationResult.STATUS_SUCCESS);
        or.setData(true);
        or.setMessage("插入成功!");

        return or;
    }


    @Override
    public OperationResult<List<VpnDialRecord>> getVpnDialRecord(VpnDialRecord record, Date startDate, Date endDate,
                                                                 int size, int pageSize) throws Exception {

        VpnDialRecordExample example = new VpnDialRecordExample();
        VpnDialRecordExample.Criteria criteria = example.createCriteria();
        if (!StringUtil.isEmpty(record.getFirstName())) {
            criteria.andFirstNameEqualTo(record.getFirstName());
        }
        if (startDate != null) {
            criteria.andLastUpdatedStampGreaterThanOrEqualTo(startDate);
        }
        if (endDate != null) {
            criteria.andLastUpdatedStampLessThanOrEqualTo(endDate);
        }

        PageHelper.startPage(size,pageSize);
        List<VpnDialRecord> records = vpnDialRecordMapper.selectByExample(example);
        PageInfo<VpnDialRecord> info = new PageInfo<>();

        OperationResult<List<VpnDialRecord>> or = new OperationResult<>();
        or.setStatus(OperationResult.STATUS_SUCCESS);
        or.setData(records);
        or.setTotal(info.getTotal());
        or.setMessage("查询成功.");

        return or;
    }
}
