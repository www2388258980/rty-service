package com.asiainfo.rty.service;

import com.asiainfo.rty.bean.User;
import com.asiainfo.rty.utils.OperationResult;

public interface ILoginService {
    OperationResult<User> login(User user);
}
