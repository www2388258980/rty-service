package com.asiainfo.vpn.service;

import com.asiainfo.vpn.bean.VpnDialPersons;
import com.asiainfo.vpn.utils.OperationResult;

import java.sql.SQLException;


public interface IVpnDialPersonsService {

    public OperationResult<Boolean> insertVpnDialPersonsService(VpnDialPersons persons) throws SQLException;
}
