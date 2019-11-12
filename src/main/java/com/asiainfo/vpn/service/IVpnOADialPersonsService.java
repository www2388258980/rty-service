package com.asiainfo.vpn.service;

import com.asiainfo.vpn.bean.VpnOADialPersons;
import com.asiainfo.vpn.bean.VpnOADialPersonsHis;
import com.asiainfo.vpn.utils.OperationResult;

import java.util.List;
import java.util.Date;

public interface IVpnOADialPersonsService {

    /**
     * 增加数据的同时向历史表也插入一条数据
     *
     * @param persons
     * @return
     * @throws Exception
     */
    public OperationResult<Boolean> insert(VpnOADialPersons persons) throws Exception;

    /**
     * 根据主键获取数据
     *
     * @param id
     * @return
     * @throws Exception
     */
    public OperationResult<VpnOADialPersons> getVpnOADialPersonsBykey(String id) throws Exception;

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
    public OperationResult<List<VpnOADialPersons>> getVpnOADialPersons(VpnOADialPersons persons, Date startDate, Date endDate,
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
    public OperationResult<List<VpnOADialPersonsHis>> getVpnOADialPersonsHis(VpnOADialPersonsHis his, Date startDate, Date endDate,
                                                                             int size, int pageSize) throws Exception;

    /**
     * @param persons
     * @return
     * @throws Exception
     */
    public OperationResult<Boolean> updateVpnOADialPersons(VpnOADialPersons persons) throws Exception;
}
