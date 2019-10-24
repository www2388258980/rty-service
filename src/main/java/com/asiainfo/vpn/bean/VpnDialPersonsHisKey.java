package com.asiainfo.vpn.bean;

import java.util.Date;

public class VpnDialPersonsHisKey {
    private String historyId;

    private Date lastUpdatedStamp;

    public String getHistoryId() {
        return historyId;
    }

    public void setHistoryId(String historyId) {
        this.historyId = historyId == null ? null : historyId.trim();
    }

    public Date getLastUpdatedStamp() {
        return lastUpdatedStamp;
    }

    public void setLastUpdatedStamp(Date lastUpdatedStamp) {
        this.lastUpdatedStamp = lastUpdatedStamp;
    }
}