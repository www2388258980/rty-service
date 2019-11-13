package com.asiainfo.vpn.bean.extend;

import com.asiainfo.vpn.bean.Enumeration;
import com.asiainfo.vpn.bean.Organization;
import com.asiainfo.vpn.bean.User;
import com.asiainfo.vpn.bean.VpnOADialPersonsHis;

public class VpnOADialPersonsHisExtend extends VpnOADialPersonsHis {
    private Organization department;

    private User createdByUser;

    private User modifiedByUser;

    private Enumeration vpnType;

    public Organization getDepartment() {
        return department;
    }

    public void setDepartment(Organization department) {
        this.department = department;
    }

    public User getCreatedByUser() {
        return createdByUser;
    }

    public void setCreatedByUser(User createdByUser) {
        this.createdByUser = createdByUser;
    }

    public User getModifiedByUser() {
        return modifiedByUser;
    }

    public void setModifiedByUser(User modifiedByUser) {
        this.modifiedByUser = modifiedByUser;
    }

    public Enumeration getVpnType() {
        return vpnType;
    }

    public void setVpnType(Enumeration vpnType) {
        this.vpnType = vpnType;
    }
}
