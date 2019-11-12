package com.asiainfo.vpn.mapper.extend;

import com.asiainfo.vpn.bean.VpnDialRecord;
import com.asiainfo.vpn.bean.extend.VpnDialRecordExtend;

import java.util.Date;
import java.util.List;

public interface VpnDialRecordExtendMapper {

    List<VpnDialRecordExtend> selectVpnDialRecordsWithExtra(VpnDialRecord record, Date startDate, Date endDate);
}
