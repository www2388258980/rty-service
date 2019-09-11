package com.asiainfo.vpn.mapper;

import com.asiainfo.vpn.bean.enumeration;
import com.asiainfo.vpn.bean.enumerationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface enumerationMapper {
    long countByExample(enumerationExample example);

    int deleteByExample(enumerationExample example);

    int insert(enumeration record);

    int insertSelective(enumeration record);

    List<enumeration> selectByExample(enumerationExample example);

    int updateByExampleSelective(@Param("record") enumeration record, @Param("example") enumerationExample example);

    int updateByExample(@Param("record") enumeration record, @Param("example") enumerationExample example);
}