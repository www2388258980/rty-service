package com.asiainfo.vpn.service;


import com.asiainfo.vpn.bean.VpnDialPersons;
import com.asiainfo.vpn.bean.VpnDialPersonsHis;
import com.asiainfo.vpn.utils.OperationResult;

import java.util.List;
import java.util.Date;

public interface IVpnDialPersonsService {

    /**
     * 插入数据[增]
     *
     * @param persons
     * @return
     * @throws Exception
     */
    public OperationResult<Boolean> insert(VpnDialPersons persons) throws Exception;

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
    public OperationResult<List<VpnDialPersons>> getVpnDailPersons(VpnDialPersons persons, Date startDate, Date endDate,
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
    public OperationResult<List<VpnDialPersonsHis>> getVpnDialPersonsHis(VpnDialPersonsHis his, Date startDate, Date endDate,
                                                                         int size, int pageSize) throws Exception;

    /**
     * 根据主键拿取数据
     *
     * @param id
     * @return
     * @throws Exception
     */
    public OperationResult<VpnDialPersons> getVpnDialPersonsByPrimaryKey(String id) throws Exception;

    /**
     * 根据主键更改数据
     * 更改数据的同时生成一条历史记录
     *
     * @param persons
     * @return
     * @throws Exception
     */
    public OperationResult<Boolean> updateVpnDialPersons(VpnDialPersons persons) throws Exception;
}
