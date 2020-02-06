package com.asiainfo.rty.service;

import com.asiainfo.rty.bean.RtyDialRecord;
import com.asiainfo.rty.bean.extend.RtyDialRecordExtend;
import com.asiainfo.rty.utils.OperationResult;

import java.util.Date;
import java.util.List;

public interface IRtyDialRecordService {

    /**
     * 插入一条拨入记录
     *
     * @param record
     * @return
     */
    public OperationResult<Boolean> insertRecord(RtyDialRecord record) throws Exception;

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
    public OperationResult<List<RtyDialRecordExtend>> getVpnDialRecord(RtyDialRecord record, Date startDate, Date endDate,
                                                                       int size, int pageSize) throws Exception;


}
