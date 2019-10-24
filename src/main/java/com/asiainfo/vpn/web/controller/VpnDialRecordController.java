package com.asiainfo.vpn.web.controller;

import com.asiainfo.vpn.service.IVpnDialRecordService;
import com.asiainfo.vpn.utils.OperationResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vpnDialRecord")
@Api(tags = "操作VPV_DIAL_RECORD这张表.")
public class VpnDialRecordController {

    @Autowired
    private IVpnDialRecordService vpnDialRecordService;

    @RequestMapping("/insert")
    @ApiOperation(value = "插入一条数据", notes = "主键,时间后台生成;数据前台准备好传过来.")
    public OperationResult<Boolean> insert(VpnDialRecord record) {
        OperationResult<Boolean> or = new OperationResult<>();
        try {
            or = vpnDialRecordService.insertRecord(record);
        } catch (Exception e) {
            e.printStackTrace();
            or.setStatus(OperationResult.STATUS_FAILURE);
            or.setData(false);
            or.setMessage(e.getMessage());
        }

        return or;

    }

}
