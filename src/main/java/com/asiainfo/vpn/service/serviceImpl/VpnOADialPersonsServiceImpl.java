package com.asiainfo.vpn.service.serviceImpl;

import com.asiainfo.vpn.bean.*;
import com.asiainfo.vpn.bean.extend.VpnOADialPersonsExtend;
import com.asiainfo.vpn.bean.extend.VpnOADialPersonsHisExtend;
import com.asiainfo.vpn.mapper.SequenceValueItemMapper;
import com.asiainfo.vpn.mapper.VpnOADialPersonsHisMapper;
import com.asiainfo.vpn.mapper.VpnOADialPersonsMapper;
import com.asiainfo.vpn.mapper.extend.VpnOADialPersonsExtendMapper;
import com.asiainfo.vpn.service.IVpnOADialPersonsService;
import com.asiainfo.vpn.utils.OperationResult;
import com.asiainfo.vpn.utils.StringUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class VpnOADialPersonsServiceImpl implements IVpnOADialPersonsService {
    @Autowired
    private SequenceValueItemMapper sequenceValueItemMapper;
    @Autowired
    private VpnOADialPersonsMapper vpnOADialPersonsMapper;
    @Autowired
    private VpnOADialPersonsHisMapper vpnOADialPersonsHisMapper;
    @Autowired
    private VpnOADialPersonsExtendMapper vpnOADialPersonsExtendMapper;


    @Override
    public OperationResult<Boolean> insert(VpnOADialPersons persons) throws Exception {
        // 主键
        Integer key = getPrimaryKey("VpnOADialPersons");
        persons.setDialPersonId(key + "");

        vpnOADialPersonsMapper.insertSelective(persons);

        // 更新主键
        updatePrimaryKey("VpnOADialPersons", key);
        // 历史表也插入一条数据
        VpnOADialPersonsHis his = new VpnOADialPersonsHis();
        Integer key2 = getPrimaryKey("VpnOADialPersonsHistory");
        his.setHistoryId(key2 + "");
        his.setDialPersonId(key + "");
        swap(persons, his);

        vpnOADialPersonsHisMapper.insertSelective(his);

        // 更新历史表主键
        updatePrimaryKey("VpnOADialPersonsHistory", key2);

        OperationResult<Boolean> or = new OperationResult<>();
        or.setStatus(OperationResult.STATUS_SUCCESS);
        or.setData(true);
        or.setMessage("插入成功.");

        return or;
    }

    /**
     * 根据表名拿取对应的主键,并将其返回
     *
     * @param name
     * @return
     */
    private Integer getPrimaryKey(String name) throws Exception {
        SequenceValueItem seq = sequenceValueItemMapper.selectByPrimaryKey(name);
        return seq.getSeqId();
    }

    /**
     * 根据表名将其对应的主键+1
     *
     * @param name
     * @param id
     */
    private void updatePrimaryKey(String name, Integer id) throws Exception {
        SequenceValueItem seq = new SequenceValueItem();
        seq.setSeqName(name);
        seq.setSeqId(id + 1);
        seq.setLastUpdatedStamp(new Date());
        sequenceValueItemMapper.updateByPrimaryKeySelective(seq);
    }

    private void swap(VpnOADialPersons persons, VpnOADialPersonsHis his) {
        if (!StringUtil.isEmpty(persons.getFirstName())) {
            his.setFirstName(persons.getFirstName());
        }
        if (!StringUtil.isEmpty(persons.getTelecomNumber())) {
            his.setTelecomNumber(persons.getTelecomNumber());
        }
        if (!StringUtil.isEmpty(persons.getCountName())) {
            his.setCountName(persons.getCountName());
        }
        if (!StringUtil.isEmpty(persons.getStatus())) {
            his.setStatus(persons.getStatus());
        }
        if (!StringUtil.isEmpty(persons.getDescription())) {
            his.setDescription(persons.getDescription());
        }
        if (!StringUtil.isEmpty(persons.getFirstChar())) {
            his.setFirstChar(persons.getFirstChar());
        }
        if (!StringUtil.isEmpty(persons.getDepartmentId())) {
            his.setDepartmentId(persons.getDepartmentId());
        }
        if (!StringUtil.isEmpty(persons.getCreatedBy())) {
            his.setCreatedBy(persons.getCreatedBy());
        }
        if (!StringUtil.isEmpty(persons.getModifiedBy())) {
            his.setModifiedBy(persons.getModifiedBy());
        }
        if (!StringUtil.isEmpty(persons.getBillId())) {
            his.setBillId(persons.getBillId());
        }
        if (!StringUtil.isEmpty(persons.getModifiedBillId())) {
            his.setModifiedBillId(persons.getModifiedBillId());
        }
        if (!StringUtil.isEmpty(persons.getVpnTypeId())) {
            his.setVpnTypeId(persons.getVpnTypeId());
        }
        if (!StringUtil.isEmpty(persons.getOpType())) {
            his.setOpType(persons.getOpType());
        }
        if (persons.getLastUpdatedStamp() != null) {
            his.setLastUpdatedStamp(persons.getLastUpdatedStamp());
        }
        if (persons.getCreatedStamp() != null) {
            his.setCreatedStamp(persons.getCreatedStamp());
        }
    }


    @Override
    public OperationResult<VpnOADialPersons> getVpnOADialPersonsBykey(String id) throws Exception {
        if (StringUtil.isEmpty(id)) {
            throw new Exception("主键不可为空.");
        }
        VpnOADialPersons vpnOADialPersons = vpnOADialPersonsMapper.selectByPrimaryKey(id);

        OperationResult<VpnOADialPersons> or = new OperationResult<>();
        or.setStatus(OperationResult.STATUS_SUCCESS);
        or.setData(vpnOADialPersons);
        or.setMessage("查询成功.");

        return or;
    }

    @Override
    public OperationResult<List<VpnOADialPersonsExtend>> getVpnOADialPersons(VpnOADialPersons persons, Date startDate, Date endDate,
                                                                             int size, int pageSize) throws Exception {
        PageHelper.startPage(size, pageSize);
        List<VpnOADialPersonsExtend> vpnOADialPersons = vpnOADialPersonsExtendMapper.selectVpnOADialPersonsWithExtra(
                persons, startDate, endDate);
        PageInfo<VpnOADialPersonsExtend> info = new PageInfo<>(vpnOADialPersons);

        OperationResult<List<VpnOADialPersonsExtend>> or = new OperationResult<>();
        or.setStatus(OperationResult.STATUS_SUCCESS);
        or.setData(vpnOADialPersons);
        or.setTotal(info.getTotal());
        or.setMessage("查询成功.");

        return or;
    }


    @Override
    public OperationResult<List<VpnOADialPersonsHisExtend>> getVpnOADialPersonsHis(VpnOADialPersonsHis his, Date startDate,
                                                                                   Date endDate, int size, int pageSize) throws Exception {

        PageHelper.startPage(size, pageSize);
        List<VpnOADialPersonsHisExtend> vpnOADialPersons = vpnOADialPersonsExtendMapper.selectVpnOADialPersonsHisWithExtra(
                his, startDate, endDate);
        PageInfo<VpnOADialPersonsHisExtend> info = new PageInfo<>(vpnOADialPersons);

        OperationResult<List<VpnOADialPersonsHisExtend>> or = new OperationResult<>();
        or.setStatus(OperationResult.STATUS_SUCCESS);
        or.setData(vpnOADialPersons);
        or.setTotal(info.getTotal());
        or.setMessage("查询成功.");

        return or;
    }


    @Override
    public OperationResult<Boolean> updateVpnOADialPersons(VpnOADialPersons persons) throws Exception {
        if (StringUtil.isEmpty(persons.getDialPersonId())) {
            throw new Exception("主键不可为空.");
        }
        // 更新之前先找出更新前的数据
        VpnOADialPersons old = vpnOADialPersonsMapper.selectByPrimaryKey(persons.getDialPersonId());
        if (old == null) {
            throw new Exception("根据主键找不到对应的数据");
        }
        // 更新
        vpnOADialPersonsMapper.updateByPrimaryKeySelective(persons);
        /**
         * 同时生成一条历史记录
         * old字段为上次记录
         * 由于更新可能只更新某些字段,某些不更新的字段应当保留
         */
        Integer key = getPrimaryKey("VpnOADialPersonsHistory");
        VpnOADialPersonsHis his = new VpnOADialPersonsHis();
        his.setHistoryId(key + "");
        swap2(old, his);
        swap(old, his);
        swap(persons, his);

        vpnOADialPersonsHisMapper.insertSelective(his);
        // 更新历史表主键
        updatePrimaryKey("VpnOADialPersonsHistory", key);

        OperationResult<Boolean> or = new OperationResult<>();
        or.setStatus(OperationResult.STATUS_SUCCESS);
        or.setMessage("更新成功.");
        or.setData(true);

        return or;

    }

    /**
     * 把字段放到old上
     *
     * @param old
     * @param his2
     */
    private void swap2(VpnOADialPersons old, VpnOADialPersonsHis his2) {
        his2.setOldFirstName(old.getFirstName());
        his2.setOldTelecomNumber(old.getTelecomNumber());
        his2.setOldCountName(old.getCountName());
        his2.setOldStatus(old.getStatus());
        his2.setOldDescription(old.getDescription());
        his2.setOldFirstChar(old.getFirstChar());
        his2.setOldDepartmentId(old.getDepartmentId());
        his2.setOldCreatedBy(old.getCreatedBy());
        his2.setOldModifiedBy(old.getModifiedBy());
        his2.setOldBillId(old.getBillId());
        his2.setOldModifiedBillId(old.getModifiedBillId());
        his2.setOldVpnTypeId(old.getVpnTypeId());
    }
}
