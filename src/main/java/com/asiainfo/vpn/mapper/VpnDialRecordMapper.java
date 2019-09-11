package com.asiainfo.vpn.mapper;

import com.asiainfo.vpn.bean.VpnDialRecord;
import com.asiainfo.vpn.bean.VpnDialRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VpnDialRecordMapper {
    long countByExample(VpnDialRecordExample example);

    int deleteByExample(VpnDialRecordExample example);

    int insert(VpnDialRecord record);

    int insertSelective(VpnDialRecord record);

    List<VpnDialRecord> selectByExample(VpnDialRecordExample example);

    int updateByExampleSelective(@Param("record") VpnDialRecord record, @Param("example") VpnDialRecordExample example);

    int updateByExample(@Param("record") VpnDialRecord record, @Param("example") VpnDialRecordExample example);
}