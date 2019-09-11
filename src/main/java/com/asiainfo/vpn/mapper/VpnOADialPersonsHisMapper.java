package com.asiainfo.vpn.mapper;

import com.asiainfo.vpn.bean.VpnOADialPersonsHis;
import com.asiainfo.vpn.bean.VpnOADialPersonsHisExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VpnOADialPersonsHisMapper {
    long countByExample(VpnOADialPersonsHisExample example);

    int deleteByExample(VpnOADialPersonsHisExample example);

    int insert(VpnOADialPersonsHis record);

    int insertSelective(VpnOADialPersonsHis record);

    List<VpnOADialPersonsHis> selectByExample(VpnOADialPersonsHisExample example);

    int updateByExampleSelective(@Param("record") VpnOADialPersonsHis record, @Param("example") VpnOADialPersonsHisExample example);

    int updateByExample(@Param("record") VpnOADialPersonsHis record, @Param("example") VpnOADialPersonsHisExample example);
}