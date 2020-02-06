package com.asiainfo.rty.mapper;

import com.asiainfo.rty.bean.SequenceValueItem;
import com.asiainfo.rty.bean.SequenceValueItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SequenceValueItemMapper {
    long countByExample(SequenceValueItemExample example);

    int deleteByExample(SequenceValueItemExample example);

    int deleteByPrimaryKey(String seqName);

    int insert(SequenceValueItem record);

    int insertSelective(SequenceValueItem record);

    List<SequenceValueItem> selectByExample(SequenceValueItemExample example);

    SequenceValueItem selectByPrimaryKey(String seqName);

    int updateByExampleSelective(@Param("record") SequenceValueItem record, @Param("example") SequenceValueItemExample example);

    int updateByExample(@Param("record") SequenceValueItem record, @Param("example") SequenceValueItemExample example);

    int updateByPrimaryKeySelective(SequenceValueItem record);

    int updateByPrimaryKey(SequenceValueItem record);
}