package com.ai.ch.user.dao.mapper.bo;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class CtScoreLogCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public CtScoreLogCriteria() {
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

        public Criteria andScoreDateIsNull() {
            addCriterion("SCORE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andScoreDateIsNotNull() {
            addCriterion("SCORE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andScoreDateEqualTo(Timestamp value) {
            addCriterion("SCORE_DATE =", value, "scoreDate");
            return (Criteria) this;
        }

        public Criteria andScoreDateNotEqualTo(Timestamp value) {
            addCriterion("SCORE_DATE <>", value, "scoreDate");
            return (Criteria) this;
        }

        public Criteria andScoreDateGreaterThan(Timestamp value) {
            addCriterion("SCORE_DATE >", value, "scoreDate");
            return (Criteria) this;
        }

        public Criteria andScoreDateGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("SCORE_DATE >=", value, "scoreDate");
            return (Criteria) this;
        }

        public Criteria andScoreDateLessThan(Timestamp value) {
            addCriterion("SCORE_DATE <", value, "scoreDate");
            return (Criteria) this;
        }

        public Criteria andScoreDateLessThanOrEqualTo(Timestamp value) {
            addCriterion("SCORE_DATE <=", value, "scoreDate");
            return (Criteria) this;
        }

        public Criteria andScoreDateIn(List<Timestamp> values) {
            addCriterion("SCORE_DATE in", values, "scoreDate");
            return (Criteria) this;
        }

        public Criteria andScoreDateNotIn(List<Timestamp> values) {
            addCriterion("SCORE_DATE not in", values, "scoreDate");
            return (Criteria) this;
        }

        public Criteria andScoreDateBetween(Timestamp value1, Timestamp value2) {
            addCriterion("SCORE_DATE between", value1, value2, "scoreDate");
            return (Criteria) this;
        }

        public Criteria andScoreDateNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("SCORE_DATE not between", value1, value2, "scoreDate");
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

        public Criteria andTotalScoreIsNull() {
            addCriterion("TOTAL_SCORE is null");
            return (Criteria) this;
        }

        public Criteria andTotalScoreIsNotNull() {
            addCriterion("TOTAL_SCORE is not null");
            return (Criteria) this;
        }

        public Criteria andTotalScoreEqualTo(Integer value) {
            addCriterion("TOTAL_SCORE =", value, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreNotEqualTo(Integer value) {
            addCriterion("TOTAL_SCORE <>", value, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreGreaterThan(Integer value) {
            addCriterion("TOTAL_SCORE >", value, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("TOTAL_SCORE >=", value, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreLessThan(Integer value) {
            addCriterion("TOTAL_SCORE <", value, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreLessThanOrEqualTo(Integer value) {
            addCriterion("TOTAL_SCORE <=", value, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreIn(List<Integer> values) {
            addCriterion("TOTAL_SCORE in", values, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreNotIn(List<Integer> values) {
            addCriterion("TOTAL_SCORE not in", values, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreBetween(Integer value1, Integer value2) {
            addCriterion("TOTAL_SCORE between", value1, value2, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("TOTAL_SCORE not between", value1, value2, "totalScore");
            return (Criteria) this;
        }

        public Criteria andScore1IsNull() {
            addCriterion("SCORE1 is null");
            return (Criteria) this;
        }

        public Criteria andScore1IsNotNull() {
            addCriterion("SCORE1 is not null");
            return (Criteria) this;
        }

        public Criteria andScore1EqualTo(Integer value) {
            addCriterion("SCORE1 =", value, "score1");
            return (Criteria) this;
        }

        public Criteria andScore1NotEqualTo(Integer value) {
            addCriterion("SCORE1 <>", value, "score1");
            return (Criteria) this;
        }

        public Criteria andScore1GreaterThan(Integer value) {
            addCriterion("SCORE1 >", value, "score1");
            return (Criteria) this;
        }

        public Criteria andScore1GreaterThanOrEqualTo(Integer value) {
            addCriterion("SCORE1 >=", value, "score1");
            return (Criteria) this;
        }

        public Criteria andScore1LessThan(Integer value) {
            addCriterion("SCORE1 <", value, "score1");
            return (Criteria) this;
        }

        public Criteria andScore1LessThanOrEqualTo(Integer value) {
            addCriterion("SCORE1 <=", value, "score1");
            return (Criteria) this;
        }

        public Criteria andScore1In(List<Integer> values) {
            addCriterion("SCORE1 in", values, "score1");
            return (Criteria) this;
        }

        public Criteria andScore1NotIn(List<Integer> values) {
            addCriterion("SCORE1 not in", values, "score1");
            return (Criteria) this;
        }

        public Criteria andScore1Between(Integer value1, Integer value2) {
            addCriterion("SCORE1 between", value1, value2, "score1");
            return (Criteria) this;
        }

        public Criteria andScore1NotBetween(Integer value1, Integer value2) {
            addCriterion("SCORE1 not between", value1, value2, "score1");
            return (Criteria) this;
        }

        public Criteria andScore2IsNull() {
            addCriterion("SCORE2 is null");
            return (Criteria) this;
        }

        public Criteria andScore2IsNotNull() {
            addCriterion("SCORE2 is not null");
            return (Criteria) this;
        }

        public Criteria andScore2EqualTo(Integer value) {
            addCriterion("SCORE2 =", value, "score2");
            return (Criteria) this;
        }

        public Criteria andScore2NotEqualTo(Integer value) {
            addCriterion("SCORE2 <>", value, "score2");
            return (Criteria) this;
        }

        public Criteria andScore2GreaterThan(Integer value) {
            addCriterion("SCORE2 >", value, "score2");
            return (Criteria) this;
        }

        public Criteria andScore2GreaterThanOrEqualTo(Integer value) {
            addCriterion("SCORE2 >=", value, "score2");
            return (Criteria) this;
        }

        public Criteria andScore2LessThan(Integer value) {
            addCriterion("SCORE2 <", value, "score2");
            return (Criteria) this;
        }

        public Criteria andScore2LessThanOrEqualTo(Integer value) {
            addCriterion("SCORE2 <=", value, "score2");
            return (Criteria) this;
        }

        public Criteria andScore2In(List<Integer> values) {
            addCriterion("SCORE2 in", values, "score2");
            return (Criteria) this;
        }

        public Criteria andScore2NotIn(List<Integer> values) {
            addCriterion("SCORE2 not in", values, "score2");
            return (Criteria) this;
        }

        public Criteria andScore2Between(Integer value1, Integer value2) {
            addCriterion("SCORE2 between", value1, value2, "score2");
            return (Criteria) this;
        }

        public Criteria andScore2NotBetween(Integer value1, Integer value2) {
            addCriterion("SCORE2 not between", value1, value2, "score2");
            return (Criteria) this;
        }

        public Criteria andScore3IsNull() {
            addCriterion("SCORE3 is null");
            return (Criteria) this;
        }

        public Criteria andScore3IsNotNull() {
            addCriterion("SCORE3 is not null");
            return (Criteria) this;
        }

        public Criteria andScore3EqualTo(Integer value) {
            addCriterion("SCORE3 =", value, "score3");
            return (Criteria) this;
        }

        public Criteria andScore3NotEqualTo(Integer value) {
            addCriterion("SCORE3 <>", value, "score3");
            return (Criteria) this;
        }

        public Criteria andScore3GreaterThan(Integer value) {
            addCriterion("SCORE3 >", value, "score3");
            return (Criteria) this;
        }

        public Criteria andScore3GreaterThanOrEqualTo(Integer value) {
            addCriterion("SCORE3 >=", value, "score3");
            return (Criteria) this;
        }

        public Criteria andScore3LessThan(Integer value) {
            addCriterion("SCORE3 <", value, "score3");
            return (Criteria) this;
        }

        public Criteria andScore3LessThanOrEqualTo(Integer value) {
            addCriterion("SCORE3 <=", value, "score3");
            return (Criteria) this;
        }

        public Criteria andScore3In(List<Integer> values) {
            addCriterion("SCORE3 in", values, "score3");
            return (Criteria) this;
        }

        public Criteria andScore3NotIn(List<Integer> values) {
            addCriterion("SCORE3 not in", values, "score3");
            return (Criteria) this;
        }

        public Criteria andScore3Between(Integer value1, Integer value2) {
            addCriterion("SCORE3 between", value1, value2, "score3");
            return (Criteria) this;
        }

        public Criteria andScore3NotBetween(Integer value1, Integer value2) {
            addCriterion("SCORE3 not between", value1, value2, "score3");
            return (Criteria) this;
        }

        public Criteria andScore4IsNull() {
            addCriterion("SCORE4 is null");
            return (Criteria) this;
        }

        public Criteria andScore4IsNotNull() {
            addCriterion("SCORE4 is not null");
            return (Criteria) this;
        }

        public Criteria andScore4EqualTo(Integer value) {
            addCriterion("SCORE4 =", value, "score4");
            return (Criteria) this;
        }

        public Criteria andScore4NotEqualTo(Integer value) {
            addCriterion("SCORE4 <>", value, "score4");
            return (Criteria) this;
        }

        public Criteria andScore4GreaterThan(Integer value) {
            addCriterion("SCORE4 >", value, "score4");
            return (Criteria) this;
        }

        public Criteria andScore4GreaterThanOrEqualTo(Integer value) {
            addCriterion("SCORE4 >=", value, "score4");
            return (Criteria) this;
        }

        public Criteria andScore4LessThan(Integer value) {
            addCriterion("SCORE4 <", value, "score4");
            return (Criteria) this;
        }

        public Criteria andScore4LessThanOrEqualTo(Integer value) {
            addCriterion("SCORE4 <=", value, "score4");
            return (Criteria) this;
        }

        public Criteria andScore4In(List<Integer> values) {
            addCriterion("SCORE4 in", values, "score4");
            return (Criteria) this;
        }

        public Criteria andScore4NotIn(List<Integer> values) {
            addCriterion("SCORE4 not in", values, "score4");
            return (Criteria) this;
        }

        public Criteria andScore4Between(Integer value1, Integer value2) {
            addCriterion("SCORE4 between", value1, value2, "score4");
            return (Criteria) this;
        }

        public Criteria andScore4NotBetween(Integer value1, Integer value2) {
            addCriterion("SCORE4 not between", value1, value2, "score4");
            return (Criteria) this;
        }

        public Criteria andScore5IsNull() {
            addCriterion("SCORE5 is null");
            return (Criteria) this;
        }

        public Criteria andScore5IsNotNull() {
            addCriterion("SCORE5 is not null");
            return (Criteria) this;
        }

        public Criteria andScore5EqualTo(Integer value) {
            addCriterion("SCORE5 =", value, "score5");
            return (Criteria) this;
        }

        public Criteria andScore5NotEqualTo(Integer value) {
            addCriterion("SCORE5 <>", value, "score5");
            return (Criteria) this;
        }

        public Criteria andScore5GreaterThan(Integer value) {
            addCriterion("SCORE5 >", value, "score5");
            return (Criteria) this;
        }

        public Criteria andScore5GreaterThanOrEqualTo(Integer value) {
            addCriterion("SCORE5 >=", value, "score5");
            return (Criteria) this;
        }

        public Criteria andScore5LessThan(Integer value) {
            addCriterion("SCORE5 <", value, "score5");
            return (Criteria) this;
        }

        public Criteria andScore5LessThanOrEqualTo(Integer value) {
            addCriterion("SCORE5 <=", value, "score5");
            return (Criteria) this;
        }

        public Criteria andScore5In(List<Integer> values) {
            addCriterion("SCORE5 in", values, "score5");
            return (Criteria) this;
        }

        public Criteria andScore5NotIn(List<Integer> values) {
            addCriterion("SCORE5 not in", values, "score5");
            return (Criteria) this;
        }

        public Criteria andScore5Between(Integer value1, Integer value2) {
            addCriterion("SCORE5 between", value1, value2, "score5");
            return (Criteria) this;
        }

        public Criteria andScore5NotBetween(Integer value1, Integer value2) {
            addCriterion("SCORE5 not between", value1, value2, "score5");
            return (Criteria) this;
        }

        public Criteria andScore6IsNull() {
            addCriterion("SCORE6 is null");
            return (Criteria) this;
        }

        public Criteria andScore6IsNotNull() {
            addCriterion("SCORE6 is not null");
            return (Criteria) this;
        }

        public Criteria andScore6EqualTo(Integer value) {
            addCriterion("SCORE6 =", value, "score6");
            return (Criteria) this;
        }

        public Criteria andScore6NotEqualTo(Integer value) {
            addCriterion("SCORE6 <>", value, "score6");
            return (Criteria) this;
        }

        public Criteria andScore6GreaterThan(Integer value) {
            addCriterion("SCORE6 >", value, "score6");
            return (Criteria) this;
        }

        public Criteria andScore6GreaterThanOrEqualTo(Integer value) {
            addCriterion("SCORE6 >=", value, "score6");
            return (Criteria) this;
        }

        public Criteria andScore6LessThan(Integer value) {
            addCriterion("SCORE6 <", value, "score6");
            return (Criteria) this;
        }

        public Criteria andScore6LessThanOrEqualTo(Integer value) {
            addCriterion("SCORE6 <=", value, "score6");
            return (Criteria) this;
        }

        public Criteria andScore6In(List<Integer> values) {
            addCriterion("SCORE6 in", values, "score6");
            return (Criteria) this;
        }

        public Criteria andScore6NotIn(List<Integer> values) {
            addCriterion("SCORE6 not in", values, "score6");
            return (Criteria) this;
        }

        public Criteria andScore6Between(Integer value1, Integer value2) {
            addCriterion("SCORE6 between", value1, value2, "score6");
            return (Criteria) this;
        }

        public Criteria andScore6NotBetween(Integer value1, Integer value2) {
            addCriterion("SCORE6 not between", value1, value2, "score6");
            return (Criteria) this;
        }

        public Criteria andScore7IsNull() {
            addCriterion("SCORE7 is null");
            return (Criteria) this;
        }

        public Criteria andScore7IsNotNull() {
            addCriterion("SCORE7 is not null");
            return (Criteria) this;
        }

        public Criteria andScore7EqualTo(Integer value) {
            addCriterion("SCORE7 =", value, "score7");
            return (Criteria) this;
        }

        public Criteria andScore7NotEqualTo(Integer value) {
            addCriterion("SCORE7 <>", value, "score7");
            return (Criteria) this;
        }

        public Criteria andScore7GreaterThan(Integer value) {
            addCriterion("SCORE7 >", value, "score7");
            return (Criteria) this;
        }

        public Criteria andScore7GreaterThanOrEqualTo(Integer value) {
            addCriterion("SCORE7 >=", value, "score7");
            return (Criteria) this;
        }

        public Criteria andScore7LessThan(Integer value) {
            addCriterion("SCORE7 <", value, "score7");
            return (Criteria) this;
        }

        public Criteria andScore7LessThanOrEqualTo(Integer value) {
            addCriterion("SCORE7 <=", value, "score7");
            return (Criteria) this;
        }

        public Criteria andScore7In(List<Integer> values) {
            addCriterion("SCORE7 in", values, "score7");
            return (Criteria) this;
        }

        public Criteria andScore7NotIn(List<Integer> values) {
            addCriterion("SCORE7 not in", values, "score7");
            return (Criteria) this;
        }

        public Criteria andScore7Between(Integer value1, Integer value2) {
            addCriterion("SCORE7 between", value1, value2, "score7");
            return (Criteria) this;
        }

        public Criteria andScore7NotBetween(Integer value1, Integer value2) {
            addCriterion("SCORE7 not between", value1, value2, "score7");
            return (Criteria) this;
        }

        public Criteria andScore8IsNull() {
            addCriterion("SCORE8 is null");
            return (Criteria) this;
        }

        public Criteria andScore8IsNotNull() {
            addCriterion("SCORE8 is not null");
            return (Criteria) this;
        }

        public Criteria andScore8EqualTo(Integer value) {
            addCriterion("SCORE8 =", value, "score8");
            return (Criteria) this;
        }

        public Criteria andScore8NotEqualTo(Integer value) {
            addCriterion("SCORE8 <>", value, "score8");
            return (Criteria) this;
        }

        public Criteria andScore8GreaterThan(Integer value) {
            addCriterion("SCORE8 >", value, "score8");
            return (Criteria) this;
        }

        public Criteria andScore8GreaterThanOrEqualTo(Integer value) {
            addCriterion("SCORE8 >=", value, "score8");
            return (Criteria) this;
        }

        public Criteria andScore8LessThan(Integer value) {
            addCriterion("SCORE8 <", value, "score8");
            return (Criteria) this;
        }

        public Criteria andScore8LessThanOrEqualTo(Integer value) {
            addCriterion("SCORE8 <=", value, "score8");
            return (Criteria) this;
        }

        public Criteria andScore8In(List<Integer> values) {
            addCriterion("SCORE8 in", values, "score8");
            return (Criteria) this;
        }

        public Criteria andScore8NotIn(List<Integer> values) {
            addCriterion("SCORE8 not in", values, "score8");
            return (Criteria) this;
        }

        public Criteria andScore8Between(Integer value1, Integer value2) {
            addCriterion("SCORE8 between", value1, value2, "score8");
            return (Criteria) this;
        }

        public Criteria andScore8NotBetween(Integer value1, Integer value2) {
            addCriterion("SCORE8 not between", value1, value2, "score8");
            return (Criteria) this;
        }

        public Criteria andScore9IsNull() {
            addCriterion("SCORE9 is null");
            return (Criteria) this;
        }

        public Criteria andScore9IsNotNull() {
            addCriterion("SCORE9 is not null");
            return (Criteria) this;
        }

        public Criteria andScore9EqualTo(Integer value) {
            addCriterion("SCORE9 =", value, "score9");
            return (Criteria) this;
        }

        public Criteria andScore9NotEqualTo(Integer value) {
            addCriterion("SCORE9 <>", value, "score9");
            return (Criteria) this;
        }

        public Criteria andScore9GreaterThan(Integer value) {
            addCriterion("SCORE9 >", value, "score9");
            return (Criteria) this;
        }

        public Criteria andScore9GreaterThanOrEqualTo(Integer value) {
            addCriterion("SCORE9 >=", value, "score9");
            return (Criteria) this;
        }

        public Criteria andScore9LessThan(Integer value) {
            addCriterion("SCORE9 <", value, "score9");
            return (Criteria) this;
        }

        public Criteria andScore9LessThanOrEqualTo(Integer value) {
            addCriterion("SCORE9 <=", value, "score9");
            return (Criteria) this;
        }

        public Criteria andScore9In(List<Integer> values) {
            addCriterion("SCORE9 in", values, "score9");
            return (Criteria) this;
        }

        public Criteria andScore9NotIn(List<Integer> values) {
            addCriterion("SCORE9 not in", values, "score9");
            return (Criteria) this;
        }

        public Criteria andScore9Between(Integer value1, Integer value2) {
            addCriterion("SCORE9 between", value1, value2, "score9");
            return (Criteria) this;
        }

        public Criteria andScore9NotBetween(Integer value1, Integer value2) {
            addCriterion("SCORE9 not between", value1, value2, "score9");
            return (Criteria) this;
        }

        public Criteria andScore10IsNull() {
            addCriterion("SCORE10 is null");
            return (Criteria) this;
        }

        public Criteria andScore10IsNotNull() {
            addCriterion("SCORE10 is not null");
            return (Criteria) this;
        }

        public Criteria andScore10EqualTo(Integer value) {
            addCriterion("SCORE10 =", value, "score10");
            return (Criteria) this;
        }

        public Criteria andScore10NotEqualTo(Integer value) {
            addCriterion("SCORE10 <>", value, "score10");
            return (Criteria) this;
        }

        public Criteria andScore10GreaterThan(Integer value) {
            addCriterion("SCORE10 >", value, "score10");
            return (Criteria) this;
        }

        public Criteria andScore10GreaterThanOrEqualTo(Integer value) {
            addCriterion("SCORE10 >=", value, "score10");
            return (Criteria) this;
        }

        public Criteria andScore10LessThan(Integer value) {
            addCriterion("SCORE10 <", value, "score10");
            return (Criteria) this;
        }

        public Criteria andScore10LessThanOrEqualTo(Integer value) {
            addCriterion("SCORE10 <=", value, "score10");
            return (Criteria) this;
        }

        public Criteria andScore10In(List<Integer> values) {
            addCriterion("SCORE10 in", values, "score10");
            return (Criteria) this;
        }

        public Criteria andScore10NotIn(List<Integer> values) {
            addCriterion("SCORE10 not in", values, "score10");
            return (Criteria) this;
        }

        public Criteria andScore10Between(Integer value1, Integer value2) {
            addCriterion("SCORE10 between", value1, value2, "score10");
            return (Criteria) this;
        }

        public Criteria andScore10NotBetween(Integer value1, Integer value2) {
            addCriterion("SCORE10 not between", value1, value2, "score10");
            return (Criteria) this;
        }

        public Criteria andScore11IsNull() {
            addCriterion("SCORE11 is null");
            return (Criteria) this;
        }

        public Criteria andScore11IsNotNull() {
            addCriterion("SCORE11 is not null");
            return (Criteria) this;
        }

        public Criteria andScore11EqualTo(Integer value) {
            addCriterion("SCORE11 =", value, "score11");
            return (Criteria) this;
        }

        public Criteria andScore11NotEqualTo(Integer value) {
            addCriterion("SCORE11 <>", value, "score11");
            return (Criteria) this;
        }

        public Criteria andScore11GreaterThan(Integer value) {
            addCriterion("SCORE11 >", value, "score11");
            return (Criteria) this;
        }

        public Criteria andScore11GreaterThanOrEqualTo(Integer value) {
            addCriterion("SCORE11 >=", value, "score11");
            return (Criteria) this;
        }

        public Criteria andScore11LessThan(Integer value) {
            addCriterion("SCORE11 <", value, "score11");
            return (Criteria) this;
        }

        public Criteria andScore11LessThanOrEqualTo(Integer value) {
            addCriterion("SCORE11 <=", value, "score11");
            return (Criteria) this;
        }

        public Criteria andScore11In(List<Integer> values) {
            addCriterion("SCORE11 in", values, "score11");
            return (Criteria) this;
        }

        public Criteria andScore11NotIn(List<Integer> values) {
            addCriterion("SCORE11 not in", values, "score11");
            return (Criteria) this;
        }

        public Criteria andScore11Between(Integer value1, Integer value2) {
            addCriterion("SCORE11 between", value1, value2, "score11");
            return (Criteria) this;
        }

        public Criteria andScore11NotBetween(Integer value1, Integer value2) {
            addCriterion("SCORE11 not between", value1, value2, "score11");
            return (Criteria) this;
        }

        public Criteria andScore12IsNull() {
            addCriterion("SCORE12 is null");
            return (Criteria) this;
        }

        public Criteria andScore12IsNotNull() {
            addCriterion("SCORE12 is not null");
            return (Criteria) this;
        }

        public Criteria andScore12EqualTo(Integer value) {
            addCriterion("SCORE12 =", value, "score12");
            return (Criteria) this;
        }

        public Criteria andScore12NotEqualTo(Integer value) {
            addCriterion("SCORE12 <>", value, "score12");
            return (Criteria) this;
        }

        public Criteria andScore12GreaterThan(Integer value) {
            addCriterion("SCORE12 >", value, "score12");
            return (Criteria) this;
        }

        public Criteria andScore12GreaterThanOrEqualTo(Integer value) {
            addCriterion("SCORE12 >=", value, "score12");
            return (Criteria) this;
        }

        public Criteria andScore12LessThan(Integer value) {
            addCriterion("SCORE12 <", value, "score12");
            return (Criteria) this;
        }

        public Criteria andScore12LessThanOrEqualTo(Integer value) {
            addCriterion("SCORE12 <=", value, "score12");
            return (Criteria) this;
        }

        public Criteria andScore12In(List<Integer> values) {
            addCriterion("SCORE12 in", values, "score12");
            return (Criteria) this;
        }

        public Criteria andScore12NotIn(List<Integer> values) {
            addCriterion("SCORE12 not in", values, "score12");
            return (Criteria) this;
        }

        public Criteria andScore12Between(Integer value1, Integer value2) {
            addCriterion("SCORE12 between", value1, value2, "score12");
            return (Criteria) this;
        }

        public Criteria andScore12NotBetween(Integer value1, Integer value2) {
            addCriterion("SCORE12 not between", value1, value2, "score12");
            return (Criteria) this;
        }

        public Criteria andScore13IsNull() {
            addCriterion("SCORE13 is null");
            return (Criteria) this;
        }

        public Criteria andScore13IsNotNull() {
            addCriterion("SCORE13 is not null");
            return (Criteria) this;
        }

        public Criteria andScore13EqualTo(Integer value) {
            addCriterion("SCORE13 =", value, "score13");
            return (Criteria) this;
        }

        public Criteria andScore13NotEqualTo(Integer value) {
            addCriterion("SCORE13 <>", value, "score13");
            return (Criteria) this;
        }

        public Criteria andScore13GreaterThan(Integer value) {
            addCriterion("SCORE13 >", value, "score13");
            return (Criteria) this;
        }

        public Criteria andScore13GreaterThanOrEqualTo(Integer value) {
            addCriterion("SCORE13 >=", value, "score13");
            return (Criteria) this;
        }

        public Criteria andScore13LessThan(Integer value) {
            addCriterion("SCORE13 <", value, "score13");
            return (Criteria) this;
        }

        public Criteria andScore13LessThanOrEqualTo(Integer value) {
            addCriterion("SCORE13 <=", value, "score13");
            return (Criteria) this;
        }

        public Criteria andScore13In(List<Integer> values) {
            addCriterion("SCORE13 in", values, "score13");
            return (Criteria) this;
        }

        public Criteria andScore13NotIn(List<Integer> values) {
            addCriterion("SCORE13 not in", values, "score13");
            return (Criteria) this;
        }

        public Criteria andScore13Between(Integer value1, Integer value2) {
            addCriterion("SCORE13 between", value1, value2, "score13");
            return (Criteria) this;
        }

        public Criteria andScore13NotBetween(Integer value1, Integer value2) {
            addCriterion("SCORE13 not between", value1, value2, "score13");
            return (Criteria) this;
        }

        public Criteria andScore14IsNull() {
            addCriterion("SCORE14 is null");
            return (Criteria) this;
        }

        public Criteria andScore14IsNotNull() {
            addCriterion("SCORE14 is not null");
            return (Criteria) this;
        }

        public Criteria andScore14EqualTo(Integer value) {
            addCriterion("SCORE14 =", value, "score14");
            return (Criteria) this;
        }

        public Criteria andScore14NotEqualTo(Integer value) {
            addCriterion("SCORE14 <>", value, "score14");
            return (Criteria) this;
        }

        public Criteria andScore14GreaterThan(Integer value) {
            addCriterion("SCORE14 >", value, "score14");
            return (Criteria) this;
        }

        public Criteria andScore14GreaterThanOrEqualTo(Integer value) {
            addCriterion("SCORE14 >=", value, "score14");
            return (Criteria) this;
        }

        public Criteria andScore14LessThan(Integer value) {
            addCriterion("SCORE14 <", value, "score14");
            return (Criteria) this;
        }

        public Criteria andScore14LessThanOrEqualTo(Integer value) {
            addCriterion("SCORE14 <=", value, "score14");
            return (Criteria) this;
        }

        public Criteria andScore14In(List<Integer> values) {
            addCriterion("SCORE14 in", values, "score14");
            return (Criteria) this;
        }

        public Criteria andScore14NotIn(List<Integer> values) {
            addCriterion("SCORE14 not in", values, "score14");
            return (Criteria) this;
        }

        public Criteria andScore14Between(Integer value1, Integer value2) {
            addCriterion("SCORE14 between", value1, value2, "score14");
            return (Criteria) this;
        }

        public Criteria andScore14NotBetween(Integer value1, Integer value2) {
            addCriterion("SCORE14 not between", value1, value2, "score14");
            return (Criteria) this;
        }

        public Criteria andScore15IsNull() {
            addCriterion("SCORE15 is null");
            return (Criteria) this;
        }

        public Criteria andScore15IsNotNull() {
            addCriterion("SCORE15 is not null");
            return (Criteria) this;
        }

        public Criteria andScore15EqualTo(Integer value) {
            addCriterion("SCORE15 =", value, "score15");
            return (Criteria) this;
        }

        public Criteria andScore15NotEqualTo(Integer value) {
            addCriterion("SCORE15 <>", value, "score15");
            return (Criteria) this;
        }

        public Criteria andScore15GreaterThan(Integer value) {
            addCriterion("SCORE15 >", value, "score15");
            return (Criteria) this;
        }

        public Criteria andScore15GreaterThanOrEqualTo(Integer value) {
            addCriterion("SCORE15 >=", value, "score15");
            return (Criteria) this;
        }

        public Criteria andScore15LessThan(Integer value) {
            addCriterion("SCORE15 <", value, "score15");
            return (Criteria) this;
        }

        public Criteria andScore15LessThanOrEqualTo(Integer value) {
            addCriterion("SCORE15 <=", value, "score15");
            return (Criteria) this;
        }

        public Criteria andScore15In(List<Integer> values) {
            addCriterion("SCORE15 in", values, "score15");
            return (Criteria) this;
        }

        public Criteria andScore15NotIn(List<Integer> values) {
            addCriterion("SCORE15 not in", values, "score15");
            return (Criteria) this;
        }

        public Criteria andScore15Between(Integer value1, Integer value2) {
            addCriterion("SCORE15 between", value1, value2, "score15");
            return (Criteria) this;
        }

        public Criteria andScore15NotBetween(Integer value1, Integer value2) {
            addCriterion("SCORE15 not between", value1, value2, "score15");
            return (Criteria) this;
        }

        public Criteria andScore16IsNull() {
            addCriterion("SCORE16 is null");
            return (Criteria) this;
        }

        public Criteria andScore16IsNotNull() {
            addCriterion("SCORE16 is not null");
            return (Criteria) this;
        }

        public Criteria andScore16EqualTo(Integer value) {
            addCriterion("SCORE16 =", value, "score16");
            return (Criteria) this;
        }

        public Criteria andScore16NotEqualTo(Integer value) {
            addCriterion("SCORE16 <>", value, "score16");
            return (Criteria) this;
        }

        public Criteria andScore16GreaterThan(Integer value) {
            addCriterion("SCORE16 >", value, "score16");
            return (Criteria) this;
        }

        public Criteria andScore16GreaterThanOrEqualTo(Integer value) {
            addCriterion("SCORE16 >=", value, "score16");
            return (Criteria) this;
        }

        public Criteria andScore16LessThan(Integer value) {
            addCriterion("SCORE16 <", value, "score16");
            return (Criteria) this;
        }

        public Criteria andScore16LessThanOrEqualTo(Integer value) {
            addCriterion("SCORE16 <=", value, "score16");
            return (Criteria) this;
        }

        public Criteria andScore16In(List<Integer> values) {
            addCriterion("SCORE16 in", values, "score16");
            return (Criteria) this;
        }

        public Criteria andScore16NotIn(List<Integer> values) {
            addCriterion("SCORE16 not in", values, "score16");
            return (Criteria) this;
        }

        public Criteria andScore16Between(Integer value1, Integer value2) {
            addCriterion("SCORE16 between", value1, value2, "score16");
            return (Criteria) this;
        }

        public Criteria andScore16NotBetween(Integer value1, Integer value2) {
            addCriterion("SCORE16 not between", value1, value2, "score16");
            return (Criteria) this;
        }

        public Criteria andScore17IsNull() {
            addCriterion("SCORE17 is null");
            return (Criteria) this;
        }

        public Criteria andScore17IsNotNull() {
            addCriterion("SCORE17 is not null");
            return (Criteria) this;
        }

        public Criteria andScore17EqualTo(Integer value) {
            addCriterion("SCORE17 =", value, "score17");
            return (Criteria) this;
        }

        public Criteria andScore17NotEqualTo(Integer value) {
            addCriterion("SCORE17 <>", value, "score17");
            return (Criteria) this;
        }

        public Criteria andScore17GreaterThan(Integer value) {
            addCriterion("SCORE17 >", value, "score17");
            return (Criteria) this;
        }

        public Criteria andScore17GreaterThanOrEqualTo(Integer value) {
            addCriterion("SCORE17 >=", value, "score17");
            return (Criteria) this;
        }

        public Criteria andScore17LessThan(Integer value) {
            addCriterion("SCORE17 <", value, "score17");
            return (Criteria) this;
        }

        public Criteria andScore17LessThanOrEqualTo(Integer value) {
            addCriterion("SCORE17 <=", value, "score17");
            return (Criteria) this;
        }

        public Criteria andScore17In(List<Integer> values) {
            addCriterion("SCORE17 in", values, "score17");
            return (Criteria) this;
        }

        public Criteria andScore17NotIn(List<Integer> values) {
            addCriterion("SCORE17 not in", values, "score17");
            return (Criteria) this;
        }

        public Criteria andScore17Between(Integer value1, Integer value2) {
            addCriterion("SCORE17 between", value1, value2, "score17");
            return (Criteria) this;
        }

        public Criteria andScore17NotBetween(Integer value1, Integer value2) {
            addCriterion("SCORE17 not between", value1, value2, "score17");
            return (Criteria) this;
        }

        public Criteria andScore18IsNull() {
            addCriterion("SCORE18 is null");
            return (Criteria) this;
        }

        public Criteria andScore18IsNotNull() {
            addCriterion("SCORE18 is not null");
            return (Criteria) this;
        }

        public Criteria andScore18EqualTo(Integer value) {
            addCriterion("SCORE18 =", value, "score18");
            return (Criteria) this;
        }

        public Criteria andScore18NotEqualTo(Integer value) {
            addCriterion("SCORE18 <>", value, "score18");
            return (Criteria) this;
        }

        public Criteria andScore18GreaterThan(Integer value) {
            addCriterion("SCORE18 >", value, "score18");
            return (Criteria) this;
        }

        public Criteria andScore18GreaterThanOrEqualTo(Integer value) {
            addCriterion("SCORE18 >=", value, "score18");
            return (Criteria) this;
        }

        public Criteria andScore18LessThan(Integer value) {
            addCriterion("SCORE18 <", value, "score18");
            return (Criteria) this;
        }

        public Criteria andScore18LessThanOrEqualTo(Integer value) {
            addCriterion("SCORE18 <=", value, "score18");
            return (Criteria) this;
        }

        public Criteria andScore18In(List<Integer> values) {
            addCriterion("SCORE18 in", values, "score18");
            return (Criteria) this;
        }

        public Criteria andScore18NotIn(List<Integer> values) {
            addCriterion("SCORE18 not in", values, "score18");
            return (Criteria) this;
        }

        public Criteria andScore18Between(Integer value1, Integer value2) {
            addCriterion("SCORE18 between", value1, value2, "score18");
            return (Criteria) this;
        }

        public Criteria andScore18NotBetween(Integer value1, Integer value2) {
            addCriterion("SCORE18 not between", value1, value2, "score18");
            return (Criteria) this;
        }

        public Criteria andScore19IsNull() {
            addCriterion("SCORE19 is null");
            return (Criteria) this;
        }

        public Criteria andScore19IsNotNull() {
            addCriterion("SCORE19 is not null");
            return (Criteria) this;
        }

        public Criteria andScore19EqualTo(Integer value) {
            addCriterion("SCORE19 =", value, "score19");
            return (Criteria) this;
        }

        public Criteria andScore19NotEqualTo(Integer value) {
            addCriterion("SCORE19 <>", value, "score19");
            return (Criteria) this;
        }

        public Criteria andScore19GreaterThan(Integer value) {
            addCriterion("SCORE19 >", value, "score19");
            return (Criteria) this;
        }

        public Criteria andScore19GreaterThanOrEqualTo(Integer value) {
            addCriterion("SCORE19 >=", value, "score19");
            return (Criteria) this;
        }

        public Criteria andScore19LessThan(Integer value) {
            addCriterion("SCORE19 <", value, "score19");
            return (Criteria) this;
        }

        public Criteria andScore19LessThanOrEqualTo(Integer value) {
            addCriterion("SCORE19 <=", value, "score19");
            return (Criteria) this;
        }

        public Criteria andScore19In(List<Integer> values) {
            addCriterion("SCORE19 in", values, "score19");
            return (Criteria) this;
        }

        public Criteria andScore19NotIn(List<Integer> values) {
            addCriterion("SCORE19 not in", values, "score19");
            return (Criteria) this;
        }

        public Criteria andScore19Between(Integer value1, Integer value2) {
            addCriterion("SCORE19 between", value1, value2, "score19");
            return (Criteria) this;
        }

        public Criteria andScore19NotBetween(Integer value1, Integer value2) {
            addCriterion("SCORE19 not between", value1, value2, "score19");
            return (Criteria) this;
        }

        public Criteria andScore20IsNull() {
            addCriterion("SCORE20 is null");
            return (Criteria) this;
        }

        public Criteria andScore20IsNotNull() {
            addCriterion("SCORE20 is not null");
            return (Criteria) this;
        }

        public Criteria andScore20EqualTo(Integer value) {
            addCriterion("SCORE20 =", value, "score20");
            return (Criteria) this;
        }

        public Criteria andScore20NotEqualTo(Integer value) {
            addCriterion("SCORE20 <>", value, "score20");
            return (Criteria) this;
        }

        public Criteria andScore20GreaterThan(Integer value) {
            addCriterion("SCORE20 >", value, "score20");
            return (Criteria) this;
        }

        public Criteria andScore20GreaterThanOrEqualTo(Integer value) {
            addCriterion("SCORE20 >=", value, "score20");
            return (Criteria) this;
        }

        public Criteria andScore20LessThan(Integer value) {
            addCriterion("SCORE20 <", value, "score20");
            return (Criteria) this;
        }

        public Criteria andScore20LessThanOrEqualTo(Integer value) {
            addCriterion("SCORE20 <=", value, "score20");
            return (Criteria) this;
        }

        public Criteria andScore20In(List<Integer> values) {
            addCriterion("SCORE20 in", values, "score20");
            return (Criteria) this;
        }

        public Criteria andScore20NotIn(List<Integer> values) {
            addCriterion("SCORE20 not in", values, "score20");
            return (Criteria) this;
        }

        public Criteria andScore20Between(Integer value1, Integer value2) {
            addCriterion("SCORE20 between", value1, value2, "score20");
            return (Criteria) this;
        }

        public Criteria andScore20NotBetween(Integer value1, Integer value2) {
            addCriterion("SCORE20 not between", value1, value2, "score20");
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