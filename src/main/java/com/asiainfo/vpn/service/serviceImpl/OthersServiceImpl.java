package com.asiainfo.vpn.service.serviceImpl;

import com.asiainfo.vpn.bean.Organization;
import com.asiainfo.vpn.bean.OrganizationExample;
import com.asiainfo.vpn.mapper.OrganizationMapper;
import com.asiainfo.vpn.service.OthersService;
import com.asiainfo.vpn.utils.OperationResult;
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
