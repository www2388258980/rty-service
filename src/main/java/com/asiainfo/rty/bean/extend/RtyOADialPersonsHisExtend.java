package com.asiainfo.rty.bean.extend;

import com.asiainfo.rty.bean.Enumeration;
import com.asiainfo.rty.bean.Organization;
import com.asiainfo.rty.bean.RtyOADialPersonsHis;
import com.asiainfo.rty.bean.User;

public class RtyOADialPersonsHisExtend extends RtyOADialPersonsHis {
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
