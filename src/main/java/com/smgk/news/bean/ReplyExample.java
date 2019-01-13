package com.smgk.news.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReplyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReplyExample() {
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

        public Criteria andReplyIdIsNull() {
            addCriterion("reply_id is null");
            return (Criteria) this;
        }

        public Criteria andReplyIdIsNotNull() {
            addCriterion("reply_id is not null");
            return (Criteria) this;
        }

        public Criteria andReplyIdEqualTo(Integer value) {
            addCriterion("reply_id =", value, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdNotEqualTo(Integer value) {
            addCriterion("reply_id <>", value, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdGreaterThan(Integer value) {
            addCriterion("reply_id >", value, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("reply_id >=", value, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdLessThan(Integer value) {
            addCriterion("reply_id <", value, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdLessThanOrEqualTo(Integer value) {
            addCriterion("reply_id <=", value, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdIn(List<Integer> values) {
            addCriterion("reply_id in", values, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdNotIn(List<Integer> values) {
            addCriterion("reply_id not in", values, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdBetween(Integer value1, Integer value2) {
            addCriterion("reply_id between", value1, value2, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("reply_id not between", value1, value2, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyUserIsNull() {
            addCriterion("reply_user is null");
            return (Criteria) this;
        }

        public Criteria andReplyUserIsNotNull() {
            addCriterion("reply_user is not null");
            return (Criteria) this;
        }

        public Criteria andReplyUserEqualTo(Integer value) {
            addCriterion("reply_user =", value, "replyUser");
            return (Criteria) this;
        }

        public Criteria andReplyUserNotEqualTo(Integer value) {
            addCriterion("reply_user <>", value, "replyUser");
            return (Criteria) this;
        }

        public Criteria andReplyUserGreaterThan(Integer value) {
            addCriterion("reply_user >", value, "replyUser");
            return (Criteria) this;
        }

        public Criteria andReplyUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("reply_user >=", value, "replyUser");
            return (Criteria) this;
        }

        public Criteria andReplyUserLessThan(Integer value) {
            addCriterion("reply_user <", value, "replyUser");
            return (Criteria) this;
        }

        public Criteria andReplyUserLessThanOrEqualTo(Integer value) {
            addCriterion("reply_user <=", value, "replyUser");
            return (Criteria) this;
        }

        public Criteria andReplyUserIn(List<Integer> values) {
            addCriterion("reply_user in", values, "replyUser");
            return (Criteria) this;
        }

        public Criteria andReplyUserNotIn(List<Integer> values) {
            addCriterion("reply_user not in", values, "replyUser");
            return (Criteria) this;
        }

        public Criteria andReplyUserBetween(Integer value1, Integer value2) {
            addCriterion("reply_user between", value1, value2, "replyUser");
            return (Criteria) this;
        }

        public Criteria andReplyUserNotBetween(Integer value1, Integer value2) {
            addCriterion("reply_user not between", value1, value2, "replyUser");
            return (Criteria) this;
        }

        public Criteria andReplyToUserIsNull() {
            addCriterion("reply_to_user is null");
            return (Criteria) this;
        }

        public Criteria andReplyToUserIsNotNull() {
            addCriterion("reply_to_user is not null");
            return (Criteria) this;
        }

        public Criteria andReplyToUserEqualTo(Integer value) {
            addCriterion("reply_to_user =", value, "replyToUser");
            return (Criteria) this;
        }

        public Criteria andReplyToUserNotEqualTo(Integer value) {
            addCriterion("reply_to_user <>", value, "replyToUser");
            return (Criteria) this;
        }

        public Criteria andReplyToUserGreaterThan(Integer value) {
            addCriterion("reply_to_user >", value, "replyToUser");
            return (Criteria) this;
        }

        public Criteria andReplyToUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("reply_to_user >=", value, "replyToUser");
            return (Criteria) this;
        }

        public Criteria andReplyToUserLessThan(Integer value) {
            addCriterion("reply_to_user <", value, "replyToUser");
            return (Criteria) this;
        }

        public Criteria andReplyToUserLessThanOrEqualTo(Integer value) {
            addCriterion("reply_to_user <=", value, "replyToUser");
            return (Criteria) this;
        }

        public Criteria andReplyToUserIn(List<Integer> values) {
            addCriterion("reply_to_user in", values, "replyToUser");
            return (Criteria) this;
        }

        public Criteria andReplyToUserNotIn(List<Integer> values) {
            addCriterion("reply_to_user not in", values, "replyToUser");
            return (Criteria) this;
        }

        public Criteria andReplyToUserBetween(Integer value1, Integer value2) {
            addCriterion("reply_to_user between", value1, value2, "replyToUser");
            return (Criteria) this;
        }

        public Criteria andReplyToUserNotBetween(Integer value1, Integer value2) {
            addCriterion("reply_to_user not between", value1, value2, "replyToUser");
            return (Criteria) this;
        }

        public Criteria andReplyCommentsIsNull() {
            addCriterion("reply_comments is null");
            return (Criteria) this;
        }

        public Criteria andReplyCommentsIsNotNull() {
            addCriterion("reply_comments is not null");
            return (Criteria) this;
        }

        public Criteria andReplyCommentsEqualTo(Integer value) {
            addCriterion("reply_comments =", value, "replyComments");
            return (Criteria) this;
        }

        public Criteria andReplyCommentsNotEqualTo(Integer value) {
            addCriterion("reply_comments <>", value, "replyComments");
            return (Criteria) this;
        }

        public Criteria andReplyCommentsGreaterThan(Integer value) {
            addCriterion("reply_comments >", value, "replyComments");
            return (Criteria) this;
        }

        public Criteria andReplyCommentsGreaterThanOrEqualTo(Integer value) {
            addCriterion("reply_comments >=", value, "replyComments");
            return (Criteria) this;
        }

        public Criteria andReplyCommentsLessThan(Integer value) {
            addCriterion("reply_comments <", value, "replyComments");
            return (Criteria) this;
        }

        public Criteria andReplyCommentsLessThanOrEqualTo(Integer value) {
            addCriterion("reply_comments <=", value, "replyComments");
            return (Criteria) this;
        }

        public Criteria andReplyCommentsIn(List<Integer> values) {
            addCriterion("reply_comments in", values, "replyComments");
            return (Criteria) this;
        }

        public Criteria andReplyCommentsNotIn(List<Integer> values) {
            addCriterion("reply_comments not in", values, "replyComments");
            return (Criteria) this;
        }

        public Criteria andReplyCommentsBetween(Integer value1, Integer value2) {
            addCriterion("reply_comments between", value1, value2, "replyComments");
            return (Criteria) this;
        }

        public Criteria andReplyCommentsNotBetween(Integer value1, Integer value2) {
            addCriterion("reply_comments not between", value1, value2, "replyComments");
            return (Criteria) this;
        }

        public Criteria andReplyTimeIsNull() {
            addCriterion("reply_time is null");
            return (Criteria) this;
        }

        public Criteria andReplyTimeIsNotNull() {
            addCriterion("reply_time is not null");
            return (Criteria) this;
        }

        public Criteria andReplyTimeEqualTo(Date value) {
            addCriterion("reply_time =", value, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeNotEqualTo(Date value) {
            addCriterion("reply_time <>", value, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeGreaterThan(Date value) {
            addCriterion("reply_time >", value, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("reply_time >=", value, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeLessThan(Date value) {
            addCriterion("reply_time <", value, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeLessThanOrEqualTo(Date value) {
            addCriterion("reply_time <=", value, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeIn(List<Date> values) {
            addCriterion("reply_time in", values, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeNotIn(List<Date> values) {
            addCriterion("reply_time not in", values, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeBetween(Date value1, Date value2) {
            addCriterion("reply_time between", value1, value2, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeNotBetween(Date value1, Date value2) {
            addCriterion("reply_time not between", value1, value2, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyContentIsNull() {
            addCriterion("reply_content is null");
            return (Criteria) this;
        }

        public Criteria andReplyContentIsNotNull() {
            addCriterion("reply_content is not null");
            return (Criteria) this;
        }

        public Criteria andReplyContentEqualTo(String value) {
            addCriterion("reply_content =", value, "replyContent");
            return (Criteria) this;
        }

        public Criteria andReplyContentNotEqualTo(String value) {
            addCriterion("reply_content <>", value, "replyContent");
            return (Criteria) this;
        }

        public Criteria andReplyContentGreaterThan(String value) {
            addCriterion("reply_content >", value, "replyContent");
            return (Criteria) this;
        }

        public Criteria andReplyContentGreaterThanOrEqualTo(String value) {
            addCriterion("reply_content >=", value, "replyContent");
            return (Criteria) this;
        }

        public Criteria andReplyContentLessThan(String value) {
            addCriterion("reply_content <", value, "replyContent");
            return (Criteria) this;
        }

        public Criteria andReplyContentLessThanOrEqualTo(String value) {
            addCriterion("reply_content <=", value, "replyContent");
            return (Criteria) this;
        }

        public Criteria andReplyContentLike(String value) {
            addCriterion("reply_content like", value, "replyContent");
            return (Criteria) this;
        }

        public Criteria andReplyContentNotLike(String value) {
            addCriterion("reply_content not like", value, "replyContent");
            return (Criteria) this;
        }

        public Criteria andReplyContentIn(List<String> values) {
            addCriterion("reply_content in", values, "replyContent");
            return (Criteria) this;
        }

        public Criteria andReplyContentNotIn(List<String> values) {
            addCriterion("reply_content not in", values, "replyContent");
            return (Criteria) this;
        }

        public Criteria andReplyContentBetween(String value1, String value2) {
            addCriterion("reply_content between", value1, value2, "replyContent");
            return (Criteria) this;
        }

        public Criteria andReplyContentNotBetween(String value1, String value2) {
            addCriterion("reply_content not between", value1, value2, "replyContent");
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