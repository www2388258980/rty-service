package com.asiainfo.vpn.web.controller;

import com.asiainfo.vpn.utils.OperationResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/vpnDialPersons")
@RestController
@Api(tags = "操作VPN_DIAL_PERSONS和VPN_DIAL_PERSONS_HISTORY两张表")
public class VpnDialPersonsController {

    @PostMapping("/insert")
    @ApiOperation(value = "插入一条数据,同时向其历史表也插入一条数据", notes = "中文名对应的拼音后台生成")
    public OperationResult<Boolean> insert(VpnDialPersons persons) {

        return null;
    }
}
