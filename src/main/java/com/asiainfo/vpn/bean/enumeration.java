package com.asiainfo.vpn.bean;

import java.util.Date;

public class enumeration {
    private String enumId;

    private String enumTypeId;

    private String enumCode;

    private String sequenceId;

    private String description;

    private Date lastUpdatedStamp;

    private Date lastUpdatedTxStamp;

    private Date createdStamp;

    private Date createdTxStamp;

    private String comments;

    private Integer enumCodeNumber;

    public String getEnumId() {
        return enumId;
    }

    public void setEnumId(String enumId) {
        this.enumId = enumId == null ? null : enumId.trim();
    }

    public String getEnumTypeId() {
        return enumTypeId;
    }

    public void setEnumTypeId(String enumTypeId) {
        this.enumTypeId = enumTypeId == null ? null : enumTypeId.trim();
    }

    public String getEnumCode() {
        return enumCode;
    }

    public void setEnumCode(String enumCode) {
        this.enumCode = enumCode == null ? null : enumCode.trim();
    }

    public String getSequenceId() {
        return sequenceId;
    }

    public void setSequenceId(String sequenceId) {
        this.sequenceId = sequenceId == null ? null : sequenceId.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
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

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments == null ? null : comments.trim();
    }

    public Integer getEnumCodeNumber() {
        return enumCodeNumber;
    }

    public void setEnumCodeNumber(Integer enumCodeNumber) {
        this.enumCodeNumber = enumCodeNumber;
    }
}