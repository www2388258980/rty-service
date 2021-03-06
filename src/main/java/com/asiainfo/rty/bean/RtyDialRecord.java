package com.asiainfo.rty.bean;

import java.util.Date;

public class RtyDialRecord {
    private String vpnDialRecordId;

    private String firstName;

    private String vpnDialCause;

    private String description;

    private Date dialDate;

    private Date createdDate;

    private Date lastUpdatedStamp;

    private Date createdStamp;

    private String createdByUserLogin;

    private String telecomNumber;

    private String departmentId;

    public String getVpnDialRecordId() {
        return vpnDialRecordId;
    }

    public void setVpnDialRecordId(String vpnDialRecordId) {
        this.vpnDialRecordId = vpnDialRecordId == null ? null : vpnDialRecordId.trim();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName == null ? null : firstName.trim();
    }

    public String getVpnDialCause() {
        return vpnDialCause;
    }

    public void setVpnDialCause(String vpnDialCause) {
        this.vpnDialCause = vpnDialCause == null ? null : vpnDialCause.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Date getDialDate() {
        return dialDate;
    }

    public void setDialDate(Date dialDate) {
        this.dialDate = dialDate;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getLastUpdatedStamp() {
        return lastUpdatedStamp;
    }

    public void setLastUpdatedStamp(Date lastUpdatedStamp) {
        this.lastUpdatedStamp = lastUpdatedStamp;
    }

    public Date getCreatedStamp() {
        return createdStamp;
    }

    public void setCreatedStamp(Date createdStamp) {
        this.createdStamp = createdStamp;
    }

    public String getCreatedByUserLogin() {
        return createdByUserLogin;
    }

    public void setCreatedByUserLogin(String createdByUserLogin) {
        this.createdByUserLogin = createdByUserLogin == null ? null : createdByUserLogin.trim();
    }

    public String getTelecomNumber() {
        return telecomNumber;
    }

    public void setTelecomNumber(String telecomNumber) {
        this.telecomNumber = telecomNumber == null ? null : telecomNumber.trim();
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId == null ? null : departmentId.trim();
    }
}