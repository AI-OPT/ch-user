package com.ai.ch.user.dao.mapper.bo;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class ShopRankRuleCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public ShopRankRuleCriteria() {
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

        public Criteria andRankIsNull() {
            addCriterion("rank is null");
            return (Criteria) this;
        }

        public Criteria andRankIsNotNull() {
            addCriterion("rank is not null");
            return (Criteria) this;
        }

        public Criteria andRankEqualTo(Integer value) {
            addCriterion("rank =", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankNotEqualTo(Integer value) {
            addCriterion("rank <>", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankGreaterThan(Integer value) {
            addCriterion("rank >", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankGreaterThanOrEqualTo(Integer value) {
            addCriterion("rank >=", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankLessThan(Integer value) {
            addCriterion("rank <", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankLessThanOrEqualTo(Integer value) {
            addCriterion("rank <=", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankIn(List<Integer> values) {
            addCriterion("rank in", values, "rank");
            return (Criteria) this;
        }

        public Criteria andRankNotIn(List<Integer> values) {
            addCriterion("rank not in", values, "rank");
            return (Criteria) this;
        }

        public Criteria andRankBetween(Integer value1, Integer value2) {
            addCriterion("rank between", value1, value2, "rank");
            return (Criteria) this;
        }

        public Criteria andRankNotBetween(Integer value1, Integer value2) {
            addCriterion("rank not between", value1, value2, "rank");
            return (Criteria) this;
        }

        public Criteria andPeriodTypeIsNull() {
            addCriterion("period_type is null");
            return (Criteria) this;
        }

        public Criteria andPeriodTypeIsNotNull() {
            addCriterion("period_type is not null");
            return (Criteria) this;
        }

        public Criteria andPeriodTypeEqualTo(String value) {
            addCriterion("period_type =", value, "periodType");
            return (Criteria) this;
        }

        public Criteria andPeriodTypeNotEqualTo(String value) {
            addCriterion("period_type <>", value, "periodType");
            return (Criteria) this;
        }

        public Criteria andPeriodTypeGreaterThan(String value) {
            addCriterion("period_type >", value, "periodType");
            return (Criteria) this;
        }

        public Criteria andPeriodTypeGreaterThanOrEqualTo(String value) {
            addCriterion("period_type >=", value, "periodType");
            return (Criteria) this;
        }

        public Criteria andPeriodTypeLessThan(String value) {
            addCriterion("period_type <", value, "periodType");
            return (Criteria) this;
        }

        public Criteria andPeriodTypeLessThanOrEqualTo(String value) {
            addCriterion("period_type <=", value, "periodType");
            return (Criteria) this;
        }

        public Criteria andPeriodTypeLike(String value) {
            addCriterion("period_type like", value, "periodType");
            return (Criteria) this;
        }

        public Criteria andPeriodTypeNotLike(String value) {
            addCriterion("period_type not like", value, "periodType");
            return (Criteria) this;
        }

        public Criteria andPeriodTypeIn(List<String> values) {
            addCriterion("period_type in", values, "periodType");
            return (Criteria) this;
        }

        public Criteria andPeriodTypeNotIn(List<String> values) {
            addCriterion("period_type not in", values, "periodType");
            return (Criteria) this;
        }

        public Criteria andPeriodTypeBetween(String value1, String value2) {
            addCriterion("period_type between", value1, value2, "periodType");
            return (Criteria) this;
        }

        public Criteria andPeriodTypeNotBetween(String value1, String value2) {
            addCriterion("period_type not between", value1, value2, "periodType");
            return (Criteria) this;
        }

        public Criteria andMinScoreIsNull() {
            addCriterion("min_score is null");
            return (Criteria) this;
        }

        public Criteria andMinScoreIsNotNull() {
            addCriterion("min_score is not null");
            return (Criteria) this;
        }

        public Criteria andMinScoreEqualTo(Long value) {
            addCriterion("min_score =", value, "minScore");
            return (Criteria) this;
        }

        public Criteria andMinScoreNotEqualTo(Long value) {
            addCriterion("min_score <>", value, "minScore");
            return (Criteria) this;
        }

        public Criteria andMinScoreGreaterThan(Long value) {
            addCriterion("min_score >", value, "minScore");
            return (Criteria) this;
        }

        public Criteria andMinScoreGreaterThanOrEqualTo(Long value) {
            addCriterion("min_score >=", value, "minScore");
            return (Criteria) this;
        }

        public Criteria andMinScoreLessThan(Long value) {
            addCriterion("min_score <", value, "minScore");
            return (Criteria) this;
        }

        public Criteria andMinScoreLessThanOrEqualTo(Long value) {
            addCriterion("min_score <=", value, "minScore");
            return (Criteria) this;
        }

        public Criteria andMinScoreIn(List<Long> values) {
            addCriterion("min_score in", values, "minScore");
            return (Criteria) this;
        }

        public Criteria andMinScoreNotIn(List<Long> values) {
            addCriterion("min_score not in", values, "minScore");
            return (Criteria) this;
        }

        public Criteria andMinScoreBetween(Long value1, Long value2) {
            addCriterion("min_score between", value1, value2, "minScore");
            return (Criteria) this;
        }

        public Criteria andMinScoreNotBetween(Long value1, Long value2) {
            addCriterion("min_score not between", value1, value2, "minScore");
            return (Criteria) this;
        }

        public Criteria andMaxScoreIsNull() {
            addCriterion("max_score is null");
            return (Criteria) this;
        }

        public Criteria andMaxScoreIsNotNull() {
            addCriterion("max_score is not null");
            return (Criteria) this;
        }

        public Criteria andMaxScoreEqualTo(Long value) {
            addCriterion("max_score =", value, "maxScore");
            return (Criteria) this;
        }

        public Criteria andMaxScoreNotEqualTo(Long value) {
            addCriterion("max_score <>", value, "maxScore");
            return (Criteria) this;
        }

        public Criteria andMaxScoreGreaterThan(Long value) {
            addCriterion("max_score >", value, "maxScore");
            return (Criteria) this;
        }

        public Criteria andMaxScoreGreaterThanOrEqualTo(Long value) {
            addCriterion("max_score >=", value, "maxScore");
            return (Criteria) this;
        }

        public Criteria andMaxScoreLessThan(Long value) {
            addCriterion("max_score <", value, "maxScore");
            return (Criteria) this;
        }

        public Criteria andMaxScoreLessThanOrEqualTo(Long value) {
            addCriterion("max_score <=", value, "maxScore");
            return (Criteria) this;
        }

        public Criteria andMaxScoreIn(List<Long> values) {
            addCriterion("max_score in", values, "maxScore");
            return (Criteria) this;
        }

        public Criteria andMaxScoreNotIn(List<Long> values) {
            addCriterion("max_score not in", values, "maxScore");
            return (Criteria) this;
        }

        public Criteria andMaxScoreBetween(Long value1, Long value2) {
            addCriterion("max_score between", value1, value2, "maxScore");
            return (Criteria) this;
        }

        public Criteria andMaxScoreNotBetween(Long value1, Long value2) {
            addCriterion("max_score not between", value1, value2, "maxScore");
            return (Criteria) this;
        }

        public Criteria andRankNameIsNull() {
            addCriterion("rank_name is null");
            return (Criteria) this;
        }

        public Criteria andRankNameIsNotNull() {
            addCriterion("rank_name is not null");
            return (Criteria) this;
        }

        public Criteria andRankNameEqualTo(String value) {
            addCriterion("rank_name =", value, "rankName");
            return (Criteria) this;
        }

        public Criteria andRankNameNotEqualTo(String value) {
            addCriterion("rank_name <>", value, "rankName");
            return (Criteria) this;
        }

        public Criteria andRankNameGreaterThan(String value) {
            addCriterion("rank_name >", value, "rankName");
            return (Criteria) this;
        }

        public Criteria andRankNameGreaterThanOrEqualTo(String value) {
            addCriterion("rank_name >=", value, "rankName");
            return (Criteria) this;
        }

        public Criteria andRankNameLessThan(String value) {
            addCriterion("rank_name <", value, "rankName");
            return (Criteria) this;
        }

        public Criteria andRankNameLessThanOrEqualTo(String value) {
            addCriterion("rank_name <=", value, "rankName");
            return (Criteria) this;
        }

        public Criteria andRankNameLike(String value) {
            addCriterion("rank_name like", value, "rankName");
            return (Criteria) this;
        }

        public Criteria andRankNameNotLike(String value) {
            addCriterion("rank_name not like", value, "rankName");
            return (Criteria) this;
        }

        public Criteria andRankNameIn(List<String> values) {
            addCriterion("rank_name in", values, "rankName");
            return (Criteria) this;
        }

        public Criteria andRankNameNotIn(List<String> values) {
            addCriterion("rank_name not in", values, "rankName");
            return (Criteria) this;
        }

        public Criteria andRankNameBetween(String value1, String value2) {
            addCriterion("rank_name between", value1, value2, "rankName");
            return (Criteria) this;
        }

        public Criteria andRankNameNotBetween(String value1, String value2) {
            addCriterion("rank_name not between", value1, value2, "rankName");
            return (Criteria) this;
        }

        public Criteria andRankLogoIsNull() {
            addCriterion("rank_logo is null");
            return (Criteria) this;
        }

        public Criteria andRankLogoIsNotNull() {
            addCriterion("rank_logo is not null");
            return (Criteria) this;
        }

        public Criteria andRankLogoEqualTo(String value) {
            addCriterion("rank_logo =", value, "rankLogo");
            return (Criteria) this;
        }

        public Criteria andRankLogoNotEqualTo(String value) {
            addCriterion("rank_logo <>", value, "rankLogo");
            return (Criteria) this;
        }

        public Criteria andRankLogoGreaterThan(String value) {
            addCriterion("rank_logo >", value, "rankLogo");
            return (Criteria) this;
        }

        public Criteria andRankLogoGreaterThanOrEqualTo(String value) {
            addCriterion("rank_logo >=", value, "rankLogo");
            return (Criteria) this;
        }

        public Criteria andRankLogoLessThan(String value) {
            addCriterion("rank_logo <", value, "rankLogo");
            return (Criteria) this;
        }

        public Criteria andRankLogoLessThanOrEqualTo(String value) {
            addCriterion("rank_logo <=", value, "rankLogo");
            return (Criteria) this;
        }

        public Criteria andRankLogoLike(String value) {
            addCriterion("rank_logo like", value, "rankLogo");
            return (Criteria) this;
        }

        public Criteria andRankLogoNotLike(String value) {
            addCriterion("rank_logo not like", value, "rankLogo");
            return (Criteria) this;
        }

        public Criteria andRankLogoIn(List<String> values) {
            addCriterion("rank_logo in", values, "rankLogo");
            return (Criteria) this;
        }

        public Criteria andRankLogoNotIn(List<String> values) {
            addCriterion("rank_logo not in", values, "rankLogo");
            return (Criteria) this;
        }

        public Criteria andRankLogoBetween(String value1, String value2) {
            addCriterion("rank_logo between", value1, value2, "rankLogo");
            return (Criteria) this;
        }

        public Criteria andRankLogoNotBetween(String value1, String value2) {
            addCriterion("rank_logo not between", value1, value2, "rankLogo");
            return (Criteria) this;
        }

        public Criteria andTenantIdIsNull() {
            addCriterion("TENANT_ID is null");
            return (Criteria) this;
        }

        public Criteria andTenantIdIsNotNull() {
            addCriterion("TENANT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTenantIdEqualTo(String value) {
            addCriterion("TENANT_ID =", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotEqualTo(String value) {
            addCriterion("TENANT_ID <>", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdGreaterThan(String value) {
            addCriterion("TENANT_ID >", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdGreaterThanOrEqualTo(String value) {
            addCriterion("TENANT_ID >=", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdLessThan(String value) {
            addCriterion("TENANT_ID <", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdLessThanOrEqualTo(String value) {
            addCriterion("TENANT_ID <=", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdLike(String value) {
            addCriterion("TENANT_ID like", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotLike(String value) {
            addCriterion("TENANT_ID not like", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdIn(List<String> values) {
            addCriterion("TENANT_ID in", values, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotIn(List<String> values) {
            addCriterion("TENANT_ID not in", values, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdBetween(String value1, String value2) {
            addCriterion("TENANT_ID between", value1, value2, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotBetween(String value1, String value2) {
            addCriterion("TENANT_ID not between", value1, value2, "tenantId");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Timestamp value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Timestamp value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Timestamp value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Timestamp value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Timestamp> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Timestamp> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andOperIdIsNull() {
            addCriterion("oper_Id is null");
            return (Criteria) this;
        }

        public Criteria andOperIdIsNotNull() {
            addCriterion("oper_Id is not null");
            return (Criteria) this;
        }

        public Criteria andOperIdEqualTo(Long value) {
            addCriterion("oper_Id =", value, "operId");
            return (Criteria) this;
        }

        public Criteria andOperIdNotEqualTo(Long value) {
            addCriterion("oper_Id <>", value, "operId");
            return (Criteria) this;
        }

        public Criteria andOperIdGreaterThan(Long value) {
            addCriterion("oper_Id >", value, "operId");
            return (Criteria) this;
        }

        public Criteria andOperIdGreaterThanOrEqualTo(Long value) {
            addCriterion("oper_Id >=", value, "operId");
            return (Criteria) this;
        }

        public Criteria andOperIdLessThan(Long value) {
            addCriterion("oper_Id <", value, "operId");
            return (Criteria) this;
        }

        public Criteria andOperIdLessThanOrEqualTo(Long value) {
            addCriterion("oper_Id <=", value, "operId");
            return (Criteria) this;
        }

        public Criteria andOperIdIn(List<Long> values) {
            addCriterion("oper_Id in", values, "operId");
            return (Criteria) this;
        }

        public Criteria andOperIdNotIn(List<Long> values) {
            addCriterion("oper_Id not in", values, "operId");
            return (Criteria) this;
        }

        public Criteria andOperIdBetween(Long value1, Long value2) {
            addCriterion("oper_Id between", value1, value2, "operId");
            return (Criteria) this;
        }

        public Criteria andOperIdNotBetween(Long value1, Long value2) {
            addCriterion("oper_Id not between", value1, value2, "operId");
            return (Criteria) this;
        }

        public Criteria andOperNameIsNull() {
            addCriterion("oper_name is null");
            return (Criteria) this;
        }

        public Criteria andOperNameIsNotNull() {
            addCriterion("oper_name is not null");
            return (Criteria) this;
        }

        public Criteria andOperNameEqualTo(String value) {
            addCriterion("oper_name =", value, "operName");
            return (Criteria) this;
        }

        public Criteria andOperNameNotEqualTo(String value) {
            addCriterion("oper_name <>", value, "operName");
            return (Criteria) this;
        }

        public Criteria andOperNameGreaterThan(String value) {
            addCriterion("oper_name >", value, "operName");
            return (Criteria) this;
        }

        public Criteria andOperNameGreaterThanOrEqualTo(String value) {
            addCriterion("oper_name >=", value, "operName");
            return (Criteria) this;
        }

        public Criteria andOperNameLessThan(String value) {
            addCriterion("oper_name <", value, "operName");
            return (Criteria) this;
        }

        public Criteria andOperNameLessThanOrEqualTo(String value) {
            addCriterion("oper_name <=", value, "operName");
            return (Criteria) this;
        }

        public Criteria andOperNameLike(String value) {
            addCriterion("oper_name like", value, "operName");
            return (Criteria) this;
        }

        public Criteria andOperNameNotLike(String value) {
            addCriterion("oper_name not like", value, "operName");
            return (Criteria) this;
        }

        public Criteria andOperNameIn(List<String> values) {
            addCriterion("oper_name in", values, "operName");
            return (Criteria) this;
        }

        public Criteria andOperNameNotIn(List<String> values) {
            addCriterion("oper_name not in", values, "operName");
            return (Criteria) this;
        }

        public Criteria andOperNameBetween(String value1, String value2) {
            addCriterion("oper_name between", value1, value2, "operName");
            return (Criteria) this;
        }

        public Criteria andOperNameNotBetween(String value1, String value2) {
            addCriterion("oper_name not between", value1, value2, "operName");
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