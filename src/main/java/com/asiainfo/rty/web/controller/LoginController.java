package com.asiainfo.rty.web.controller;

import com.asiainfo.rty.bean.User;
import com.asiainfo.rty.service.ILoginService;
import com.asiainfo.rty.utils.OperationResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/user")
@RestController
@Api(tags = "登录接口")
@CrossOrigin
public class LoginController {
    @Autowired
    private ILoginService loginService;

    @RequestMapping("/login")
    @ApiOperation(value = "登录验证")
    public OperationResult<User> login(User user) {

        OperationResult<User> or = loginService.login(user);

        return or;
    }
}
