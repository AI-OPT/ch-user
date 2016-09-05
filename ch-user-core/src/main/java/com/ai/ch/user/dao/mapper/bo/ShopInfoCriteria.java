package com.ai.ch.user.dao.mapper.bo;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class ShopInfoCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public ShopInfoCriteria() {
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

        public Criteria andDepositBalanceIsNull() {
            addCriterion("DEPOSIT_BALANCE is null");
            return (Criteria) this;
        }

        public Criteria andDepositBalanceIsNotNull() {
            addCriterion("DEPOSIT_BALANCE is not null");
            return (Criteria) this;
        }

        public Criteria andDepositBalanceEqualTo(Long value) {
            addCriterion("DEPOSIT_BALANCE =", value, "depositBalance");
            return (Criteria) this;
        }

        public Criteria andDepositBalanceNotEqualTo(Long value) {
            addCriterion("DEPOSIT_BALANCE <>", value, "depositBalance");
            return (Criteria) this;
        }

        public Criteria andDepositBalanceGreaterThan(Long value) {
            addCriterion("DEPOSIT_BALANCE >", value, "depositBalance");
            return (Criteria) this;
        }

        public Criteria andDepositBalanceGreaterThanOrEqualTo(Long value) {
            addCriterion("DEPOSIT_BALANCE >=", value, "depositBalance");
            return (Criteria) this;
        }

        public Criteria andDepositBalanceLessThan(Long value) {
            addCriterion("DEPOSIT_BALANCE <", value, "depositBalance");
            return (Criteria) this;
        }

        public Criteria andDepositBalanceLessThanOrEqualTo(Long value) {
            addCriterion("DEPOSIT_BALANCE <=", value, "depositBalance");
            return (Criteria) this;
        }

        public Criteria andDepositBalanceIn(List<Long> values) {
            addCriterion("DEPOSIT_BALANCE in", values, "depositBalance");
            return (Criteria) this;
        }

        public Criteria andDepositBalanceNotIn(List<Long> values) {
            addCriterion("DEPOSIT_BALANCE not in", values, "depositBalance");
            return (Criteria) this;
        }

        public Criteria andDepositBalanceBetween(Long value1, Long value2) {
            addCriterion("DEPOSIT_BALANCE between", value1, value2, "depositBalance");
            return (Criteria) this;
        }

        public Criteria andDepositBalanceNotBetween(Long value1, Long value2) {
            addCriterion("DEPOSIT_BALANCE not between", value1, value2, "depositBalance");
            return (Criteria) this;
        }

        public Criteria andPeriodTypeIsNull() {
            addCriterion("PERIOD_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andPeriodTypeIsNotNull() {
            addCriterion("PERIOD_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPeriodTypeEqualTo(String value) {
            addCriterion("PERIOD_TYPE =", value, "periodType");
            return (Criteria) this;
        }

        public Criteria andPeriodTypeNotEqualTo(String value) {
            addCriterion("PERIOD_TYPE <>", value, "periodType");
            return (Criteria) this;
        }

        public Criteria andPeriodTypeGreaterThan(String value) {
            addCriterion("PERIOD_TYPE >", value, "periodType");
            return (Criteria) this;
        }

        public Criteria andPeriodTypeGreaterThanOrEqualTo(String value) {
            addCriterion("PERIOD_TYPE >=", value, "periodType");
            return (Criteria) this;
        }

        public Criteria andPeriodTypeLessThan(String value) {
            addCriterion("PERIOD_TYPE <", value, "periodType");
            return (Criteria) this;
        }

        public Criteria andPeriodTypeLessThanOrEqualTo(String value) {
            addCriterion("PERIOD_TYPE <=", value, "periodType");
            return (Criteria) this;
        }

        public Criteria andPeriodTypeLike(String value) {
            addCriterion("PERIOD_TYPE like", value, "periodType");
            return (Criteria) this;
        }

        public Criteria andPeriodTypeNotLike(String value) {
            addCriterion("PERIOD_TYPE not like", value, "periodType");
            return (Criteria) this;
        }

        public Criteria andPeriodTypeIn(List<String> values) {
            addCriterion("PERIOD_TYPE in", values, "periodType");
            return (Criteria) this;
        }

        public Criteria andPeriodTypeNotIn(List<String> values) {
            addCriterion("PERIOD_TYPE not in", values, "periodType");
            return (Criteria) this;
        }

        public Criteria andPeriodTypeBetween(String value1, String value2) {
            addCriterion("PERIOD_TYPE between", value1, value2, "periodType");
            return (Criteria) this;
        }

        public Criteria andPeriodTypeNotBetween(String value1, String value2) {
            addCriterion("PERIOD_TYPE not between", value1, value2, "periodType");
            return (Criteria) this;
        }

        public Criteria andRentCycleTypeIsNull() {
            addCriterion("RENT_CYCLE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andRentCycleTypeIsNotNull() {
            addCriterion("RENT_CYCLE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andRentCycleTypeEqualTo(String value) {
            addCriterion("RENT_CYCLE_TYPE =", value, "rentCycleType");
            return (Criteria) this;
        }

        public Criteria andRentCycleTypeNotEqualTo(String value) {
            addCriterion("RENT_CYCLE_TYPE <>", value, "rentCycleType");
            return (Criteria) this;
        }

        public Criteria andRentCycleTypeGreaterThan(String value) {
            addCriterion("RENT_CYCLE_TYPE >", value, "rentCycleType");
            return (Criteria) this;
        }

        public Criteria andRentCycleTypeGreaterThanOrEqualTo(String value) {
            addCriterion("RENT_CYCLE_TYPE >=", value, "rentCycleType");
            return (Criteria) this;
        }

        public Criteria andRentCycleTypeLessThan(String value) {
            addCriterion("RENT_CYCLE_TYPE <", value, "rentCycleType");
            return (Criteria) this;
        }

        public Criteria andRentCycleTypeLessThanOrEqualTo(String value) {
            addCriterion("RENT_CYCLE_TYPE <=", value, "rentCycleType");
            return (Criteria) this;
        }

        public Criteria andRentCycleTypeLike(String value) {
            addCriterion("RENT_CYCLE_TYPE like", value, "rentCycleType");
            return (Criteria) this;
        }

        public Criteria andRentCycleTypeNotLike(String value) {
            addCriterion("RENT_CYCLE_TYPE not like", value, "rentCycleType");
            return (Criteria) this;
        }

        public Criteria andRentCycleTypeIn(List<String> values) {
            addCriterion("RENT_CYCLE_TYPE in", values, "rentCycleType");
            return (Criteria) this;
        }

        public Criteria andRentCycleTypeNotIn(List<String> values) {
            addCriterion("RENT_CYCLE_TYPE not in", values, "rentCycleType");
            return (Criteria) this;
        }

        public Criteria andRentCycleTypeBetween(String value1, String value2) {
            addCriterion("RENT_CYCLE_TYPE between", value1, value2, "rentCycleType");
            return (Criteria) this;
        }

        public Criteria andRentCycleTypeNotBetween(String value1, String value2) {
            addCriterion("RENT_CYCLE_TYPE not between", value1, value2, "rentCycleType");
            return (Criteria) this;
        }

        public Criteria andRentFeeIsNull() {
            addCriterion("RENT_FEE is null");
            return (Criteria) this;
        }

        public Criteria andRentFeeIsNotNull() {
            addCriterion("RENT_FEE is not null");
            return (Criteria) this;
        }

        public Criteria andRentFeeEqualTo(Long value) {
            addCriterion("RENT_FEE =", value, "rentFee");
            return (Criteria) this;
        }

        public Criteria andRentFeeNotEqualTo(Long value) {
            addCriterion("RENT_FEE <>", value, "rentFee");
            return (Criteria) this;
        }

        public Criteria andRentFeeGreaterThan(Long value) {
            addCriterion("RENT_FEE >", value, "rentFee");
            return (Criteria) this;
        }

        public Criteria andRentFeeGreaterThanOrEqualTo(Long value) {
            addCriterion("RENT_FEE >=", value, "rentFee");
            return (Criteria) this;
        }

        public Criteria andRentFeeLessThan(Long value) {
            addCriterion("RENT_FEE <", value, "rentFee");
            return (Criteria) this;
        }

        public Criteria andRentFeeLessThanOrEqualTo(Long value) {
            addCriterion("RENT_FEE <=", value, "rentFee");
            return (Criteria) this;
        }

        public Criteria andRentFeeIn(List<Long> values) {
            addCriterion("RENT_FEE in", values, "rentFee");
            return (Criteria) this;
        }

        public Criteria andRentFeeNotIn(List<Long> values) {
            addCriterion("RENT_FEE not in", values, "rentFee");
            return (Criteria) this;
        }

        public Criteria andRentFeeBetween(Long value1, Long value2) {
            addCriterion("RENT_FEE between", value1, value2, "rentFee");
            return (Criteria) this;
        }

        public Criteria andRentFeeNotBetween(Long value1, Long value2) {
            addCriterion("RENT_FEE not between", value1, value2, "rentFee");
            return (Criteria) this;
        }

        public Criteria andRatioIsNull() {
            addCriterion("RATIO is null");
            return (Criteria) this;
        }

        public Criteria andRatioIsNotNull() {
            addCriterion("RATIO is not null");
            return (Criteria) this;
        }

        public Criteria andRatioEqualTo(Integer value) {
            addCriterion("RATIO =", value, "ratio");
            return (Criteria) this;
        }

        public Criteria andRatioNotEqualTo(Integer value) {
            addCriterion("RATIO <>", value, "ratio");
            return (Criteria) this;
        }

        public Criteria andRatioGreaterThan(Integer value) {
            addCriterion("RATIO >", value, "ratio");
            return (Criteria) this;
        }

        public Criteria andRatioGreaterThanOrEqualTo(Integer value) {
            addCriterion("RATIO >=", value, "ratio");
            return (Criteria) this;
        }

        public Criteria andRatioLessThan(Integer value) {
            addCriterion("RATIO <", value, "ratio");
            return (Criteria) this;
        }

        public Criteria andRatioLessThanOrEqualTo(Integer value) {
            addCriterion("RATIO <=", value, "ratio");
            return (Criteria) this;
        }

        public Criteria andRatioIn(List<Integer> values) {
            addCriterion("RATIO in", values, "ratio");
            return (Criteria) this;
        }

        public Criteria andRatioNotIn(List<Integer> values) {
            addCriterion("RATIO not in", values, "ratio");
            return (Criteria) this;
        }

        public Criteria andRatioBetween(Integer value1, Integer value2) {
            addCriterion("RATIO between", value1, value2, "ratio");
            return (Criteria) this;
        }

        public Criteria andRatioNotBetween(Integer value1, Integer value2) {
            addCriterion("RATIO not between", value1, value2, "ratio");
            return (Criteria) this;
        }

        public Criteria andRankIsNull() {
            addCriterion("RANK is null");
            return (Criteria) this;
        }

        public Criteria andRankIsNotNull() {
            addCriterion("RANK is not null");
            return (Criteria) this;
        }

        public Criteria andRankEqualTo(Integer value) {
            addCriterion("RANK =", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankNotEqualTo(Integer value) {
            addCriterion("RANK <>", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankGreaterThan(Integer value) {
            addCriterion("RANK >", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankGreaterThanOrEqualTo(Integer value) {
            addCriterion("RANK >=", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankLessThan(Integer value) {
            addCriterion("RANK <", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankLessThanOrEqualTo(Integer value) {
            addCriterion("RANK <=", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankIn(List<Integer> values) {
            addCriterion("RANK in", values, "rank");
            return (Criteria) this;
        }

        public Criteria andRankNotIn(List<Integer> values) {
            addCriterion("RANK not in", values, "rank");
            return (Criteria) this;
        }

        public Criteria andRankBetween(Integer value1, Integer value2) {
            addCriterion("RANK between", value1, value2, "rank");
            return (Criteria) this;
        }

        public Criteria andRankNotBetween(Integer value1, Integer value2) {
            addCriterion("RANK not between", value1, value2, "rank");
            return (Criteria) this;
        }

        public Criteria andRankLogoIsNull() {
            addCriterion("RANK_LOGO is null");
            return (Criteria) this;
        }

        public Criteria andRankLogoIsNotNull() {
            addCriterion("RANK_LOGO is not null");
            return (Criteria) this;
        }

        public Criteria andRankLogoEqualTo(String value) {
            addCriterion("RANK_LOGO =", value, "rankLogo");
            return (Criteria) this;
        }

        public Criteria andRankLogoNotEqualTo(String value) {
            addCriterion("RANK_LOGO <>", value, "rankLogo");
            return (Criteria) this;
        }

        public Criteria andRankLogoGreaterThan(String value) {
            addCriterion("RANK_LOGO >", value, "rankLogo");
            return (Criteria) this;
        }

        public Criteria andRankLogoGreaterThanOrEqualTo(String value) {
            addCriterion("RANK_LOGO >=", value, "rankLogo");
            return (Criteria) this;
        }

        public Criteria andRankLogoLessThan(String value) {
            addCriterion("RANK_LOGO <", value, "rankLogo");
            return (Criteria) this;
        }

        public Criteria andRankLogoLessThanOrEqualTo(String value) {
            addCriterion("RANK_LOGO <=", value, "rankLogo");
            return (Criteria) this;
        }

        public Criteria andRankLogoLike(String value) {
            addCriterion("RANK_LOGO like", value, "rankLogo");
            return (Criteria) this;
        }

        public Criteria andRankLogoNotLike(String value) {
            addCriterion("RANK_LOGO not like", value, "rankLogo");
            return (Criteria) this;
        }

        public Criteria andRankLogoIn(List<String> values) {
            addCriterion("RANK_LOGO in", values, "rankLogo");
            return (Criteria) this;
        }

        public Criteria andRankLogoNotIn(List<String> values) {
            addCriterion("RANK_LOGO not in", values, "rankLogo");
            return (Criteria) this;
        }

        public Criteria andRankLogoBetween(String value1, String value2) {
            addCriterion("RANK_LOGO between", value1, value2, "rankLogo");
            return (Criteria) this;
        }

        public Criteria andRankLogoNotBetween(String value1, String value2) {
            addCriterion("RANK_LOGO not between", value1, value2, "rankLogo");
            return (Criteria) this;
        }

        public Criteria andShopNameIsNull() {
            addCriterion("SHOP_NAME is null");
            return (Criteria) this;
        }

        public Criteria andShopNameIsNotNull() {
            addCriterion("SHOP_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andShopNameEqualTo(String value) {
            addCriterion("SHOP_NAME =", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotEqualTo(String value) {
            addCriterion("SHOP_NAME <>", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameGreaterThan(String value) {
            addCriterion("SHOP_NAME >", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameGreaterThanOrEqualTo(String value) {
            addCriterion("SHOP_NAME >=", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLessThan(String value) {
            addCriterion("SHOP_NAME <", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLessThanOrEqualTo(String value) {
            addCriterion("SHOP_NAME <=", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLike(String value) {
            addCriterion("SHOP_NAME like", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotLike(String value) {
            addCriterion("SHOP_NAME not like", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameIn(List<String> values) {
            addCriterion("SHOP_NAME in", values, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotIn(List<String> values) {
            addCriterion("SHOP_NAME not in", values, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameBetween(String value1, String value2) {
            addCriterion("SHOP_NAME between", value1, value2, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotBetween(String value1, String value2) {
            addCriterion("SHOP_NAME not between", value1, value2, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopDescIsNull() {
            addCriterion("SHOP_DESC is null");
            return (Criteria) this;
        }

        public Criteria andShopDescIsNotNull() {
            addCriterion("SHOP_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andShopDescEqualTo(String value) {
            addCriterion("SHOP_DESC =", value, "shopDesc");
            return (Criteria) this;
        }

        public Criteria andShopDescNotEqualTo(String value) {
            addCriterion("SHOP_DESC <>", value, "shopDesc");
            return (Criteria) this;
        }

        public Criteria andShopDescGreaterThan(String value) {
            addCriterion("SHOP_DESC >", value, "shopDesc");
            return (Criteria) this;
        }

        public Criteria andShopDescGreaterThanOrEqualTo(String value) {
            addCriterion("SHOP_DESC >=", value, "shopDesc");
            return (Criteria) this;
        }

        public Criteria andShopDescLessThan(String value) {
            addCriterion("SHOP_DESC <", value, "shopDesc");
            return (Criteria) this;
        }

        public Criteria andShopDescLessThanOrEqualTo(String value) {
            addCriterion("SHOP_DESC <=", value, "shopDesc");
            return (Criteria) this;
        }

        public Criteria andShopDescLike(String value) {
            addCriterion("SHOP_DESC like", value, "shopDesc");
            return (Criteria) this;
        }

        public Criteria andShopDescNotLike(String value) {
            addCriterion("SHOP_DESC not like", value, "shopDesc");
            return (Criteria) this;
        }

        public Criteria andShopDescIn(List<String> values) {
            addCriterion("SHOP_DESC in", values, "shopDesc");
            return (Criteria) this;
        }

        public Criteria andShopDescNotIn(List<String> values) {
            addCriterion("SHOP_DESC not in", values, "shopDesc");
            return (Criteria) this;
        }

        public Criteria andShopDescBetween(String value1, String value2) {
            addCriterion("SHOP_DESC between", value1, value2, "shopDesc");
            return (Criteria) this;
        }

        public Criteria andShopDescNotBetween(String value1, String value2) {
            addCriterion("SHOP_DESC not between", value1, value2, "shopDesc");
            return (Criteria) this;
        }

        public Criteria andBusiTypeIsNull() {
            addCriterion("BUSI_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andBusiTypeIsNotNull() {
            addCriterion("BUSI_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andBusiTypeEqualTo(String value) {
            addCriterion("BUSI_TYPE =", value, "busiType");
            return (Criteria) this;
        }

        public Criteria andBusiTypeNotEqualTo(String value) {
            addCriterion("BUSI_TYPE <>", value, "busiType");
            return (Criteria) this;
        }

        public Criteria andBusiTypeGreaterThan(String value) {
            addCriterion("BUSI_TYPE >", value, "busiType");
            return (Criteria) this;
        }

        public Criteria andBusiTypeGreaterThanOrEqualTo(String value) {
            addCriterion("BUSI_TYPE >=", value, "busiType");
            return (Criteria) this;
        }

        public Criteria andBusiTypeLessThan(String value) {
            addCriterion("BUSI_TYPE <", value, "busiType");
            return (Criteria) this;
        }

        public Criteria andBusiTypeLessThanOrEqualTo(String value) {
            addCriterion("BUSI_TYPE <=", value, "busiType");
            return (Criteria) this;
        }

        public Criteria andBusiTypeLike(String value) {
            addCriterion("BUSI_TYPE like", value, "busiType");
            return (Criteria) this;
        }

        public Criteria andBusiTypeNotLike(String value) {
            addCriterion("BUSI_TYPE not like", value, "busiType");
            return (Criteria) this;
        }

        public Criteria andBusiTypeIn(List<String> values) {
            addCriterion("BUSI_TYPE in", values, "busiType");
            return (Criteria) this;
        }

        public Criteria andBusiTypeNotIn(List<String> values) {
            addCriterion("BUSI_TYPE not in", values, "busiType");
            return (Criteria) this;
        }

        public Criteria andBusiTypeBetween(String value1, String value2) {
            addCriterion("BUSI_TYPE between", value1, value2, "busiType");
            return (Criteria) this;
        }

        public Criteria andBusiTypeNotBetween(String value1, String value2) {
            addCriterion("BUSI_TYPE not between", value1, value2, "busiType");
            return (Criteria) this;
        }

        public Criteria andGoodsNumIsNull() {
            addCriterion("GOODS_NUM is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNumIsNotNull() {
            addCriterion("GOODS_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNumEqualTo(Integer value) {
            addCriterion("GOODS_NUM =", value, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumNotEqualTo(Integer value) {
            addCriterion("GOODS_NUM <>", value, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumGreaterThan(Integer value) {
            addCriterion("GOODS_NUM >", value, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("GOODS_NUM >=", value, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumLessThan(Integer value) {
            addCriterion("GOODS_NUM <", value, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumLessThanOrEqualTo(Integer value) {
            addCriterion("GOODS_NUM <=", value, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumIn(List<Integer> values) {
            addCriterion("GOODS_NUM in", values, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumNotIn(List<Integer> values) {
            addCriterion("GOODS_NUM not in", values, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumBetween(Integer value1, Integer value2) {
            addCriterion("GOODS_NUM between", value1, value2, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumNotBetween(Integer value1, Integer value2) {
            addCriterion("GOODS_NUM not between", value1, value2, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andHasExperiIsNull() {
            addCriterion("HAS_EXPERI is null");
            return (Criteria) this;
        }

        public Criteria andHasExperiIsNotNull() {
            addCriterion("HAS_EXPERI is not null");
            return (Criteria) this;
        }

        public Criteria andHasExperiEqualTo(Integer value) {
            addCriterion("HAS_EXPERI =", value, "hasExperi");
            return (Criteria) this;
        }

        public Criteria andHasExperiNotEqualTo(Integer value) {
            addCriterion("HAS_EXPERI <>", value, "hasExperi");
            return (Criteria) this;
        }

        public Criteria andHasExperiGreaterThan(Integer value) {
            addCriterion("HAS_EXPERI >", value, "hasExperi");
            return (Criteria) this;
        }

        public Criteria andHasExperiGreaterThanOrEqualTo(Integer value) {
            addCriterion("HAS_EXPERI >=", value, "hasExperi");
            return (Criteria) this;
        }

        public Criteria andHasExperiLessThan(Integer value) {
            addCriterion("HAS_EXPERI <", value, "hasExperi");
            return (Criteria) this;
        }

        public Criteria andHasExperiLessThanOrEqualTo(Integer value) {
            addCriterion("HAS_EXPERI <=", value, "hasExperi");
            return (Criteria) this;
        }

        public Criteria andHasExperiIn(List<Integer> values) {
            addCriterion("HAS_EXPERI in", values, "hasExperi");
            return (Criteria) this;
        }

        public Criteria andHasExperiNotIn(List<Integer> values) {
            addCriterion("HAS_EXPERI not in", values, "hasExperi");
            return (Criteria) this;
        }

        public Criteria andHasExperiBetween(Integer value1, Integer value2) {
            addCriterion("HAS_EXPERI between", value1, value2, "hasExperi");
            return (Criteria) this;
        }

        public Criteria andHasExperiNotBetween(Integer value1, Integer value2) {
            addCriterion("HAS_EXPERI not between", value1, value2, "hasExperi");
            return (Criteria) this;
        }

        public Criteria andEcommOwnerIsNull() {
            addCriterion("ECOMM_OWNER is null");
            return (Criteria) this;
        }

        public Criteria andEcommOwnerIsNotNull() {
            addCriterion("ECOMM_OWNER is not null");
            return (Criteria) this;
        }

        public Criteria andEcommOwnerEqualTo(String value) {
            addCriterion("ECOMM_OWNER =", value, "ecommOwner");
            return (Criteria) this;
        }

        public Criteria andEcommOwnerNotEqualTo(String value) {
            addCriterion("ECOMM_OWNER <>", value, "ecommOwner");
            return (Criteria) this;
        }

        public Criteria andEcommOwnerGreaterThan(String value) {
            addCriterion("ECOMM_OWNER >", value, "ecommOwner");
            return (Criteria) this;
        }

        public Criteria andEcommOwnerGreaterThanOrEqualTo(String value) {
            addCriterion("ECOMM_OWNER >=", value, "ecommOwner");
            return (Criteria) this;
        }

        public Criteria andEcommOwnerLessThan(String value) {
            addCriterion("ECOMM_OWNER <", value, "ecommOwner");
            return (Criteria) this;
        }

        public Criteria andEcommOwnerLessThanOrEqualTo(String value) {
            addCriterion("ECOMM_OWNER <=", value, "ecommOwner");
            return (Criteria) this;
        }

        public Criteria andEcommOwnerLike(String value) {
            addCriterion("ECOMM_OWNER like", value, "ecommOwner");
            return (Criteria) this;
        }

        public Criteria andEcommOwnerNotLike(String value) {
            addCriterion("ECOMM_OWNER not like", value, "ecommOwner");
            return (Criteria) this;
        }

        public Criteria andEcommOwnerIn(List<String> values) {
            addCriterion("ECOMM_OWNER in", values, "ecommOwner");
            return (Criteria) this;
        }

        public Criteria andEcommOwnerNotIn(List<String> values) {
            addCriterion("ECOMM_OWNER not in", values, "ecommOwner");
            return (Criteria) this;
        }

        public Criteria andEcommOwnerBetween(String value1, String value2) {
            addCriterion("ECOMM_OWNER between", value1, value2, "ecommOwner");
            return (Criteria) this;
        }

        public Criteria andEcommOwnerNotBetween(String value1, String value2) {
            addCriterion("ECOMM_OWNER not between", value1, value2, "ecommOwner");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Timestamp value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Timestamp value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Timestamp value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Timestamp value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Timestamp> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Timestamp> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
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

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andOpenTimeIsNull() {
            addCriterion("open_time is null");
            return (Criteria) this;
        }

        public Criteria andOpenTimeIsNotNull() {
            addCriterion("open_time is not null");
            return (Criteria) this;
        }

        public Criteria andOpenTimeEqualTo(Timestamp value) {
            addCriterion("open_time =", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeNotEqualTo(Timestamp value) {
            addCriterion("open_time <>", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeGreaterThan(Timestamp value) {
            addCriterion("open_time >", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("open_time >=", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeLessThan(Timestamp value) {
            addCriterion("open_time <", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("open_time <=", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeIn(List<Timestamp> values) {
            addCriterion("open_time in", values, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeNotIn(List<Timestamp> values) {
            addCriterion("open_time not in", values, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("open_time between", value1, value2, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("open_time not between", value1, value2, "openTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeIsNull() {
            addCriterion("close_time is null");
            return (Criteria) this;
        }

        public Criteria andCloseTimeIsNotNull() {
            addCriterion("close_time is not null");
            return (Criteria) this;
        }

        public Criteria andCloseTimeEqualTo(Timestamp value) {
            addCriterion("close_time =", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeNotEqualTo(Timestamp value) {
            addCriterion("close_time <>", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeGreaterThan(Timestamp value) {
            addCriterion("close_time >", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("close_time >=", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeLessThan(Timestamp value) {
            addCriterion("close_time <", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("close_time <=", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeIn(List<Timestamp> values) {
            addCriterion("close_time in", values, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeNotIn(List<Timestamp> values) {
            addCriterion("close_time not in", values, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("close_time between", value1, value2, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("close_time not between", value1, value2, "closeTime");
            return (Criteria) this;
        }

        public Criteria andMerchantNoIsNull() {
            addCriterion("MERCHANT_NO is null");
            return (Criteria) this;
        }

        public Criteria andMerchantNoIsNotNull() {
            addCriterion("MERCHANT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantNoEqualTo(String value) {
            addCriterion("MERCHANT_NO =", value, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoNotEqualTo(String value) {
            addCriterion("MERCHANT_NO <>", value, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoGreaterThan(String value) {
            addCriterion("MERCHANT_NO >", value, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoGreaterThanOrEqualTo(String value) {
            addCriterion("MERCHANT_NO >=", value, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoLessThan(String value) {
            addCriterion("MERCHANT_NO <", value, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoLessThanOrEqualTo(String value) {
            addCriterion("MERCHANT_NO <=", value, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoLike(String value) {
            addCriterion("MERCHANT_NO like", value, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoNotLike(String value) {
            addCriterion("MERCHANT_NO not like", value, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoIn(List<String> values) {
            addCriterion("MERCHANT_NO in", values, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoNotIn(List<String> values) {
            addCriterion("MERCHANT_NO not in", values, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoBetween(String value1, String value2) {
            addCriterion("MERCHANT_NO between", value1, value2, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoNotBetween(String value1, String value2) {
            addCriterion("MERCHANT_NO not between", value1, value2, "merchantNo");
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