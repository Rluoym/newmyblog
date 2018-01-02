package com.myblog.po;

import java.util.ArrayList;
import java.util.List;

public class LikeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LikeExample() {
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

        public Criteria andLikeCountIsNull() {
            addCriterion("like_count is null");
            return (Criteria) this;
        }

        public Criteria andLikeCountIsNotNull() {
            addCriterion("like_count is not null");
            return (Criteria) this;
        }

        public Criteria andLikeCountEqualTo(Integer value) {
            addCriterion("like_count =", value, "likeCount");
            return (Criteria) this;
        }

        public Criteria andLikeCountNotEqualTo(Integer value) {
            addCriterion("like_count <>", value, "likeCount");
            return (Criteria) this;
        }

        public Criteria andLikeCountGreaterThan(Integer value) {
            addCriterion("like_count >", value, "likeCount");
            return (Criteria) this;
        }

        public Criteria andLikeCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("like_count >=", value, "likeCount");
            return (Criteria) this;
        }

        public Criteria andLikeCountLessThan(Integer value) {
            addCriterion("like_count <", value, "likeCount");
            return (Criteria) this;
        }

        public Criteria andLikeCountLessThanOrEqualTo(Integer value) {
            addCriterion("like_count <=", value, "likeCount");
            return (Criteria) this;
        }

        public Criteria andLikeCountIn(List<Integer> values) {
            addCriterion("like_count in", values, "likeCount");
            return (Criteria) this;
        }

        public Criteria andLikeCountNotIn(List<Integer> values) {
            addCriterion("like_count not in", values, "likeCount");
            return (Criteria) this;
        }

        public Criteria andLikeCountBetween(Integer value1, Integer value2) {
            addCriterion("like_count between", value1, value2, "likeCount");
            return (Criteria) this;
        }

        public Criteria andLikeCountNotBetween(Integer value1, Integer value2) {
            addCriterion("like_count not between", value1, value2, "likeCount");
            return (Criteria) this;
        }

        public Criteria andDislikeCountIsNull() {
            addCriterion("dislike_count is null");
            return (Criteria) this;
        }

        public Criteria andDislikeCountIsNotNull() {
            addCriterion("dislike_count is not null");
            return (Criteria) this;
        }

        public Criteria andDislikeCountEqualTo(Integer value) {
            addCriterion("dislike_count =", value, "dislikeCount");
            return (Criteria) this;
        }

        public Criteria andDislikeCountNotEqualTo(Integer value) {
            addCriterion("dislike_count <>", value, "dislikeCount");
            return (Criteria) this;
        }

        public Criteria andDislikeCountGreaterThan(Integer value) {
            addCriterion("dislike_count >", value, "dislikeCount");
            return (Criteria) this;
        }

        public Criteria andDislikeCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("dislike_count >=", value, "dislikeCount");
            return (Criteria) this;
        }

        public Criteria andDislikeCountLessThan(Integer value) {
            addCriterion("dislike_count <", value, "dislikeCount");
            return (Criteria) this;
        }

        public Criteria andDislikeCountLessThanOrEqualTo(Integer value) {
            addCriterion("dislike_count <=", value, "dislikeCount");
            return (Criteria) this;
        }

        public Criteria andDislikeCountIn(List<Integer> values) {
            addCriterion("dislike_count in", values, "dislikeCount");
            return (Criteria) this;
        }

        public Criteria andDislikeCountNotIn(List<Integer> values) {
            addCriterion("dislike_count not in", values, "dislikeCount");
            return (Criteria) this;
        }

        public Criteria andDislikeCountBetween(Integer value1, Integer value2) {
            addCriterion("dislike_count between", value1, value2, "dislikeCount");
            return (Criteria) this;
        }

        public Criteria andDislikeCountNotBetween(Integer value1, Integer value2) {
            addCriterion("dislike_count not between", value1, value2, "dislikeCount");
            return (Criteria) this;
        }

        public Criteria andLikeMemoIsNull() {
            addCriterion("like_memo is null");
            return (Criteria) this;
        }

        public Criteria andLikeMemoIsNotNull() {
            addCriterion("like_memo is not null");
            return (Criteria) this;
        }

        public Criteria andLikeMemoEqualTo(String value) {
            addCriterion("like_memo =", value, "likeMemo");
            return (Criteria) this;
        }

        public Criteria andLikeMemoNotEqualTo(String value) {
            addCriterion("like_memo <>", value, "likeMemo");
            return (Criteria) this;
        }

        public Criteria andLikeMemoGreaterThan(String value) {
            addCriterion("like_memo >", value, "likeMemo");
            return (Criteria) this;
        }

        public Criteria andLikeMemoGreaterThanOrEqualTo(String value) {
            addCriterion("like_memo >=", value, "likeMemo");
            return (Criteria) this;
        }

        public Criteria andLikeMemoLessThan(String value) {
            addCriterion("like_memo <", value, "likeMemo");
            return (Criteria) this;
        }

        public Criteria andLikeMemoLessThanOrEqualTo(String value) {
            addCriterion("like_memo <=", value, "likeMemo");
            return (Criteria) this;
        }

        public Criteria andLikeMemoLike(String value) {
            addCriterion("like_memo like", value, "likeMemo");
            return (Criteria) this;
        }

        public Criteria andLikeMemoNotLike(String value) {
            addCriterion("like_memo not like", value, "likeMemo");
            return (Criteria) this;
        }

        public Criteria andLikeMemoIn(List<String> values) {
            addCriterion("like_memo in", values, "likeMemo");
            return (Criteria) this;
        }

        public Criteria andLikeMemoNotIn(List<String> values) {
            addCriterion("like_memo not in", values, "likeMemo");
            return (Criteria) this;
        }

        public Criteria andLikeMemoBetween(String value1, String value2) {
            addCriterion("like_memo between", value1, value2, "likeMemo");
            return (Criteria) this;
        }

        public Criteria andLikeMemoNotBetween(String value1, String value2) {
            addCriterion("like_memo not between", value1, value2, "likeMemo");
            return (Criteria) this;
        }

        public Criteria andBlogIdIsNull() {
            addCriterion("blog_id is null");
            return (Criteria) this;
        }

        public Criteria andBlogIdIsNotNull() {
            addCriterion("blog_id is not null");
            return (Criteria) this;
        }

        public Criteria andBlogIdEqualTo(String value) {
            addCriterion("blog_id =", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdNotEqualTo(String value) {
            addCriterion("blog_id <>", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdGreaterThan(String value) {
            addCriterion("blog_id >", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdGreaterThanOrEqualTo(String value) {
            addCriterion("blog_id >=", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdLessThan(String value) {
            addCriterion("blog_id <", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdLessThanOrEqualTo(String value) {
            addCriterion("blog_id <=", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdLike(String value) {
            addCriterion("blog_id like", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdNotLike(String value) {
            addCriterion("blog_id not like", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdIn(List<String> values) {
            addCriterion("blog_id in", values, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdNotIn(List<String> values) {
            addCriterion("blog_id not in", values, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdBetween(String value1, String value2) {
            addCriterion("blog_id between", value1, value2, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdNotBetween(String value1, String value2) {
            addCriterion("blog_id not between", value1, value2, "blogId");
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