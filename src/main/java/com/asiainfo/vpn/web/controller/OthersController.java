package com.asiainfo.vpn.web.controller;

import com.asiainfo.vpn.bean.Organization;
import com.asiainfo.vpn.service.OthersService;
import com.asiainfo.vpn.utils.OperationResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/others")
@RestController
@Api(tags = "操作其它表,一些小功能,eg: 查询所有部门")
public class OthersController {

    @Autowired
    private OthersService othersService;

    @RequestMapping(value = "/getDepartment", method = {RequestMethod.POST, RequestMethod.GET})
    @ApiOperation(value = "查询所有部门", notes = "")
    public OperationResult<List<Organization>> getDepartments() {
        OperationResult<List<Organization>> or = null;
        try {
            or = othersService.getDepartments();
        } catch (Exception e) {
            e.printStackTrace();
            or = new OperationResult<>();
            or.setStatus(OperationResult.STATUS_FAILURE);
            or.setData(null);
            or.setMessage("查询失败.");
        }

        return or;

    }

}
