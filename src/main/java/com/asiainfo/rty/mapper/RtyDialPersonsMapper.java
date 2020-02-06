package com.asiainfo.rty.mapper;

import com.asiainfo.rty.bean.RtyDialPersons;
import com.asiainfo.rty.bean.RtyDialPersonsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RtyDialPersonsMapper {
    long countByExample(RtyDialPersonsExample example);

    int deleteByExample(RtyDialPersonsExample example);

    int deleteByPrimaryKey(String dialPersonId);

    int insert(RtyDialPersons record);

    int insertSelective(RtyDialPersons record);

    List<RtyDialPersons> selectByExample(RtyDialPersonsExample example);

    RtyDialPersons selectByPrimaryKey(String dialPersonId);

    int updateByExampleSelective(@Param("record") RtyDialPersons record, @Param("example") RtyDialPersonsExample example);

    int updateByExample(@Param("record") RtyDialPersons record, @Param("example") RtyDialPersonsExample example);

    int updateByPrimaryKeySelective(RtyDialPersons record);

    int updateByPrimaryKey(RtyDialPersons record);
}