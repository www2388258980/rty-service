package com.asiainfo.rty.service.serviceImpl;

import com.asiainfo.rty.bean.User;
import com.asiainfo.rty.mapper.UserMapper;
import com.asiainfo.rty.service.ILoginService;
import com.asiainfo.rty.utils.OperationResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements ILoginService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public OperationResult<User> login(User user) {
        User user2 = userMapper.selectByPrimaryKey(user.getId());

        OperationResult<User> or = new OperationResult<>();
        if (user2 != null && user.getPassword().equals(user2.getPassword())) {
            or.setStatus(OperationResult.STATUS_SUCCESS);
            or.setData(user2);
        } else {
            or.setStatus(OperationResult.STATUS_FAILURE);
        }
        return or;
    }
}
