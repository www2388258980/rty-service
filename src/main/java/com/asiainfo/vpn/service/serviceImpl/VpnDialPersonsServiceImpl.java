package com.asiainfo.vpn.service.serviceImpl;

import com.asiainfo.vpn.bean.SequenceValueItem;
import com.asiainfo.vpn.bean.VpnDialPersons;
import com.asiainfo.vpn.bean.VpnDialPersonsHis;
import com.asiainfo.vpn.mapper.SequenceValueItemMapper;
import com.asiainfo.vpn.mapper.VpnDialPersonsHisMapper;
import com.asiainfo.vpn.mapper.VpnDialPersonsMapper;
import com.asiainfo.vpn.service.IVpnDialPersonsService;
import com.asiainfo.vpn.utils.OperationResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class VpnDialPersonsServiceImpl implements IVpnDialPersonsService {
    @Autowired
    private SequenceValueItemMapper sequenceValueItemMapper;

    @Autowired
    private VpnDialPersonsMapper vpnDialPersonsMapper;

    @Autowired
    private VpnDialPersonsHisMapper vpnDialPersonsHisMapper;


    @Override
    public OperationResult<Boolean> insert(VpnDialPersons persons) throws Exception {
        // 先拿到主键
        SequenceValueItem seq = sequenceValueItemMapper.selectByPrimaryKey("VpnDialPersons");
        persons.setDialPersonId(seq.getSeqId() + "");
        // 向VPN_DIAL_PERSONS插入数据
        vpnDialPersonsMapper.insert(persons);
        // 更新主键
        SequenceValueItem seq2 = new SequenceValueItem();
        seq2.setSeqName("VpnDialPersons");
        seq2.setSeqId(seq.getSeqId() + 1);
        Date date = new Date();
        seq2.setLastUpdatedStamp(date);
        sequenceValueItemMapper.updateByPrimaryKeySelective(seq2);

        /* 向其历史表插入一条数据
         * 先复制一遍persons属性
         * 由于是插入,所有old系列字段为空
         */
        // 先拿到历史表对应的主键
        SequenceValueItem seq3 = sequenceValueItemMapper.selectByPrimaryKey("VpnDialPersonsHistory");
        VpnDialPersonsHis his = new VpnDialPersonsHis();
        his.setHistoryId(seq3.getSeqId() + "");
        his.setDialPersonId(seq.getSeqId() + "");
        his.setFirstName(persons.getFirstName());
        his.setFirstChar(persons.getFirstChar());
        his.setTelecomNumber(persons.getTelecomNumber());
        his.setStatus(persons.getStatus());
        his.setDescription(persons.getDescription());
        his.setDepartmentId(persons.getDepartmentId());
        his.setCreatedBy(persons.getCreatedBy());
        his.setBillId(persons.getBillId());
        his.setOpType(persons.getOpType());
        his.setEffectiveDate(persons.getEffectiveDate());
        his.setCreatedStamp(persons.getCreatedStamp());
        his.setLastUpdatedStamp(persons.getLastUpdatedStamp());
        // 插入历史表
        vpnDialPersonsHisMapper.insert(his);
        // 更新历史主键表
        SequenceValueItem seq4 = new SequenceValueItem();
        seq4.setSeqName("VpnDialPersonsHistory");
        seq4.setSeqId(seq.getSeqId() + 1);
        seq4.setLastUpdatedStamp(date);
        sequenceValueItemMapper.updateByPrimaryKeySelective(seq4);

        OperationResult<Boolean> or = new OperationResult<>();
        or.setStatus(OperationResult.STATUS_SUCCESS);
        or.setData(true);

        return or;
    }
}
