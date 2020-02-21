package com.asiainfo.rty.web.controller;

import com.asiainfo.rty.bean.RtyOADialPersons;
import com.asiainfo.rty.bean.RtyOADialPersonsHis;
import com.asiainfo.rty.bean.extend.RtyOADialPersonsExtend;
import com.asiainfo.rty.bean.extend.RtyOADialPersonsHisExtend;
import com.asiainfo.rty.config.DateConverterConfig;
import com.asiainfo.rty.service.IRtyOADialPersonsService;
import com.asiainfo.rty.utils.OperationResult;
import com.asiainfo.rty.utils.PinyinUtils;
import com.asiainfo.rty.utils.StringUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.support.GenericConversionService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.ConfigurableWebBindingInitializer;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;

import javax.annotation.PostConstruct;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/rtyOADialPersons")
@Api(tags = "操控RTY_DIAL_OA_PERSONS和RTY_DIAL_OA_PERSONS_HISTORY")
@CrossOrigin
public class RtyDialOAPersonsController {
    @Autowired
    private IRtyOADialPersonsService rtyOADialPersonsService;
    @Autowired
    private RequestMappingHandlerAdapter handlerAdapter;

    @PostConstruct
    public void initEditableAvlidation() {

        ConfigurableWebBindingInitializer initializer = (ConfigurableWebBindingInitializer) handlerAdapter.getWebBindingInitializer();
        if (initializer.getConversionService() != null) {
            GenericConversionService genericConversionService = (GenericConversionService) initializer.getConversionService();

            genericConversionService.addConverter(new DateConverterConfig());

        }
    }

    @PostMapping("/insert")
    @ApiOperation(value = "向rty_oa_dial_persons插入数据,同时向其对应历史表生成一条数据.", notes = "创建和最后更新时间由后台生成.")
    public OperationResult<Boolean> insert(RtyOADialPersons persons) {
        OperationResult<Boolean> or = null;
        try {
            // 转化数据
            persons.setFirstChar(PinyinUtils.getPinYin(persons.getFirstName()));
            Date date = new Date();
            persons.setOpType("新增");
            persons.setCreatedStamp(date);
            persons.setLastUpdatedStamp(date);
            or = rtyOADialPersonsService.insert(persons);
        } catch (Exception e) {
            e.printStackTrace();
            or = new OperationResult<>();
            or.setStatus(OperationResult.STATUS_FAILURE);
            or.setData(false);
            or.setMessage("插入失败: " + e.getMessage());
        }

        return or;
    }


    @RequestMapping(value = "/getDataById", method = {RequestMethod.GET, RequestMethod.POST})
    @ApiOperation(value = "根据主键获得一条rty_oa_dial_persons数据", notes = "数据为空当key没有对应的数据.")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "key", value = "必须传入,key对应的数据为空也行.", required = true, paramType = "query")
    })
    public OperationResult<RtyOADialPersons> getRtyOADialPersonsBykey(String key) {
        OperationResult<RtyOADialPersons> or = null;
        try {
            or = rtyOADialPersonsService.getRtyOADialPersonsBykey(key);
        } catch (Exception e) {
            e.printStackTrace();
            or = new OperationResult<>();
            or.setStatus(OperationResult.STATUS_FAILURE);
            or.setMessage("查询失败: " + e.getMessage());
        }

        return or;
    }


    @RequestMapping(value = "/getPersonsByCondition", method = {RequestMethod.GET, RequestMethod.POST})
    @ApiOperation(value = "根据姓名和部门分页获取数据.", notes = "时间前台传时间戳.")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "startDate", value = "最新时间>=", paramType = "query"),
            @ApiImplicitParam(name = "endDate", value = "最新时间>=", paramType = "query"),
            @ApiImplicitParam(name = "size", value = "第几页", paramType = "query", required = true),
            @ApiImplicitParam(name = "pageSize", value = "每页数量>=", paramType = "query", required = true)
    })
    public OperationResult<List<RtyOADialPersonsExtend>> getRtyOADialPersons(RtyOADialPersons persons, Date startDate, Date endDate,
                                                                             int size, int pageSize) {
        OperationResult<List<RtyOADialPersonsExtend>> or = null;
        try {
            or = rtyOADialPersonsService.getRtyOADialPersons(persons, startDate, endDate, size, pageSize);
        } catch (Exception e) {
            e.printStackTrace();
            or = new OperationResult<>();
            or.setStatus(OperationResult.STATUS_FAILURE);
            or.setMessage("查询失败: " + e.getMessage());
        }

        return or;
    }

    @RequestMapping(value = "/getPersonsHisByCondition", method = {RequestMethod.GET, RequestMethod.POST})
    @ApiOperation(value = "根据姓名和部门分页获取历史数据.", notes = "时间前台传时间戳.")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "startDate", value = "最新时间>=", paramType = "query"),
            @ApiImplicitParam(name = "endDate", value = "最新时间>=", paramType = "query"),
            @ApiImplicitParam(name = "size", value = "第几页", paramType = "query", required = true),
            @ApiImplicitParam(name = "pageSize", value = "每页数量>=", paramType = "query", required = true)
    })
    public OperationResult<List<RtyOADialPersonsHisExtend>> getRtyOADialPersonsHis(RtyOADialPersonsHis his, Date startDate,
                                                                                   Date endDate, int size, int pageSize) {
        OperationResult<List<RtyOADialPersonsHisExtend>> or = null;
        try {
            or = rtyOADialPersonsService.getRtyOADialPersonsHis(his, startDate, endDate, size, pageSize);
        } catch (Exception e) {
            e.printStackTrace();
            or = new OperationResult<>();
            or.setStatus(OperationResult.STATUS_FAILURE);
            or.setMessage("查询失败: " + e.getMessage());
        }

        return or;
    }

    @PostMapping("/update")
    @ApiOperation(value = "根据主键更新数据,需要更新啥属性将就其实例字段设值.", notes = "更新的同时会向历史表插入数据.")
    public OperationResult<Boolean> updateRtyOADialPersons(RtyOADialPersons persons) {
        OperationResult<Boolean> or = null;
        try {
            // 转换
            if (!StringUtil.isEmpty(persons.getFirstName())) {
                persons.setFirstChar(PinyinUtils.getPinYin(persons.getFirstName()));
            }
            Date d = new Date();
            persons.setLastUpdatedStamp(d);
            persons.setOpType("更新");
            or = rtyOADialPersonsService.updateRtyOADialPersons(persons);
        } catch (Exception e) {
            e.printStackTrace();
            or = new OperationResult<>();
            or.setStatus(OperationResult.STATUS_FAILURE);
            or.setMessage("更新失败: " + e.getMessage());
        }

        return or;
    }

    @RequestMapping(value = "/getRtyOADialPersonsByFirstChar", method = {RequestMethod.GET, RequestMethod.POST})
    @ApiOperation(value = "根据拼音查数据", notes = "中文也可以，后台默认将中文转成拼音")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "firstChar", value = "拼音or中文", paramType = "query")
    })
    public OperationResult<List<RtyOADialPersons>> getRtyOADialPersonsByFirstChar(String firstChar) {
        OperationResult<List<RtyOADialPersons>> or = null;
        try {
            or = rtyOADialPersonsService.getRtyOADialPersonsByFirstChar(firstChar);
        } catch (Exception e) {
            e.printStackTrace();
            or = new OperationResult<>();
            or.setStatus(OperationResult.STATUS_FAILURE);
            or.setMessage(e.getMessage());
        }

        return or;
    }


}
