package com.asiainfo.rty.service;


import com.asiainfo.rty.bean.RtyDialPersons;
import com.asiainfo.rty.bean.RtyDialPersonsHis;
import com.asiainfo.rty.bean.extend.RtyDialPersonsExtend;
import com.asiainfo.rty.bean.extend.RtyDialPersonsHisExtend;
import com.asiainfo.rty.utils.OperationResult;

import java.util.List;
import java.util.Date;

public interface IRtyDialPersonsService {

    /**
     * 插入数据[增]
     *
     * @param persons
     * @return
     * @throws Exception
     */
    public OperationResult<Boolean> insert(RtyDialPersons persons) throws Exception;

    /**
     * 根据条件拿到数据
     *
     * @param persons
     * @param startDate
     * @param endDate
     * @param size
     * @param pageSize
     * @return
     * @throws Exception
     */
    public OperationResult<List<RtyDialPersonsExtend>> getRtyDailPersons(RtyDialPersons persons, Date startDate, Date endDate,
                                                                         int size, int pageSize) throws Exception;

    /**
     * 根据条件获取历史记录
     *
     * @param his
     * @param startDate
     * @param endDate
     * @param size
     * @param pageSize
     * @return
     * @throws Exception
     */
    public OperationResult<List<RtyDialPersonsHisExtend>> getRtyDialPersonsHis(RtyDialPersonsHis his, Date startDate, Date endDate,
                                                                               int size, int pageSize) throws Exception;

    /**
     * 根据主键拿取数据
     *
     * @param id
     * @return
     * @throws Exception
     */
    public OperationResult<RtyDialPersons> getRtyDialPersonsByPrimaryKey(String id) throws Exception;

    /**
     * 根据主键更改数据
     * 更改数据的同时生成一条历史记录
     *
     * @param persons
     * @return
     * @throws Exception
     */
    public OperationResult<Boolean> updateRtyDialPersons(RtyDialPersons persons) throws Exception;

    /**
     * 根据拼音获取数据
     *
     * @param fristChar
     * @return
     * @throws Exception
     */
    public OperationResult<List<RtyDialPersons>> getRtyDialPersonsByFirstChar(String fristChar) throws Exception;
}
