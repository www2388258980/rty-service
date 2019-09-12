package com.asiainfo.vpn.web.controller;

import com.asiainfo.vpn.bean.VpnDialPersons;
import com.asiainfo.vpn.service.IVpnDialPersonsService;
import com.asiainfo.vpn.utils.OperationResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;

@RequestMapping("vpnDialPersons")
@RestController
@Api(tags = "操作表VPN_DIAL_PERSONS和VPN_DIAL_PERSONS_HISTORY")
public class VpnDialPersonsController {
    @Autowired
    private IVpnDialPersonsService vpnDialPersonsService;

    @PostMapping("insert")
    @ApiOperation(value = "向VPN_DIAL_PERSONS和其对应的历史表插入一条数据", notes = "")
    @ApiImplicitParams(@ApiImplicitParam(name = "persons", value = "", required = true, paramType = "header"))
    public OperationResult<Boolean> insert(VpnDialPersons persons) {
        OperationResult<Boolean> or = null;
        try {
            or = vpnDialPersonsService.insertVpnDialPersonsService(persons);
        } catch (SQLException e) {
            e.printStackTrace();
            or.setStatus(OperationResult.STATUS_FAILURE);
            or.setData(false);
            or.setMessage(e.toString());
        }

        return or;
    }
}
