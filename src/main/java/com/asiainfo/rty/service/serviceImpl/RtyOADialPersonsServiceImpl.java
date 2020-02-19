package com.asiainfo.rty.service.serviceImpl;

import com.asiainfo.rty.bean.*;
import com.asiainfo.rty.bean.extend.RtyOADialPersonsExtend;
import com.asiainfo.rty.bean.extend.RtyOADialPersonsHisExtend;
import com.asiainfo.rty.mapper.RtyOADialPersonsHisMapper;
import com.asiainfo.rty.mapper.RtyOADialPersonsMapper;
import com.asiainfo.rty.mapper.SequenceValueItemMapper;
import com.asiainfo.rty.mapper.extend.RtyOADialPersonsExtendMapper;
import com.asiainfo.rty.service.IRtyOADialPersonsService;
import com.asiainfo.rty.utils.OperationResult;
import com.asiainfo.rty.utils.PinyinUtils;
import com.asiainfo.rty.utils.StringUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class RtyOADialPersonsServiceImpl implements IRtyOADialPersonsService {
    @Autowired
    private SequenceValueItemMapper sequenceValueItemMapper;
    @Autowired
    private RtyOADialPersonsMapper rtyOADialPersonsMapper;
    @Autowired
    private RtyOADialPersonsHisMapper rtyOADialPersonsHisMapper;
    @Autowired
    private RtyOADialPersonsExtendMapper rtyOADialPersonsExtendMapper;


    @Override
    public OperationResult<Boolean> insert(RtyOADialPersons persons) throws Exception {
        // 主键
        Integer key = getPrimaryKey("RtyOADialPersons");
        persons.setDialPersonId(key + "");

        rtyOADialPersonsMapper.insertSelective(persons);

        // 更新主键
        updatePrimaryKey("RtyOADialPersons", key);
        // 历史表也插入一条数据
        RtyOADialPersonsHis his = new RtyOADialPersonsHis();
        Integer key2 = getPrimaryKey("RtyOADialPersonsHistory");
        his.setHistoryId(key2 + "");
        his.setDialPersonId(key + "");
        swap(persons, his);

        rtyOADialPersonsHisMapper.insertSelective(his);

        // 更新历史表主键
        updatePrimaryKey("RtyOADialPersonsHistory", key2);

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

    private void swap(RtyOADialPersons persons, RtyOADialPersonsHis his) {
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
    public OperationResult<RtyOADialPersons> getRtyOADialPersonsBykey(String id) throws Exception {
        if (StringUtil.isEmpty(id)) {
            throw new Exception("主键不可为空.");
        }
        RtyOADialPersons RtyOADialPersons = rtyOADialPersonsMapper.selectByPrimaryKey(id);

        OperationResult<RtyOADialPersons> or = new OperationResult<>();
        or.setStatus(OperationResult.STATUS_SUCCESS);
        or.setData(RtyOADialPersons);
        or.setMessage("查询成功.");

        return or;
    }

    @Override
    public OperationResult<List<RtyOADialPersonsExtend>> getRtyOADialPersons(RtyOADialPersons persons, Date startDate, Date endDate,
                                                                             int size, int pageSize) throws Exception {
        PageHelper.startPage(size, pageSize);
        List<RtyOADialPersonsExtend> RtyOADialPersons = rtyOADialPersonsExtendMapper.selectRtyOADialPersonsWithExtra(
                persons, startDate, endDate);
        PageInfo<RtyOADialPersonsExtend> info = new PageInfo<>(RtyOADialPersons);

        OperationResult<List<RtyOADialPersonsExtend>> or = new OperationResult<>();
        or.setStatus(OperationResult.STATUS_SUCCESS);
        or.setData(RtyOADialPersons);
        or.setTotal(info.getTotal());
        or.setMessage("查询成功.");

        return or;
    }


    @Override
    public OperationResult<List<RtyOADialPersonsHisExtend>> getRtyOADialPersonsHis(RtyOADialPersonsHis his, Date startDate,
                                                                                   Date endDate, int size, int pageSize) throws Exception {

        PageHelper.startPage(size, pageSize);
        List<RtyOADialPersonsHisExtend> RtyOADialPersons = rtyOADialPersonsExtendMapper.selectRtyOADialPersonsHisWithExtra(
                his, startDate, endDate);
        PageInfo<RtyOADialPersonsHisExtend> info = new PageInfo<>(RtyOADialPersons);

        OperationResult<List<RtyOADialPersonsHisExtend>> or = new OperationResult<>();
        or.setStatus(OperationResult.STATUS_SUCCESS);
        or.setData(RtyOADialPersons);
        or.setTotal(info.getTotal());
        or.setMessage("查询成功.");

        return or;
    }


    @Override
    public OperationResult<Boolean> updateRtyOADialPersons(RtyOADialPersons persons) throws Exception {
        if (StringUtil.isEmpty(persons.getDialPersonId())) {
            throw new Exception("主键不可为空.");
        }
        // 更新之前先找出更新前的数据
        RtyOADialPersons old = rtyOADialPersonsMapper.selectByPrimaryKey(persons.getDialPersonId());
        if (old == null) {
            throw new Exception("根据主键找不到对应的数据");
        }
        // 更新
        rtyOADialPersonsMapper.updateByPrimaryKeySelective(persons);
        /**
         * 同时生成一条历史记录
         * old字段为上次记录
         * 由于更新可能只更新某些字段,某些不更新的字段应当保留
         */
        Integer key = getPrimaryKey("RtyOADialPersonsHistory");
        RtyOADialPersonsHis his = new RtyOADialPersonsHis();
        his.setHistoryId(key + "");
        swap2(old, his);
        swap(old, his);
        swap(persons, his);

        rtyOADialPersonsHisMapper.insertSelective(his);
        // 更新历史表主键
        updatePrimaryKey("RtyOADialPersonsHistory", key);

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
    private void swap2(RtyOADialPersons old, RtyOADialPersonsHis his2) {
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

    @Override
    public OperationResult<List<RtyOADialPersons>> getRtyOADialPersonsByFirstChar(String firstChar) throws Exception {
        RtyOADialPersonsExample example = new RtyOADialPersonsExample();
        RtyOADialPersonsExample.Criteria criteria = example.createCriteria();
        // 默认状态为'是'
        criteria.andStatusEqualTo("是");
        List<RtyOADialPersons> rtyOADialPersons = null;
        if (StringUtil.isEmpty(firstChar)) {
            rtyOADialPersons = rtyOADialPersonsMapper.selectByExample(example);
        } else {
            criteria.andFirstCharLike("%" + PinyinUtils.getPinYin(firstChar) + "%");
            rtyOADialPersons = rtyOADialPersonsMapper.selectByExample(example);
        }
        OperationResult<List<RtyOADialPersons>> or = new OperationResult<>();
        or.setStatus(OperationResult.STATUS_SUCCESS);
        or.setData(rtyOADialPersons);
        or.setMessage("查询成功.");
        return or;
    }
}
