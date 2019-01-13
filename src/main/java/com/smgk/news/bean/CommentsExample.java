package com.smgk.news.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CommentsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommentsExample() {
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

        public Criteria andCommentsIdIsNull() {
            addCriterion("comments_id is null");
            return (Criteria) this;
        }

        public Criteria andCommentsIdIsNotNull() {
            addCriterion("comments_id is not null");
            return (Criteria) this;
        }

        public Criteria andCommentsIdEqualTo(Integer value) {
            addCriterion("comments_id =", value, "commentsId");
            return (Criteria) this;
        }

        public Criteria andCommentsIdNotEqualTo(Integer value) {
            addCriterion("comments_id <>", value, "commentsId");
            return (Criteria) this;
        }

        public Criteria andCommentsIdGreaterThan(Integer value) {
            addCriterion("comments_id >", value, "commentsId");
            return (Criteria) this;
        }

        public Criteria andCommentsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("comments_id >=", value, "commentsId");
            return (Criteria) this;
        }

        public Criteria andCommentsIdLessThan(Integer value) {
            addCriterion("comments_id <", value, "commentsId");
            return (Criteria) this;
        }

        public Criteria andCommentsIdLessThanOrEqualTo(Integer value) {
            addCriterion("comments_id <=", value, "commentsId");
            return (Criteria) this;
        }

        public Criteria andCommentsIdIn(List<Integer> values) {
            addCriterion("comments_id in", values, "commentsId");
            return (Criteria) this;
        }

        public Criteria andCommentsIdNotIn(List<Integer> values) {
            addCriterion("comments_id not in", values, "commentsId");
            return (Criteria) this;
        }

        public Criteria andCommentsIdBetween(Integer value1, Integer value2) {
            addCriterion("comments_id between", value1, value2, "commentsId");
            return (Criteria) this;
        }

        public Criteria andCommentsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("comments_id not between", value1, value2, "commentsId");
            return (Criteria) this;
        }

        public Criteria andCommentsContentIsNull() {
            addCriterion("comments_content is null");
            return (Criteria) this;
        }

        public Criteria andCommentsContentIsNotNull() {
            addCriterion("comments_content is not null");
            return (Criteria) this;
        }

        public Criteria andCommentsContentEqualTo(String value) {
            addCriterion("comments_content =", value, "commentsContent");
            return (Criteria) this;
        }

        public Criteria andCommentsContentNotEqualTo(String value) {
            addCriterion("comments_content <>", value, "commentsContent");
            return (Criteria) this;
        }

        public Criteria andCommentsContentGreaterThan(String value) {
            addCriterion("comments_content >", value, "commentsContent");
            return (Criteria) this;
        }

        public Criteria andCommentsContentGreaterThanOrEqualTo(String value) {
            addCriterion("comments_content >=", value, "commentsContent");
            return (Criteria) this;
        }

        public Criteria andCommentsContentLessThan(String value) {
            addCriterion("comments_content <", value, "commentsContent");
            return (Criteria) this;
        }

        public Criteria andCommentsContentLessThanOrEqualTo(String value) {
            addCriterion("comments_content <=", value, "commentsContent");
            return (Criteria) this;
        }

        public Criteria andCommentsContentLike(String value) {
            addCriterion("comments_content like", value, "commentsContent");
            return (Criteria) this;
        }

        public Criteria andCommentsContentNotLike(String value) {
            addCriterion("comments_content not like", value, "commentsContent");
            return (Criteria) this;
        }

        public Criteria andCommentsContentIn(List<String> values) {
            addCriterion("comments_content in", values, "commentsContent");
            return (Criteria) this;
        }

        public Criteria andCommentsContentNotIn(List<String> values) {
            addCriterion("comments_content not in", values, "commentsContent");
            return (Criteria) this;
        }

        public Criteria andCommentsContentBetween(String value1, String value2) {
            addCriterion("comments_content between", value1, value2, "commentsContent");
            return (Criteria) this;
        }

        public Criteria andCommentsContentNotBetween(String value1, String value2) {
            addCriterion("comments_content not between", value1, value2, "commentsContent");
            return (Criteria) this;
        }

        public Criteria andCommentsTimeIsNull() {
            addCriterion("comments_time is null");
            return (Criteria) this;
        }

        public Criteria andCommentsTimeIsNotNull() {
            addCriterion("comments_time is not null");
            return (Criteria) this;
        }

        public Criteria andCommentsTimeEqualTo(Date value) {
            addCriterion("comments_time =", value, "commentsTime");
            return (Criteria) this;
        }

        public Criteria andCommentsTimeNotEqualTo(Date value) {
            addCriterion("comments_time <>", value, "commentsTime");
            return (Criteria) this;
        }

        public Criteria andCommentsTimeGreaterThan(Date value) {
            addCriterion("comments_time >", value, "commentsTime");
            return (Criteria) this;
        }

        public Criteria andCommentsTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("comments_time >=", value, "commentsTime");
            return (Criteria) this;
        }

        public Criteria andCommentsTimeLessThan(Date value) {
            addCriterion("comments_time <", value, "commentsTime");
            return (Criteria) this;
        }

        public Criteria andCommentsTimeLessThanOrEqualTo(Date value) {
            addCriterion("comments_time <=", value, "commentsTime");
            return (Criteria) this;
        }

        public Criteria andCommentsTimeIn(List<Date> values) {
            addCriterion("comments_time in", values, "commentsTime");
            return (Criteria) this;
        }

        public Criteria andCommentsTimeNotIn(List<Date> values) {
            addCriterion("comments_time not in", values, "commentsTime");
            return (Criteria) this;
        }

        public Criteria andCommentsTimeBetween(Date value1, Date value2) {
            addCriterion("comments_time between", value1, value2, "commentsTime");
            return (Criteria) this;
        }

        public Criteria andCommentsTimeNotBetween(Date value1, Date value2) {
            addCriterion("comments_time not between", value1, value2, "commentsTime");
            return (Criteria) this;
        }

        public Criteria andCommentsUserIsNull() {
            addCriterion("comments_user is null");
            return (Criteria) this;
        }

        public Criteria andCommentsUserIsNotNull() {
            addCriterion("comments_user is not null");
            return (Criteria) this;
        }

        public Criteria andCommentsUserEqualTo(Integer value) {
            addCriterion("comments_user =", value, "commentsUser");
            return (Criteria) this;
        }

        public Criteria andCommentsUserNotEqualTo(Integer value) {
            addCriterion("comments_user <>", value, "commentsUser");
            return (Criteria) this;
        }

        public Criteria andCommentsUserGreaterThan(Integer value) {
            addCriterion("comments_user >", value, "commentsUser");
            return (Criteria) this;
        }

        public Criteria andCommentsUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("comments_user >=", value, "commentsUser");
            return (Criteria) this;
        }

        public Criteria andCommentsUserLessThan(Integer value) {
            addCriterion("comments_user <", value, "commentsUser");
            return (Criteria) this;
        }

        public Criteria andCommentsUserLessThanOrEqualTo(Integer value) {
            addCriterion("comments_user <=", value, "commentsUser");
            return (Criteria) this;
        }

        public Criteria andCommentsUserIn(List<Integer> values) {
            addCriterion("comments_user in", values, "commentsUser");
            return (Criteria) this;
        }

        public Criteria andCommentsUserNotIn(List<Integer> values) {
            addCriterion("comments_user not in", values, "commentsUser");
            return (Criteria) this;
        }

        public Criteria andCommentsUserBetween(Integer value1, Integer value2) {
            addCriterion("comments_user between", value1, value2, "commentsUser");
            return (Criteria) this;
        }

        public Criteria andCommentsUserNotBetween(Integer value1, Integer value2) {
            addCriterion("comments_user not between", value1, value2, "commentsUser");
            return (Criteria) this;
        }

        public Criteria andCommentsNewsIsNull() {
            addCriterion("comments_news is null");
            return (Criteria) this;
        }

        public Criteria andCommentsNewsIsNotNull() {
            addCriterion("comments_news is not null");
            return (Criteria) this;
        }

        public Criteria andCommentsNewsEqualTo(Integer value) {
            addCriterion("comments_news =", value, "commentsNews");
            return (Criteria) this;
        }

        public Criteria andCommentsNewsNotEqualTo(Integer value) {
            addCriterion("comments_news <>", value, "commentsNews");
            return (Criteria) this;
        }

        public Criteria andCommentsNewsGreaterThan(Integer value) {
            addCriterion("comments_news >", value, "commentsNews");
            return (Criteria) this;
        }

        public Criteria andCommentsNewsGreaterThanOrEqualTo(Integer value) {
            addCriterion("comments_news >=", value, "commentsNews");
            return (Criteria) this;
        }

        public Criteria andCommentsNewsLessThan(Integer value) {
            addCriterion("comments_news <", value, "commentsNews");
            return (Criteria) this;
        }

        public Criteria andCommentsNewsLessThanOrEqualTo(Integer value) {
            addCriterion("comments_news <=", value, "commentsNews");
            return (Criteria) this;
        }

        public Criteria andCommentsNewsIn(List<Integer> values) {
            addCriterion("comments_news in", values, "commentsNews");
            return (Criteria) this;
        }

        public Criteria andCommentsNewsNotIn(List<Integer> values) {
            addCriterion("comments_news not in", values, "commentsNews");
            return (Criteria) this;
        }

        public Criteria andCommentsNewsBetween(Integer value1, Integer value2) {
            addCriterion("comments_news between", value1, value2, "commentsNews");
            return (Criteria) this;
        }

        public Criteria andCommentsNewsNotBetween(Integer value1, Integer value2) {
            addCriterion("comments_news not between", value1, value2, "commentsNews");
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