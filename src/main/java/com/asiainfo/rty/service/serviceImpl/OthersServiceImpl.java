package com.asiainfo.rty.service.serviceImpl;

import com.asiainfo.rty.bean.Organization;
import com.asiainfo.rty.bean.OrganizationExample;
import com.asiainfo.rty.mapper.OrganizationMapper;
import com.asiainfo.rty.service.OthersService;
import com.asiainfo.rty.utils.OperationResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OthersServiceImpl implements OthersService {

    @Autowired
    private OrganizationMapper organizationMapper;


    @Override
    public OperationResult<List<Organization>> getDepartments() throws Exception {

        List<Organization> organizations = organizationMapper.selectByExample(new OrganizationExample());

        OperationResult<List<Organization>> or = new OperationResult<>();
        or.setStatus(OperationResult.STATUS_SUCCESS);
        or.setData(organizations);
        or.setMessage("查询成功.");

        return or;
    }
}
