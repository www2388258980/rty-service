package com.asiainfo.rty.bean.extend;

import com.asiainfo.rty.bean.Organization;
import com.asiainfo.rty.bean.RtyDialRecord;
import com.asiainfo.rty.bean.User;

public class RtyDialRecordExtend extends RtyDialRecord {
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
