package com.asiainfo.rty.bean.extend;

import com.asiainfo.rty.bean.Organization;
import com.asiainfo.rty.bean.RtyDialPersons;
import com.asiainfo.rty.bean.User;

public class RtyDialPersonsExtend extends RtyDialPersons {
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
