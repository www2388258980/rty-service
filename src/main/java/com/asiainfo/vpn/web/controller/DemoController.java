package com.asiainfo.vpn.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/demo")
@RestController
public class DemoController {

    @RequestMapping("/sayHello")
    public String sayHello(){
        return "hello!";
    }
}
