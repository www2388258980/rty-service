package com.asiainfo.rty.mapper.extend;

import com.asiainfo.rty.bean.RtyDialPersons;
import com.asiainfo.rty.bean.extend.RtyDialPersonsExtend;

import java.util.Date;
import java.util.List;

public interface RtyDialPersonsExtendMapper {

    List<RtyDialPersonsExtend> selectRtyDialRecordsWithExtra(RtyDialPersons persons, Date startDate, Date endDate);
}
