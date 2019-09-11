package com.asiainfo.vpn.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VpnDialRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VpnDialRecordExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andVpnDialRecordIdIsNull() {
            addCriterion("VPN_DIAL_RECORD_ID is null");
            return (Criteria) this;
        }

        public Criteria andVpnDialRecordIdIsNotNull() {
            addCriterion("VPN_DIAL_RECORD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andVpnDialRecordIdEqualTo(String value) {
            addCriterion("VPN_DIAL_RECORD_ID =", value, "vpnDialRecordId");
            return (Criteria) this;
        }

        public Criteria andVpnDialRecordIdNotEqualTo(String value) {
            addCriterion("VPN_DIAL_RECORD_ID <>", value, "vpnDialRecordId");
            return (Criteria) this;
        }

        public Criteria andVpnDialRecordIdGreaterThan(String value) {
            addCriterion("VPN_DIAL_RECORD_ID >", value, "vpnDialRecordId");
            return (Criteria) this;
        }

        public Criteria andVpnDialRecordIdGreaterThanOrEqualTo(String value) {
            addCriterion("VPN_DIAL_RECORD_ID >=", value, "vpnDialRecordId");
            return (Criteria) this;
        }

        public Criteria andVpnDialRecordIdLessThan(String value) {
            addCriterion("VPN_DIAL_RECORD_ID <", value, "vpnDialRecordId");
            return (Criteria) this;
        }

        public Criteria andVpnDialRecordIdLessThanOrEqualTo(String value) {
            addCriterion("VPN_DIAL_RECORD_ID <=", value, "vpnDialRecordId");
            return (Criteria) this;
        }

        public Criteria andVpnDialRecordIdLike(String value) {
            addCriterion("VPN_DIAL_RECORD_ID like", value, "vpnDialRecordId");
            return (Criteria) this;
        }

        public Criteria andVpnDialRecordIdNotLike(String value) {
            addCriterion("VPN_DIAL_RECORD_ID not like", value, "vpnDialRecordId");
            return (Criteria) this;
        }

        public Criteria andVpnDialRecordIdIn(List<String> values) {
            addCriterion("VPN_DIAL_RECORD_ID in", values, "vpnDialRecordId");
            return (Criteria) this;
        }

        public Criteria andVpnDialRecordIdNotIn(List<String> values) {
            addCriterion("VPN_DIAL_RECORD_ID not in", values, "vpnDialRecordId");
            return (Criteria) this;
        }

        public Criteria andVpnDialRecordIdBetween(String value1, String value2) {
            addCriterion("VPN_DIAL_RECORD_ID between", value1, value2, "vpnDialRecordId");
            return (Criteria) this;
        }

        public Criteria andVpnDialRecordIdNotBetween(String value1, String value2) {
            addCriterion("VPN_DIAL_RECORD_ID not between", value1, value2, "vpnDialRecordId");
            return (Criteria) this;
        }

        public Criteria andFirstNameIsNull() {
            addCriterion("FIRST_NAME is null");
            return (Criteria) this;
        }

        public Criteria andFirstNameIsNotNull() {
            addCriterion("FIRST_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andFirstNameEqualTo(String value) {
            addCriterion("FIRST_NAME =", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameNotEqualTo(String value) {
            addCriterion("FIRST_NAME <>", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameGreaterThan(String value) {
            addCriterion("FIRST_NAME >", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameGreaterThanOrEqualTo(String value) {
            addCriterion("FIRST_NAME >=", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameLessThan(String value) {
            addCriterion("FIRST_NAME <", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameLessThanOrEqualTo(String value) {
            addCriterion("FIRST_NAME <=", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameLike(String value) {
            addCriterion("FIRST_NAME like", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameNotLike(String value) {
            addCriterion("FIRST_NAME not like", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameIn(List<String> values) {
            addCriterion("FIRST_NAME in", values, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameNotIn(List<String> values) {
            addCriterion("FIRST_NAME not in", values, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameBetween(String value1, String value2) {
            addCriterion("FIRST_NAME between", value1, value2, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameNotBetween(String value1, String value2) {
            addCriterion("FIRST_NAME not between", value1, value2, "firstName");
            return (Criteria) this;
        }

        public Criteria andVpnDialCauseIsNull() {
            addCriterion("VPN_DIAL_CAUSE is null");
            return (Criteria) this;
        }

        public Criteria andVpnDialCauseIsNotNull() {
            addCriterion("VPN_DIAL_CAUSE is not null");
            return (Criteria) this;
        }

        public Criteria andVpnDialCauseEqualTo(String value) {
            addCriterion("VPN_DIAL_CAUSE =", value, "vpnDialCause");
            return (Criteria) this;
        }

        public Criteria andVpnDialCauseNotEqualTo(String value) {
            addCriterion("VPN_DIAL_CAUSE <>", value, "vpnDialCause");
            return (Criteria) this;
        }

        public Criteria andVpnDialCauseGreaterThan(String value) {
            addCriterion("VPN_DIAL_CAUSE >", value, "vpnDialCause");
            return (Criteria) this;
        }

        public Criteria andVpnDialCauseGreaterThanOrEqualTo(String value) {
            addCriterion("VPN_DIAL_CAUSE >=", value, "vpnDialCause");
            return (Criteria) this;
        }

        public Criteria andVpnDialCauseLessThan(String value) {
            addCriterion("VPN_DIAL_CAUSE <", value, "vpnDialCause");
            return (Criteria) this;
        }

        public Criteria andVpnDialCauseLessThanOrEqualTo(String value) {
            addCriterion("VPN_DIAL_CAUSE <=", value, "vpnDialCause");
            return (Criteria) this;
        }

        public Criteria andVpnDialCauseLike(String value) {
            addCriterion("VPN_DIAL_CAUSE like", value, "vpnDialCause");
            return (Criteria) this;
        }

        public Criteria andVpnDialCauseNotLike(String value) {
            addCriterion("VPN_DIAL_CAUSE not like", value, "vpnDialCause");
            return (Criteria) this;
        }

        public Criteria andVpnDialCauseIn(List<String> values) {
            addCriterion("VPN_DIAL_CAUSE in", values, "vpnDialCause");
            return (Criteria) this;
        }

        public Criteria andVpnDialCauseNotIn(List<String> values) {
            addCriterion("VPN_DIAL_CAUSE not in", values, "vpnDialCause");
            return (Criteria) this;
        }

        public Criteria andVpnDialCauseBetween(String value1, String value2) {
            addCriterion("VPN_DIAL_CAUSE between", value1, value2, "vpnDialCause");
            return (Criteria) this;
        }

        public Criteria andVpnDialCauseNotBetween(String value1, String value2) {
            addCriterion("VPN_DIAL_CAUSE not between", value1, value2, "vpnDialCause");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("DESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("DESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("DESCRIPTION =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("DESCRIPTION <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("DESCRIPTION >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("DESCRIPTION <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("DESCRIPTION like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("DESCRIPTION not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("DESCRIPTION in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("DESCRIPTION not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("DESCRIPTION between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("DESCRIPTION not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDialDateIsNull() {
            addCriterion("DIAL_DATE is null");
            return (Criteria) this;
        }

        public Criteria andDialDateIsNotNull() {
            addCriterion("DIAL_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andDialDateEqualTo(Date value) {
            addCriterion("DIAL_DATE =", value, "dialDate");
            return (Criteria) this;
        }

        public Criteria andDialDateNotEqualTo(Date value) {
            addCriterion("DIAL_DATE <>", value, "dialDate");
            return (Criteria) this;
        }

        public Criteria andDialDateGreaterThan(Date value) {
            addCriterion("DIAL_DATE >", value, "dialDate");
            return (Criteria) this;
        }

        public Criteria andDialDateGreaterThanOrEqualTo(Date value) {
            addCriterion("DIAL_DATE >=", value, "dialDate");
            return (Criteria) this;
        }

        public Criteria andDialDateLessThan(Date value) {
            addCriterion("DIAL_DATE <", value, "dialDate");
            return (Criteria) this;
        }

        public Criteria andDialDateLessThanOrEqualTo(Date value) {
            addCriterion("DIAL_DATE <=", value, "dialDate");
            return (Criteria) this;
        }

        public Criteria andDialDateIn(List<Date> values) {
            addCriterion("DIAL_DATE in", values, "dialDate");
            return (Criteria) this;
        }

        public Criteria andDialDateNotIn(List<Date> values) {
            addCriterion("DIAL_DATE not in", values, "dialDate");
            return (Criteria) this;
        }

        public Criteria andDialDateBetween(Date value1, Date value2) {
            addCriterion("DIAL_DATE between", value1, value2, "dialDate");
            return (Criteria) this;
        }

        public Criteria andDialDateNotBetween(Date value1, Date value2) {
            addCriterion("DIAL_DATE not between", value1, value2, "dialDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateIsNull() {
            addCriterion("CREATED_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCreatedDateIsNotNull() {
            addCriterion("CREATED_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedDateEqualTo(Date value) {
            addCriterion("CREATED_DATE =", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateNotEqualTo(Date value) {
            addCriterion("CREATED_DATE <>", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateGreaterThan(Date value) {
            addCriterion("CREATED_DATE >", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATED_DATE >=", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateLessThan(Date value) {
            addCriterion("CREATED_DATE <", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateLessThanOrEqualTo(Date value) {
            addCriterion("CREATED_DATE <=", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateIn(List<Date> values) {
            addCriterion("CREATED_DATE in", values, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateNotIn(List<Date> values) {
            addCriterion("CREATED_DATE not in", values, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateBetween(Date value1, Date value2) {
            addCriterion("CREATED_DATE between", value1, value2, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateNotBetween(Date value1, Date value2) {
            addCriterion("CREATED_DATE not between", value1, value2, "createdDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedStampIsNull() {
            addCriterion("LAST_UPDATED_STAMP is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedStampIsNotNull() {
            addCriterion("LAST_UPDATED_STAMP is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedStampEqualTo(Date value) {
            addCriterion("LAST_UPDATED_STAMP =", value, "lastUpdatedStamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedStampNotEqualTo(Date value) {
            addCriterion("LAST_UPDATED_STAMP <>", value, "lastUpdatedStamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedStampGreaterThan(Date value) {
            addCriterion("LAST_UPDATED_STAMP >", value, "lastUpdatedStamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedStampGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_UPDATED_STAMP >=", value, "lastUpdatedStamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedStampLessThan(Date value) {
            addCriterion("LAST_UPDATED_STAMP <", value, "lastUpdatedStamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedStampLessThanOrEqualTo(Date value) {
            addCriterion("LAST_UPDATED_STAMP <=", value, "lastUpdatedStamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedStampIn(List<Date> values) {
            addCriterion("LAST_UPDATED_STAMP in", values, "lastUpdatedStamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedStampNotIn(List<Date> values) {
            addCriterion("LAST_UPDATED_STAMP not in", values, "lastUpdatedStamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedStampBetween(Date value1, Date value2) {
            addCriterion("LAST_UPDATED_STAMP between", value1, value2, "lastUpdatedStamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedStampNotBetween(Date value1, Date value2) {
            addCriterion("LAST_UPDATED_STAMP not between", value1, value2, "lastUpdatedStamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedTxStampIsNull() {
            addCriterion("LAST_UPDATED_TX_STAMP is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedTxStampIsNotNull() {
            addCriterion("LAST_UPDATED_TX_STAMP is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedTxStampEqualTo(Date value) {
            addCriterion("LAST_UPDATED_TX_STAMP =", value, "lastUpdatedTxStamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedTxStampNotEqualTo(Date value) {
            addCriterion("LAST_UPDATED_TX_STAMP <>", value, "lastUpdatedTxStamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedTxStampGreaterThan(Date value) {
            addCriterion("LAST_UPDATED_TX_STAMP >", value, "lastUpdatedTxStamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedTxStampGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_UPDATED_TX_STAMP >=", value, "lastUpdatedTxStamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedTxStampLessThan(Date value) {
            addCriterion("LAST_UPDATED_TX_STAMP <", value, "lastUpdatedTxStamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedTxStampLessThanOrEqualTo(Date value) {
            addCriterion("LAST_UPDATED_TX_STAMP <=", value, "lastUpdatedTxStamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedTxStampIn(List<Date> values) {
            addCriterion("LAST_UPDATED_TX_STAMP in", values, "lastUpdatedTxStamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedTxStampNotIn(List<Date> values) {
            addCriterion("LAST_UPDATED_TX_STAMP not in", values, "lastUpdatedTxStamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedTxStampBetween(Date value1, Date value2) {
            addCriterion("LAST_UPDATED_TX_STAMP between", value1, value2, "lastUpdatedTxStamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedTxStampNotBetween(Date value1, Date value2) {
            addCriterion("LAST_UPDATED_TX_STAMP not between", value1, value2, "lastUpdatedTxStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedStampIsNull() {
            addCriterion("CREATED_STAMP is null");
            return (Criteria) this;
        }

        public Criteria andCreatedStampIsNotNull() {
            addCriterion("CREATED_STAMP is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedStampEqualTo(Date value) {
            addCriterion("CREATED_STAMP =", value, "createdStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedStampNotEqualTo(Date value) {
            addCriterion("CREATED_STAMP <>", value, "createdStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedStampGreaterThan(Date value) {
            addCriterion("CREATED_STAMP >", value, "createdStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedStampGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATED_STAMP >=", value, "createdStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedStampLessThan(Date value) {
            addCriterion("CREATED_STAMP <", value, "createdStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedStampLessThanOrEqualTo(Date value) {
            addCriterion("CREATED_STAMP <=", value, "createdStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedStampIn(List<Date> values) {
            addCriterion("CREATED_STAMP in", values, "createdStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedStampNotIn(List<Date> values) {
            addCriterion("CREATED_STAMP not in", values, "createdStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedStampBetween(Date value1, Date value2) {
            addCriterion("CREATED_STAMP between", value1, value2, "createdStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedStampNotBetween(Date value1, Date value2) {
            addCriterion("CREATED_STAMP not between", value1, value2, "createdStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedTxStampIsNull() {
            addCriterion("CREATED_TX_STAMP is null");
            return (Criteria) this;
        }

        public Criteria andCreatedTxStampIsNotNull() {
            addCriterion("CREATED_TX_STAMP is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedTxStampEqualTo(Date value) {
            addCriterion("CREATED_TX_STAMP =", value, "createdTxStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedTxStampNotEqualTo(Date value) {
            addCriterion("CREATED_TX_STAMP <>", value, "createdTxStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedTxStampGreaterThan(Date value) {
            addCriterion("CREATED_TX_STAMP >", value, "createdTxStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedTxStampGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATED_TX_STAMP >=", value, "createdTxStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedTxStampLessThan(Date value) {
            addCriterion("CREATED_TX_STAMP <", value, "createdTxStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedTxStampLessThanOrEqualTo(Date value) {
            addCriterion("CREATED_TX_STAMP <=", value, "createdTxStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedTxStampIn(List<Date> values) {
            addCriterion("CREATED_TX_STAMP in", values, "createdTxStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedTxStampNotIn(List<Date> values) {
            addCriterion("CREATED_TX_STAMP not in", values, "createdTxStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedTxStampBetween(Date value1, Date value2) {
            addCriterion("CREATED_TX_STAMP between", value1, value2, "createdTxStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedTxStampNotBetween(Date value1, Date value2) {
            addCriterion("CREATED_TX_STAMP not between", value1, value2, "createdTxStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedByUserLoginIsNull() {
            addCriterion("CREATED_BY_USER_LOGIN is null");
            return (Criteria) this;
        }

        public Criteria andCreatedByUserLoginIsNotNull() {
            addCriterion("CREATED_BY_USER_LOGIN is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedByUserLoginEqualTo(String value) {
            addCriterion("CREATED_BY_USER_LOGIN =", value, "createdByUserLogin");
            return (Criteria) this;
        }

        public Criteria andCreatedByUserLoginNotEqualTo(String value) {
            addCriterion("CREATED_BY_USER_LOGIN <>", value, "createdByUserLogin");
            return (Criteria) this;
        }

        public Criteria andCreatedByUserLoginGreaterThan(String value) {
            addCriterion("CREATED_BY_USER_LOGIN >", value, "createdByUserLogin");
            return (Criteria) this;
        }

        public Criteria andCreatedByUserLoginGreaterThanOrEqualTo(String value) {
            addCriterion("CREATED_BY_USER_LOGIN >=", value, "createdByUserLogin");
            return (Criteria) this;
        }

        public Criteria andCreatedByUserLoginLessThan(String value) {
            addCriterion("CREATED_BY_USER_LOGIN <", value, "createdByUserLogin");
            return (Criteria) this;
        }

        public Criteria andCreatedByUserLoginLessThanOrEqualTo(String value) {
            addCriterion("CREATED_BY_USER_LOGIN <=", value, "createdByUserLogin");
            return (Criteria) this;
        }

        public Criteria andCreatedByUserLoginLike(String value) {
            addCriterion("CREATED_BY_USER_LOGIN like", value, "createdByUserLogin");
            return (Criteria) this;
        }

        public Criteria andCreatedByUserLoginNotLike(String value) {
            addCriterion("CREATED_BY_USER_LOGIN not like", value, "createdByUserLogin");
            return (Criteria) this;
        }

        public Criteria andCreatedByUserLoginIn(List<String> values) {
            addCriterion("CREATED_BY_USER_LOGIN in", values, "createdByUserLogin");
            return (Criteria) this;
        }

        public Criteria andCreatedByUserLoginNotIn(List<String> values) {
            addCriterion("CREATED_BY_USER_LOGIN not in", values, "createdByUserLogin");
            return (Criteria) this;
        }

        public Criteria andCreatedByUserLoginBetween(String value1, String value2) {
            addCriterion("CREATED_BY_USER_LOGIN between", value1, value2, "createdByUserLogin");
            return (Criteria) this;
        }

        public Criteria andCreatedByUserLoginNotBetween(String value1, String value2) {
            addCriterion("CREATED_BY_USER_LOGIN not between", value1, value2, "createdByUserLogin");
            return (Criteria) this;
        }

        public Criteria andTelecomNumberIsNull() {
            addCriterion("TELECOM_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andTelecomNumberIsNotNull() {
            addCriterion("TELECOM_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andTelecomNumberEqualTo(String value) {
            addCriterion("TELECOM_NUMBER =", value, "telecomNumber");
            return (Criteria) this;
        }

        public Criteria andTelecomNumberNotEqualTo(String value) {
            addCriterion("TELECOM_NUMBER <>", value, "telecomNumber");
            return (Criteria) this;
        }

        public Criteria andTelecomNumberGreaterThan(String value) {
            addCriterion("TELECOM_NUMBER >", value, "telecomNumber");
            return (Criteria) this;
        }

        public Criteria andTelecomNumberGreaterThanOrEqualTo(String value) {
            addCriterion("TELECOM_NUMBER >=", value, "telecomNumber");
            return (Criteria) this;
        }

        public Criteria andTelecomNumberLessThan(String value) {
            addCriterion("TELECOM_NUMBER <", value, "telecomNumber");
            return (Criteria) this;
        }

        public Criteria andTelecomNumberLessThanOrEqualTo(String value) {
            addCriterion("TELECOM_NUMBER <=", value, "telecomNumber");
            return (Criteria) this;
        }

        public Criteria andTelecomNumberLike(String value) {
            addCriterion("TELECOM_NUMBER like", value, "telecomNumber");
            return (Criteria) this;
        }

        public Criteria andTelecomNumberNotLike(String value) {
            addCriterion("TELECOM_NUMBER not like", value, "telecomNumber");
            return (Criteria) this;
        }

        public Criteria andTelecomNumberIn(List<String> values) {
            addCriterion("TELECOM_NUMBER in", values, "telecomNumber");
            return (Criteria) this;
        }

        public Criteria andTelecomNumberNotIn(List<String> values) {
            addCriterion("TELECOM_NUMBER not in", values, "telecomNumber");
            return (Criteria) this;
        }

        public Criteria andTelecomNumberBetween(String value1, String value2) {
            addCriterion("TELECOM_NUMBER between", value1, value2, "telecomNumber");
            return (Criteria) this;
        }

        public Criteria andTelecomNumberNotBetween(String value1, String value2) {
            addCriterion("TELECOM_NUMBER not between", value1, value2, "telecomNumber");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNull() {
            addCriterion("DEPARTMENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNotNull() {
            addCriterion("DEPARTMENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentEqualTo(String value) {
            addCriterion("DEPARTMENT_ID =", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotEqualTo(String value) {
            addCriterion("DEPARTMENT_ID <>", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThan(String value) {
            addCriterion("DEPARTMENT_ID >", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("DEPARTMENT_ID >=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThan(String value) {
            addCriterion("DEPARTMENT_ID <", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThanOrEqualTo(String value) {
            addCriterion("DEPARTMENT_ID <=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLike(String value) {
            addCriterion("DEPARTMENT_ID like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotLike(String value) {
            addCriterion("DEPARTMENT_ID not like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentIn(List<String> values) {
            addCriterion("DEPARTMENT_ID in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotIn(List<String> values) {
            addCriterion("DEPARTMENT_ID not in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentBetween(String value1, String value2) {
            addCriterion("DEPARTMENT_ID between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotBetween(String value1, String value2) {
            addCriterion("DEPARTMENT_ID not between", value1, value2, "department");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}