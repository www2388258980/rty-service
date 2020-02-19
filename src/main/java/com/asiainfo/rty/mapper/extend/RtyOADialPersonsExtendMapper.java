package com.asiainfo.rty.mapper.extend;

import com.asiainfo.rty.bean.RtyOADialPersons;
import com.asiainfo.rty.bean.RtyOADialPersonsHis;
import com.asiainfo.rty.bean.extend.RtyOADialPersonsExtend;
import com.asiainfo.rty.bean.extend.RtyOADialPersonsHisExtend;

import java.util.Date;
import java.util.List;

public interface RtyOADialPersonsExtendMapper {

    List<RtyOADialPersonsExtend> selectRtyOADialPersonsWithExtra(RtyOADialPersons persons, Date startDate, Date endDate);

    List<RtyOADialPersonsHisExtend> selectRtyOADialPersonsHisWithExtra(RtyOADialPersonsHis his, Date startDate, Date endDate);
}
