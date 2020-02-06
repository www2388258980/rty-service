package com.asiainfo.rty.service;

import com.asiainfo.rty.bean.Organization;
import com.asiainfo.rty.utils.OperationResult;

import java.util.List;


public interface OthersService {

    /*
     * 获取所有部门
     */
    public OperationResult<List<Organization>> getDepartments() throws Exception;
}
