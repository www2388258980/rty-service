package com.asiainfo.vpn.service.serviceImpl;

import com.asiainfo.vpn.service.IVpnDialRecordService;
import com.asiainfo.vpn.utils.OperationResult;
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
//        SequenceValueItem sequenceValueItem = new SequenceValueItem();
//        sequenceValueItem.setSeqId(new Integer(id + 1));
//        sequenceValueItemMapper.updateByExample();

        OperationResult<Boolean> or = new OperationResult<>();
        or.setStatus(OperationResult.STATUS_SUCCESS);
        or.setData(true);
        or.setMessage("插入成功!");

        return or;
    }
}
