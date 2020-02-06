package com.asiainfo.rty.web.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// @RestController注解相当于@ResponseBody ＋ @Controller
@RequestMapping("/demo")
@RestController
@Api(tags = "测试类,主要是看springboot启动是否成功!")
public class DemoController {

    @RequestMapping("/sayHello")
    @ApiOperation(value = "返回一个字符串。")
    public String sayHello(){
        return "hello!";
    }
}
