package cn.lesliu.Trading.pojo;

import java.util.ArrayList;
import java.util.List;

public class EmailMessagesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EmailMessagesExample() {
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

        public Criteria andMessageidIsNull() {
            addCriterion("messageid is null");
            return (Criteria) this;
        }

        public Criteria andMessageidIsNotNull() {
            addCriterion("messageid is not null");
            return (Criteria) this;
        }

        public Criteria andMessageidEqualTo(String value) {
            addCriterion("messageid =", value, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidNotEqualTo(String value) {
            addCriterion("messageid <>", value, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidGreaterThan(String value) {
            addCriterion("messageid >", value, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidGreaterThanOrEqualTo(String value) {
            addCriterion("messageid >=", value, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidLessThan(String value) {
            addCriterion("messageid <", value, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidLessThanOrEqualTo(String value) {
            addCriterion("messageid <=", value, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidLike(String value) {
            addCriterion("messageid like", value, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidNotLike(String value) {
            addCriterion("messageid not like", value, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidIn(List<String> values) {
            addCriterion("messageid in", values, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidNotIn(List<String> values) {
            addCriterion("messageid not in", values, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidBetween(String value1, String value2) {
            addCriterion("messageid between", value1, value2, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidNotBetween(String value1, String value2) {
            addCriterion("messageid not between", value1, value2, "messageid");
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

        public Criteria andGoodsnameIsNull() {
            addCriterion("goodsname is null");
            return (Criteria) this;
        }

        public Criteria andGoodsnameIsNotNull() {
            addCriterion("goodsname is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsnameEqualTo(String value) {
            addCriterion("goodsname =", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotEqualTo(String value) {
            addCriterion("goodsname <>", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameGreaterThan(String value) {
            addCriterion("goodsname >", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameGreaterThanOrEqualTo(String value) {
            addCriterion("goodsname >=", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameLessThan(String value) {
            addCriterion("goodsname <", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameLessThanOrEqualTo(String value) {
            addCriterion("goodsname <=", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameLike(String value) {
            addCriterion("goodsname like", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotLike(String value) {
            addCriterion("goodsname not like", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameIn(List<String> values) {
            addCriterion("goodsname in", values, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotIn(List<String> values) {
            addCriterion("goodsname not in", values, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameBetween(String value1, String value2) {
            addCriterion("goodsname between", value1, value2, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotBetween(String value1, String value2) {
            addCriterion("goodsname not between", value1, value2, "goodsname");
            return (Criteria) this;
        }

        public Criteria andSenduseridIsNull() {
            addCriterion("senduserid is null");
            return (Criteria) this;
        }

        public Criteria andSenduseridIsNotNull() {
            addCriterion("senduserid is not null");
            return (Criteria) this;
        }

        public Criteria andSenduseridEqualTo(String value) {
            addCriterion("senduserid =", value, "senduserid");
            return (Criteria) this;
        }

        public Criteria andSenduseridNotEqualTo(String value) {
            addCriterion("senduserid <>", value, "senduserid");
            return (Criteria) this;
        }

        public Criteria andSenduseridGreaterThan(String value) {
            addCriterion("senduserid >", value, "senduserid");
            return (Criteria) this;
        }

        public Criteria andSenduseridGreaterThanOrEqualTo(String value) {
            addCriterion("senduserid >=", value, "senduserid");
            return (Criteria) this;
        }

        public Criteria andSenduseridLessThan(String value) {
            addCriterion("senduserid <", value, "senduserid");
            return (Criteria) this;
        }

        public Criteria andSenduseridLessThanOrEqualTo(String value) {
            addCriterion("senduserid <=", value, "senduserid");
            return (Criteria) this;
        }

        public Criteria andSenduseridLike(String value) {
            addCriterion("senduserid like", value, "senduserid");
            return (Criteria) this;
        }

        public Criteria andSenduseridNotLike(String value) {
            addCriterion("senduserid not like", value, "senduserid");
            return (Criteria) this;
        }

        public Criteria andSenduseridIn(List<String> values) {
            addCriterion("senduserid in", values, "senduserid");
            return (Criteria) this;
        }

        public Criteria andSenduseridNotIn(List<String> values) {
            addCriterion("senduserid not in", values, "senduserid");
            return (Criteria) this;
        }

        public Criteria andSenduseridBetween(String value1, String value2) {
            addCriterion("senduserid between", value1, value2, "senduserid");
            return (Criteria) this;
        }

        public Criteria andSenduseridNotBetween(String value1, String value2) {
            addCriterion("senduserid not between", value1, value2, "senduserid");
            return (Criteria) this;
        }

        public Criteria andSendusernameIsNull() {
            addCriterion("sendusername is null");
            return (Criteria) this;
        }

        public Criteria andSendusernameIsNotNull() {
            addCriterion("sendusername is not null");
            return (Criteria) this;
        }

        public Criteria andSendusernameEqualTo(String value) {
            addCriterion("sendusername =", value, "sendusername");
            return (Criteria) this;
        }

        public Criteria andSendusernameNotEqualTo(String value) {
            addCriterion("sendusername <>", value, "sendusername");
            return (Criteria) this;
        }

        public Criteria andSendusernameGreaterThan(String value) {
            addCriterion("sendusername >", value, "sendusername");
            return (Criteria) this;
        }

        public Criteria andSendusernameGreaterThanOrEqualTo(String value) {
            addCriterion("sendusername >=", value, "sendusername");
            return (Criteria) this;
        }

        public Criteria andSendusernameLessThan(String value) {
            addCriterion("sendusername <", value, "sendusername");
            return (Criteria) this;
        }

        public Criteria andSendusernameLessThanOrEqualTo(String value) {
            addCriterion("sendusername <=", value, "sendusername");
            return (Criteria) this;
        }

        public Criteria andSendusernameLike(String value) {
            addCriterion("sendusername like", value, "sendusername");
            return (Criteria) this;
        }

        public Criteria andSendusernameNotLike(String value) {
            addCriterion("sendusername not like", value, "sendusername");
            return (Criteria) this;
        }

        public Criteria andSendusernameIn(List<String> values) {
            addCriterion("sendusername in", values, "sendusername");
            return (Criteria) this;
        }

        public Criteria andSendusernameNotIn(List<String> values) {
            addCriterion("sendusername not in", values, "sendusername");
            return (Criteria) this;
        }

        public Criteria andSendusernameBetween(String value1, String value2) {
            addCriterion("sendusername between", value1, value2, "sendusername");
            return (Criteria) this;
        }

        public Criteria andSendusernameNotBetween(String value1, String value2) {
            addCriterion("sendusername not between", value1, value2, "sendusername");
            return (Criteria) this;
        }

        public Criteria andGoodsowneridIsNull() {
            addCriterion("goodsownerid is null");
            return (Criteria) this;
        }

        public Criteria andGoodsowneridIsNotNull() {
            addCriterion("goodsownerid is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsowneridEqualTo(String value) {
            addCriterion("goodsownerid =", value, "goodsownerid");
            return (Criteria) this;
        }

        public Criteria andGoodsowneridNotEqualTo(String value) {
            addCriterion("goodsownerid <>", value, "goodsownerid");
            return (Criteria) this;
        }

        public Criteria andGoodsowneridGreaterThan(String value) {
            addCriterion("goodsownerid >", value, "goodsownerid");
            return (Criteria) this;
        }

        public Criteria andGoodsowneridGreaterThanOrEqualTo(String value) {
            addCriterion("goodsownerid >=", value, "goodsownerid");
            return (Criteria) this;
        }

        public Criteria andGoodsowneridLessThan(String value) {
            addCriterion("goodsownerid <", value, "goodsownerid");
            return (Criteria) this;
        }

        public Criteria andGoodsowneridLessThanOrEqualTo(String value) {
            addCriterion("goodsownerid <=", value, "goodsownerid");
            return (Criteria) this;
        }

        public Criteria andGoodsowneridLike(String value) {
            addCriterion("goodsownerid like", value, "goodsownerid");
            return (Criteria) this;
        }

        public Criteria andGoodsowneridNotLike(String value) {
            addCriterion("goodsownerid not like", value, "goodsownerid");
            return (Criteria) this;
        }

        public Criteria andGoodsowneridIn(List<String> values) {
            addCriterion("goodsownerid in", values, "goodsownerid");
            return (Criteria) this;
        }

        public Criteria andGoodsowneridNotIn(List<String> values) {
            addCriterion("goodsownerid not in", values, "goodsownerid");
            return (Criteria) this;
        }

        public Criteria andGoodsowneridBetween(String value1, String value2) {
            addCriterion("goodsownerid between", value1, value2, "goodsownerid");
            return (Criteria) this;
        }

        public Criteria andGoodsowneridNotBetween(String value1, String value2) {
            addCriterion("goodsownerid not between", value1, value2, "goodsownerid");
            return (Criteria) this;
        }

        public Criteria andGoodsownernameIsNull() {
            addCriterion("goodsownername is null");
            return (Criteria) this;
        }

        public Criteria andGoodsownernameIsNotNull() {
            addCriterion("goodsownername is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsownernameEqualTo(String value) {
            addCriterion("goodsownername =", value, "goodsownername");
            return (Criteria) this;
        }

        public Criteria andGoodsownernameNotEqualTo(String value) {
            addCriterion("goodsownername <>", value, "goodsownername");
            return (Criteria) this;
        }

        public Criteria andGoodsownernameGreaterThan(String value) {
            addCriterion("goodsownername >", value, "goodsownername");
            return (Criteria) this;
        }

        public Criteria andGoodsownernameGreaterThanOrEqualTo(String value) {
            addCriterion("goodsownername >=", value, "goodsownername");
            return (Criteria) this;
        }

        public Criteria andGoodsownernameLessThan(String value) {
            addCriterion("goodsownername <", value, "goodsownername");
            return (Criteria) this;
        }

        public Criteria andGoodsownernameLessThanOrEqualTo(String value) {
            addCriterion("goodsownername <=", value, "goodsownername");
            return (Criteria) this;
        }

        public Criteria andGoodsownernameLike(String value) {
            addCriterion("goodsownername like", value, "goodsownername");
            return (Criteria) this;
        }

        public Criteria andGoodsownernameNotLike(String value) {
            addCriterion("goodsownername not like", value, "goodsownername");
            return (Criteria) this;
        }

        public Criteria andGoodsownernameIn(List<String> values) {
            addCriterion("goodsownername in", values, "goodsownername");
            return (Criteria) this;
        }

        public Criteria andGoodsownernameNotIn(List<String> values) {
            addCriterion("goodsownername not in", values, "goodsownername");
            return (Criteria) this;
        }

        public Criteria andGoodsownernameBetween(String value1, String value2) {
            addCriterion("goodsownername between", value1, value2, "goodsownername");
            return (Criteria) this;
        }

        public Criteria andGoodsownernameNotBetween(String value1, String value2) {
            addCriterion("goodsownername not between", value1, value2, "goodsownername");
            return (Criteria) this;
        }

        public Criteria andGivewordsIsNull() {
            addCriterion("givewords is null");
            return (Criteria) this;
        }

        public Criteria andGivewordsIsNotNull() {
            addCriterion("givewords is not null");
            return (Criteria) this;
        }

        public Criteria andGivewordsEqualTo(String value) {
            addCriterion("givewords =", value, "givewords");
            return (Criteria) this;
        }

        public Criteria andGivewordsNotEqualTo(String value) {
            addCriterion("givewords <>", value, "givewords");
            return (Criteria) this;
        }

        public Criteria andGivewordsGreaterThan(String value) {
            addCriterion("givewords >", value, "givewords");
            return (Criteria) this;
        }

        public Criteria andGivewordsGreaterThanOrEqualTo(String value) {
            addCriterion("givewords >=", value, "givewords");
            return (Criteria) this;
        }

        public Criteria andGivewordsLessThan(String value) {
            addCriterion("givewords <", value, "givewords");
            return (Criteria) this;
        }

        public Criteria andGivewordsLessThanOrEqualTo(String value) {
            addCriterion("givewords <=", value, "givewords");
            return (Criteria) this;
        }

        public Criteria andGivewordsLike(String value) {
            addCriterion("givewords like", value, "givewords");
            return (Criteria) this;
        }

        public Criteria andGivewordsNotLike(String value) {
            addCriterion("givewords not like", value, "givewords");
            return (Criteria) this;
        }

        public Criteria andGivewordsIn(List<String> values) {
            addCriterion("givewords in", values, "givewords");
            return (Criteria) this;
        }

        public Criteria andGivewordsNotIn(List<String> values) {
            addCriterion("givewords not in", values, "givewords");
            return (Criteria) this;
        }

        public Criteria andGivewordsBetween(String value1, String value2) {
            addCriterion("givewords between", value1, value2, "givewords");
            return (Criteria) this;
        }

        public Criteria andGivewordsNotBetween(String value1, String value2) {
            addCriterion("givewords not between", value1, value2, "givewords");
            return (Criteria) this;
        }

        public Criteria andGivepriceIsNull() {
            addCriterion("giveprice is null");
            return (Criteria) this;
        }

        public Criteria andGivepriceIsNotNull() {
            addCriterion("giveprice is not null");
            return (Criteria) this;
        }

        public Criteria andGivepriceEqualTo(String value) {
            addCriterion("giveprice =", value, "giveprice");
            return (Criteria) this;
        }

        public Criteria andGivepriceNotEqualTo(String value) {
            addCriterion("giveprice <>", value, "giveprice");
            return (Criteria) this;
        }

        public Criteria andGivepriceGreaterThan(String value) {
            addCriterion("giveprice >", value, "giveprice");
            return (Criteria) this;
        }

        public Criteria andGivepriceGreaterThanOrEqualTo(String value) {
            addCriterion("giveprice >=", value, "giveprice");
            return (Criteria) this;
        }

        public Criteria andGivepriceLessThan(String value) {
            addCriterion("giveprice <", value, "giveprice");
            return (Criteria) this;
        }

        public Criteria andGivepriceLessThanOrEqualTo(String value) {
            addCriterion("giveprice <=", value, "giveprice");
            return (Criteria) this;
        }

        public Criteria andGivepriceLike(String value) {
            addCriterion("giveprice like", value, "giveprice");
            return (Criteria) this;
        }

        public Criteria andGivepriceNotLike(String value) {
            addCriterion("giveprice not like", value, "giveprice");
            return (Criteria) this;
        }

        public Criteria andGivepriceIn(List<String> values) {
            addCriterion("giveprice in", values, "giveprice");
            return (Criteria) this;
        }

        public Criteria andGivepriceNotIn(List<String> values) {
            addCriterion("giveprice not in", values, "giveprice");
            return (Criteria) this;
        }

        public Criteria andGivepriceBetween(String value1, String value2) {
            addCriterion("giveprice between", value1, value2, "giveprice");
            return (Criteria) this;
        }

        public Criteria andGivepriceNotBetween(String value1, String value2) {
            addCriterion("giveprice not between", value1, value2, "giveprice");
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