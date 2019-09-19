package com.asiainfo.vpn.mapper;

import com.asiainfo.vpn.bean.VpnDialPersons;
import com.asiainfo.vpn.bean.VpnDialPersonsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

public interface VpnDialPersonsMapper {
    long countByExample(VpnDialPersonsExample example);

    int deleteByExample(VpnDialPersonsExample example);

    int insert(VpnDialPersons record);

    int insertSelective(VpnDialPersons record);

    List<VpnDialPersons> selectByExample(VpnDialPersonsExample example);

    int updateByExampleSelective(@Param("record") VpnDialPersons record, @Param("example") VpnDialPersonsExample example);

    int updateByExample(@Param("record") VpnDialPersons record, @Param("example") VpnDialPersonsExample example);
}