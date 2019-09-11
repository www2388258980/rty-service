package com.asiainfo.vpn.mapper;

import com.asiainfo.vpn.bean.organization;
import com.asiainfo.vpn.bean.organizationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface organizationMapper {
    long countByExample(organizationExample example);

    int deleteByExample(organizationExample example);

    int insert(organization record);

    int insertSelective(organization record);

    List<organization> selectByExample(organizationExample example);

    int updateByExampleSelective(@Param("record") organization record, @Param("example") organizationExample example);

    int updateByExample(@Param("record") organization record, @Param("example") organizationExample example);
}