package com.asiainfo.rty.mapper;

import com.asiainfo.rty.bean.RtyDialPersonsHis;
import com.asiainfo.rty.bean.RtyDialPersonsHisExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RtyDialPersonsHisMapper {
    long countByExample(RtyDialPersonsHisExample example);

    int deleteByExample(RtyDialPersonsHisExample example);

    int deleteByPrimaryKey(String historyId);

    int insert(RtyDialPersonsHis record);

    int insertSelective(RtyDialPersonsHis record);

    List<RtyDialPersonsHis> selectByExample(RtyDialPersonsHisExample example);

    RtyDialPersonsHis selectByPrimaryKey(String historyId);

    int updateByExampleSelective(@Param("record") RtyDialPersonsHis record, @Param("example") RtyDialPersonsHisExample example);

    int updateByExample(@Param("record") RtyDialPersonsHis record, @Param("example") RtyDialPersonsHisExample example);

    int updateByPrimaryKeySelective(RtyDialPersonsHis record);

    int updateByPrimaryKey(RtyDialPersonsHis record);
}