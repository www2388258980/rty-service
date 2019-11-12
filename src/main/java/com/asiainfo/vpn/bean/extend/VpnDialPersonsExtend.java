package com.asiainfo.vpn.bean.extend;

import com.asiainfo.vpn.bean.Organization;
import com.asiainfo.vpn.bean.User;
import com.asiainfo.vpn.bean.VpnDialPersons;

public class VpnDialPersonsExtend extends VpnDialPersons {
    private Organization department;

    private User createdUser;

    private User modifiedUser;

    public Organization getDepartment() {
        return department;
    }

    public void setDepartment(Organization department) {
        this.department = department;
    }

    public User getCreatedUser() {
        return createdUser;
    }

    public void setCreatedUser(User createdUser) {
        this.createdUser = createdUser;
    }

    public User getModifiedUser() {
        return modifiedUser;
    }

    public void setModifiedUser(User modifiedUser) {
        this.modifiedUser = modifiedUser;
    }
}
