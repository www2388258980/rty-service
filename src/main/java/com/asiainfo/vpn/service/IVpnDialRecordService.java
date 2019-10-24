package com.asiainfo.vpn.service;

import com.asiainfo.vpn.utils.OperationResult;

public interface IVpnDialRecordService {

    /**
     * 插入一条拨入记录
     *
     * @param record
     * @return
     */
    public OperationResult<Boolean> insertRecord(VpnDialRecord record) throws Exception;
}
