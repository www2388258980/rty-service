package com.asiainfo.vpn.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VpnDialPersonsHisExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VpnDialPersonsHisExample() {
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

        public Criteria andHistoryIdIsNull() {
            addCriterion("HISTORY_ID is null");
            return (Criteria) this;
        }

        public Criteria andHistoryIdIsNotNull() {
            addCriterion("HISTORY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andHistoryIdEqualTo(String value) {
            addCriterion("HISTORY_ID =", value, "historyId");
            return (Criteria) this;
        }

        public Criteria andHistoryIdNotEqualTo(String value) {
            addCriterion("HISTORY_ID <>", value, "historyId");
            return (Criteria) this;
        }

        public Criteria andHistoryIdGreaterThan(String value) {
            addCriterion("HISTORY_ID >", value, "historyId");
            return (Criteria) this;
        }

        public Criteria andHistoryIdGreaterThanOrEqualTo(String value) {
            addCriterion("HISTORY_ID >=", value, "historyId");
            return (Criteria) this;
        }

        public Criteria andHistoryIdLessThan(String value) {
            addCriterion("HISTORY_ID <", value, "historyId");
            return (Criteria) this;
        }

        public Criteria andHistoryIdLessThanOrEqualTo(String value) {
            addCriterion("HISTORY_ID <=", value, "historyId");
            return (Criteria) this;
        }

        public Criteria andHistoryIdLike(String value) {
            addCriterion("HISTORY_ID like", value, "historyId");
            return (Criteria) this;
        }

        public Criteria andHistoryIdNotLike(String value) {
            addCriterion("HISTORY_ID not like", value, "historyId");
            return (Criteria) this;
        }

        public Criteria andHistoryIdIn(List<String> values) {
            addCriterion("HISTORY_ID in", values, "historyId");
            return (Criteria) this;
        }

        public Criteria andHistoryIdNotIn(List<String> values) {
            addCriterion("HISTORY_ID not in", values, "historyId");
            return (Criteria) this;
        }

        public Criteria andHistoryIdBetween(String value1, String value2) {
            addCriterion("HISTORY_ID between", value1, value2, "historyId");
            return (Criteria) this;
        }

        public Criteria andHistoryIdNotBetween(String value1, String value2) {
            addCriterion("HISTORY_ID not between", value1, value2, "historyId");
            return (Criteria) this;
        }

        public Criteria andDialPersonIdIsNull() {
            addCriterion("DIAL_PERSON_ID is null");
            return (Criteria) this;
        }

        public Criteria andDialPersonIdIsNotNull() {
            addCriterion("DIAL_PERSON_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDialPersonIdEqualTo(String value) {
            addCriterion("DIAL_PERSON_ID =", value, "dialPersonId");
            return (Criteria) this;
        }

        public Criteria andDialPersonIdNotEqualTo(String value) {
            addCriterion("DIAL_PERSON_ID <>", value, "dialPersonId");
            return (Criteria) this;
        }

        public Criteria andDialPersonIdGreaterThan(String value) {
            addCriterion("DIAL_PERSON_ID >", value, "dialPersonId");
            return (Criteria) this;
        }

        public Criteria andDialPersonIdGreaterThanOrEqualTo(String value) {
            addCriterion("DIAL_PERSON_ID >=", value, "dialPersonId");
            return (Criteria) this;
        }

        public Criteria andDialPersonIdLessThan(String value) {
            addCriterion("DIAL_PERSON_ID <", value, "dialPersonId");
            return (Criteria) this;
        }

        public Criteria andDialPersonIdLessThanOrEqualTo(String value) {
            addCriterion("DIAL_PERSON_ID <=", value, "dialPersonId");
            return (Criteria) this;
        }

        public Criteria andDialPersonIdLike(String value) {
            addCriterion("DIAL_PERSON_ID like", value, "dialPersonId");
            return (Criteria) this;
        }

        public Criteria andDialPersonIdNotLike(String value) {
            addCriterion("DIAL_PERSON_ID not like", value, "dialPersonId");
            return (Criteria) this;
        }

        public Criteria andDialPersonIdIn(List<String> values) {
            addCriterion("DIAL_PERSON_ID in", values, "dialPersonId");
            return (Criteria) this;
        }

        public Criteria andDialPersonIdNotIn(List<String> values) {
            addCriterion("DIAL_PERSON_ID not in", values, "dialPersonId");
            return (Criteria) this;
        }

        public Criteria andDialPersonIdBetween(String value1, String value2) {
            addCriterion("DIAL_PERSON_ID between", value1, value2, "dialPersonId");
            return (Criteria) this;
        }

        public Criteria andDialPersonIdNotBetween(String value1, String value2) {
            addCriterion("DIAL_PERSON_ID not between", value1, value2, "dialPersonId");
            return (Criteria) this;
        }

        public Criteria andOldFirstNameIsNull() {
            addCriterion("OLD_FIRST_NAME is null");
            return (Criteria) this;
        }

        public Criteria andOldFirstNameIsNotNull() {
            addCriterion("OLD_FIRST_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andOldFirstNameEqualTo(String value) {
            addCriterion("OLD_FIRST_NAME =", value, "oldFirstName");
            return (Criteria) this;
        }

        public Criteria andOldFirstNameNotEqualTo(String value) {
            addCriterion("OLD_FIRST_NAME <>", value, "oldFirstName");
            return (Criteria) this;
        }

        public Criteria andOldFirstNameGreaterThan(String value) {
            addCriterion("OLD_FIRST_NAME >", value, "oldFirstName");
            return (Criteria) this;
        }

        public Criteria andOldFirstNameGreaterThanOrEqualTo(String value) {
            addCriterion("OLD_FIRST_NAME >=", value, "oldFirstName");
            return (Criteria) this;
        }

        public Criteria andOldFirstNameLessThan(String value) {
            addCriterion("OLD_FIRST_NAME <", value, "oldFirstName");
            return (Criteria) this;
        }

        public Criteria andOldFirstNameLessThanOrEqualTo(String value) {
            addCriterion("OLD_FIRST_NAME <=", value, "oldFirstName");
            return (Criteria) this;
        }

        public Criteria andOldFirstNameLike(String value) {
            addCriterion("OLD_FIRST_NAME like", value, "oldFirstName");
            return (Criteria) this;
        }

        public Criteria andOldFirstNameNotLike(String value) {
            addCriterion("OLD_FIRST_NAME not like", value, "oldFirstName");
            return (Criteria) this;
        }

        public Criteria andOldFirstNameIn(List<String> values) {
            addCriterion("OLD_FIRST_NAME in", values, "oldFirstName");
            return (Criteria) this;
        }

        public Criteria andOldFirstNameNotIn(List<String> values) {
            addCriterion("OLD_FIRST_NAME not in", values, "oldFirstName");
            return (Criteria) this;
        }

        public Criteria andOldFirstNameBetween(String value1, String value2) {
            addCriterion("OLD_FIRST_NAME between", value1, value2, "oldFirstName");
            return (Criteria) this;
        }

        public Criteria andOldFirstNameNotBetween(String value1, String value2) {
            addCriterion("OLD_FIRST_NAME not between", value1, value2, "oldFirstName");
            return (Criteria) this;
        }

        public Criteria andOldTelecomNumberIsNull() {
            addCriterion("OLD_TELECOM_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andOldTelecomNumberIsNotNull() {
            addCriterion("OLD_TELECOM_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andOldTelecomNumberEqualTo(String value) {
            addCriterion("OLD_TELECOM_NUMBER =", value, "oldTelecomNumber");
            return (Criteria) this;
        }

        public Criteria andOldTelecomNumberNotEqualTo(String value) {
            addCriterion("OLD_TELECOM_NUMBER <>", value, "oldTelecomNumber");
            return (Criteria) this;
        }

        public Criteria andOldTelecomNumberGreaterThan(String value) {
            addCriterion("OLD_TELECOM_NUMBER >", value, "oldTelecomNumber");
            return (Criteria) this;
        }

        public Criteria andOldTelecomNumberGreaterThanOrEqualTo(String value) {
            addCriterion("OLD_TELECOM_NUMBER >=", value, "oldTelecomNumber");
            return (Criteria) this;
        }

        public Criteria andOldTelecomNumberLessThan(String value) {
            addCriterion("OLD_TELECOM_NUMBER <", value, "oldTelecomNumber");
            return (Criteria) this;
        }

        public Criteria andOldTelecomNumberLessThanOrEqualTo(String value) {
            addCriterion("OLD_TELECOM_NUMBER <=", value, "oldTelecomNumber");
            return (Criteria) this;
        }

        public Criteria andOldTelecomNumberLike(String value) {
            addCriterion("OLD_TELECOM_NUMBER like", value, "oldTelecomNumber");
            return (Criteria) this;
        }

        public Criteria andOldTelecomNumberNotLike(String value) {
            addCriterion("OLD_TELECOM_NUMBER not like", value, "oldTelecomNumber");
            return (Criteria) this;
        }

        public Criteria andOldTelecomNumberIn(List<String> values) {
            addCriterion("OLD_TELECOM_NUMBER in", values, "oldTelecomNumber");
            return (Criteria) this;
        }

        public Criteria andOldTelecomNumberNotIn(List<String> values) {
            addCriterion("OLD_TELECOM_NUMBER not in", values, "oldTelecomNumber");
            return (Criteria) this;
        }

        public Criteria andOldTelecomNumberBetween(String value1, String value2) {
            addCriterion("OLD_TELECOM_NUMBER between", value1, value2, "oldTelecomNumber");
            return (Criteria) this;
        }

        public Criteria andOldTelecomNumberNotBetween(String value1, String value2) {
            addCriterion("OLD_TELECOM_NUMBER not between", value1, value2, "oldTelecomNumber");
            return (Criteria) this;
        }

        public Criteria andOldCountNameIsNull() {
            addCriterion("OLD_COUNT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andOldCountNameIsNotNull() {
            addCriterion("OLD_COUNT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andOldCountNameEqualTo(String value) {
            addCriterion("OLD_COUNT_NAME =", value, "oldCountName");
            return (Criteria) this;
        }

        public Criteria andOldCountNameNotEqualTo(String value) {
            addCriterion("OLD_COUNT_NAME <>", value, "oldCountName");
            return (Criteria) this;
        }

        public Criteria andOldCountNameGreaterThan(String value) {
            addCriterion("OLD_COUNT_NAME >", value, "oldCountName");
            return (Criteria) this;
        }

        public Criteria andOldCountNameGreaterThanOrEqualTo(String value) {
            addCriterion("OLD_COUNT_NAME >=", value, "oldCountName");
            return (Criteria) this;
        }

        public Criteria andOldCountNameLessThan(String value) {
            addCriterion("OLD_COUNT_NAME <", value, "oldCountName");
            return (Criteria) this;
        }

        public Criteria andOldCountNameLessThanOrEqualTo(String value) {
            addCriterion("OLD_COUNT_NAME <=", value, "oldCountName");
            return (Criteria) this;
        }

        public Criteria andOldCountNameLike(String value) {
            addCriterion("OLD_COUNT_NAME like", value, "oldCountName");
            return (Criteria) this;
        }

        public Criteria andOldCountNameNotLike(String value) {
            addCriterion("OLD_COUNT_NAME not like", value, "oldCountName");
            return (Criteria) this;
        }

        public Criteria andOldCountNameIn(List<String> values) {
            addCriterion("OLD_COUNT_NAME in", values, "oldCountName");
            return (Criteria) this;
        }

        public Criteria andOldCountNameNotIn(List<String> values) {
            addCriterion("OLD_COUNT_NAME not in", values, "oldCountName");
            return (Criteria) this;
        }

        public Criteria andOldCountNameBetween(String value1, String value2) {
            addCriterion("OLD_COUNT_NAME between", value1, value2, "oldCountName");
            return (Criteria) this;
        }

        public Criteria andOldCountNameNotBetween(String value1, String value2) {
            addCriterion("OLD_COUNT_NAME not between", value1, value2, "oldCountName");
            return (Criteria) this;
        }

        public Criteria andOldStatusIsNull() {
            addCriterion("OLD_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andOldStatusIsNotNull() {
            addCriterion("OLD_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andOldStatusEqualTo(String value) {
            addCriterion("OLD_STATUS =", value, "oldStatus");
            return (Criteria) this;
        }

        public Criteria andOldStatusNotEqualTo(String value) {
            addCriterion("OLD_STATUS <>", value, "oldStatus");
            return (Criteria) this;
        }

        public Criteria andOldStatusGreaterThan(String value) {
            addCriterion("OLD_STATUS >", value, "oldStatus");
            return (Criteria) this;
        }

        public Criteria andOldStatusGreaterThanOrEqualTo(String value) {
            addCriterion("OLD_STATUS >=", value, "oldStatus");
            return (Criteria) this;
        }

        public Criteria andOldStatusLessThan(String value) {
            addCriterion("OLD_STATUS <", value, "oldStatus");
            return (Criteria) this;
        }

        public Criteria andOldStatusLessThanOrEqualTo(String value) {
            addCriterion("OLD_STATUS <=", value, "oldStatus");
            return (Criteria) this;
        }

        public Criteria andOldStatusLike(String value) {
            addCriterion("OLD_STATUS like", value, "oldStatus");
            return (Criteria) this;
        }

        public Criteria andOldStatusNotLike(String value) {
            addCriterion("OLD_STATUS not like", value, "oldStatus");
            return (Criteria) this;
        }

        public Criteria andOldStatusIn(List<String> values) {
            addCriterion("OLD_STATUS in", values, "oldStatus");
            return (Criteria) this;
        }

        public Criteria andOldStatusNotIn(List<String> values) {
            addCriterion("OLD_STATUS not in", values, "oldStatus");
            return (Criteria) this;
        }

        public Criteria andOldStatusBetween(String value1, String value2) {
            addCriterion("OLD_STATUS between", value1, value2, "oldStatus");
            return (Criteria) this;
        }

        public Criteria andOldStatusNotBetween(String value1, String value2) {
            addCriterion("OLD_STATUS not between", value1, value2, "oldStatus");
            return (Criteria) this;
        }

        public Criteria andOldDescriptionIsNull() {
            addCriterion("OLD_DESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andOldDescriptionIsNotNull() {
            addCriterion("OLD_DESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andOldDescriptionEqualTo(String value) {
            addCriterion("OLD_DESCRIPTION =", value, "oldDescription");
            return (Criteria) this;
        }

        public Criteria andOldDescriptionNotEqualTo(String value) {
            addCriterion("OLD_DESCRIPTION <>", value, "oldDescription");
            return (Criteria) this;
        }

        public Criteria andOldDescriptionGreaterThan(String value) {
            addCriterion("OLD_DESCRIPTION >", value, "oldDescription");
            return (Criteria) this;
        }

        public Criteria andOldDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("OLD_DESCRIPTION >=", value, "oldDescription");
            return (Criteria) this;
        }

        public Criteria andOldDescriptionLessThan(String value) {
            addCriterion("OLD_DESCRIPTION <", value, "oldDescription");
            return (Criteria) this;
        }

        public Criteria andOldDescriptionLessThanOrEqualTo(String value) {
            addCriterion("OLD_DESCRIPTION <=", value, "oldDescription");
            return (Criteria) this;
        }

        public Criteria andOldDescriptionLike(String value) {
            addCriterion("OLD_DESCRIPTION like", value, "oldDescription");
            return (Criteria) this;
        }

        public Criteria andOldDescriptionNotLike(String value) {
            addCriterion("OLD_DESCRIPTION not like", value, "oldDescription");
            return (Criteria) this;
        }

        public Criteria andOldDescriptionIn(List<String> values) {
            addCriterion("OLD_DESCRIPTION in", values, "oldDescription");
            return (Criteria) this;
        }

        public Criteria andOldDescriptionNotIn(List<String> values) {
            addCriterion("OLD_DESCRIPTION not in", values, "oldDescription");
            return (Criteria) this;
        }

        public Criteria andOldDescriptionBetween(String value1, String value2) {
            addCriterion("OLD_DESCRIPTION between", value1, value2, "oldDescription");
            return (Criteria) this;
        }

        public Criteria andOldDescriptionNotBetween(String value1, String value2) {
            addCriterion("OLD_DESCRIPTION not between", value1, value2, "oldDescription");
            return (Criteria) this;
        }

        public Criteria andOldFirstCharIsNull() {
            addCriterion("OLD_FIRST_CHAR is null");
            return (Criteria) this;
        }

        public Criteria andOldFirstCharIsNotNull() {
            addCriterion("OLD_FIRST_CHAR is not null");
            return (Criteria) this;
        }

        public Criteria andOldFirstCharEqualTo(String value) {
            addCriterion("OLD_FIRST_CHAR =", value, "oldFirstChar");
            return (Criteria) this;
        }

        public Criteria andOldFirstCharNotEqualTo(String value) {
            addCriterion("OLD_FIRST_CHAR <>", value, "oldFirstChar");
            return (Criteria) this;
        }

        public Criteria andOldFirstCharGreaterThan(String value) {
            addCriterion("OLD_FIRST_CHAR >", value, "oldFirstChar");
            return (Criteria) this;
        }

        public Criteria andOldFirstCharGreaterThanOrEqualTo(String value) {
            addCriterion("OLD_FIRST_CHAR >=", value, "oldFirstChar");
            return (Criteria) this;
        }

        public Criteria andOldFirstCharLessThan(String value) {
            addCriterion("OLD_FIRST_CHAR <", value, "oldFirstChar");
            return (Criteria) this;
        }

        public Criteria andOldFirstCharLessThanOrEqualTo(String value) {
            addCriterion("OLD_FIRST_CHAR <=", value, "oldFirstChar");
            return (Criteria) this;
        }

        public Criteria andOldFirstCharLike(String value) {
            addCriterion("OLD_FIRST_CHAR like", value, "oldFirstChar");
            return (Criteria) this;
        }

        public Criteria andOldFirstCharNotLike(String value) {
            addCriterion("OLD_FIRST_CHAR not like", value, "oldFirstChar");
            return (Criteria) this;
        }

        public Criteria andOldFirstCharIn(List<String> values) {
            addCriterion("OLD_FIRST_CHAR in", values, "oldFirstChar");
            return (Criteria) this;
        }

        public Criteria andOldFirstCharNotIn(List<String> values) {
            addCriterion("OLD_FIRST_CHAR not in", values, "oldFirstChar");
            return (Criteria) this;
        }

        public Criteria andOldFirstCharBetween(String value1, String value2) {
            addCriterion("OLD_FIRST_CHAR between", value1, value2, "oldFirstChar");
            return (Criteria) this;
        }

        public Criteria andOldFirstCharNotBetween(String value1, String value2) {
            addCriterion("OLD_FIRST_CHAR not between", value1, value2, "oldFirstChar");
            return (Criteria) this;
        }

        public Criteria andOldDepartmentIsNull() {
            addCriterion("OLD_DEPARTMENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andOldDepartmentIsNotNull() {
            addCriterion("OLD_DEPARTMENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOldDepartmentEqualTo(String value) {
            addCriterion("OLD_DEPARTMENT_ID =", value, "oldDepartment");
            return (Criteria) this;
        }

        public Criteria andOldDepartmentNotEqualTo(String value) {
            addCriterion("OLD_DEPARTMENT_ID <>", value, "oldDepartment");
            return (Criteria) this;
        }

        public Criteria andOldDepartmentGreaterThan(String value) {
            addCriterion("OLD_DEPARTMENT_ID >", value, "oldDepartment");
            return (Criteria) this;
        }

        public Criteria andOldDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("OLD_DEPARTMENT_ID >=", value, "oldDepartment");
            return (Criteria) this;
        }

        public Criteria andOldDepartmentLessThan(String value) {
            addCriterion("OLD_DEPARTMENT_ID <", value, "oldDepartment");
            return (Criteria) this;
        }

        public Criteria andOldDepartmentLessThanOrEqualTo(String value) {
            addCriterion("OLD_DEPARTMENT_ID <=", value, "oldDepartment");
            return (Criteria) this;
        }

        public Criteria andOldDepartmentLike(String value) {
            addCriterion("OLD_DEPARTMENT_ID like", value, "oldDepartment");
            return (Criteria) this;
        }

        public Criteria andOldDepartmentNotLike(String value) {
            addCriterion("OLD_DEPARTMENT_ID not like", value, "oldDepartment");
            return (Criteria) this;
        }

        public Criteria andOldDepartmentIn(List<String> values) {
            addCriterion("OLD_DEPARTMENT_ID in", values, "oldDepartment");
            return (Criteria) this;
        }

        public Criteria andOldDepartmentNotIn(List<String> values) {
            addCriterion("OLD_DEPARTMENT_ID not in", values, "oldDepartment");
            return (Criteria) this;
        }

        public Criteria andOldDepartmentBetween(String value1, String value2) {
            addCriterion("OLD_DEPARTMENT_ID between", value1, value2, "oldDepartment");
            return (Criteria) this;
        }

        public Criteria andOldDepartmentNotBetween(String value1, String value2) {
            addCriterion("OLD_DEPARTMENT_ID not between", value1, value2, "oldDepartment");
            return (Criteria) this;
        }

        public Criteria andOldCreatedByIsNull() {
            addCriterion("OLD_CREATED_BY is null");
            return (Criteria) this;
        }

        public Criteria andOldCreatedByIsNotNull() {
            addCriterion("OLD_CREATED_BY is not null");
            return (Criteria) this;
        }

        public Criteria andOldCreatedByEqualTo(String value) {
            addCriterion("OLD_CREATED_BY =", value, "oldCreatedBy");
            return (Criteria) this;
        }

        public Criteria andOldCreatedByNotEqualTo(String value) {
            addCriterion("OLD_CREATED_BY <>", value, "oldCreatedBy");
            return (Criteria) this;
        }

        public Criteria andOldCreatedByGreaterThan(String value) {
            addCriterion("OLD_CREATED_BY >", value, "oldCreatedBy");
            return (Criteria) this;
        }

        public Criteria andOldCreatedByGreaterThanOrEqualTo(String value) {
            addCriterion("OLD_CREATED_BY >=", value, "oldCreatedBy");
            return (Criteria) this;
        }

        public Criteria andOldCreatedByLessThan(String value) {
            addCriterion("OLD_CREATED_BY <", value, "oldCreatedBy");
            return (Criteria) this;
        }

        public Criteria andOldCreatedByLessThanOrEqualTo(String value) {
            addCriterion("OLD_CREATED_BY <=", value, "oldCreatedBy");
            return (Criteria) this;
        }

        public Criteria andOldCreatedByLike(String value) {
            addCriterion("OLD_CREATED_BY like", value, "oldCreatedBy");
            return (Criteria) this;
        }

        public Criteria andOldCreatedByNotLike(String value) {
            addCriterion("OLD_CREATED_BY not like", value, "oldCreatedBy");
            return (Criteria) this;
        }

        public Criteria andOldCreatedByIn(List<String> values) {
            addCriterion("OLD_CREATED_BY in", values, "oldCreatedBy");
            return (Criteria) this;
        }

        public Criteria andOldCreatedByNotIn(List<String> values) {
            addCriterion("OLD_CREATED_BY not in", values, "oldCreatedBy");
            return (Criteria) this;
        }

        public Criteria andOldCreatedByBetween(String value1, String value2) {
            addCriterion("OLD_CREATED_BY between", value1, value2, "oldCreatedBy");
            return (Criteria) this;
        }

        public Criteria andOldCreatedByNotBetween(String value1, String value2) {
            addCriterion("OLD_CREATED_BY not between", value1, value2, "oldCreatedBy");
            return (Criteria) this;
        }

        public Criteria andOldModifiedByIsNull() {
            addCriterion("OLD_MODIFIED_BY is null");
            return (Criteria) this;
        }

        public Criteria andOldModifiedByIsNotNull() {
            addCriterion("OLD_MODIFIED_BY is not null");
            return (Criteria) this;
        }

        public Criteria andOldModifiedByEqualTo(String value) {
            addCriterion("OLD_MODIFIED_BY =", value, "oldModifiedBy");
            return (Criteria) this;
        }

        public Criteria andOldModifiedByNotEqualTo(String value) {
            addCriterion("OLD_MODIFIED_BY <>", value, "oldModifiedBy");
            return (Criteria) this;
        }

        public Criteria andOldModifiedByGreaterThan(String value) {
            addCriterion("OLD_MODIFIED_BY >", value, "oldModifiedBy");
            return (Criteria) this;
        }

        public Criteria andOldModifiedByGreaterThanOrEqualTo(String value) {
            addCriterion("OLD_MODIFIED_BY >=", value, "oldModifiedBy");
            return (Criteria) this;
        }

        public Criteria andOldModifiedByLessThan(String value) {
            addCriterion("OLD_MODIFIED_BY <", value, "oldModifiedBy");
            return (Criteria) this;
        }

        public Criteria andOldModifiedByLessThanOrEqualTo(String value) {
            addCriterion("OLD_MODIFIED_BY <=", value, "oldModifiedBy");
            return (Criteria) this;
        }

        public Criteria andOldModifiedByLike(String value) {
            addCriterion("OLD_MODIFIED_BY like", value, "oldModifiedBy");
            return (Criteria) this;
        }

        public Criteria andOldModifiedByNotLike(String value) {
            addCriterion("OLD_MODIFIED_BY not like", value, "oldModifiedBy");
            return (Criteria) this;
        }

        public Criteria andOldModifiedByIn(List<String> values) {
            addCriterion("OLD_MODIFIED_BY in", values, "oldModifiedBy");
            return (Criteria) this;
        }

        public Criteria andOldModifiedByNotIn(List<String> values) {
            addCriterion("OLD_MODIFIED_BY not in", values, "oldModifiedBy");
            return (Criteria) this;
        }

        public Criteria andOldModifiedByBetween(String value1, String value2) {
            addCriterion("OLD_MODIFIED_BY between", value1, value2, "oldModifiedBy");
            return (Criteria) this;
        }

        public Criteria andOldModifiedByNotBetween(String value1, String value2) {
            addCriterion("OLD_MODIFIED_BY not between", value1, value2, "oldModifiedBy");
            return (Criteria) this;
        }

        public Criteria andOldbillIdIsNull() {
            addCriterion("OLDBILL_ID is null");
            return (Criteria) this;
        }

        public Criteria andOldbillIdIsNotNull() {
            addCriterion("OLDBILL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOldbillIdEqualTo(String value) {
            addCriterion("OLDBILL_ID =", value, "oldbillId");
            return (Criteria) this;
        }

        public Criteria andOldbillIdNotEqualTo(String value) {
            addCriterion("OLDBILL_ID <>", value, "oldbillId");
            return (Criteria) this;
        }

        public Criteria andOldbillIdGreaterThan(String value) {
            addCriterion("OLDBILL_ID >", value, "oldbillId");
            return (Criteria) this;
        }

        public Criteria andOldbillIdGreaterThanOrEqualTo(String value) {
            addCriterion("OLDBILL_ID >=", value, "oldbillId");
            return (Criteria) this;
        }

        public Criteria andOldbillIdLessThan(String value) {
            addCriterion("OLDBILL_ID <", value, "oldbillId");
            return (Criteria) this;
        }

        public Criteria andOldbillIdLessThanOrEqualTo(String value) {
            addCriterion("OLDBILL_ID <=", value, "oldbillId");
            return (Criteria) this;
        }

        public Criteria andOldbillIdLike(String value) {
            addCriterion("OLDBILL_ID like", value, "oldbillId");
            return (Criteria) this;
        }

        public Criteria andOldbillIdNotLike(String value) {
            addCriterion("OLDBILL_ID not like", value, "oldbillId");
            return (Criteria) this;
        }

        public Criteria andOldbillIdIn(List<String> values) {
            addCriterion("OLDBILL_ID in", values, "oldbillId");
            return (Criteria) this;
        }

        public Criteria andOldbillIdNotIn(List<String> values) {
            addCriterion("OLDBILL_ID not in", values, "oldbillId");
            return (Criteria) this;
        }

        public Criteria andOldbillIdBetween(String value1, String value2) {
            addCriterion("OLDBILL_ID between", value1, value2, "oldbillId");
            return (Criteria) this;
        }

        public Criteria andOldbillIdNotBetween(String value1, String value2) {
            addCriterion("OLDBILL_ID not between", value1, value2, "oldbillId");
            return (Criteria) this;
        }

        public Criteria andOldModifiedBillIdIsNull() {
            addCriterion("OLD_MODIFIED_BILL_ID is null");
            return (Criteria) this;
        }

        public Criteria andOldModifiedBillIdIsNotNull() {
            addCriterion("OLD_MODIFIED_BILL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOldModifiedBillIdEqualTo(String value) {
            addCriterion("OLD_MODIFIED_BILL_ID =", value, "oldModifiedBillId");
            return (Criteria) this;
        }

        public Criteria andOldModifiedBillIdNotEqualTo(String value) {
            addCriterion("OLD_MODIFIED_BILL_ID <>", value, "oldModifiedBillId");
            return (Criteria) this;
        }

        public Criteria andOldModifiedBillIdGreaterThan(String value) {
            addCriterion("OLD_MODIFIED_BILL_ID >", value, "oldModifiedBillId");
            return (Criteria) this;
        }

        public Criteria andOldModifiedBillIdGreaterThanOrEqualTo(String value) {
            addCriterion("OLD_MODIFIED_BILL_ID >=", value, "oldModifiedBillId");
            return (Criteria) this;
        }

        public Criteria andOldModifiedBillIdLessThan(String value) {
            addCriterion("OLD_MODIFIED_BILL_ID <", value, "oldModifiedBillId");
            return (Criteria) this;
        }

        public Criteria andOldModifiedBillIdLessThanOrEqualTo(String value) {
            addCriterion("OLD_MODIFIED_BILL_ID <=", value, "oldModifiedBillId");
            return (Criteria) this;
        }

        public Criteria andOldModifiedBillIdLike(String value) {
            addCriterion("OLD_MODIFIED_BILL_ID like", value, "oldModifiedBillId");
            return (Criteria) this;
        }

        public Criteria andOldModifiedBillIdNotLike(String value) {
            addCriterion("OLD_MODIFIED_BILL_ID not like", value, "oldModifiedBillId");
            return (Criteria) this;
        }

        public Criteria andOldModifiedBillIdIn(List<String> values) {
            addCriterion("OLD_MODIFIED_BILL_ID in", values, "oldModifiedBillId");
            return (Criteria) this;
        }

        public Criteria andOldModifiedBillIdNotIn(List<String> values) {
            addCriterion("OLD_MODIFIED_BILL_ID not in", values, "oldModifiedBillId");
            return (Criteria) this;
        }

        public Criteria andOldModifiedBillIdBetween(String value1, String value2) {
            addCriterion("OLD_MODIFIED_BILL_ID between", value1, value2, "oldModifiedBillId");
            return (Criteria) this;
        }

        public Criteria andOldModifiedBillIdNotBetween(String value1, String value2) {
            addCriterion("OLD_MODIFIED_BILL_ID not between", value1, value2, "oldModifiedBillId");
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

        public Criteria andCountNameIsNull() {
            addCriterion("COUNT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCountNameIsNotNull() {
            addCriterion("COUNT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCountNameEqualTo(String value) {
            addCriterion("COUNT_NAME =", value, "countName");
            return (Criteria) this;
        }

        public Criteria andCountNameNotEqualTo(String value) {
            addCriterion("COUNT_NAME <>", value, "countName");
            return (Criteria) this;
        }

        public Criteria andCountNameGreaterThan(String value) {
            addCriterion("COUNT_NAME >", value, "countName");
            return (Criteria) this;
        }

        public Criteria andCountNameGreaterThanOrEqualTo(String value) {
            addCriterion("COUNT_NAME >=", value, "countName");
            return (Criteria) this;
        }

        public Criteria andCountNameLessThan(String value) {
            addCriterion("COUNT_NAME <", value, "countName");
            return (Criteria) this;
        }

        public Criteria andCountNameLessThanOrEqualTo(String value) {
            addCriterion("COUNT_NAME <=", value, "countName");
            return (Criteria) this;
        }

        public Criteria andCountNameLike(String value) {
            addCriterion("COUNT_NAME like", value, "countName");
            return (Criteria) this;
        }

        public Criteria andCountNameNotLike(String value) {
            addCriterion("COUNT_NAME not like", value, "countName");
            return (Criteria) this;
        }

        public Criteria andCountNameIn(List<String> values) {
            addCriterion("COUNT_NAME in", values, "countName");
            return (Criteria) this;
        }

        public Criteria andCountNameNotIn(List<String> values) {
            addCriterion("COUNT_NAME not in", values, "countName");
            return (Criteria) this;
        }

        public Criteria andCountNameBetween(String value1, String value2) {
            addCriterion("COUNT_NAME between", value1, value2, "countName");
            return (Criteria) this;
        }

        public Criteria andCountNameNotBetween(String value1, String value2) {
            addCriterion("COUNT_NAME not between", value1, value2, "countName");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "status");
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

        public Criteria andFirstCharIsNull() {
            addCriterion("FIRST_CHAR is null");
            return (Criteria) this;
        }

        public Criteria andFirstCharIsNotNull() {
            addCriterion("FIRST_CHAR is not null");
            return (Criteria) this;
        }

        public Criteria andFirstCharEqualTo(String value) {
            addCriterion("FIRST_CHAR =", value, "firstChar");
            return (Criteria) this;
        }

        public Criteria andFirstCharNotEqualTo(String value) {
            addCriterion("FIRST_CHAR <>", value, "firstChar");
            return (Criteria) this;
        }

        public Criteria andFirstCharGreaterThan(String value) {
            addCriterion("FIRST_CHAR >", value, "firstChar");
            return (Criteria) this;
        }

        public Criteria andFirstCharGreaterThanOrEqualTo(String value) {
            addCriterion("FIRST_CHAR >=", value, "firstChar");
            return (Criteria) this;
        }

        public Criteria andFirstCharLessThan(String value) {
            addCriterion("FIRST_CHAR <", value, "firstChar");
            return (Criteria) this;
        }

        public Criteria andFirstCharLessThanOrEqualTo(String value) {
            addCriterion("FIRST_CHAR <=", value, "firstChar");
            return (Criteria) this;
        }

        public Criteria andFirstCharLike(String value) {
            addCriterion("FIRST_CHAR like", value, "firstChar");
            return (Criteria) this;
        }

        public Criteria andFirstCharNotLike(String value) {
            addCriterion("FIRST_CHAR not like", value, "firstChar");
            return (Criteria) this;
        }

        public Criteria andFirstCharIn(List<String> values) {
            addCriterion("FIRST_CHAR in", values, "firstChar");
            return (Criteria) this;
        }

        public Criteria andFirstCharNotIn(List<String> values) {
            addCriterion("FIRST_CHAR not in", values, "firstChar");
            return (Criteria) this;
        }

        public Criteria andFirstCharBetween(String value1, String value2) {
            addCriterion("FIRST_CHAR between", value1, value2, "firstChar");
            return (Criteria) this;
        }

        public Criteria andFirstCharNotBetween(String value1, String value2) {
            addCriterion("FIRST_CHAR not between", value1, value2, "firstChar");
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

        public Criteria andCreatedByIsNull() {
            addCriterion("CREATED_BY is null");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNotNull() {
            addCriterion("CREATED_BY is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedByEqualTo(String value) {
            addCriterion("CREATED_BY =", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotEqualTo(String value) {
            addCriterion("CREATED_BY <>", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThan(String value) {
            addCriterion("CREATED_BY >", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThanOrEqualTo(String value) {
            addCriterion("CREATED_BY >=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThan(String value) {
            addCriterion("CREATED_BY <", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThanOrEqualTo(String value) {
            addCriterion("CREATED_BY <=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLike(String value) {
            addCriterion("CREATED_BY like", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotLike(String value) {
            addCriterion("CREATED_BY not like", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByIn(List<String> values) {
            addCriterion("CREATED_BY in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotIn(List<String> values) {
            addCriterion("CREATED_BY not in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByBetween(String value1, String value2) {
            addCriterion("CREATED_BY between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotBetween(String value1, String value2) {
            addCriterion("CREATED_BY not between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andModifiedByIsNull() {
            addCriterion("MODIFIED_BY is null");
            return (Criteria) this;
        }

        public Criteria andModifiedByIsNotNull() {
            addCriterion("MODIFIED_BY is not null");
            return (Criteria) this;
        }

        public Criteria andModifiedByEqualTo(String value) {
            addCriterion("MODIFIED_BY =", value, "modifiedBy");
            return (Criteria) this;
        }

        public Criteria andModifiedByNotEqualTo(String value) {
            addCriterion("MODIFIED_BY <>", value, "modifiedBy");
            return (Criteria) this;
        }

        public Criteria andModifiedByGreaterThan(String value) {
            addCriterion("MODIFIED_BY >", value, "modifiedBy");
            return (Criteria) this;
        }

        public Criteria andModifiedByGreaterThanOrEqualTo(String value) {
            addCriterion("MODIFIED_BY >=", value, "modifiedBy");
            return (Criteria) this;
        }

        public Criteria andModifiedByLessThan(String value) {
            addCriterion("MODIFIED_BY <", value, "modifiedBy");
            return (Criteria) this;
        }

        public Criteria andModifiedByLessThanOrEqualTo(String value) {
            addCriterion("MODIFIED_BY <=", value, "modifiedBy");
            return (Criteria) this;
        }

        public Criteria andModifiedByLike(String value) {
            addCriterion("MODIFIED_BY like", value, "modifiedBy");
            return (Criteria) this;
        }

        public Criteria andModifiedByNotLike(String value) {
            addCriterion("MODIFIED_BY not like", value, "modifiedBy");
            return (Criteria) this;
        }

        public Criteria andModifiedByIn(List<String> values) {
            addCriterion("MODIFIED_BY in", values, "modifiedBy");
            return (Criteria) this;
        }

        public Criteria andModifiedByNotIn(List<String> values) {
            addCriterion("MODIFIED_BY not in", values, "modifiedBy");
            return (Criteria) this;
        }

        public Criteria andModifiedByBetween(String value1, String value2) {
            addCriterion("MODIFIED_BY between", value1, value2, "modifiedBy");
            return (Criteria) this;
        }

        public Criteria andModifiedByNotBetween(String value1, String value2) {
            addCriterion("MODIFIED_BY not between", value1, value2, "modifiedBy");
            return (Criteria) this;
        }

        public Criteria andBillIdIsNull() {
            addCriterion("BILL_ID is null");
            return (Criteria) this;
        }

        public Criteria andBillIdIsNotNull() {
            addCriterion("BILL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBillIdEqualTo(String value) {
            addCriterion("BILL_ID =", value, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdNotEqualTo(String value) {
            addCriterion("BILL_ID <>", value, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdGreaterThan(String value) {
            addCriterion("BILL_ID >", value, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdGreaterThanOrEqualTo(String value) {
            addCriterion("BILL_ID >=", value, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdLessThan(String value) {
            addCriterion("BILL_ID <", value, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdLessThanOrEqualTo(String value) {
            addCriterion("BILL_ID <=", value, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdLike(String value) {
            addCriterion("BILL_ID like", value, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdNotLike(String value) {
            addCriterion("BILL_ID not like", value, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdIn(List<String> values) {
            addCriterion("BILL_ID in", values, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdNotIn(List<String> values) {
            addCriterion("BILL_ID not in", values, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdBetween(String value1, String value2) {
            addCriterion("BILL_ID between", value1, value2, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdNotBetween(String value1, String value2) {
            addCriterion("BILL_ID not between", value1, value2, "billId");
            return (Criteria) this;
        }

        public Criteria andModifiedBillIdIsNull() {
            addCriterion("MODIFIED_BILL_ID is null");
            return (Criteria) this;
        }

        public Criteria andModifiedBillIdIsNotNull() {
            addCriterion("MODIFIED_BILL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andModifiedBillIdEqualTo(String value) {
            addCriterion("MODIFIED_BILL_ID =", value, "modifiedBillId");
            return (Criteria) this;
        }

        public Criteria andModifiedBillIdNotEqualTo(String value) {
            addCriterion("MODIFIED_BILL_ID <>", value, "modifiedBillId");
            return (Criteria) this;
        }

        public Criteria andModifiedBillIdGreaterThan(String value) {
            addCriterion("MODIFIED_BILL_ID >", value, "modifiedBillId");
            return (Criteria) this;
        }

        public Criteria andModifiedBillIdGreaterThanOrEqualTo(String value) {
            addCriterion("MODIFIED_BILL_ID >=", value, "modifiedBillId");
            return (Criteria) this;
        }

        public Criteria andModifiedBillIdLessThan(String value) {
            addCriterion("MODIFIED_BILL_ID <", value, "modifiedBillId");
            return (Criteria) this;
        }

        public Criteria andModifiedBillIdLessThanOrEqualTo(String value) {
            addCriterion("MODIFIED_BILL_ID <=", value, "modifiedBillId");
            return (Criteria) this;
        }

        public Criteria andModifiedBillIdLike(String value) {
            addCriterion("MODIFIED_BILL_ID like", value, "modifiedBillId");
            return (Criteria) this;
        }

        public Criteria andModifiedBillIdNotLike(String value) {
            addCriterion("MODIFIED_BILL_ID not like", value, "modifiedBillId");
            return (Criteria) this;
        }

        public Criteria andModifiedBillIdIn(List<String> values) {
            addCriterion("MODIFIED_BILL_ID in", values, "modifiedBillId");
            return (Criteria) this;
        }

        public Criteria andModifiedBillIdNotIn(List<String> values) {
            addCriterion("MODIFIED_BILL_ID not in", values, "modifiedBillId");
            return (Criteria) this;
        }

        public Criteria andModifiedBillIdBetween(String value1, String value2) {
            addCriterion("MODIFIED_BILL_ID between", value1, value2, "modifiedBillId");
            return (Criteria) this;
        }

        public Criteria andModifiedBillIdNotBetween(String value1, String value2) {
            addCriterion("MODIFIED_BILL_ID not between", value1, value2, "modifiedBillId");
            return (Criteria) this;
        }

        public Criteria andOpTypeIsNull() {
            addCriterion("OP_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andOpTypeIsNotNull() {
            addCriterion("OP_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andOpTypeEqualTo(String value) {
            addCriterion("OP_TYPE =", value, "opType");
            return (Criteria) this;
        }

        public Criteria andOpTypeNotEqualTo(String value) {
            addCriterion("OP_TYPE <>", value, "opType");
            return (Criteria) this;
        }

        public Criteria andOpTypeGreaterThan(String value) {
            addCriterion("OP_TYPE >", value, "opType");
            return (Criteria) this;
        }

        public Criteria andOpTypeGreaterThanOrEqualTo(String value) {
            addCriterion("OP_TYPE >=", value, "opType");
            return (Criteria) this;
        }

        public Criteria andOpTypeLessThan(String value) {
            addCriterion("OP_TYPE <", value, "opType");
            return (Criteria) this;
        }

        public Criteria andOpTypeLessThanOrEqualTo(String value) {
            addCriterion("OP_TYPE <=", value, "opType");
            return (Criteria) this;
        }

        public Criteria andOpTypeLike(String value) {
            addCriterion("OP_TYPE like", value, "opType");
            return (Criteria) this;
        }

        public Criteria andOpTypeNotLike(String value) {
            addCriterion("OP_TYPE not like", value, "opType");
            return (Criteria) this;
        }

        public Criteria andOpTypeIn(List<String> values) {
            addCriterion("OP_TYPE in", values, "opType");
            return (Criteria) this;
        }

        public Criteria andOpTypeNotIn(List<String> values) {
            addCriterion("OP_TYPE not in", values, "opType");
            return (Criteria) this;
        }

        public Criteria andOpTypeBetween(String value1, String value2) {
            addCriterion("OP_TYPE between", value1, value2, "opType");
            return (Criteria) this;
        }

        public Criteria andOpTypeNotBetween(String value1, String value2) {
            addCriterion("OP_TYPE not between", value1, value2, "opType");
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

        public Criteria andEffectiveDateIsNull() {
            addCriterion("EFFECTIVE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andEffectiveDateIsNotNull() {
            addCriterion("EFFECTIVE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andEffectiveDateEqualTo(Date value) {
            addCriterion("EFFECTIVE_DATE =", value, "effectiveDate");
            return (Criteria) this;
        }

        public Criteria andEffectiveDateNotEqualTo(Date value) {
            addCriterion("EFFECTIVE_DATE <>", value, "effectiveDate");
            return (Criteria) this;
        }

        public Criteria andEffectiveDateGreaterThan(Date value) {
            addCriterion("EFFECTIVE_DATE >", value, "effectiveDate");
            return (Criteria) this;
        }

        public Criteria andEffectiveDateGreaterThanOrEqualTo(Date value) {
            addCriterion("EFFECTIVE_DATE >=", value, "effectiveDate");
            return (Criteria) this;
        }

        public Criteria andEffectiveDateLessThan(Date value) {
            addCriterion("EFFECTIVE_DATE <", value, "effectiveDate");
            return (Criteria) this;
        }

        public Criteria andEffectiveDateLessThanOrEqualTo(Date value) {
            addCriterion("EFFECTIVE_DATE <=", value, "effectiveDate");
            return (Criteria) this;
        }

        public Criteria andEffectiveDateIn(List<Date> values) {
            addCriterion("EFFECTIVE_DATE in", values, "effectiveDate");
            return (Criteria) this;
        }

        public Criteria andEffectiveDateNotIn(List<Date> values) {
            addCriterion("EFFECTIVE_DATE not in", values, "effectiveDate");
            return (Criteria) this;
        }

        public Criteria andEffectiveDateBetween(Date value1, Date value2) {
            addCriterion("EFFECTIVE_DATE between", value1, value2, "effectiveDate");
            return (Criteria) this;
        }

        public Criteria andEffectiveDateNotBetween(Date value1, Date value2) {
            addCriterion("EFFECTIVE_DATE not between", value1, value2, "effectiveDate");
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