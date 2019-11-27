package com.asiainfo.vpn.service;

import com.asiainfo.vpn.bean.Organization;
import com.asiainfo.vpn.utils.OperationResult;

import java.util.List;


public interface OthersService {

    /*
     * 获取所有部门
     */
    public OperationResult<List<Organization>> getDepartments() throws Exception;
}
