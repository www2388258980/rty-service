package com.asiainfo.vpn.mapper;

import com.asiainfo.vpn.bean.VpnOADialPersons;
import com.asiainfo.vpn.bean.VpnOADialPersonsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VpnOADialPersonsMapper {
    long countByExample(VpnOADialPersonsExample example);

    int deleteByExample(VpnOADialPersonsExample example);

    int deleteByPrimaryKey(String dialPersonId);

    int insert(VpnOADialPersons record);

    int insertSelective(VpnOADialPersons record);

    List<VpnOADialPersons> selectByExample(VpnOADialPersonsExample example);

    VpnOADialPersons selectByPrimaryKey(String dialPersonId);

    int updateByExampleSelective(@Param("record") VpnOADialPersons record, @Param("example") VpnOADialPersonsExample example);

    int updateByExample(@Param("record") VpnOADialPersons record, @Param("example") VpnOADialPersonsExample example);

    int updateByPrimaryKeySelective(VpnOADialPersons record);

    int updateByPrimaryKey(VpnOADialPersons record);
}