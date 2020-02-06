package com.asiainfo.rty.mapper;

import com.asiainfo.rty.bean.RtyOADialPersons;
import com.asiainfo.rty.bean.RtyOADialPersonsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RtyOADialPersonsMapper {
    long countByExample(RtyOADialPersonsExample example);

    int deleteByExample(RtyOADialPersonsExample example);

    int deleteByPrimaryKey(String dialPersonId);

    int insert(RtyOADialPersons record);

    int insertSelective(RtyOADialPersons record);

    List<RtyOADialPersons> selectByExample(RtyOADialPersonsExample example);

    RtyOADialPersons selectByPrimaryKey(String dialPersonId);

    int updateByExampleSelective(@Param("record") RtyOADialPersons record, @Param("example") RtyOADialPersonsExample example);

    int updateByExample(@Param("record") RtyOADialPersons record, @Param("example") RtyOADialPersonsExample example);

    int updateByPrimaryKeySelective(RtyOADialPersons record);

    int updateByPrimaryKey(RtyOADialPersons record);
}