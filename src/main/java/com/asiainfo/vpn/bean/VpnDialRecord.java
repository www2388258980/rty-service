package com.asiainfo.vpn.bean;

import java.util.Date;

public class VpnDialRecord {
    private String vpnDialRecordId;

    private String firstName;

    private String vpnDialCause;

    private String description;

    private Date dialDate;

    private Date createdDate;

    private Date lastUpdatedStamp;

    private Date lastUpdatedTxStamp;

    private Date createdStamp;

    private Date createdTxStamp;

    private String createdByUserLogin;

    private String telecomNumber;

    private String department;

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

    public Date getLastUpdatedTxStamp() {
        return lastUpdatedTxStamp;
    }

    public void setLastUpdatedTxStamp(Date lastUpdatedTxStamp) {
        this.lastUpdatedTxStamp = lastUpdatedTxStamp;
    }

    public Date getCreatedStamp() {
        return createdStamp;
    }

    public void setCreatedStamp(Date createdStamp) {
        this.createdStamp = createdStamp;
    }

    public Date getCreatedTxStamp() {
        return createdTxStamp;
    }

    public void setCreatedTxStamp(Date createdTxStamp) {
        this.createdTxStamp = createdTxStamp;
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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }
}