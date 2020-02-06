package com.asiainfo.rty.bean.extend;

import com.asiainfo.rty.bean.Organization;
import com.asiainfo.rty.bean.RtyDialPersonsHis;
import com.asiainfo.rty.bean.User;

public class RtyDialPersonsHisExtend extends RtyDialPersonsHis {
    private Organization department;

    private User createdByUser;

    private User modifiedByUser;

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
}
