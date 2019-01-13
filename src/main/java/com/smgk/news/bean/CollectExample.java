package com.smgk.news.bean;

import java.util.ArrayList;
import java.util.List;

public class CollectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CollectExample() {
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

        public Criteria andCollectIdIsNull() {
            addCriterion("collect_id is null");
            return (Criteria) this;
        }

        public Criteria andCollectIdIsNotNull() {
            addCriterion("collect_id is not null");
            return (Criteria) this;
        }

        public Criteria andCollectIdEqualTo(Integer value) {
            addCriterion("collect_id =", value, "collectId");
            return (Criteria) this;
        }

        public Criteria andCollectIdNotEqualTo(Integer value) {
            addCriterion("collect_id <>", value, "collectId");
            return (Criteria) this;
        }

        public Criteria andCollectIdGreaterThan(Integer value) {
            addCriterion("collect_id >", value, "collectId");
            return (Criteria) this;
        }

        public Criteria andCollectIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("collect_id >=", value, "collectId");
            return (Criteria) this;
        }

        public Criteria andCollectIdLessThan(Integer value) {
            addCriterion("collect_id <", value, "collectId");
            return (Criteria) this;
        }

        public Criteria andCollectIdLessThanOrEqualTo(Integer value) {
            addCriterion("collect_id <=", value, "collectId");
            return (Criteria) this;
        }

        public Criteria andCollectIdIn(List<Integer> values) {
            addCriterion("collect_id in", values, "collectId");
            return (Criteria) this;
        }

        public Criteria andCollectIdNotIn(List<Integer> values) {
            addCriterion("collect_id not in", values, "collectId");
            return (Criteria) this;
        }

        public Criteria andCollectIdBetween(Integer value1, Integer value2) {
            addCriterion("collect_id between", value1, value2, "collectId");
            return (Criteria) this;
        }

        public Criteria andCollectIdNotBetween(Integer value1, Integer value2) {
            addCriterion("collect_id not between", value1, value2, "collectId");
            return (Criteria) this;
        }

        public Criteria andCollectUserIsNull() {
            addCriterion("collect_user is null");
            return (Criteria) this;
        }

        public Criteria andCollectUserIsNotNull() {
            addCriterion("collect_user is not null");
            return (Criteria) this;
        }

        public Criteria andCollectUserEqualTo(Integer value) {
            addCriterion("collect_user =", value, "collectUser");
            return (Criteria) this;
        }

        public Criteria andCollectUserNotEqualTo(Integer value) {
            addCriterion("collect_user <>", value, "collectUser");
            return (Criteria) this;
        }

        public Criteria andCollectUserGreaterThan(Integer value) {
            addCriterion("collect_user >", value, "collectUser");
            return (Criteria) this;
        }

        public Criteria andCollectUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("collect_user >=", value, "collectUser");
            return (Criteria) this;
        }

        public Criteria andCollectUserLessThan(Integer value) {
            addCriterion("collect_user <", value, "collectUser");
            return (Criteria) this;
        }

        public Criteria andCollectUserLessThanOrEqualTo(Integer value) {
            addCriterion("collect_user <=", value, "collectUser");
            return (Criteria) this;
        }

        public Criteria andCollectUserIn(List<Integer> values) {
            addCriterion("collect_user in", values, "collectUser");
            return (Criteria) this;
        }

        public Criteria andCollectUserNotIn(List<Integer> values) {
            addCriterion("collect_user not in", values, "collectUser");
            return (Criteria) this;
        }

        public Criteria andCollectUserBetween(Integer value1, Integer value2) {
            addCriterion("collect_user between", value1, value2, "collectUser");
            return (Criteria) this;
        }

        public Criteria andCollectUserNotBetween(Integer value1, Integer value2) {
            addCriterion("collect_user not between", value1, value2, "collectUser");
            return (Criteria) this;
        }

        public Criteria andCollectNewsIsNull() {
            addCriterion("collect_news is null");
            return (Criteria) this;
        }

        public Criteria andCollectNewsIsNotNull() {
            addCriterion("collect_news is not null");
            return (Criteria) this;
        }

        public Criteria andCollectNewsEqualTo(Integer value) {
            addCriterion("collect_news =", value, "collectNews");
            return (Criteria) this;
        }

        public Criteria andCollectNewsNotEqualTo(Integer value) {
            addCriterion("collect_news <>", value, "collectNews");
            return (Criteria) this;
        }

        public Criteria andCollectNewsGreaterThan(Integer value) {
            addCriterion("collect_news >", value, "collectNews");
            return (Criteria) this;
        }

        public Criteria andCollectNewsGreaterThanOrEqualTo(Integer value) {
            addCriterion("collect_news >=", value, "collectNews");
            return (Criteria) this;
        }

        public Criteria andCollectNewsLessThan(Integer value) {
            addCriterion("collect_news <", value, "collectNews");
            return (Criteria) this;
        }

        public Criteria andCollectNewsLessThanOrEqualTo(Integer value) {
            addCriterion("collect_news <=", value, "collectNews");
            return (Criteria) this;
        }

        public Criteria andCollectNewsIn(List<Integer> values) {
            addCriterion("collect_news in", values, "collectNews");
            return (Criteria) this;
        }

        public Criteria andCollectNewsNotIn(List<Integer> values) {
            addCriterion("collect_news not in", values, "collectNews");
            return (Criteria) this;
        }

        public Criteria andCollectNewsBetween(Integer value1, Integer value2) {
            addCriterion("collect_news between", value1, value2, "collectNews");
            return (Criteria) this;
        }

        public Criteria andCollectNewsNotBetween(Integer value1, Integer value2) {
            addCriterion("collect_news not between", value1, value2, "collectNews");
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