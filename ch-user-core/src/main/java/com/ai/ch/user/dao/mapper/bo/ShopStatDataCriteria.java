package com.ai.ch.user.dao.mapper.bo;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class ShopStatDataCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public ShopStatDataCriteria() {
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

        public Criteria andUserNameIsNull() {
            addCriterion("USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("USER_NAME =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("USER_NAME <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("USER_NAME >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("USER_NAME >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("USER_NAME <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("USER_NAME <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("USER_NAME like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("USER_NAME not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("USER_NAME in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("USER_NAME not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("USER_NAME between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("USER_NAME not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andOrderAmountIsNull() {
            addCriterion("ORDER_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andOrderAmountIsNotNull() {
            addCriterion("ORDER_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andOrderAmountEqualTo(Long value) {
            addCriterion("ORDER_AMOUNT =", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountNotEqualTo(Long value) {
            addCriterion("ORDER_AMOUNT <>", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountGreaterThan(Long value) {
            addCriterion("ORDER_AMOUNT >", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("ORDER_AMOUNT >=", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountLessThan(Long value) {
            addCriterion("ORDER_AMOUNT <", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountLessThanOrEqualTo(Long value) {
            addCriterion("ORDER_AMOUNT <=", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountIn(List<Long> values) {
            addCriterion("ORDER_AMOUNT in", values, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountNotIn(List<Long> values) {
            addCriterion("ORDER_AMOUNT not in", values, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountBetween(Long value1, Long value2) {
            addCriterion("ORDER_AMOUNT between", value1, value2, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountNotBetween(Long value1, Long value2) {
            addCriterion("ORDER_AMOUNT not between", value1, value2, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderCountIsNull() {
            addCriterion("ORDER_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andOrderCountIsNotNull() {
            addCriterion("ORDER_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCountEqualTo(Long value) {
            addCriterion("ORDER_COUNT =", value, "orderCount");
            return (Criteria) this;
        }

        public Criteria andOrderCountNotEqualTo(Long value) {
            addCriterion("ORDER_COUNT <>", value, "orderCount");
            return (Criteria) this;
        }

        public Criteria andOrderCountGreaterThan(Long value) {
            addCriterion("ORDER_COUNT >", value, "orderCount");
            return (Criteria) this;
        }

        public Criteria andOrderCountGreaterThanOrEqualTo(Long value) {
            addCriterion("ORDER_COUNT >=", value, "orderCount");
            return (Criteria) this;
        }

        public Criteria andOrderCountLessThan(Long value) {
            addCriterion("ORDER_COUNT <", value, "orderCount");
            return (Criteria) this;
        }

        public Criteria andOrderCountLessThanOrEqualTo(Long value) {
            addCriterion("ORDER_COUNT <=", value, "orderCount");
            return (Criteria) this;
        }

        public Criteria andOrderCountIn(List<Long> values) {
            addCriterion("ORDER_COUNT in", values, "orderCount");
            return (Criteria) this;
        }

        public Criteria andOrderCountNotIn(List<Long> values) {
            addCriterion("ORDER_COUNT not in", values, "orderCount");
            return (Criteria) this;
        }

        public Criteria andOrderCountBetween(Long value1, Long value2) {
            addCriterion("ORDER_COUNT between", value1, value2, "orderCount");
            return (Criteria) this;
        }

        public Criteria andOrderCountNotBetween(Long value1, Long value2) {
            addCriterion("ORDER_COUNT not between", value1, value2, "orderCount");
            return (Criteria) this;
        }

        public Criteria andServChargeIsNull() {
            addCriterion("SERV_CHARGE is null");
            return (Criteria) this;
        }

        public Criteria andServChargeIsNotNull() {
            addCriterion("SERV_CHARGE is not null");
            return (Criteria) this;
        }

        public Criteria andServChargeEqualTo(Long value) {
            addCriterion("SERV_CHARGE =", value, "servCharge");
            return (Criteria) this;
        }

        public Criteria andServChargeNotEqualTo(Long value) {
            addCriterion("SERV_CHARGE <>", value, "servCharge");
            return (Criteria) this;
        }

        public Criteria andServChargeGreaterThan(Long value) {
            addCriterion("SERV_CHARGE >", value, "servCharge");
            return (Criteria) this;
        }

        public Criteria andServChargeGreaterThanOrEqualTo(Long value) {
            addCriterion("SERV_CHARGE >=", value, "servCharge");
            return (Criteria) this;
        }

        public Criteria andServChargeLessThan(Long value) {
            addCriterion("SERV_CHARGE <", value, "servCharge");
            return (Criteria) this;
        }

        public Criteria andServChargeLessThanOrEqualTo(Long value) {
            addCriterion("SERV_CHARGE <=", value, "servCharge");
            return (Criteria) this;
        }

        public Criteria andServChargeIn(List<Long> values) {
            addCriterion("SERV_CHARGE in", values, "servCharge");
            return (Criteria) this;
        }

        public Criteria andServChargeNotIn(List<Long> values) {
            addCriterion("SERV_CHARGE not in", values, "servCharge");
            return (Criteria) this;
        }

        public Criteria andServChargeBetween(Long value1, Long value2) {
            addCriterion("SERV_CHARGE between", value1, value2, "servCharge");
            return (Criteria) this;
        }

        public Criteria andServChargeNotBetween(Long value1, Long value2) {
            addCriterion("SERV_CHARGE not between", value1, value2, "servCharge");
            return (Criteria) this;
        }

        public Criteria andGenTimeIsNull() {
            addCriterion("GEN_TIME is null");
            return (Criteria) this;
        }

        public Criteria andGenTimeIsNotNull() {
            addCriterion("GEN_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andGenTimeEqualTo(Timestamp value) {
            addCriterion("GEN_TIME =", value, "genTime");
            return (Criteria) this;
        }

        public Criteria andGenTimeNotEqualTo(Timestamp value) {
            addCriterion("GEN_TIME <>", value, "genTime");
            return (Criteria) this;
        }

        public Criteria andGenTimeGreaterThan(Timestamp value) {
            addCriterion("GEN_TIME >", value, "genTime");
            return (Criteria) this;
        }

        public Criteria andGenTimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("GEN_TIME >=", value, "genTime");
            return (Criteria) this;
        }

        public Criteria andGenTimeLessThan(Timestamp value) {
            addCriterion("GEN_TIME <", value, "genTime");
            return (Criteria) this;
        }

        public Criteria andGenTimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("GEN_TIME <=", value, "genTime");
            return (Criteria) this;
        }

        public Criteria andGenTimeIn(List<Timestamp> values) {
            addCriterion("GEN_TIME in", values, "genTime");
            return (Criteria) this;
        }

        public Criteria andGenTimeNotIn(List<Timestamp> values) {
            addCriterion("GEN_TIME not in", values, "genTime");
            return (Criteria) this;
        }

        public Criteria andGenTimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("GEN_TIME between", value1, value2, "genTime");
            return (Criteria) this;
        }

        public Criteria andGenTimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("GEN_TIME not between", value1, value2, "genTime");
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