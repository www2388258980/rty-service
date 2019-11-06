package com.asiainfo.vpn.service;


import com.asiainfo.vpn.bean.VpnDialPersons;
import com.asiainfo.vpn.utils.OperationResult;

public interface IVpnDialPersonsService {

    /**
     * 插入数据[增]
     *
     * @param persons
     * @return
     * @throws Exception
     */
    public OperationResult<Boolean> insert(VpnDialPersons persons) throws Exception;
}
