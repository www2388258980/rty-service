package com.asiainfo.rty.mapper;

import com.asiainfo.rty.bean.RtyOADialPersonsHis;
import com.asiainfo.rty.bean.RtyOADialPersonsHisExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RtyOADialPersonsHisMapper {
    long countByExample(RtyOADialPersonsHisExample example);

    int deleteByExample(RtyOADialPersonsHisExample example);

    int deleteByPrimaryKey(String historyId);

    int insert(RtyOADialPersonsHis record);

    int insertSelective(RtyOADialPersonsHis record);

    List<RtyOADialPersonsHis> selectByExample(RtyOADialPersonsHisExample example);

    RtyOADialPersonsHis selectByPrimaryKey(String historyId);

    int updateByExampleSelective(@Param("record") RtyOADialPersonsHis record, @Param("example") RtyOADialPersonsHisExample example);

    int updateByExample(@Param("record") RtyOADialPersonsHis record, @Param("example") RtyOADialPersonsHisExample example);

    int updateByPrimaryKeySelective(RtyOADialPersonsHis record);

    int updateByPrimaryKey(RtyOADialPersonsHis record);
}