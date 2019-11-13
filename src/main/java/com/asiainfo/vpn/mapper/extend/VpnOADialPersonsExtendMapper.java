package com.asiainfo.vpn.mapper.extend;

import com.asiainfo.vpn.bean.VpnOADialPersons;
import com.asiainfo.vpn.bean.VpnOADialPersonsHis;
import com.asiainfo.vpn.bean.extend.VpnOADialPersonsExtend;
import com.asiainfo.vpn.bean.extend.VpnOADialPersonsHisExtend;

import java.util.Date;
import java.util.List;

public interface VpnOADialPersonsExtendMapper {

    List<VpnOADialPersonsExtend> selectVpnOADialPersonsWithExtra(VpnOADialPersons persons, Date startDate, Date endDate);

    List<VpnOADialPersonsHisExtend> selectVpnOADialPersonsHisWithExtra(VpnOADialPersonsHis his, Date startDate, Date endDate);
}
