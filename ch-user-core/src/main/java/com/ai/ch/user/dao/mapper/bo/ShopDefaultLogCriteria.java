package com.ai.ch.user.dao.mapper.bo;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class ShopDefaultLogCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public ShopDefaultLogCriteria() {
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

    public void setLimitStart(Integer limitStart) {
        this.limitStart=limitStart;
    }

    public Integer getLimitStart() {
        return limitStart;
    }

    public void setLimitEnd(Integer limitEnd) {
        this.limitEnd=limitEnd;
    }

    public Integer getLimitEnd() {
        return limitEnd;
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

        public Criteria andSerialCodeIsNull() {
            addCriterion("SERIAL_CODE is null");
            return (Criteria) this;
        }

        public Criteria andSerialCodeIsNotNull() {
            addCriterion("SERIAL_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andSerialCodeEqualTo(String value) {
            addCriterion("SERIAL_CODE =", value, "serialCode");
            return (Criteria) this;
        }

        public Criteria andSerialCodeNotEqualTo(String value) {
            addCriterion("SERIAL_CODE <>", value, "serialCode");
            return (Criteria) this;
        }

        public Criteria andSerialCodeGreaterThan(String value) {
            addCriterion("SERIAL_CODE >", value, "serialCode");
            return (Criteria) this;
        }

        public Criteria andSerialCodeGreaterThanOrEqualTo(String value) {
            addCriterion("SERIAL_CODE >=", value, "serialCode");
            return (Criteria) this;
        }

        public Criteria andSerialCodeLessThan(String value) {
            addCriterion("SERIAL_CODE <", value, "serialCode");
            return (Criteria) this;
        }

        public Criteria andSerialCodeLessThanOrEqualTo(String value) {
            addCriterion("SERIAL_CODE <=", value, "serialCode");
            return (Criteria) this;
        }

        public Criteria andSerialCodeLike(String value) {
            addCriterion("SERIAL_CODE like", value, "serialCode");
            return (Criteria) this;
        }

        public Criteria andSerialCodeNotLike(String value) {
            addCriterion("SERIAL_CODE not like", value, "serialCode");
            return (Criteria) this;
        }

        public Criteria andSerialCodeIn(List<String> values) {
            addCriterion("SERIAL_CODE in", values, "serialCode");
            return (Criteria) this;
        }

        public Criteria andSerialCodeNotIn(List<String> values) {
            addCriterion("SERIAL_CODE not in", values, "serialCode");
            return (Criteria) this;
        }

        public Criteria andSerialCodeBetween(String value1, String value2) {
            addCriterion("SERIAL_CODE between", value1, value2, "serialCode");
            return (Criteria) this;
        }

        public Criteria andSerialCodeNotBetween(String value1, String value2) {
            addCriterion("SERIAL_CODE not between", value1, value2, "serialCode");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("USER_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("USER_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("USER_ID like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("USER_ID not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("USER_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("USER_ID not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andDefaultReasonIsNull() {
            addCriterion("DEFAULT_REASON is null");
            return (Criteria) this;
        }

        public Criteria andDefaultReasonIsNotNull() {
            addCriterion("DEFAULT_REASON is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultReasonEqualTo(String value) {
            addCriterion("DEFAULT_REASON =", value, "defaultReason");
            return (Criteria) this;
        }

        public Criteria andDefaultReasonNotEqualTo(String value) {
            addCriterion("DEFAULT_REASON <>", value, "defaultReason");
            return (Criteria) this;
        }

        public Criteria andDefaultReasonGreaterThan(String value) {
            addCriterion("DEFAULT_REASON >", value, "defaultReason");
            return (Criteria) this;
        }

        public Criteria andDefaultReasonGreaterThanOrEqualTo(String value) {
            addCriterion("DEFAULT_REASON >=", value, "defaultReason");
            return (Criteria) this;
        }

        public Criteria andDefaultReasonLessThan(String value) {
            addCriterion("DEFAULT_REASON <", value, "defaultReason");
            return (Criteria) this;
        }

        public Criteria andDefaultReasonLessThanOrEqualTo(String value) {
            addCriterion("DEFAULT_REASON <=", value, "defaultReason");
            return (Criteria) this;
        }

        public Criteria andDefaultReasonLike(String value) {
            addCriterion("DEFAULT_REASON like", value, "defaultReason");
            return (Criteria) this;
        }

        public Criteria andDefaultReasonNotLike(String value) {
            addCriterion("DEFAULT_REASON not like", value, "defaultReason");
            return (Criteria) this;
        }

        public Criteria andDefaultReasonIn(List<String> values) {
            addCriterion("DEFAULT_REASON in", values, "defaultReason");
            return (Criteria) this;
        }

        public Criteria andDefaultReasonNotIn(List<String> values) {
            addCriterion("DEFAULT_REASON not in", values, "defaultReason");
            return (Criteria) this;
        }

        public Criteria andDefaultReasonBetween(String value1, String value2) {
            addCriterion("DEFAULT_REASON between", value1, value2, "defaultReason");
            return (Criteria) this;
        }

        public Criteria andDefaultReasonNotBetween(String value1, String value2) {
            addCriterion("DEFAULT_REASON not between", value1, value2, "defaultReason");
            return (Criteria) this;
        }

        public Criteria andDeductDateIsNull() {
            addCriterion("DEDUCT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andDeductDateIsNotNull() {
            addCriterion("DEDUCT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andDeductDateEqualTo(Timestamp value) {
            addCriterion("DEDUCT_DATE =", value, "deductDate");
            return (Criteria) this;
        }

        public Criteria andDeductDateNotEqualTo(Timestamp value) {
            addCriterion("DEDUCT_DATE <>", value, "deductDate");
            return (Criteria) this;
        }

        public Criteria andDeductDateGreaterThan(Timestamp value) {
            addCriterion("DEDUCT_DATE >", value, "deductDate");
            return (Criteria) this;
        }

        public Criteria andDeductDateGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("DEDUCT_DATE >=", value, "deductDate");
            return (Criteria) this;
        }

        public Criteria andDeductDateLessThan(Timestamp value) {
            addCriterion("DEDUCT_DATE <", value, "deductDate");
            return (Criteria) this;
        }

        public Criteria andDeductDateLessThanOrEqualTo(Timestamp value) {
            addCriterion("DEDUCT_DATE <=", value, "deductDate");
            return (Criteria) this;
        }

        public Criteria andDeductDateIn(List<Timestamp> values) {
            addCriterion("DEDUCT_DATE in", values, "deductDate");
            return (Criteria) this;
        }

        public Criteria andDeductDateNotIn(List<Timestamp> values) {
            addCriterion("DEDUCT_DATE not in", values, "deductDate");
            return (Criteria) this;
        }

        public Criteria andDeductDateBetween(Timestamp value1, Timestamp value2) {
            addCriterion("DEDUCT_DATE between", value1, value2, "deductDate");
            return (Criteria) this;
        }

        public Criteria andDeductDateNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("DEDUCT_DATE not between", value1, value2, "deductDate");
            return (Criteria) this;
        }

        public Criteria andDeductBalanceIsNull() {
            addCriterion("DEDUCT_BALANCE is null");
            return (Criteria) this;
        }

        public Criteria andDeductBalanceIsNotNull() {
            addCriterion("DEDUCT_BALANCE is not null");
            return (Criteria) this;
        }

        public Criteria andDeductBalanceEqualTo(Long value) {
            addCriterion("DEDUCT_BALANCE =", value, "deductBalance");
            return (Criteria) this;
        }

        public Criteria andDeductBalanceNotEqualTo(Long value) {
            addCriterion("DEDUCT_BALANCE <>", value, "deductBalance");
            return (Criteria) this;
        }

        public Criteria andDeductBalanceGreaterThan(Long value) {
            addCriterion("DEDUCT_BALANCE >", value, "deductBalance");
            return (Criteria) this;
        }

        public Criteria andDeductBalanceGreaterThanOrEqualTo(Long value) {
            addCriterion("DEDUCT_BALANCE >=", value, "deductBalance");
            return (Criteria) this;
        }

        public Criteria andDeductBalanceLessThan(Long value) {
            addCriterion("DEDUCT_BALANCE <", value, "deductBalance");
            return (Criteria) this;
        }

        public Criteria andDeductBalanceLessThanOrEqualTo(Long value) {
            addCriterion("DEDUCT_BALANCE <=", value, "deductBalance");
            return (Criteria) this;
        }

        public Criteria andDeductBalanceIn(List<Long> values) {
            addCriterion("DEDUCT_BALANCE in", values, "deductBalance");
            return (Criteria) this;
        }

        public Criteria andDeductBalanceNotIn(List<Long> values) {
            addCriterion("DEDUCT_BALANCE not in", values, "deductBalance");
            return (Criteria) this;
        }

        public Criteria andDeductBalanceBetween(Long value1, Long value2) {
            addCriterion("DEDUCT_BALANCE between", value1, value2, "deductBalance");
            return (Criteria) this;
        }

        public Criteria andDeductBalanceNotBetween(Long value1, Long value2) {
            addCriterion("DEDUCT_BALANCE not between", value1, value2, "deductBalance");
            return (Criteria) this;
        }

        public Criteria andOperIdIsNull() {
            addCriterion("OPER_ID is null");
            return (Criteria) this;
        }

        public Criteria andOperIdIsNotNull() {
            addCriterion("OPER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOperIdEqualTo(Long value) {
            addCriterion("OPER_ID =", value, "operId");
            return (Criteria) this;
        }

        public Criteria andOperIdNotEqualTo(Long value) {
            addCriterion("OPER_ID <>", value, "operId");
            return (Criteria) this;
        }

        public Criteria andOperIdGreaterThan(Long value) {
            addCriterion("OPER_ID >", value, "operId");
            return (Criteria) this;
        }

        public Criteria andOperIdGreaterThanOrEqualTo(Long value) {
            addCriterion("OPER_ID >=", value, "operId");
            return (Criteria) this;
        }

        public Criteria andOperIdLessThan(Long value) {
            addCriterion("OPER_ID <", value, "operId");
            return (Criteria) this;
        }

        public Criteria andOperIdLessThanOrEqualTo(Long value) {
            addCriterion("OPER_ID <=", value, "operId");
            return (Criteria) this;
        }

        public Criteria andOperIdIn(List<Long> values) {
            addCriterion("OPER_ID in", values, "operId");
            return (Criteria) this;
        }

        public Criteria andOperIdNotIn(List<Long> values) {
            addCriterion("OPER_ID not in", values, "operId");
            return (Criteria) this;
        }

        public Criteria andOperIdBetween(Long value1, Long value2) {
            addCriterion("OPER_ID between", value1, value2, "operId");
            return (Criteria) this;
        }

        public Criteria andOperIdNotBetween(Long value1, Long value2) {
            addCriterion("OPER_ID not between", value1, value2, "operId");
            return (Criteria) this;
        }

        public Criteria andOperNameIsNull() {
            addCriterion("OPER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andOperNameIsNotNull() {
            addCriterion("OPER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andOperNameEqualTo(String value) {
            addCriterion("OPER_NAME =", value, "operName");
            return (Criteria) this;
        }

        public Criteria andOperNameNotEqualTo(String value) {
            addCriterion("OPER_NAME <>", value, "operName");
            return (Criteria) this;
        }

        public Criteria andOperNameGreaterThan(String value) {
            addCriterion("OPER_NAME >", value, "operName");
            return (Criteria) this;
        }

        public Criteria andOperNameGreaterThanOrEqualTo(String value) {
            addCriterion("OPER_NAME >=", value, "operName");
            return (Criteria) this;
        }

        public Criteria andOperNameLessThan(String value) {
            addCriterion("OPER_NAME <", value, "operName");
            return (Criteria) this;
        }

        public Criteria andOperNameLessThanOrEqualTo(String value) {
            addCriterion("OPER_NAME <=", value, "operName");
            return (Criteria) this;
        }

        public Criteria andOperNameLike(String value) {
            addCriterion("OPER_NAME like", value, "operName");
            return (Criteria) this;
        }

        public Criteria andOperNameNotLike(String value) {
            addCriterion("OPER_NAME not like", value, "operName");
            return (Criteria) this;
        }

        public Criteria andOperNameIn(List<String> values) {
            addCriterion("OPER_NAME in", values, "operName");
            return (Criteria) this;
        }

        public Criteria andOperNameNotIn(List<String> values) {
            addCriterion("OPER_NAME not in", values, "operName");
            return (Criteria) this;
        }

        public Criteria andOperNameBetween(String value1, String value2) {
            addCriterion("OPER_NAME between", value1, value2, "operName");
            return (Criteria) this;
        }

        public Criteria andOperNameNotBetween(String value1, String value2) {
            addCriterion("OPER_NAME not between", value1, value2, "operName");
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