package com.asiainfo.vpn.mapper.extend;

import com.asiainfo.vpn.bean.VpnDialPersonsHis;
import com.asiainfo.vpn.bean.extend.VpnDialPersonsHisExtend;

import java.util.Date;
import java.util.List;

public interface VpnDialPersonsHisExtendMapper {

    List<VpnDialPersonsHisExtend> selectVpnDialPersonsHisWithExtra(VpnDialPersonsHis his, Date startDate, Date endDate);
}
