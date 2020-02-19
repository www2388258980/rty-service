package com.asiainfo.rty.web.controller;

import com.asiainfo.rty.bean.RtyDialPersons;
import com.asiainfo.rty.bean.RtyDialPersonsHis;
import com.asiainfo.rty.bean.extend.RtyDialPersonsExtend;
import com.asiainfo.rty.bean.extend.RtyDialPersonsHisExtend;
import com.asiainfo.rty.config.DateConverterConfig;
import com.asiainfo.rty.service.IRtyDialPersonsService;
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


@RequestMapping("/rtyDialPersons")
@RestController
@Api(tags = "操作Rty_DIAL_PERSONS和Rty_DIAL_PERSONS_HISTORY两张表")
@CrossOrigin
public class RtyDialPersonsController {

    @Autowired
    private IRtyDialPersonsService rtyDialPersonsService;
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
    @ApiOperation(value = "插入一条数据,同时向其历史表也插入一条数据", notes = "中文名对应的拼音后台生成,创建时间,最后更新时间后台生成.")
    public OperationResult<Boolean> insert(RtyDialPersons persons) {
        OperationResult<Boolean> or = null;
        try {
            // 转换数据
            Date date = new Date();
            persons.setCreatedStamp(date);
            persons.setLastUpdatedStamp(date);
            persons.setFirstChar(PinyinUtils.getPinYin(persons.getFirstName()));

            or = rtyDialPersonsService.insert(persons);
        } catch (Exception e) {
            e.printStackTrace();
            or = new OperationResult<>();
            or.setStatus(OperationResult.STATUS_FAILURE);
            or.setData(false);
        }

        return or;
    }

    @RequestMapping(value = "/getRtyDialPersons", method = {RequestMethod.GET, RequestMethod.POST})
    @ApiOperation(value = "根据条件查询数据,根据时间降序", notes = "根据姓名,拼音模糊,状态,创建人")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "startDate", value = "最后更新时间>=,时间戳", paramType = "query"),
            @ApiImplicitParam(name = "endDate", value = "最后更新时间<=,时间戳", paramType = "query"),
            @ApiImplicitParam(name = "size", value = "第几页", required = true, paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "每页几条", required = true, paramType = "query")
    })
    public OperationResult<List<RtyDialPersonsExtend>> getRtyDialPersons(RtyDialPersons persons, Long startDate, Long endDate,
                                                                         int size, int pageSize) {
        OperationResult<List<RtyDialPersonsExtend>> or = null;
        try {
            // 转换
            Date start = null;
            Date end = null;
            if (startDate != null) {
                start = new Date(startDate);
            }
            if (endDate != null) {
                end = new Date(endDate);
            }

            or = rtyDialPersonsService.getRtyDailPersons(persons, start, end, size, pageSize);
        } catch (Exception e) {
            e.printStackTrace();
            or = new OperationResult<>();
            or.setStatus(OperationResult.STATUS_FAILURE);
            or.setMessage(e.getMessage());
        }

        return or;

    }

    @RequestMapping(value = "/getRtyDialPersonsHis", method = {RequestMethod.GET, RequestMethod.POST})
    @ApiOperation(value = "根据条件查询数据[历史数据],根据时间降序", notes = "根据姓名,拼音模糊,状态,创建人")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "startDate", value = "最后更新时间>=,时间戳", paramType = "query"),
            @ApiImplicitParam(name = "endDate", value = "最后更新时间<=,时间戳", paramType = "query"),
            @ApiImplicitParam(name = "size", value = "第几页", required = true, paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "每页几条", required = true, paramType = "query")
    })
    public OperationResult<List<RtyDialPersonsHisExtend>> getRtyDialPersonsHis(RtyDialPersonsHis his, Long startDate, Long endDate,
                                                                               int size, int pageSize) {
        OperationResult<List<RtyDialPersonsHisExtend>> or = null;
        try {
            // 转换
            Date start = null;
            Date end = null;
            if (startDate != null) {
                start = new Date(startDate);
            }
            if (endDate != null) {
                end = new Date(endDate);
            }

            or = rtyDialPersonsService.getRtyDialPersonsHis(his, start, end, size, pageSize);
            System.out.println("total：" + or.getTotal());
        } catch (Exception e) {
            e.printStackTrace();
            or = new OperationResult<>();
            or.setStatus(OperationResult.STATUS_FAILURE);
            or.setMessage(e.getMessage());
        }

        return or;

    }

    @RequestMapping(value = "/getRtyDialPersonsByKey", method = {RequestMethod.GET, RequestMethod.POST})
    @ApiOperation(value = "根据主键拿取数据", notes = "主键为空抛出异常")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "id", value = "主键", paramType = "query", required = true)
    })
    public OperationResult<RtyDialPersons> getRtyDailPersonsBykey(String id) {
        OperationResult<RtyDialPersons> or = null;
        try {
            or = rtyDialPersonsService.getRtyDialPersonsByPrimaryKey(id);
        } catch (Exception e) {
            e.printStackTrace();
            or = new OperationResult<>();
            or.setStatus(OperationResult.STATUS_FAILURE);
            or.setMessage(e.getMessage());
        }

        return or;
    }

    @RequestMapping(value = "/updateRtyDialPersons", method = {RequestMethod.GET, RequestMethod.POST})
    @ApiOperation(value = "根据主键更新数据", notes = "需要更新那些字段就将其传入")
    public OperationResult<Boolean> updateRtyDialPersons(RtyDialPersons persons) {
        OperationResult<Boolean> or = null;
        try {
            // 转换
            if (!StringUtil.isEmpty(persons.getFirstName())) {
                persons.setFirstChar(PinyinUtils.getPinYin(persons.getFirstName()));
            }
            Date d = new Date();
            persons.setLastUpdatedStamp(d);
            persons.setOpType("更新");

            or = rtyDialPersonsService.updateRtyDialPersons(persons);

        } catch (Exception e) {
            e.printStackTrace();
            or = new OperationResult<>();
            or.setStatus(OperationResult.STATUS_FAILURE);
            or.setData(false);
            or.setMessage(e.getMessage());
        }

        return or;
    }

    @RequestMapping(value = "/getRtyDialPersonsByFirstChar", method = {RequestMethod.GET, RequestMethod.POST})
    @ApiOperation(value = "根据拼音查数据", notes = "中文也可以，后台默认将中文转成拼音")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "firstChar", value = "拼音or中文", paramType = "query")
    })
    public OperationResult<List<RtyDialPersons>> getRtyDialPersonsByFirstChar(String firstChar) {
        OperationResult<List<RtyDialPersons>> or = null;
        try {
            System.out.println("firstChar: " + firstChar);
            or = rtyDialPersonsService.getRtyDialPersonsByFirstChar(firstChar);
        } catch (Exception e) {
            e.printStackTrace();
            or = new OperationResult<>();
            or.setStatus(OperationResult.STATUS_FAILURE);
            or.setMessage(e.getMessage());
        }

        return or;
    }
}
