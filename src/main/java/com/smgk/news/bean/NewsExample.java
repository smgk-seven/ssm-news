package com.smgk.news.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NewsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NewsExample() {
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

        public Criteria andNewsIdIsNull() {
            addCriterion("news_id is null");
            return (Criteria) this;
        }

        public Criteria andNewsIdIsNotNull() {
            addCriterion("news_id is not null");
            return (Criteria) this;
        }

        public Criteria andNewsIdEqualTo(Integer value) {
            addCriterion("news_id =", value, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdNotEqualTo(Integer value) {
            addCriterion("news_id <>", value, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdGreaterThan(Integer value) {
            addCriterion("news_id >", value, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("news_id >=", value, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdLessThan(Integer value) {
            addCriterion("news_id <", value, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdLessThanOrEqualTo(Integer value) {
            addCriterion("news_id <=", value, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdIn(List<Integer> values) {
            addCriterion("news_id in", values, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdNotIn(List<Integer> values) {
            addCriterion("news_id not in", values, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdBetween(Integer value1, Integer value2) {
            addCriterion("news_id between", value1, value2, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("news_id not between", value1, value2, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsTitleIsNull() {
            addCriterion("news_title is null");
            return (Criteria) this;
        }

        public Criteria andNewsTitleIsNotNull() {
            addCriterion("news_title is not null");
            return (Criteria) this;
        }

        public Criteria andNewsTitleEqualTo(String value) {
            addCriterion("news_title =", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleNotEqualTo(String value) {
            addCriterion("news_title <>", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleGreaterThan(String value) {
            addCriterion("news_title >", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleGreaterThanOrEqualTo(String value) {
            addCriterion("news_title >=", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleLessThan(String value) {
            addCriterion("news_title <", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleLessThanOrEqualTo(String value) {
            addCriterion("news_title <=", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleLike(String value) {
            addCriterion("news_title like", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleNotLike(String value) {
            addCriterion("news_title not like", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleIn(List<String> values) {
            addCriterion("news_title in", values, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleNotIn(List<String> values) {
            addCriterion("news_title not in", values, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleBetween(String value1, String value2) {
            addCriterion("news_title between", value1, value2, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleNotBetween(String value1, String value2) {
            addCriterion("news_title not between", value1, value2, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsContentIsNull() {
            addCriterion("news_content is null");
            return (Criteria) this;
        }

        public Criteria andNewsContentIsNotNull() {
            addCriterion("news_content is not null");
            return (Criteria) this;
        }

        public Criteria andNewsContentEqualTo(String value) {
            addCriterion("news_content =", value, "newsContent");
            return (Criteria) this;
        }

        public Criteria andNewsContentNotEqualTo(String value) {
            addCriterion("news_content <>", value, "newsContent");
            return (Criteria) this;
        }

        public Criteria andNewsContentGreaterThan(String value) {
            addCriterion("news_content >", value, "newsContent");
            return (Criteria) this;
        }

        public Criteria andNewsContentGreaterThanOrEqualTo(String value) {
            addCriterion("news_content >=", value, "newsContent");
            return (Criteria) this;
        }

        public Criteria andNewsContentLessThan(String value) {
            addCriterion("news_content <", value, "newsContent");
            return (Criteria) this;
        }

        public Criteria andNewsContentLessThanOrEqualTo(String value) {
            addCriterion("news_content <=", value, "newsContent");
            return (Criteria) this;
        }

        public Criteria andNewsContentLike(String value) {
            addCriterion("news_content like", value, "newsContent");
            return (Criteria) this;
        }

        public Criteria andNewsContentNotLike(String value) {
            addCriterion("news_content not like", value, "newsContent");
            return (Criteria) this;
        }

        public Criteria andNewsContentIn(List<String> values) {
            addCriterion("news_content in", values, "newsContent");
            return (Criteria) this;
        }

        public Criteria andNewsContentNotIn(List<String> values) {
            addCriterion("news_content not in", values, "newsContent");
            return (Criteria) this;
        }

        public Criteria andNewsContentBetween(String value1, String value2) {
            addCriterion("news_content between", value1, value2, "newsContent");
            return (Criteria) this;
        }

        public Criteria andNewsContentNotBetween(String value1, String value2) {
            addCriterion("news_content not between", value1, value2, "newsContent");
            return (Criteria) this;
        }

        public Criteria andNewsTimeIsNull() {
            addCriterion("news_time is null");
            return (Criteria) this;
        }

        public Criteria andNewsTimeIsNotNull() {
            addCriterion("news_time is not null");
            return (Criteria) this;
        }

        public Criteria andNewsTimeEqualTo(Date value) {
            addCriterion("news_time =", value, "newsTime");
            return (Criteria) this;
        }

        public Criteria andNewsTimeNotEqualTo(Date value) {
            addCriterion("news_time <>", value, "newsTime");
            return (Criteria) this;
        }

        public Criteria andNewsTimeGreaterThan(Date value) {
            addCriterion("news_time >", value, "newsTime");
            return (Criteria) this;
        }

        public Criteria andNewsTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("news_time >=", value, "newsTime");
            return (Criteria) this;
        }

        public Criteria andNewsTimeLessThan(Date value) {
            addCriterion("news_time <", value, "newsTime");
            return (Criteria) this;
        }

        public Criteria andNewsTimeLessThanOrEqualTo(Date value) {
            addCriterion("news_time <=", value, "newsTime");
            return (Criteria) this;
        }

        public Criteria andNewsTimeIn(List<Date> values) {
            addCriterion("news_time in", values, "newsTime");
            return (Criteria) this;
        }

        public Criteria andNewsTimeNotIn(List<Date> values) {
            addCriterion("news_time not in", values, "newsTime");
            return (Criteria) this;
        }

        public Criteria andNewsTimeBetween(Date value1, Date value2) {
            addCriterion("news_time between", value1, value2, "newsTime");
            return (Criteria) this;
        }

        public Criteria andNewsTimeNotBetween(Date value1, Date value2) {
            addCriterion("news_time not between", value1, value2, "newsTime");
            return (Criteria) this;
        }

        public Criteria andNewsSummaryIsNull() {
            addCriterion("news_summary is null");
            return (Criteria) this;
        }

        public Criteria andNewsSummaryIsNotNull() {
            addCriterion("news_summary is not null");
            return (Criteria) this;
        }

        public Criteria andNewsSummaryEqualTo(String value) {
            addCriterion("news_summary =", value, "newsSummary");
            return (Criteria) this;
        }

        public Criteria andNewsSummaryNotEqualTo(String value) {
            addCriterion("news_summary <>", value, "newsSummary");
            return (Criteria) this;
        }

        public Criteria andNewsSummaryGreaterThan(String value) {
            addCriterion("news_summary >", value, "newsSummary");
            return (Criteria) this;
        }

        public Criteria andNewsSummaryGreaterThanOrEqualTo(String value) {
            addCriterion("news_summary >=", value, "newsSummary");
            return (Criteria) this;
        }

        public Criteria andNewsSummaryLessThan(String value) {
            addCriterion("news_summary <", value, "newsSummary");
            return (Criteria) this;
        }

        public Criteria andNewsSummaryLessThanOrEqualTo(String value) {
            addCriterion("news_summary <=", value, "newsSummary");
            return (Criteria) this;
        }

        public Criteria andNewsSummaryLike(String value) {
            addCriterion("news_summary like", value, "newsSummary");
            return (Criteria) this;
        }

        public Criteria andNewsSummaryNotLike(String value) {
            addCriterion("news_summary not like", value, "newsSummary");
            return (Criteria) this;
        }

        public Criteria andNewsSummaryIn(List<String> values) {
            addCriterion("news_summary in", values, "newsSummary");
            return (Criteria) this;
        }

        public Criteria andNewsSummaryNotIn(List<String> values) {
            addCriterion("news_summary not in", values, "newsSummary");
            return (Criteria) this;
        }

        public Criteria andNewsSummaryBetween(String value1, String value2) {
            addCriterion("news_summary between", value1, value2, "newsSummary");
            return (Criteria) this;
        }

        public Criteria andNewsSummaryNotBetween(String value1, String value2) {
            addCriterion("news_summary not between", value1, value2, "newsSummary");
            return (Criteria) this;
        }

        public Criteria andNewsTopImgIsNull() {
            addCriterion("news_top_img is null");
            return (Criteria) this;
        }

        public Criteria andNewsTopImgIsNotNull() {
            addCriterion("news_top_img is not null");
            return (Criteria) this;
        }

        public Criteria andNewsTopImgEqualTo(String value) {
            addCriterion("news_top_img =", value, "newsTopImg");
            return (Criteria) this;
        }

        public Criteria andNewsTopImgNotEqualTo(String value) {
            addCriterion("news_top_img <>", value, "newsTopImg");
            return (Criteria) this;
        }

        public Criteria andNewsTopImgGreaterThan(String value) {
            addCriterion("news_top_img >", value, "newsTopImg");
            return (Criteria) this;
        }

        public Criteria andNewsTopImgGreaterThanOrEqualTo(String value) {
            addCriterion("news_top_img >=", value, "newsTopImg");
            return (Criteria) this;
        }

        public Criteria andNewsTopImgLessThan(String value) {
            addCriterion("news_top_img <", value, "newsTopImg");
            return (Criteria) this;
        }

        public Criteria andNewsTopImgLessThanOrEqualTo(String value) {
            addCriterion("news_top_img <=", value, "newsTopImg");
            return (Criteria) this;
        }

        public Criteria andNewsTopImgLike(String value) {
            addCriterion("news_top_img like", value, "newsTopImg");
            return (Criteria) this;
        }

        public Criteria andNewsTopImgNotLike(String value) {
            addCriterion("news_top_img not like", value, "newsTopImg");
            return (Criteria) this;
        }

        public Criteria andNewsTopImgIn(List<String> values) {
            addCriterion("news_top_img in", values, "newsTopImg");
            return (Criteria) this;
        }

        public Criteria andNewsTopImgNotIn(List<String> values) {
            addCriterion("news_top_img not in", values, "newsTopImg");
            return (Criteria) this;
        }

        public Criteria andNewsTopImgBetween(String value1, String value2) {
            addCriterion("news_top_img between", value1, value2, "newsTopImg");
            return (Criteria) this;
        }

        public Criteria andNewsTopImgNotBetween(String value1, String value2) {
            addCriterion("news_top_img not between", value1, value2, "newsTopImg");
            return (Criteria) this;
        }

        public Criteria andNewsUserIsNull() {
            addCriterion("news_user is null");
            return (Criteria) this;
        }

        public Criteria andNewsUserIsNotNull() {
            addCriterion("news_user is not null");
            return (Criteria) this;
        }

        public Criteria andNewsUserEqualTo(Integer value) {
            addCriterion("news_user =", value, "newsUser");
            return (Criteria) this;
        }

        public Criteria andNewsUserNotEqualTo(Integer value) {
            addCriterion("news_user <>", value, "newsUser");
            return (Criteria) this;
        }

        public Criteria andNewsUserGreaterThan(Integer value) {
            addCriterion("news_user >", value, "newsUser");
            return (Criteria) this;
        }

        public Criteria andNewsUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("news_user >=", value, "newsUser");
            return (Criteria) this;
        }

        public Criteria andNewsUserLessThan(Integer value) {
            addCriterion("news_user <", value, "newsUser");
            return (Criteria) this;
        }

        public Criteria andNewsUserLessThanOrEqualTo(Integer value) {
            addCriterion("news_user <=", value, "newsUser");
            return (Criteria) this;
        }

        public Criteria andNewsUserIn(List<Integer> values) {
            addCriterion("news_user in", values, "newsUser");
            return (Criteria) this;
        }

        public Criteria andNewsUserNotIn(List<Integer> values) {
            addCriterion("news_user not in", values, "newsUser");
            return (Criteria) this;
        }

        public Criteria andNewsUserBetween(Integer value1, Integer value2) {
            addCriterion("news_user between", value1, value2, "newsUser");
            return (Criteria) this;
        }

        public Criteria andNewsUserNotBetween(Integer value1, Integer value2) {
            addCriterion("news_user not between", value1, value2, "newsUser");
            return (Criteria) this;
        }

        public Criteria andNewsViewCountIsNull() {
            addCriterion("news_view_count is null");
            return (Criteria) this;
        }

        public Criteria andNewsViewCountIsNotNull() {
            addCriterion("news_view_count is not null");
            return (Criteria) this;
        }

        public Criteria andNewsViewCountEqualTo(Integer value) {
            addCriterion("news_view_count =", value, "newsViewCount");
            return (Criteria) this;
        }

        public Criteria andNewsViewCountNotEqualTo(Integer value) {
            addCriterion("news_view_count <>", value, "newsViewCount");
            return (Criteria) this;
        }

        public Criteria andNewsViewCountGreaterThan(Integer value) {
            addCriterion("news_view_count >", value, "newsViewCount");
            return (Criteria) this;
        }

        public Criteria andNewsViewCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("news_view_count >=", value, "newsViewCount");
            return (Criteria) this;
        }

        public Criteria andNewsViewCountLessThan(Integer value) {
            addCriterion("news_view_count <", value, "newsViewCount");
            return (Criteria) this;
        }

        public Criteria andNewsViewCountLessThanOrEqualTo(Integer value) {
            addCriterion("news_view_count <=", value, "newsViewCount");
            return (Criteria) this;
        }

        public Criteria andNewsViewCountIn(List<Integer> values) {
            addCriterion("news_view_count in", values, "newsViewCount");
            return (Criteria) this;
        }

        public Criteria andNewsViewCountNotIn(List<Integer> values) {
            addCriterion("news_view_count not in", values, "newsViewCount");
            return (Criteria) this;
        }

        public Criteria andNewsViewCountBetween(Integer value1, Integer value2) {
            addCriterion("news_view_count between", value1, value2, "newsViewCount");
            return (Criteria) this;
        }

        public Criteria andNewsViewCountNotBetween(Integer value1, Integer value2) {
            addCriterion("news_view_count not between", value1, value2, "newsViewCount");
            return (Criteria) this;
        }

        public Criteria andNewsGenreIsNull() {
            addCriterion("news_genre is null");
            return (Criteria) this;
        }

        public Criteria andNewsGenreIsNotNull() {
            addCriterion("news_genre is not null");
            return (Criteria) this;
        }

        public Criteria andNewsGenreEqualTo(Integer value) {
            addCriterion("news_genre =", value, "newsGenre");
            return (Criteria) this;
        }

        public Criteria andNewsGenreNotEqualTo(Integer value) {
            addCriterion("news_genre <>", value, "newsGenre");
            return (Criteria) this;
        }

        public Criteria andNewsGenreGreaterThan(Integer value) {
            addCriterion("news_genre >", value, "newsGenre");
            return (Criteria) this;
        }

        public Criteria andNewsGenreGreaterThanOrEqualTo(Integer value) {
            addCriterion("news_genre >=", value, "newsGenre");
            return (Criteria) this;
        }

        public Criteria andNewsGenreLessThan(Integer value) {
            addCriterion("news_genre <", value, "newsGenre");
            return (Criteria) this;
        }

        public Criteria andNewsGenreLessThanOrEqualTo(Integer value) {
            addCriterion("news_genre <=", value, "newsGenre");
            return (Criteria) this;
        }

        public Criteria andNewsGenreIn(List<Integer> values) {
            addCriterion("news_genre in", values, "newsGenre");
            return (Criteria) this;
        }

        public Criteria andNewsGenreNotIn(List<Integer> values) {
            addCriterion("news_genre not in", values, "newsGenre");
            return (Criteria) this;
        }

        public Criteria andNewsGenreBetween(Integer value1, Integer value2) {
            addCriterion("news_genre between", value1, value2, "newsGenre");
            return (Criteria) this;
        }

        public Criteria andNewsGenreNotBetween(Integer value1, Integer value2) {
            addCriterion("news_genre not between", value1, value2, "newsGenre");
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