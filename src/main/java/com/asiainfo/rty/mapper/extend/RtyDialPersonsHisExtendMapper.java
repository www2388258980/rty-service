package com.asiainfo.rty.mapper.extend;

import com.asiainfo.rty.bean.RtyDialPersonsHis;
import com.asiainfo.rty.bean.extend.RtyDialPersonsHisExtend;

import java.util.Date;
import java.util.List;

public interface RtyDialPersonsHisExtendMapper {

    List<RtyDialPersonsHisExtend> selectRtyDialPersonsHisWithExtra(RtyDialPersonsHis his, Date startDate, Date endDate);
}
