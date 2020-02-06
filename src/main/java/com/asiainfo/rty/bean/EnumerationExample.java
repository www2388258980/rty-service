package com.asiainfo.rty.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EnumerationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EnumerationExample() {
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

        public Criteria andEnumIdIsNull() {
            addCriterion("ENUM_ID is null");
            return (Criteria) this;
        }

        public Criteria andEnumIdIsNotNull() {
            addCriterion("ENUM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEnumIdEqualTo(String value) {
            addCriterion("ENUM_ID =", value, "enumId");
            return (Criteria) this;
        }

        public Criteria andEnumIdNotEqualTo(String value) {
            addCriterion("ENUM_ID <>", value, "enumId");
            return (Criteria) this;
        }

        public Criteria andEnumIdGreaterThan(String value) {
            addCriterion("ENUM_ID >", value, "enumId");
            return (Criteria) this;
        }

        public Criteria andEnumIdGreaterThanOrEqualTo(String value) {
            addCriterion("ENUM_ID >=", value, "enumId");
            return (Criteria) this;
        }

        public Criteria andEnumIdLessThan(String value) {
            addCriterion("ENUM_ID <", value, "enumId");
            return (Criteria) this;
        }

        public Criteria andEnumIdLessThanOrEqualTo(String value) {
            addCriterion("ENUM_ID <=", value, "enumId");
            return (Criteria) this;
        }

        public Criteria andEnumIdLike(String value) {
            addCriterion("ENUM_ID like", value, "enumId");
            return (Criteria) this;
        }

        public Criteria andEnumIdNotLike(String value) {
            addCriterion("ENUM_ID not like", value, "enumId");
            return (Criteria) this;
        }

        public Criteria andEnumIdIn(List<String> values) {
            addCriterion("ENUM_ID in", values, "enumId");
            return (Criteria) this;
        }

        public Criteria andEnumIdNotIn(List<String> values) {
            addCriterion("ENUM_ID not in", values, "enumId");
            return (Criteria) this;
        }

        public Criteria andEnumIdBetween(String value1, String value2) {
            addCriterion("ENUM_ID between", value1, value2, "enumId");
            return (Criteria) this;
        }

        public Criteria andEnumIdNotBetween(String value1, String value2) {
            addCriterion("ENUM_ID not between", value1, value2, "enumId");
            return (Criteria) this;
        }

        public Criteria andEnumTypeIdIsNull() {
            addCriterion("ENUM_TYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andEnumTypeIdIsNotNull() {
            addCriterion("ENUM_TYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEnumTypeIdEqualTo(String value) {
            addCriterion("ENUM_TYPE_ID =", value, "enumTypeId");
            return (Criteria) this;
        }

        public Criteria andEnumTypeIdNotEqualTo(String value) {
            addCriterion("ENUM_TYPE_ID <>", value, "enumTypeId");
            return (Criteria) this;
        }

        public Criteria andEnumTypeIdGreaterThan(String value) {
            addCriterion("ENUM_TYPE_ID >", value, "enumTypeId");
            return (Criteria) this;
        }

        public Criteria andEnumTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("ENUM_TYPE_ID >=", value, "enumTypeId");
            return (Criteria) this;
        }

        public Criteria andEnumTypeIdLessThan(String value) {
            addCriterion("ENUM_TYPE_ID <", value, "enumTypeId");
            return (Criteria) this;
        }

        public Criteria andEnumTypeIdLessThanOrEqualTo(String value) {
            addCriterion("ENUM_TYPE_ID <=", value, "enumTypeId");
            return (Criteria) this;
        }

        public Criteria andEnumTypeIdLike(String value) {
            addCriterion("ENUM_TYPE_ID like", value, "enumTypeId");
            return (Criteria) this;
        }

        public Criteria andEnumTypeIdNotLike(String value) {
            addCriterion("ENUM_TYPE_ID not like", value, "enumTypeId");
            return (Criteria) this;
        }

        public Criteria andEnumTypeIdIn(List<String> values) {
            addCriterion("ENUM_TYPE_ID in", values, "enumTypeId");
            return (Criteria) this;
        }

        public Criteria andEnumTypeIdNotIn(List<String> values) {
            addCriterion("ENUM_TYPE_ID not in", values, "enumTypeId");
            return (Criteria) this;
        }

        public Criteria andEnumTypeIdBetween(String value1, String value2) {
            addCriterion("ENUM_TYPE_ID between", value1, value2, "enumTypeId");
            return (Criteria) this;
        }

        public Criteria andEnumTypeIdNotBetween(String value1, String value2) {
            addCriterion("ENUM_TYPE_ID not between", value1, value2, "enumTypeId");
            return (Criteria) this;
        }

        public Criteria andEnumCodeIsNull() {
            addCriterion("ENUM_CODE is null");
            return (Criteria) this;
        }

        public Criteria andEnumCodeIsNotNull() {
            addCriterion("ENUM_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andEnumCodeEqualTo(String value) {
            addCriterion("ENUM_CODE =", value, "enumCode");
            return (Criteria) this;
        }

        public Criteria andEnumCodeNotEqualTo(String value) {
            addCriterion("ENUM_CODE <>", value, "enumCode");
            return (Criteria) this;
        }

        public Criteria andEnumCodeGreaterThan(String value) {
            addCriterion("ENUM_CODE >", value, "enumCode");
            return (Criteria) this;
        }

        public Criteria andEnumCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ENUM_CODE >=", value, "enumCode");
            return (Criteria) this;
        }

        public Criteria andEnumCodeLessThan(String value) {
            addCriterion("ENUM_CODE <", value, "enumCode");
            return (Criteria) this;
        }

        public Criteria andEnumCodeLessThanOrEqualTo(String value) {
            addCriterion("ENUM_CODE <=", value, "enumCode");
            return (Criteria) this;
        }

        public Criteria andEnumCodeLike(String value) {
            addCriterion("ENUM_CODE like", value, "enumCode");
            return (Criteria) this;
        }

        public Criteria andEnumCodeNotLike(String value) {
            addCriterion("ENUM_CODE not like", value, "enumCode");
            return (Criteria) this;
        }

        public Criteria andEnumCodeIn(List<String> values) {
            addCriterion("ENUM_CODE in", values, "enumCode");
            return (Criteria) this;
        }

        public Criteria andEnumCodeNotIn(List<String> values) {
            addCriterion("ENUM_CODE not in", values, "enumCode");
            return (Criteria) this;
        }

        public Criteria andEnumCodeBetween(String value1, String value2) {
            addCriterion("ENUM_CODE between", value1, value2, "enumCode");
            return (Criteria) this;
        }

        public Criteria andEnumCodeNotBetween(String value1, String value2) {
            addCriterion("ENUM_CODE not between", value1, value2, "enumCode");
            return (Criteria) this;
        }

        public Criteria andSequenceIdIsNull() {
            addCriterion("SEQUENCE_ID is null");
            return (Criteria) this;
        }

        public Criteria andSequenceIdIsNotNull() {
            addCriterion("SEQUENCE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSequenceIdEqualTo(String value) {
            addCriterion("SEQUENCE_ID =", value, "sequenceId");
            return (Criteria) this;
        }

        public Criteria andSequenceIdNotEqualTo(String value) {
            addCriterion("SEQUENCE_ID <>", value, "sequenceId");
            return (Criteria) this;
        }

        public Criteria andSequenceIdGreaterThan(String value) {
            addCriterion("SEQUENCE_ID >", value, "sequenceId");
            return (Criteria) this;
        }

        public Criteria andSequenceIdGreaterThanOrEqualTo(String value) {
            addCriterion("SEQUENCE_ID >=", value, "sequenceId");
            return (Criteria) this;
        }

        public Criteria andSequenceIdLessThan(String value) {
            addCriterion("SEQUENCE_ID <", value, "sequenceId");
            return (Criteria) this;
        }

        public Criteria andSequenceIdLessThanOrEqualTo(String value) {
            addCriterion("SEQUENCE_ID <=", value, "sequenceId");
            return (Criteria) this;
        }

        public Criteria andSequenceIdLike(String value) {
            addCriterion("SEQUENCE_ID like", value, "sequenceId");
            return (Criteria) this;
        }

        public Criteria andSequenceIdNotLike(String value) {
            addCriterion("SEQUENCE_ID not like", value, "sequenceId");
            return (Criteria) this;
        }

        public Criteria andSequenceIdIn(List<String> values) {
            addCriterion("SEQUENCE_ID in", values, "sequenceId");
            return (Criteria) this;
        }

        public Criteria andSequenceIdNotIn(List<String> values) {
            addCriterion("SEQUENCE_ID not in", values, "sequenceId");
            return (Criteria) this;
        }

        public Criteria andSequenceIdBetween(String value1, String value2) {
            addCriterion("SEQUENCE_ID between", value1, value2, "sequenceId");
            return (Criteria) this;
        }

        public Criteria andSequenceIdNotBetween(String value1, String value2) {
            addCriterion("SEQUENCE_ID not between", value1, value2, "sequenceId");
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

        public Criteria andCommentsIsNull() {
            addCriterion("COMMENTS is null");
            return (Criteria) this;
        }

        public Criteria andCommentsIsNotNull() {
            addCriterion("COMMENTS is not null");
            return (Criteria) this;
        }

        public Criteria andCommentsEqualTo(String value) {
            addCriterion("COMMENTS =", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotEqualTo(String value) {
            addCriterion("COMMENTS <>", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsGreaterThan(String value) {
            addCriterion("COMMENTS >", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsGreaterThanOrEqualTo(String value) {
            addCriterion("COMMENTS >=", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLessThan(String value) {
            addCriterion("COMMENTS <", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLessThanOrEqualTo(String value) {
            addCriterion("COMMENTS <=", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLike(String value) {
            addCriterion("COMMENTS like", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotLike(String value) {
            addCriterion("COMMENTS not like", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsIn(List<String> values) {
            addCriterion("COMMENTS in", values, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotIn(List<String> values) {
            addCriterion("COMMENTS not in", values, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsBetween(String value1, String value2) {
            addCriterion("COMMENTS between", value1, value2, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotBetween(String value1, String value2) {
            addCriterion("COMMENTS not between", value1, value2, "comments");
            return (Criteria) this;
        }

        public Criteria andEnumCodeNumberIsNull() {
            addCriterion("ENUM_CODE_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andEnumCodeNumberIsNotNull() {
            addCriterion("ENUM_CODE_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andEnumCodeNumberEqualTo(Integer value) {
            addCriterion("ENUM_CODE_NUMBER =", value, "enumCodeNumber");
            return (Criteria) this;
        }

        public Criteria andEnumCodeNumberNotEqualTo(Integer value) {
            addCriterion("ENUM_CODE_NUMBER <>", value, "enumCodeNumber");
            return (Criteria) this;
        }

        public Criteria andEnumCodeNumberGreaterThan(Integer value) {
            addCriterion("ENUM_CODE_NUMBER >", value, "enumCodeNumber");
            return (Criteria) this;
        }

        public Criteria andEnumCodeNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("ENUM_CODE_NUMBER >=", value, "enumCodeNumber");
            return (Criteria) this;
        }

        public Criteria andEnumCodeNumberLessThan(Integer value) {
            addCriterion("ENUM_CODE_NUMBER <", value, "enumCodeNumber");
            return (Criteria) this;
        }

        public Criteria andEnumCodeNumberLessThanOrEqualTo(Integer value) {
            addCriterion("ENUM_CODE_NUMBER <=", value, "enumCodeNumber");
            return (Criteria) this;
        }

        public Criteria andEnumCodeNumberIn(List<Integer> values) {
            addCriterion("ENUM_CODE_NUMBER in", values, "enumCodeNumber");
            return (Criteria) this;
        }

        public Criteria andEnumCodeNumberNotIn(List<Integer> values) {
            addCriterion("ENUM_CODE_NUMBER not in", values, "enumCodeNumber");
            return (Criteria) this;
        }

        public Criteria andEnumCodeNumberBetween(Integer value1, Integer value2) {
            addCriterion("ENUM_CODE_NUMBER between", value1, value2, "enumCodeNumber");
            return (Criteria) this;
        }

        public Criteria andEnumCodeNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("ENUM_CODE_NUMBER not between", value1, value2, "enumCodeNumber");
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