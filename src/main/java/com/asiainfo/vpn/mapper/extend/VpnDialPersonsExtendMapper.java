package com.asiainfo.vpn.mapper.extend;

import com.asiainfo.vpn.bean.VpnDialPersons;
import com.asiainfo.vpn.bean.extend.VpnDialPersonsExtend;

import java.util.Date;
import java.util.List;

public interface VpnDialPersonsExtendMapper {

    List<VpnDialPersonsExtend> selectVpnDialRecordsWithExtra(VpnDialPersons persons, Date startDate, Date endDate);
}
