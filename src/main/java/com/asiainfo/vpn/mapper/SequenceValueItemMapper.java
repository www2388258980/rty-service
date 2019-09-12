package com.asiainfo.vpn.mapper;

import com.asiainfo.vpn.bean.SequenceValueItem;
import com.asiainfo.vpn.bean.SequenceValueItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SequenceValueItemMapper {
    long countByExample(SequenceValueItemExample example);

    int deleteByExample(SequenceValueItemExample example);

    int insert(SequenceValueItem record);

    int insertSelective(SequenceValueItem record);

    List<SequenceValueItem> selectByExample(SequenceValueItemExample example);

    int updateByExampleSelective(@Param("record") SequenceValueItem record, @Param("example") SequenceValueItemExample example);

    int updateByExample(@Param("record") SequenceValueItem record, @Param("example") SequenceValueItemExample example);
}