package com.asiainfo.vpn.bean.extend;

import com.asiainfo.vpn.bean.Organization;
import com.asiainfo.vpn.bean.User;
import com.asiainfo.vpn.bean.VpnDialRecord;

public class VpnDialRecordExtend extends VpnDialRecord {
    private Organization department;
    private User user;

    public Organization getDepartment() {
        return department;
    }

    public void setDepartment(Organization department) {
        this.department = department;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
