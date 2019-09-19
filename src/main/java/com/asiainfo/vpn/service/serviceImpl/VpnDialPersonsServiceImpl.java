package com.asiainfo.vpn.service.serviceImpl;

import com.asiainfo.vpn.bean.*;
import com.asiainfo.vpn.mapper.VpnDialPersonsHisMapper;
import com.asiainfo.vpn.mapper.VpnDialPersonsMapper;
import com.asiainfo.vpn.mapper.VpnMapper;
import com.asiainfo.vpn.service.IVpnDialPersonsService;
import com.asiainfo.vpn.utils.OperationResult;
import com.asiainfo.vpn.utils.PinyinUtils;
import com.asiainfo.vpn.utils.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.Date;

@Service
public class VpnDialPersonsServiceImpl implements IVpnDialPersonsService {
    @Autowired
    private VpnDialPersonsMapper vpnMapper;
    @Autowired
    private VpnDialPersonsHisMapper vpnHisMapper;

    @Autowired
    private VpnMapper mapper;

    @Override
    public OperationResult<Boolean> insertVpnDialPersonsService(VpnDialPersons persons) throws SQLException {
        OperationResult<Boolean> or = new OperationResult<Boolean>();
        or.setStatus(OperationResult.STATUS_FAILURE);
        or.setData(false);
        if (persons == null) {
            or.setMessage("传入数据为空!");
            return or;
        }
        if (StringUtil.isEmpty(persons.getFirstName())) {
            or.setMessage("姓名不可以为空!");
            return or;
        }
        // 转换部门
        String departmentId = mapper.getDepartmentID(persons.getDepartment());
        // 查出主键
        String id = mapper.getID("VpnDialPersons");
        // 插入
        String firstChar = PinyinUtils.getPinYin(persons.getFirstName());
        persons.setFirstChar(firstChar);
        Date date = new Date();
        persons.setDepartment(departmentId);
        persons.setDialPersonId(id);
        persons.setCreatedStamp(date);
        persons.setCreatedTxStamp(date);
        persons.setLastUpdatedStamp(date);
        persons.setLastUpdatedTxStamp(date);
        vpnMapper.insertSelective(persons);
        // 更新主键表
        mapper.updateID("VpnDialPersons");

        // 同时向历史表插入一条数据
        VpnDialPersonsHis his = new VpnDialPersonsHis();
        swapDate(his, persons);
        insertVpnDialPersonsHis(his);

        or.setStatus(OperationResult.STATUS_SUCCESS);
        or.setData(true);
        or.setMessage("插入成功");
        return or;
    }

    private void swapDate(VpnDialPersonsHis his, VpnDialPersons persons) {
        if (!StringUtil.isEmpty(persons.getDialPersonId())) {
            his.setDialPersonId(persons.getDialPersonId());
        }
        if (!StringUtil.isEmpty(persons.getFirstName())) {
            his.setFirstName(persons.getFirstName());
        }
        if (!StringUtil.isEmpty(persons.getTelecomNumber())) {
            his.setTelecomNumber(persons.getTelecomNumber());
        }
        if (!StringUtil.isEmpty(persons.getDescription())) {
            his.setDescription(persons.getDescription());
        }
        if (!StringUtil.isEmpty(persons.getFirstChar())) {
            his.setFirstChar(persons.getFirstChar());
        }
        if (!StringUtil.isEmpty(persons.getDepartment())) {
            his.setDepartment(persons.getDepartment());
        }
        if (!StringUtil.isEmpty(persons.getStatus())) {
            his.setStatus(persons.getStatus());
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
        if (!StringUtil.isEmpty(persons.getOpType())) {
            his.setOpType(persons.getOpType());
        }
        if (!StringUtil.isEmpty(persons.getEffectiveDate())) {
            his.setEffectiveDate(persons.getEffectiveDate());
        }
        if (!StringUtil.isEmpty(persons.getEffectiveDate())) {
            his.setEffectiveDate(persons.getEffectiveDate());
        }

    }

    private void insertVpnDialPersonsHis(VpnDialPersonsHis his) throws SQLException {
        // 获取主键
        String idHis = mapper.getID("VpnDialPersonsHistory");

        // 插入
        his.setHistoryId(idHis);
        Date date = new Date();
        his.setCreatedStamp(date);
        his.setCreatedTxStamp(date);
        his.setLastUpdatedStamp(date);
        his.setLastUpdatedTxStamp(date);
        vpnHisMapper.insertSelective(his);

        // 更新主键
        mapper.updateID("VpnDialPersonsHistory");
    }
}
