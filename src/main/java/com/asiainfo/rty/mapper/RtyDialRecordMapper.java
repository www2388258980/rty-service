package com.asiainfo.rty.mapper;

import com.asiainfo.rty.bean.RtyDialRecord;
import com.asiainfo.rty.bean.RtyDialRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RtyDialRecordMapper {
    long countByExample(RtyDialRecordExample example);

    int deleteByExample(RtyDialRecordExample example);

    int deleteByPrimaryKey(String vpnDialRecordId);

    int insert(RtyDialRecord record);

    int insertSelective(RtyDialRecord record);

    List<RtyDialRecord> selectByExample(RtyDialRecordExample example);

    RtyDialRecord selectByPrimaryKey(String vpnDialRecordId);

    int updateByExampleSelective(@Param("record") RtyDialRecord record, @Param("example") RtyDialRecordExample example);

    int updateByExample(@Param("record") RtyDialRecord record, @Param("example") RtyDialRecordExample example);

    int updateByPrimaryKeySelective(RtyDialRecord record);

    int updateByPrimaryKey(RtyDialRecord record);
}