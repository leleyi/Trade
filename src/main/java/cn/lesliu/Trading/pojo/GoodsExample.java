package cn.lesliu.Trading.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOwnerIsNull() {
            addCriterion("owner is null");
            return (Criteria) this;
        }

        public Criteria andOwnerIsNotNull() {
            addCriterion("owner is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerEqualTo(String value) {
            addCriterion("owner =", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotEqualTo(String value) {
            addCriterion("owner <>", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerGreaterThan(String value) {
            addCriterion("owner >", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerGreaterThanOrEqualTo(String value) {
            addCriterion("owner >=", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLessThan(String value) {
            addCriterion("owner <", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLessThanOrEqualTo(String value) {
            addCriterion("owner <=", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLike(String value) {
            addCriterion("owner like", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotLike(String value) {
            addCriterion("owner not like", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerIn(List<String> values) {
            addCriterion("owner in", values, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotIn(List<String> values) {
            addCriterion("owner not in", values, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerBetween(String value1, String value2) {
            addCriterion("owner between", value1, value2, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotBetween(String value1, String value2) {
            addCriterion("owner not between", value1, value2, "owner");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andCategoriesIsNull() {
            addCriterion("categories is null");
            return (Criteria) this;
        }

        public Criteria andCategoriesIsNotNull() {
            addCriterion("categories is not null");
            return (Criteria) this;
        }

        public Criteria andCategoriesEqualTo(String value) {
            addCriterion("categories =", value, "categories");
            return (Criteria) this;
        }

        public Criteria andCategoriesNotEqualTo(String value) {
            addCriterion("categories <>", value, "categories");
            return (Criteria) this;
        }

        public Criteria andCategoriesGreaterThan(String value) {
            addCriterion("categories >", value, "categories");
            return (Criteria) this;
        }

        public Criteria andCategoriesGreaterThanOrEqualTo(String value) {
            addCriterion("categories >=", value, "categories");
            return (Criteria) this;
        }

        public Criteria andCategoriesLessThan(String value) {
            addCriterion("categories <", value, "categories");
            return (Criteria) this;
        }

        public Criteria andCategoriesLessThanOrEqualTo(String value) {
            addCriterion("categories <=", value, "categories");
            return (Criteria) this;
        }

        public Criteria andCategoriesLike(String value) {
            addCriterion("categories like", value, "categories");
            return (Criteria) this;
        }

        public Criteria andCategoriesNotLike(String value) {
            addCriterion("categories not like", value, "categories");
            return (Criteria) this;
        }

        public Criteria andCategoriesIn(List<String> values) {
            addCriterion("categories in", values, "categories");
            return (Criteria) this;
        }

        public Criteria andCategoriesNotIn(List<String> values) {
            addCriterion("categories not in", values, "categories");
            return (Criteria) this;
        }

        public Criteria andCategoriesBetween(String value1, String value2) {
            addCriterion("categories between", value1, value2, "categories");
            return (Criteria) this;
        }

        public Criteria andCategoriesNotBetween(String value1, String value2) {
            addCriterion("categories not between", value1, value2, "categories");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andSummaryIsNull() {
            addCriterion("summary is null");
            return (Criteria) this;
        }

        public Criteria andSummaryIsNotNull() {
            addCriterion("summary is not null");
            return (Criteria) this;
        }

        public Criteria andSummaryEqualTo(String value) {
            addCriterion("summary =", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotEqualTo(String value) {
            addCriterion("summary <>", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryGreaterThan(String value) {
            addCriterion("summary >", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryGreaterThanOrEqualTo(String value) {
            addCriterion("summary >=", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryLessThan(String value) {
            addCriterion("summary <", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryLessThanOrEqualTo(String value) {
            addCriterion("summary <=", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryLike(String value) {
            addCriterion("summary like", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotLike(String value) {
            addCriterion("summary not like", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryIn(List<String> values) {
            addCriterion("summary in", values, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotIn(List<String> values) {
            addCriterion("summary not in", values, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryBetween(String value1, String value2) {
            addCriterion("summary between", value1, value2, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotBetween(String value1, String value2) {
            addCriterion("summary not between", value1, value2, "summary");
            return (Criteria) this;
        }

        public Criteria andExhibitdateIsNull() {
            addCriterion("exhibitdate is null");
            return (Criteria) this;
        }

        public Criteria andExhibitdateIsNotNull() {
            addCriterion("exhibitdate is not null");
            return (Criteria) this;
        }

        public Criteria andExhibitdateEqualTo(Date value) {
            addCriterion("exhibitdate =", value, "exhibitdate");
            return (Criteria) this;
        }

        public Criteria andExhibitdateNotEqualTo(Date value) {
            addCriterion("exhibitdate <>", value, "exhibitdate");
            return (Criteria) this;
        }

        public Criteria andExhibitdateGreaterThan(Date value) {
            addCriterion("exhibitdate >", value, "exhibitdate");
            return (Criteria) this;
        }

        public Criteria andExhibitdateGreaterThanOrEqualTo(Date value) {
            addCriterion("exhibitdate >=", value, "exhibitdate");
            return (Criteria) this;
        }

        public Criteria andExhibitdateLessThan(Date value) {
            addCriterion("exhibitdate <", value, "exhibitdate");
            return (Criteria) this;
        }

        public Criteria andExhibitdateLessThanOrEqualTo(Date value) {
            addCriterion("exhibitdate <=", value, "exhibitdate");
            return (Criteria) this;
        }

        public Criteria andExhibitdateIn(List<Date> values) {
            addCriterion("exhibitdate in", values, "exhibitdate");
            return (Criteria) this;
        }

        public Criteria andExhibitdateNotIn(List<Date> values) {
            addCriterion("exhibitdate not in", values, "exhibitdate");
            return (Criteria) this;
        }

        public Criteria andExhibitdateBetween(Date value1, Date value2) {
            addCriterion("exhibitdate between", value1, value2, "exhibitdate");
            return (Criteria) this;
        }

        public Criteria andExhibitdateNotBetween(Date value1, Date value2) {
            addCriterion("exhibitdate not between", value1, value2, "exhibitdate");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIsNull() {
            addCriterion("isdelete is null");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIsNotNull() {
            addCriterion("isdelete is not null");
            return (Criteria) this;
        }

        public Criteria andIsdeleteEqualTo(Integer value) {
            addCriterion("isdelete =", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotEqualTo(Integer value) {
            addCriterion("isdelete <>", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteGreaterThan(Integer value) {
            addCriterion("isdelete >", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("isdelete >=", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteLessThan(Integer value) {
            addCriterion("isdelete <", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteLessThanOrEqualTo(Integer value) {
            addCriterion("isdelete <=", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIn(List<Integer> values) {
            addCriterion("isdelete in", values, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotIn(List<Integer> values) {
            addCriterion("isdelete not in", values, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteBetween(Integer value1, Integer value2) {
            addCriterion("isdelete between", value1, value2, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotBetween(Integer value1, Integer value2) {
            addCriterion("isdelete not between", value1, value2, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIssaleIsNull() {
            addCriterion("issale is null");
            return (Criteria) this;
        }

        public Criteria andIssaleIsNotNull() {
            addCriterion("issale is not null");
            return (Criteria) this;
        }

        public Criteria andIssaleEqualTo(Integer value) {
            addCriterion("issale =", value, "issale");
            return (Criteria) this;
        }

        public Criteria andIssaleNotEqualTo(Integer value) {
            addCriterion("issale <>", value, "issale");
            return (Criteria) this;
        }

        public Criteria andIssaleGreaterThan(Integer value) {
            addCriterion("issale >", value, "issale");
            return (Criteria) this;
        }

        public Criteria andIssaleGreaterThanOrEqualTo(Integer value) {
            addCriterion("issale >=", value, "issale");
            return (Criteria) this;
        }

        public Criteria andIssaleLessThan(Integer value) {
            addCriterion("issale <", value, "issale");
            return (Criteria) this;
        }

        public Criteria andIssaleLessThanOrEqualTo(Integer value) {
            addCriterion("issale <=", value, "issale");
            return (Criteria) this;
        }

        public Criteria andIssaleIn(List<Integer> values) {
            addCriterion("issale in", values, "issale");
            return (Criteria) this;
        }

        public Criteria andIssaleNotIn(List<Integer> values) {
            addCriterion("issale not in", values, "issale");
            return (Criteria) this;
        }

        public Criteria andIssaleBetween(Integer value1, Integer value2) {
            addCriterion("issale between", value1, value2, "issale");
            return (Criteria) this;
        }

        public Criteria andIssaleNotBetween(Integer value1, Integer value2) {
            addCriterion("issale not between", value1, value2, "issale");
            return (Criteria) this;
        }

        public Criteria andOldIsNull() {
            addCriterion("old is null");
            return (Criteria) this;
        }

        public Criteria andOldIsNotNull() {
            addCriterion("old is not null");
            return (Criteria) this;
        }

        public Criteria andOldEqualTo(Integer value) {
            addCriterion("old =", value, "old");
            return (Criteria) this;
        }

        public Criteria andOldNotEqualTo(Integer value) {
            addCriterion("old <>", value, "old");
            return (Criteria) this;
        }

        public Criteria andOldGreaterThan(Integer value) {
            addCriterion("old >", value, "old");
            return (Criteria) this;
        }

        public Criteria andOldGreaterThanOrEqualTo(Integer value) {
            addCriterion("old >=", value, "old");
            return (Criteria) this;
        }

        public Criteria andOldLessThan(Integer value) {
            addCriterion("old <", value, "old");
            return (Criteria) this;
        }

        public Criteria andOldLessThanOrEqualTo(Integer value) {
            addCriterion("old <=", value, "old");
            return (Criteria) this;
        }

        public Criteria andOldIn(List<Integer> values) {
            addCriterion("old in", values, "old");
            return (Criteria) this;
        }

        public Criteria andOldNotIn(List<Integer> values) {
            addCriterion("old not in", values, "old");
            return (Criteria) this;
        }

        public Criteria andOldBetween(Integer value1, Integer value2) {
            addCriterion("old between", value1, value2, "old");
            return (Criteria) this;
        }

        public Criteria andOldNotBetween(Integer value1, Integer value2) {
            addCriterion("old not between", value1, value2, "old");
            return (Criteria) this;
        }

        public Criteria andUndercarriagedateIsNull() {
            addCriterion("undercarriagedate is null");
            return (Criteria) this;
        }

        public Criteria andUndercarriagedateIsNotNull() {
            addCriterion("undercarriagedate is not null");
            return (Criteria) this;
        }

        public Criteria andUndercarriagedateEqualTo(Date value) {
            addCriterion("undercarriagedate =", value, "undercarriagedate");
            return (Criteria) this;
        }

        public Criteria andUndercarriagedateNotEqualTo(Date value) {
            addCriterion("undercarriagedate <>", value, "undercarriagedate");
            return (Criteria) this;
        }

        public Criteria andUndercarriagedateGreaterThan(Date value) {
            addCriterion("undercarriagedate >", value, "undercarriagedate");
            return (Criteria) this;
        }

        public Criteria andUndercarriagedateGreaterThanOrEqualTo(Date value) {
            addCriterion("undercarriagedate >=", value, "undercarriagedate");
            return (Criteria) this;
        }

        public Criteria andUndercarriagedateLessThan(Date value) {
            addCriterion("undercarriagedate <", value, "undercarriagedate");
            return (Criteria) this;
        }

        public Criteria andUndercarriagedateLessThanOrEqualTo(Date value) {
            addCriterion("undercarriagedate <=", value, "undercarriagedate");
            return (Criteria) this;
        }

        public Criteria andUndercarriagedateIn(List<Date> values) {
            addCriterion("undercarriagedate in", values, "undercarriagedate");
            return (Criteria) this;
        }

        public Criteria andUndercarriagedateNotIn(List<Date> values) {
            addCriterion("undercarriagedate not in", values, "undercarriagedate");
            return (Criteria) this;
        }

        public Criteria andUndercarriagedateBetween(Date value1, Date value2) {
            addCriterion("undercarriagedate between", value1, value2, "undercarriagedate");
            return (Criteria) this;
        }

        public Criteria andUndercarriagedateNotBetween(Date value1, Date value2) {
            addCriterion("undercarriagedate not between", value1, value2, "undercarriagedate");
            return (Criteria) this;
        }

        public Criteria andEnjoyIsNull() {
            addCriterion("enjoy is null");
            return (Criteria) this;
        }

        public Criteria andEnjoyIsNotNull() {
            addCriterion("enjoy is not null");
            return (Criteria) this;
        }

        public Criteria andEnjoyEqualTo(Integer value) {
            addCriterion("enjoy =", value, "enjoy");
            return (Criteria) this;
        }

        public Criteria andEnjoyNotEqualTo(Integer value) {
            addCriterion("enjoy <>", value, "enjoy");
            return (Criteria) this;
        }

        public Criteria andEnjoyGreaterThan(Integer value) {
            addCriterion("enjoy >", value, "enjoy");
            return (Criteria) this;
        }

        public Criteria andEnjoyGreaterThanOrEqualTo(Integer value) {
            addCriterion("enjoy >=", value, "enjoy");
            return (Criteria) this;
        }

        public Criteria andEnjoyLessThan(Integer value) {
            addCriterion("enjoy <", value, "enjoy");
            return (Criteria) this;
        }

        public Criteria andEnjoyLessThanOrEqualTo(Integer value) {
            addCriterion("enjoy <=", value, "enjoy");
            return (Criteria) this;
        }

        public Criteria andEnjoyIn(List<Integer> values) {
            addCriterion("enjoy in", values, "enjoy");
            return (Criteria) this;
        }

        public Criteria andEnjoyNotIn(List<Integer> values) {
            addCriterion("enjoy not in", values, "enjoy");
            return (Criteria) this;
        }

        public Criteria andEnjoyBetween(Integer value1, Integer value2) {
            addCriterion("enjoy between", value1, value2, "enjoy");
            return (Criteria) this;
        }

        public Criteria andEnjoyNotBetween(Integer value1, Integer value2) {
            addCriterion("enjoy not between", value1, value2, "enjoy");
            return (Criteria) this;
        }

        public Criteria andIslineIsNull() {
            addCriterion("isline is null");
            return (Criteria) this;
        }

        public Criteria andIslineIsNotNull() {
            addCriterion("isline is not null");
            return (Criteria) this;
        }

        public Criteria andIslineEqualTo(String value) {
            addCriterion("isline =", value, "isline");
            return (Criteria) this;
        }

        public Criteria andIslineNotEqualTo(String value) {
            addCriterion("isline <>", value, "isline");
            return (Criteria) this;
        }

        public Criteria andIslineGreaterThan(String value) {
            addCriterion("isline >", value, "isline");
            return (Criteria) this;
        }

        public Criteria andIslineGreaterThanOrEqualTo(String value) {
            addCriterion("isline >=", value, "isline");
            return (Criteria) this;
        }

        public Criteria andIslineLessThan(String value) {
            addCriterion("isline <", value, "isline");
            return (Criteria) this;
        }

        public Criteria andIslineLessThanOrEqualTo(String value) {
            addCriterion("isline <=", value, "isline");
            return (Criteria) this;
        }

        public Criteria andIslineLike(String value) {
            addCriterion("isline like", value, "isline");
            return (Criteria) this;
        }

        public Criteria andIslineNotLike(String value) {
            addCriterion("isline not like", value, "isline");
            return (Criteria) this;
        }

        public Criteria andIslineIn(List<String> values) {
            addCriterion("isline in", values, "isline");
            return (Criteria) this;
        }

        public Criteria andIslineNotIn(List<String> values) {
            addCriterion("isline not in", values, "isline");
            return (Criteria) this;
        }

        public Criteria andIslineBetween(String value1, String value2) {
            addCriterion("isline between", value1, value2, "isline");
            return (Criteria) this;
        }

        public Criteria andIslineNotBetween(String value1, String value2) {
            addCriterion("isline not between", value1, value2, "isline");
            return (Criteria) this;
        }

        public Criteria andBuydayIsNull() {
            addCriterion("buyday is null");
            return (Criteria) this;
        }

        public Criteria andBuydayIsNotNull() {
            addCriterion("buyday is not null");
            return (Criteria) this;
        }

        public Criteria andBuydayEqualTo(String value) {
            addCriterion("buyday =", value, "buyday");
            return (Criteria) this;
        }

        public Criteria andBuydayNotEqualTo(String value) {
            addCriterion("buyday <>", value, "buyday");
            return (Criteria) this;
        }

        public Criteria andBuydayGreaterThan(String value) {
            addCriterion("buyday >", value, "buyday");
            return (Criteria) this;
        }

        public Criteria andBuydayGreaterThanOrEqualTo(String value) {
            addCriterion("buyday >=", value, "buyday");
            return (Criteria) this;
        }

        public Criteria andBuydayLessThan(String value) {
            addCriterion("buyday <", value, "buyday");
            return (Criteria) this;
        }

        public Criteria andBuydayLessThanOrEqualTo(String value) {
            addCriterion("buyday <=", value, "buyday");
            return (Criteria) this;
        }

        public Criteria andBuydayLike(String value) {
            addCriterion("buyday like", value, "buyday");
            return (Criteria) this;
        }

        public Criteria andBuydayNotLike(String value) {
            addCriterion("buyday not like", value, "buyday");
            return (Criteria) this;
        }

        public Criteria andBuydayIn(List<String> values) {
            addCriterion("buyday in", values, "buyday");
            return (Criteria) this;
        }

        public Criteria andBuydayNotIn(List<String> values) {
            addCriterion("buyday not in", values, "buyday");
            return (Criteria) this;
        }

        public Criteria andBuydayBetween(String value1, String value2) {
            addCriterion("buyday between", value1, value2, "buyday");
            return (Criteria) this;
        }

        public Criteria andBuydayNotBetween(String value1, String value2) {
            addCriterion("buyday not between", value1, value2, "buyday");
            return (Criteria) this;
        }

        public Criteria andUsetimeIsNull() {
            addCriterion("usetime is null");
            return (Criteria) this;
        }

        public Criteria andUsetimeIsNotNull() {
            addCriterion("usetime is not null");
            return (Criteria) this;
        }

        public Criteria andUsetimeEqualTo(Integer value) {
            addCriterion("usetime =", value, "usetime");
            return (Criteria) this;
        }

        public Criteria andUsetimeNotEqualTo(Integer value) {
            addCriterion("usetime <>", value, "usetime");
            return (Criteria) this;
        }

        public Criteria andUsetimeGreaterThan(Integer value) {
            addCriterion("usetime >", value, "usetime");
            return (Criteria) this;
        }

        public Criteria andUsetimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("usetime >=", value, "usetime");
            return (Criteria) this;
        }

        public Criteria andUsetimeLessThan(Integer value) {
            addCriterion("usetime <", value, "usetime");
            return (Criteria) this;
        }

        public Criteria andUsetimeLessThanOrEqualTo(Integer value) {
            addCriterion("usetime <=", value, "usetime");
            return (Criteria) this;
        }

        public Criteria andUsetimeIn(List<Integer> values) {
            addCriterion("usetime in", values, "usetime");
            return (Criteria) this;
        }

        public Criteria andUsetimeNotIn(List<Integer> values) {
            addCriterion("usetime not in", values, "usetime");
            return (Criteria) this;
        }

        public Criteria andUsetimeBetween(Integer value1, Integer value2) {
            addCriterion("usetime between", value1, value2, "usetime");
            return (Criteria) this;
        }

        public Criteria andUsetimeNotBetween(Integer value1, Integer value2) {
            addCriterion("usetime not between", value1, value2, "usetime");
            return (Criteria) this;
        }

        public Criteria andPictureIsNull() {
            addCriterion("picture is null");
            return (Criteria) this;
        }

        public Criteria andPictureIsNotNull() {
            addCriterion("picture is not null");
            return (Criteria) this;
        }

        public Criteria andPictureEqualTo(String value) {
            addCriterion("picture =", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotEqualTo(String value) {
            addCriterion("picture <>", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureGreaterThan(String value) {
            addCriterion("picture >", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureGreaterThanOrEqualTo(String value) {
            addCriterion("picture >=", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLessThan(String value) {
            addCriterion("picture <", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLessThanOrEqualTo(String value) {
            addCriterion("picture <=", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLike(String value) {
            addCriterion("picture like", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotLike(String value) {
            addCriterion("picture not like", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureIn(List<String> values) {
            addCriterion("picture in", values, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotIn(List<String> values) {
            addCriterion("picture not in", values, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureBetween(String value1, String value2) {
            addCriterion("picture between", value1, value2, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotBetween(String value1, String value2) {
            addCriterion("picture not between", value1, value2, "picture");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("userid like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("userid not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("userid not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andAdvIsNull() {
            addCriterion("adv is null");
            return (Criteria) this;
        }

        public Criteria andAdvIsNotNull() {
            addCriterion("adv is not null");
            return (Criteria) this;
        }

        public Criteria andAdvEqualTo(String value) {
            addCriterion("adv =", value, "adv");
            return (Criteria) this;
        }

        public Criteria andAdvNotEqualTo(String value) {
            addCriterion("adv <>", value, "adv");
            return (Criteria) this;
        }

        public Criteria andAdvGreaterThan(String value) {
            addCriterion("adv >", value, "adv");
            return (Criteria) this;
        }

        public Criteria andAdvGreaterThanOrEqualTo(String value) {
            addCriterion("adv >=", value, "adv");
            return (Criteria) this;
        }

        public Criteria andAdvLessThan(String value) {
            addCriterion("adv <", value, "adv");
            return (Criteria) this;
        }

        public Criteria andAdvLessThanOrEqualTo(String value) {
            addCriterion("adv <=", value, "adv");
            return (Criteria) this;
        }

        public Criteria andAdvLike(String value) {
            addCriterion("adv like", value, "adv");
            return (Criteria) this;
        }

        public Criteria andAdvNotLike(String value) {
            addCriterion("adv not like", value, "adv");
            return (Criteria) this;
        }

        public Criteria andAdvIn(List<String> values) {
            addCriterion("adv in", values, "adv");
            return (Criteria) this;
        }

        public Criteria andAdvNotIn(List<String> values) {
            addCriterion("adv not in", values, "adv");
            return (Criteria) this;
        }

        public Criteria andAdvBetween(String value1, String value2) {
            addCriterion("adv between", value1, value2, "adv");
            return (Criteria) this;
        }

        public Criteria andAdvNotBetween(String value1, String value2) {
            addCriterion("adv not between", value1, value2, "adv");
            return (Criteria) this;
        }

        public Criteria andOriginalcostIsNull() {
            addCriterion("originalcost is null");
            return (Criteria) this;
        }

        public Criteria andOriginalcostIsNotNull() {
            addCriterion("originalcost is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalcostEqualTo(BigDecimal value) {
            addCriterion("originalcost =", value, "originalcost");
            return (Criteria) this;
        }

        public Criteria andOriginalcostNotEqualTo(BigDecimal value) {
            addCriterion("originalcost <>", value, "originalcost");
            return (Criteria) this;
        }

        public Criteria andOriginalcostGreaterThan(BigDecimal value) {
            addCriterion("originalcost >", value, "originalcost");
            return (Criteria) this;
        }

        public Criteria andOriginalcostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("originalcost >=", value, "originalcost");
            return (Criteria) this;
        }

        public Criteria andOriginalcostLessThan(BigDecimal value) {
            addCriterion("originalcost <", value, "originalcost");
            return (Criteria) this;
        }

        public Criteria andOriginalcostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("originalcost <=", value, "originalcost");
            return (Criteria) this;
        }

        public Criteria andOriginalcostIn(List<BigDecimal> values) {
            addCriterion("originalcost in", values, "originalcost");
            return (Criteria) this;
        }

        public Criteria andOriginalcostNotIn(List<BigDecimal> values) {
            addCriterion("originalcost not in", values, "originalcost");
            return (Criteria) this;
        }

        public Criteria andOriginalcostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("originalcost between", value1, value2, "originalcost");
            return (Criteria) this;
        }

        public Criteria andOriginalcostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("originalcost not between", value1, value2, "originalcost");
            return (Criteria) this;
        }

        public Criteria andNumIsNull() {
            addCriterion("num is null");
            return (Criteria) this;
        }

        public Criteria andNumIsNotNull() {
            addCriterion("num is not null");
            return (Criteria) this;
        }

        public Criteria andNumEqualTo(Integer value) {
            addCriterion("num =", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotEqualTo(Integer value) {
            addCriterion("num <>", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThan(Integer value) {
            addCriterion("num >", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("num >=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThan(Integer value) {
            addCriterion("num <", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThanOrEqualTo(Integer value) {
            addCriterion("num <=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumIn(List<Integer> values) {
            addCriterion("num in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotIn(List<Integer> values) {
            addCriterion("num not in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumBetween(Integer value1, Integer value2) {
            addCriterion("num between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotBetween(Integer value1, Integer value2) {
            addCriterion("num not between", value1, value2, "num");
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