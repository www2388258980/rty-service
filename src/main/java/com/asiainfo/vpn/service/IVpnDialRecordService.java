package com.asiainfo.vpn.service;

import com.asiainfo.vpn.bean.VpnDialRecord;
import com.asiainfo.vpn.utils.OperationResult;

import java.util.Date;
import java.util.List;

public interface IVpnDialRecordService {

    /**
     * 插入一条拨入记录
     *
     * @param record
     * @return
     */
    public OperationResult<Boolean> insertRecord(VpnDialRecord record) throws Exception;

    /**
     * 获得拨入记录
     * 使用PageHelper插件分页
     *
     * @param record
     * @param startDate
     * @param endDate
     * @param size
     * @param pageSize
     * @return
     * @throws Exception
     */
    public OperationResult<List<VpnDialRecord>> getVpnDialRecord(VpnDialRecord record, Date startDate, Date endDate,
                                                                 int size, int pageSize) throws Exception;
}
