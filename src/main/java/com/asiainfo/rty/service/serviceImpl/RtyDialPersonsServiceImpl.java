package com.asiainfo.rty.service.serviceImpl;

import com.asiainfo.rty.bean.*;
import com.asiainfo.rty.bean.extend.RtyDialPersonsExtend;
import com.asiainfo.rty.bean.extend.RtyDialPersonsHisExtend;
import com.asiainfo.rty.mapper.RtyDialPersonsHisMapper;
import com.asiainfo.rty.mapper.RtyDialPersonsMapper;
import com.asiainfo.rty.mapper.SequenceValueItemMapper;
import com.asiainfo.rty.mapper.extend.RtyDialPersonsExtendMapper;
import com.asiainfo.rty.mapper.extend.RtyDialPersonsHisExtendMapper;
import com.asiainfo.rty.service.IRtyDialPersonsService;
import com.asiainfo.rty.utils.OperationResult;
import com.asiainfo.rty.utils.StringUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class RtyDialPersonsServiceImpl implements IRtyDialPersonsService {
    @Autowired
    private SequenceValueItemMapper sequenceValueItemMapper;
    @Autowired
    private RtyDialPersonsMapper rtyDialPersonsMapper;
    @Autowired
    private RtyDialPersonsHisMapper rtyDialPersonsHisMapper;
    @Autowired
    private RtyDialPersonsExtendMapper rtyDialPersonsExtendMapper;
    @Autowired
    private RtyDialPersonsHisExtendMapper rtyDialPersonsHisExtendMapper;


    @Override
    public OperationResult<Boolean> insert(RtyDialPersons persons) throws Exception {
        // 先拿到主键
        Integer key = getPrimaryKey("RtyDialPersons");
        persons.setDialPersonId(key + "");
        // 向VPN_DIAL_PERSONS插入数据
        rtyDialPersonsMapper.insert(persons);
        // 更新主键
        updatePrimaryKey("RtyDialPersons", key);

        /* 向其历史表插入一条数据
         * 先复制一遍persons属性
         * 由于是插入,所有old系列字段为空
         */
        // 先拿到历史表对应的主键
        Integer key2 = getPrimaryKey("RtyDialPersonsHistory");
        RtyDialPersonsHis his = new RtyDialPersonsHis();
        his.setHistoryId(key2 + "");
        swap(persons, his);
        // 插入历史表
        rtyDialPersonsHisMapper.insert(his);
        // 更新历史主键表
        updatePrimaryKey("RtyDialPersonsHistory", key2);

        OperationResult<Boolean> or = new OperationResult<>();
        or.setStatus(OperationResult.STATUS_SUCCESS);
        or.setData(true);

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

    /**
     * 交换数据
     *
     * @param persons
     * @param his
     * @throws Exception
     */
    private void swap(RtyDialPersons persons, RtyDialPersonsHis his) {
        if (!StringUtil.isEmpty(persons.getDialPersonId())) {
            his.setDialPersonId(persons.getDialPersonId());
        }
        if (!StringUtil.isEmpty(persons.getFirstName())) {
            his.setFirstName(persons.getFirstName());
        }
        if (!StringUtil.isEmpty(persons.getFirstChar())) {
            his.setFirstChar(persons.getFirstChar());
        }
        if (!StringUtil.isEmpty(persons.getTelecomNumber())) {
            his.setTelecomNumber(persons.getTelecomNumber());
        }
        if (!StringUtil.isEmpty(persons.getStatus())) {
            his.setStatus(persons.getStatus());
        }
        if (!StringUtil.isEmpty(persons.getDescription())) {
            his.setDescription(persons.getDescription());
        }
        if (!StringUtil.isEmpty(persons.getDepartmentId())) {
            his.setDepartmentId(persons.getDepartmentId());
        }
        if (!StringUtil.isEmpty(persons.getCreatedBy())) {
            his.setCreatedBy(persons.getCreatedBy());
        }
        if (!StringUtil.isEmpty(persons.getBillId())) {
            his.setBillId(persons.getBillId());
        }
        if (!StringUtil.isEmpty(persons.getOpType())) {
            his.setOpType(persons.getOpType());
        }
        if (persons.getEffectiveDate() != null) {
            his.setEffectiveDate(persons.getEffectiveDate());
        }
        if (persons.getCreatedStamp() != null) {
            his.setCreatedStamp(persons.getCreatedStamp());
        }
        if (persons.getLastUpdatedStamp() != null) {
            his.setLastUpdatedStamp(persons.getLastUpdatedStamp());
        }

    }

    @Override
    public OperationResult<List<RtyDialPersonsExtend>> getRtyDailPersons(RtyDialPersons persons, Date startDate, Date endDate,
                                                                         int size, int pageSize) throws Exception {
        // 分页
        PageHelper.startPage(size, pageSize);
        List<RtyDialPersonsExtend> RtyDialPersons = rtyDialPersonsExtendMapper.selectVpnDialRecordsWithExtra(persons,
                startDate, endDate);
        PageInfo<RtyDialPersonsExtend> info = new PageInfo<>(RtyDialPersons);

        OperationResult<List<RtyDialPersonsExtend>> or = new OperationResult<>();
        or.setStatus(OperationResult.STATUS_SUCCESS);
        or.setData(RtyDialPersons);
        or.setTotal(info.getTotal());
        or.setMessage("查询成功.");

        return or;
    }


    @Override
    public OperationResult<List<RtyDialPersonsHisExtend>> getRtyDialPersonsHis(RtyDialPersonsHis his, Date startDate, Date endDate,
                                                                               int size, int pageSize) throws Exception {
        // 分页
        PageHelper.startPage(size, pageSize);
        List<RtyDialPersonsHisExtend> RtyDialPersonsHis = rtyDialPersonsHisExtendMapper.selectVpnDialPersonsHisWithExtra(his, startDate, endDate);
        PageInfo<RtyDialPersonsHisExtend> info = new PageInfo<>(RtyDialPersonsHis);

        OperationResult<List<RtyDialPersonsHisExtend>> or = new OperationResult<>();
        or.setStatus(OperationResult.STATUS_SUCCESS);
        or.setData(RtyDialPersonsHis);
        or.setTotal(info.getTotal());

        return or;
    }

    @Override
    public OperationResult<RtyDialPersons> getRtyDialPersonsByPrimaryKey(String id) throws Exception {
        if (StringUtil.isEmpty(id)) {
            throw new Exception("主键不可为空.");
        }
        RtyDialPersons RtyDialPersons = rtyDialPersonsMapper.selectByPrimaryKey(id);

        OperationResult<RtyDialPersons> or = new OperationResult<>();
        or.setStatus(OperationResult.STATUS_SUCCESS);
        or.setData(RtyDialPersons);
        or.setMessage("查询成功.");

        return or;
    }

    @Override
    public OperationResult<Boolean> updateRtyDialPersons(RtyDialPersons persons) throws Exception {
        if (StringUtil.isEmpty(persons.getDialPersonId())) {
            throw new Exception("主键不可为空.");
        }
        // 更新之前先找出更新前的数据
        RtyDialPersons old = rtyDialPersonsMapper.selectByPrimaryKey(persons.getDialPersonId());
        if (old == null) {
            throw new Exception("根据主键找不到对应的数据");
        }
        // 更新
        rtyDialPersonsMapper.updateByPrimaryKeySelective(persons);
        /**
         * 同时生成一条历史记录
         * old字段为上次记录
         * 由于更新可能只更新某些字段,某些不更新的字段应当保留
         */
        Integer key = getPrimaryKey("RtyDialPersonsHistory");
        RtyDialPersonsHis his = new RtyDialPersonsHis();
        his.setHistoryId(key + "");
        swap2(old, his);
        swap(old, his);
        swap(persons, his);

        rtyDialPersonsHisMapper.insertSelective(his);
        // 更新历史表主键
        updatePrimaryKey("RtyDialPersonsHistory", key);

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
    private void swap2(RtyDialPersons old, RtyDialPersonsHis his2) {
        his2.setOldFirstName(old.getFirstName());
        his2.setOldTelecomNumber(old.getTelecomNumber());
        his2.setOldStatus(old.getStatus());
        his2.setOldDescription(old.getDescription());
        his2.setOldFirstChar(old.getFirstChar());
        his2.setOldDepartmentId(old.getDepartmentId());
        his2.setOldCreatedBy(old.getCreatedBy());
        his2.setOldModifiedBy(old.getModifiedBy());
        his2.setOldbillId(old.getBillId());
        his2.setOldModifiedBillId(old.getModifiedBillId());
    }
}
