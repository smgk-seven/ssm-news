package com.smgk.news.bean;

import java.util.ArrayList;
import java.util.List;

public class GiveGoodExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GiveGoodExample() {
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

        public Criteria andGiveGoodIdIsNull() {
            addCriterion("give_good_id is null");
            return (Criteria) this;
        }

        public Criteria andGiveGoodIdIsNotNull() {
            addCriterion("give_good_id is not null");
            return (Criteria) this;
        }

        public Criteria andGiveGoodIdEqualTo(Integer value) {
            addCriterion("give_good_id =", value, "giveGoodId");
            return (Criteria) this;
        }

        public Criteria andGiveGoodIdNotEqualTo(Integer value) {
            addCriterion("give_good_id <>", value, "giveGoodId");
            return (Criteria) this;
        }

        public Criteria andGiveGoodIdGreaterThan(Integer value) {
            addCriterion("give_good_id >", value, "giveGoodId");
            return (Criteria) this;
        }

        public Criteria andGiveGoodIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("give_good_id >=", value, "giveGoodId");
            return (Criteria) this;
        }

        public Criteria andGiveGoodIdLessThan(Integer value) {
            addCriterion("give_good_id <", value, "giveGoodId");
            return (Criteria) this;
        }

        public Criteria andGiveGoodIdLessThanOrEqualTo(Integer value) {
            addCriterion("give_good_id <=", value, "giveGoodId");
            return (Criteria) this;
        }

        public Criteria andGiveGoodIdIn(List<Integer> values) {
            addCriterion("give_good_id in", values, "giveGoodId");
            return (Criteria) this;
        }

        public Criteria andGiveGoodIdNotIn(List<Integer> values) {
            addCriterion("give_good_id not in", values, "giveGoodId");
            return (Criteria) this;
        }

        public Criteria andGiveGoodIdBetween(Integer value1, Integer value2) {
            addCriterion("give_good_id between", value1, value2, "giveGoodId");
            return (Criteria) this;
        }

        public Criteria andGiveGoodIdNotBetween(Integer value1, Integer value2) {
            addCriterion("give_good_id not between", value1, value2, "giveGoodId");
            return (Criteria) this;
        }

        public Criteria andGiveGoodUserIsNull() {
            addCriterion("give_good_user is null");
            return (Criteria) this;
        }

        public Criteria andGiveGoodUserIsNotNull() {
            addCriterion("give_good_user is not null");
            return (Criteria) this;
        }

        public Criteria andGiveGoodUserEqualTo(Integer value) {
            addCriterion("give_good_user =", value, "giveGoodUser");
            return (Criteria) this;
        }

        public Criteria andGiveGoodUserNotEqualTo(Integer value) {
            addCriterion("give_good_user <>", value, "giveGoodUser");
            return (Criteria) this;
        }

        public Criteria andGiveGoodUserGreaterThan(Integer value) {
            addCriterion("give_good_user >", value, "giveGoodUser");
            return (Criteria) this;
        }

        public Criteria andGiveGoodUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("give_good_user >=", value, "giveGoodUser");
            return (Criteria) this;
        }

        public Criteria andGiveGoodUserLessThan(Integer value) {
            addCriterion("give_good_user <", value, "giveGoodUser");
            return (Criteria) this;
        }

        public Criteria andGiveGoodUserLessThanOrEqualTo(Integer value) {
            addCriterion("give_good_user <=", value, "giveGoodUser");
            return (Criteria) this;
        }

        public Criteria andGiveGoodUserIn(List<Integer> values) {
            addCriterion("give_good_user in", values, "giveGoodUser");
            return (Criteria) this;
        }

        public Criteria andGiveGoodUserNotIn(List<Integer> values) {
            addCriterion("give_good_user not in", values, "giveGoodUser");
            return (Criteria) this;
        }

        public Criteria andGiveGoodUserBetween(Integer value1, Integer value2) {
            addCriterion("give_good_user between", value1, value2, "giveGoodUser");
            return (Criteria) this;
        }

        public Criteria andGiveGoodUserNotBetween(Integer value1, Integer value2) {
            addCriterion("give_good_user not between", value1, value2, "giveGoodUser");
            return (Criteria) this;
        }

        public Criteria andGiveGoodNewsIsNull() {
            addCriterion("give_good_news is null");
            return (Criteria) this;
        }

        public Criteria andGiveGoodNewsIsNotNull() {
            addCriterion("give_good_news is not null");
            return (Criteria) this;
        }

        public Criteria andGiveGoodNewsEqualTo(Integer value) {
            addCriterion("give_good_news =", value, "giveGoodNews");
            return (Criteria) this;
        }

        public Criteria andGiveGoodNewsNotEqualTo(Integer value) {
            addCriterion("give_good_news <>", value, "giveGoodNews");
            return (Criteria) this;
        }

        public Criteria andGiveGoodNewsGreaterThan(Integer value) {
            addCriterion("give_good_news >", value, "giveGoodNews");
            return (Criteria) this;
        }

        public Criteria andGiveGoodNewsGreaterThanOrEqualTo(Integer value) {
            addCriterion("give_good_news >=", value, "giveGoodNews");
            return (Criteria) this;
        }

        public Criteria andGiveGoodNewsLessThan(Integer value) {
            addCriterion("give_good_news <", value, "giveGoodNews");
            return (Criteria) this;
        }

        public Criteria andGiveGoodNewsLessThanOrEqualTo(Integer value) {
            addCriterion("give_good_news <=", value, "giveGoodNews");
            return (Criteria) this;
        }

        public Criteria andGiveGoodNewsIn(List<Integer> values) {
            addCriterion("give_good_news in", values, "giveGoodNews");
            return (Criteria) this;
        }

        public Criteria andGiveGoodNewsNotIn(List<Integer> values) {
            addCriterion("give_good_news not in", values, "giveGoodNews");
            return (Criteria) this;
        }

        public Criteria andGiveGoodNewsBetween(Integer value1, Integer value2) {
            addCriterion("give_good_news between", value1, value2, "giveGoodNews");
            return (Criteria) this;
        }

        public Criteria andGiveGoodNewsNotBetween(Integer value1, Integer value2) {
            addCriterion("give_good_news not between", value1, value2, "giveGoodNews");
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