package com.asiainfo.rty.service;

import com.asiainfo.rty.bean.RtyOADialPersons;
import com.asiainfo.rty.bean.RtyOADialPersonsHis;
import com.asiainfo.rty.bean.extend.RtyOADialPersonsExtend;
import com.asiainfo.rty.bean.extend.RtyOADialPersonsHisExtend;
import com.asiainfo.rty.utils.OperationResult;

import java.util.List;
import java.util.Date;

public interface IRtyOADialPersonsService {

    /**
     * 增加数据的同时向历史表也插入一条数据
     *
     * @param persons
     * @return
     * @throws Exception
     */
    public OperationResult<Boolean> insert(RtyOADialPersons persons) throws Exception;

    /**
     * 根据主键获取数据
     *
     * @param id
     * @return
     * @throws Exception
     */
    public OperationResult<RtyOADialPersons> getVpnOADialPersonsBykey(String id) throws Exception;

    /**
     * 根据条件获取数据
     *
     * @param persons
     * @param startDate
     * @param endDate
     * @param size
     * @param pageSize
     * @return
     * @throws Exception
     */
    public OperationResult<List<RtyOADialPersonsExtend>> getVpnOADialPersons(RtyOADialPersons persons, Date startDate, Date endDate,
                                                                             int size, int pageSize) throws Exception;

    /**
     * 根据条件获取历史表数据
     *
     * @param his
     * @param startDate
     * @param endDate
     * @param size
     * @param pageSize
     * @return
     * @throws Exception
     */
    public OperationResult<List<RtyOADialPersonsHisExtend>> getVpnOADialPersonsHis(RtyOADialPersonsHis his, Date startDate, Date endDate,
                                                                                   int size, int pageSize) throws Exception;

    /**
     * @param persons
     * @return
     * @throws Exception
     */
    public OperationResult<Boolean> updateVpnOADialPersons(RtyOADialPersons persons) throws Exception;
}
