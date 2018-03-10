package cn.lesliu.Trading.pojo;

import java.util.ArrayList;
import java.util.List;

public class GoodsImgExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsImgExample() {
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

        public Criteria andImgidIsNull() {
            addCriterion("imgid is null");
            return (Criteria) this;
        }

        public Criteria andImgidIsNotNull() {
            addCriterion("imgid is not null");
            return (Criteria) this;
        }

        public Criteria andImgidEqualTo(String value) {
            addCriterion("imgid =", value, "imgid");
            return (Criteria) this;
        }

        public Criteria andImgidNotEqualTo(String value) {
            addCriterion("imgid <>", value, "imgid");
            return (Criteria) this;
        }

        public Criteria andImgidGreaterThan(String value) {
            addCriterion("imgid >", value, "imgid");
            return (Criteria) this;
        }

        public Criteria andImgidGreaterThanOrEqualTo(String value) {
            addCriterion("imgid >=", value, "imgid");
            return (Criteria) this;
        }

        public Criteria andImgidLessThan(String value) {
            addCriterion("imgid <", value, "imgid");
            return (Criteria) this;
        }

        public Criteria andImgidLessThanOrEqualTo(String value) {
            addCriterion("imgid <=", value, "imgid");
            return (Criteria) this;
        }

        public Criteria andImgidLike(String value) {
            addCriterion("imgid like", value, "imgid");
            return (Criteria) this;
        }

        public Criteria andImgidNotLike(String value) {
            addCriterion("imgid not like", value, "imgid");
            return (Criteria) this;
        }

        public Criteria andImgidIn(List<String> values) {
            addCriterion("imgid in", values, "imgid");
            return (Criteria) this;
        }

        public Criteria andImgidNotIn(List<String> values) {
            addCriterion("imgid not in", values, "imgid");
            return (Criteria) this;
        }

        public Criteria andImgidBetween(String value1, String value2) {
            addCriterion("imgid between", value1, value2, "imgid");
            return (Criteria) this;
        }

        public Criteria andImgidNotBetween(String value1, String value2) {
            addCriterion("imgid not between", value1, value2, "imgid");
            return (Criteria) this;
        }

        public Criteria andGoodsidIsNull() {
            addCriterion("goodsid is null");
            return (Criteria) this;
        }

        public Criteria andGoodsidIsNotNull() {
            addCriterion("goodsid is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsidEqualTo(String value) {
            addCriterion("goodsid =", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidNotEqualTo(String value) {
            addCriterion("goodsid <>", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidGreaterThan(String value) {
            addCriterion("goodsid >", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidGreaterThanOrEqualTo(String value) {
            addCriterion("goodsid >=", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidLessThan(String value) {
            addCriterion("goodsid <", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidLessThanOrEqualTo(String value) {
            addCriterion("goodsid <=", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidLike(String value) {
            addCriterion("goodsid like", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidNotLike(String value) {
            addCriterion("goodsid not like", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidIn(List<String> values) {
            addCriterion("goodsid in", values, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidNotIn(List<String> values) {
            addCriterion("goodsid not in", values, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidBetween(String value1, String value2) {
            addCriterion("goodsid between", value1, value2, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidNotBetween(String value1, String value2) {
            addCriterion("goodsid not between", value1, value2, "goodsid");
            return (Criteria) this;
        }

        public Criteria andImgIsNull() {
            addCriterion("img is null");
            return (Criteria) this;
        }

        public Criteria andImgIsNotNull() {
            addCriterion("img is not null");
            return (Criteria) this;
        }

        public Criteria andImgEqualTo(String value) {
            addCriterion("img =", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotEqualTo(String value) {
            addCriterion("img <>", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgGreaterThan(String value) {
            addCriterion("img >", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgGreaterThanOrEqualTo(String value) {
            addCriterion("img >=", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLessThan(String value) {
            addCriterion("img <", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLessThanOrEqualTo(String value) {
            addCriterion("img <=", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLike(String value) {
            addCriterion("img like", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotLike(String value) {
            addCriterion("img not like", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgIn(List<String> values) {
            addCriterion("img in", values, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotIn(List<String> values) {
            addCriterion("img not in", values, "img");
            return (Criteria) this;
        }

        public Criteria andImgBetween(String value1, String value2) {
            addCriterion("img between", value1, value2, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotBetween(String value1, String value2) {
            addCriterion("img not between", value1, value2, "img");
            return (Criteria) this;
        }

        public Criteria andImgnameIsNull() {
            addCriterion("imgname is null");
            return (Criteria) this;
        }

        public Criteria andImgnameIsNotNull() {
            addCriterion("imgname is not null");
            return (Criteria) this;
        }

        public Criteria andImgnameEqualTo(String value) {
            addCriterion("imgname =", value, "imgname");
            return (Criteria) this;
        }

        public Criteria andImgnameNotEqualTo(String value) {
            addCriterion("imgname <>", value, "imgname");
            return (Criteria) this;
        }

        public Criteria andImgnameGreaterThan(String value) {
            addCriterion("imgname >", value, "imgname");
            return (Criteria) this;
        }

        public Criteria andImgnameGreaterThanOrEqualTo(String value) {
            addCriterion("imgname >=", value, "imgname");
            return (Criteria) this;
        }

        public Criteria andImgnameLessThan(String value) {
            addCriterion("imgname <", value, "imgname");
            return (Criteria) this;
        }

        public Criteria andImgnameLessThanOrEqualTo(String value) {
            addCriterion("imgname <=", value, "imgname");
            return (Criteria) this;
        }

        public Criteria andImgnameLike(String value) {
            addCriterion("imgname like", value, "imgname");
            return (Criteria) this;
        }

        public Criteria andImgnameNotLike(String value) {
            addCriterion("imgname not like", value, "imgname");
            return (Criteria) this;
        }

        public Criteria andImgnameIn(List<String> values) {
            addCriterion("imgname in", values, "imgname");
            return (Criteria) this;
        }

        public Criteria andImgnameNotIn(List<String> values) {
            addCriterion("imgname not in", values, "imgname");
            return (Criteria) this;
        }

        public Criteria andImgnameBetween(String value1, String value2) {
            addCriterion("imgname between", value1, value2, "imgname");
            return (Criteria) this;
        }

        public Criteria andImgnameNotBetween(String value1, String value2) {
            addCriterion("imgname not between", value1, value2, "imgname");
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