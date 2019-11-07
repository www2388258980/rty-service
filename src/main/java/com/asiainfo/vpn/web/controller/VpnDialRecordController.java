package com.asiainfo.vpn.web.controller;

import com.asiainfo.vpn.bean.VpnDialRecord;
import com.asiainfo.vpn.service.IVpnDialRecordService;
import com.asiainfo.vpn.utils.OperationResult;
import com.asiainfo.vpn.utils.StringUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/vpnDialRecord")
@Api(tags = "操作VPV_DIAL_RECORD这张表.")
@CrossOrigin
public class VpnDialRecordController {

    @Autowired
    private IVpnDialRecordService vpnDialRecordService;

    @PostMapping("/insert")
    @ApiOperation(value = "插入一条数据", notes = "主键,时间后台生成;数据前台准备好传过来.拨入日期前台需要传时间戳.")
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

    @RequestMapping("/getRecords")
    @ApiOperation(value = "根据拨入人和拨入日期获得拨入记录")
    @ApiImplicitParams(
            value =
                    {
                            @ApiImplicitParam(name = "startDate", value = "拨入日期大于等于该值,前台传时间戳",
                                    paramType = "query"),
                            @ApiImplicitParam(name = "endDate", value = "拨入日期小于等于该值,前台传时间戳",
                                    paramType = "query"),
                            @ApiImplicitParam(name = "size", value = "第几页", required = true, paramType = "query", dataType = "Integer"),
                            @ApiImplicitParam(name = "pageSize", value = "每页条数", required = true, paramType = "query", dataType = "Integer")

                    }
    )
    public OperationResult<List<VpnDialRecord>> getRecords(VpnDialRecord record, String startDate, String endDate,
                                                           Integer size, Integer pageSize) {
        OperationResult<List<VpnDialRecord>> or = null;
        try {
            Date date1 = null;
            if (!StringUtil.isEmpty(startDate)) {
                date1 = new Date(Long.parseLong(startDate));
            }
            Date date2 = null;
            if (!StringUtil.isEmpty(endDate)) {
                date2 = new Date(Long.parseLong(endDate));
            }
            or = vpnDialRecordService.getVpnDialRecord(record, date1, date2, size, pageSize);
        } catch (Exception e) {
            e.printStackTrace();
            or = new OperationResult<>();
            or.setStatus(OperationResult.STATUS_FAILURE);
            or.setData(null);
            or.setMessage("查询失败." + e.getMessage());
        }


        return or;
    }

}
