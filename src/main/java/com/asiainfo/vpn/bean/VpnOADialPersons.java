package com.asiainfo.vpn.bean;

import java.util.Date;

public class VpnOADialPersons {
    private String dialPersonId;

    private String firstName;

    private String telecomNumber;

    private String countName;

    private String status;

    private String description;

    private String firstChar;

    private String departmentId;

    private String createdBy;

    private String modifiedBy;

    private String billId;

    private String modifiedBillId;

    private String vpnTypeId;

    private String opType;

    private Date lastUpdatedStamp;

    private Date lastUpdatedTxStamp;

    private Date createdStamp;

    private Date createdTxStamp;

    public String getDialPersonId() {
        return dialPersonId;
    }

    public void setDialPersonId(String dialPersonId) {
        this.dialPersonId = dialPersonId == null ? null : dialPersonId.trim();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName == null ? null : firstName.trim();
    }

    public String getTelecomNumber() {
        return telecomNumber;
    }

    public void setTelecomNumber(String telecomNumber) {
        this.telecomNumber = telecomNumber == null ? null : telecomNumber.trim();
    }

    public String getCountName() {
        return countName;
    }

    public void setCountName(String countName) {
        this.countName = countName == null ? null : countName.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getFirstChar() {
        return firstChar;
    }

    public void setFirstChar(String firstChar) {
        this.firstChar = firstChar == null ? null : firstChar.trim();
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId == null ? null : departmentId.trim();
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy == null ? null : createdBy.trim();
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy == null ? null : modifiedBy.trim();
    }

    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId == null ? null : billId.trim();
    }

    public String getModifiedBillId() {
        return modifiedBillId;
    }

    public void setModifiedBillId(String modifiedBillId) {
        this.modifiedBillId = modifiedBillId == null ? null : modifiedBillId.trim();
    }

    public String getVpnTypeId() {
        return vpnTypeId;
    }

    public void setVpnTypeId(String vpnTypeId) {
        this.vpnTypeId = vpnTypeId == null ? null : vpnTypeId.trim();
    }

    public String getOpType() {
        return opType;
    }

    public void setOpType(String opType) {
        this.opType = opType == null ? null : opType.trim();
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
}