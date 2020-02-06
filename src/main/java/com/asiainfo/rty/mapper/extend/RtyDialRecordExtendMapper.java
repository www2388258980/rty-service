package com.asiainfo.rty.mapper.extend;

import com.asiainfo.rty.bean.RtyDialRecord;
import com.asiainfo.rty.bean.extend.RtyDialRecordExtend;

import java.util.Date;
import java.util.List;

public interface RtyDialRecordExtendMapper {

    List<RtyDialRecordExtend> selectVpnDialRecordsWithExtra(RtyDialRecord record, Date startDate, Date endDate);
}
