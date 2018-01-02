package com.myblog.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BlogAndCategoryViewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BlogAndCategoryViewExample() {
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

        public Criteria andBlogCategoryIdIsNull() {
            addCriterion("blog_category_id is null");
            return (Criteria) this;
        }

        public Criteria andBlogCategoryIdIsNotNull() {
            addCriterion("blog_category_id is not null");
            return (Criteria) this;
        }

        public Criteria andBlogCategoryIdEqualTo(String value) {
            addCriterion("blog_category_id =", value, "blogCategoryId");
            return (Criteria) this;
        }

        public Criteria andBlogCategoryIdNotEqualTo(String value) {
            addCriterion("blog_category_id <>", value, "blogCategoryId");
            return (Criteria) this;
        }

        public Criteria andBlogCategoryIdGreaterThan(String value) {
            addCriterion("blog_category_id >", value, "blogCategoryId");
            return (Criteria) this;
        }

        public Criteria andBlogCategoryIdGreaterThanOrEqualTo(String value) {
            addCriterion("blog_category_id >=", value, "blogCategoryId");
            return (Criteria) this;
        }

        public Criteria andBlogCategoryIdLessThan(String value) {
            addCriterion("blog_category_id <", value, "blogCategoryId");
            return (Criteria) this;
        }

        public Criteria andBlogCategoryIdLessThanOrEqualTo(String value) {
            addCriterion("blog_category_id <=", value, "blogCategoryId");
            return (Criteria) this;
        }

        public Criteria andBlogCategoryIdLike(String value) {
            addCriterion("blog_category_id like", value, "blogCategoryId");
            return (Criteria) this;
        }

        public Criteria andBlogCategoryIdNotLike(String value) {
            addCriterion("blog_category_id not like", value, "blogCategoryId");
            return (Criteria) this;
        }

        public Criteria andBlogCategoryIdIn(List<String> values) {
            addCriterion("blog_category_id in", values, "blogCategoryId");
            return (Criteria) this;
        }

        public Criteria andBlogCategoryIdNotIn(List<String> values) {
            addCriterion("blog_category_id not in", values, "blogCategoryId");
            return (Criteria) this;
        }

        public Criteria andBlogCategoryIdBetween(String value1, String value2) {
            addCriterion("blog_category_id between", value1, value2, "blogCategoryId");
            return (Criteria) this;
        }

        public Criteria andBlogCategoryIdNotBetween(String value1, String value2) {
            addCriterion("blog_category_id not between", value1, value2, "blogCategoryId");
            return (Criteria) this;
        }

        public Criteria andBlogCategoryNameIsNull() {
            addCriterion("blog_category_name is null");
            return (Criteria) this;
        }

        public Criteria andBlogCategoryNameIsNotNull() {
            addCriterion("blog_category_name is not null");
            return (Criteria) this;
        }

        public Criteria andBlogCategoryNameEqualTo(String value) {
            addCriterion("blog_category_name =", value, "blogCategoryName");
            return (Criteria) this;
        }

        public Criteria andBlogCategoryNameNotEqualTo(String value) {
            addCriterion("blog_category_name <>", value, "blogCategoryName");
            return (Criteria) this;
        }

        public Criteria andBlogCategoryNameGreaterThan(String value) {
            addCriterion("blog_category_name >", value, "blogCategoryName");
            return (Criteria) this;
        }

        public Criteria andBlogCategoryNameGreaterThanOrEqualTo(String value) {
            addCriterion("blog_category_name >=", value, "blogCategoryName");
            return (Criteria) this;
        }

        public Criteria andBlogCategoryNameLessThan(String value) {
            addCriterion("blog_category_name <", value, "blogCategoryName");
            return (Criteria) this;
        }

        public Criteria andBlogCategoryNameLessThanOrEqualTo(String value) {
            addCriterion("blog_category_name <=", value, "blogCategoryName");
            return (Criteria) this;
        }

        public Criteria andBlogCategoryNameLike(String value) {
            addCriterion("blog_category_name like", value, "blogCategoryName");
            return (Criteria) this;
        }

        public Criteria andBlogCategoryNameNotLike(String value) {
            addCriterion("blog_category_name not like", value, "blogCategoryName");
            return (Criteria) this;
        }

        public Criteria andBlogCategoryNameIn(List<String> values) {
            addCriterion("blog_category_name in", values, "blogCategoryName");
            return (Criteria) this;
        }

        public Criteria andBlogCategoryNameNotIn(List<String> values) {
            addCriterion("blog_category_name not in", values, "blogCategoryName");
            return (Criteria) this;
        }

        public Criteria andBlogCategoryNameBetween(String value1, String value2) {
            addCriterion("blog_category_name between", value1, value2, "blogCategoryName");
            return (Criteria) this;
        }

        public Criteria andBlogCategoryNameNotBetween(String value1, String value2) {
            addCriterion("blog_category_name not between", value1, value2, "blogCategoryName");
            return (Criteria) this;
        }

        public Criteria andBlogCategoryCreatetimeIsNull() {
            addCriterion("blog_category_createtime is null");
            return (Criteria) this;
        }

        public Criteria andBlogCategoryCreatetimeIsNotNull() {
            addCriterion("blog_category_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andBlogCategoryCreatetimeEqualTo(Date value) {
            addCriterion("blog_category_createtime =", value, "blogCategoryCreatetime");
            return (Criteria) this;
        }

        public Criteria andBlogCategoryCreatetimeNotEqualTo(Date value) {
            addCriterion("blog_category_createtime <>", value, "blogCategoryCreatetime");
            return (Criteria) this;
        }

        public Criteria andBlogCategoryCreatetimeGreaterThan(Date value) {
            addCriterion("blog_category_createtime >", value, "blogCategoryCreatetime");
            return (Criteria) this;
        }

        public Criteria andBlogCategoryCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("blog_category_createtime >=", value, "blogCategoryCreatetime");
            return (Criteria) this;
        }

        public Criteria andBlogCategoryCreatetimeLessThan(Date value) {
            addCriterion("blog_category_createtime <", value, "blogCategoryCreatetime");
            return (Criteria) this;
        }

        public Criteria andBlogCategoryCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("blog_category_createtime <=", value, "blogCategoryCreatetime");
            return (Criteria) this;
        }

        public Criteria andBlogCategoryCreatetimeIn(List<Date> values) {
            addCriterion("blog_category_createtime in", values, "blogCategoryCreatetime");
            return (Criteria) this;
        }

        public Criteria andBlogCategoryCreatetimeNotIn(List<Date> values) {
            addCriterion("blog_category_createtime not in", values, "blogCategoryCreatetime");
            return (Criteria) this;
        }

        public Criteria andBlogCategoryCreatetimeBetween(Date value1, Date value2) {
            addCriterion("blog_category_createtime between", value1, value2, "blogCategoryCreatetime");
            return (Criteria) this;
        }

        public Criteria andBlogCategoryCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("blog_category_createtime not between", value1, value2, "blogCategoryCreatetime");
            return (Criteria) this;
        }

        public Criteria andBlogCategoryUpdatetimeIsNull() {
            addCriterion("blog_category_updatetime is null");
            return (Criteria) this;
        }

        public Criteria andBlogCategoryUpdatetimeIsNotNull() {
            addCriterion("blog_category_updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andBlogCategoryUpdatetimeEqualTo(Date value) {
            addCriterion("blog_category_updatetime =", value, "blogCategoryUpdatetime");
            return (Criteria) this;
        }

        public Criteria andBlogCategoryUpdatetimeNotEqualTo(Date value) {
            addCriterion("blog_category_updatetime <>", value, "blogCategoryUpdatetime");
            return (Criteria) this;
        }

        public Criteria andBlogCategoryUpdatetimeGreaterThan(Date value) {
            addCriterion("blog_category_updatetime >", value, "blogCategoryUpdatetime");
            return (Criteria) this;
        }

        public Criteria andBlogCategoryUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("blog_category_updatetime >=", value, "blogCategoryUpdatetime");
            return (Criteria) this;
        }

        public Criteria andBlogCategoryUpdatetimeLessThan(Date value) {
            addCriterion("blog_category_updatetime <", value, "blogCategoryUpdatetime");
            return (Criteria) this;
        }

        public Criteria andBlogCategoryUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("blog_category_updatetime <=", value, "blogCategoryUpdatetime");
            return (Criteria) this;
        }

        public Criteria andBlogCategoryUpdatetimeIn(List<Date> values) {
            addCriterion("blog_category_updatetime in", values, "blogCategoryUpdatetime");
            return (Criteria) this;
        }

        public Criteria andBlogCategoryUpdatetimeNotIn(List<Date> values) {
            addCriterion("blog_category_updatetime not in", values, "blogCategoryUpdatetime");
            return (Criteria) this;
        }

        public Criteria andBlogCategoryUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("blog_category_updatetime between", value1, value2, "blogCategoryUpdatetime");
            return (Criteria) this;
        }

        public Criteria andBlogCategoryUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("blog_category_updatetime not between", value1, value2, "blogCategoryUpdatetime");
            return (Criteria) this;
        }

        public Criteria andBlogCategoryMemoIsNull() {
            addCriterion("blog_category_memo is null");
            return (Criteria) this;
        }

        public Criteria andBlogCategoryMemoIsNotNull() {
            addCriterion("blog_category_memo is not null");
            return (Criteria) this;
        }

        public Criteria andBlogCategoryMemoEqualTo(String value) {
            addCriterion("blog_category_memo =", value, "blogCategoryMemo");
            return (Criteria) this;
        }

        public Criteria andBlogCategoryMemoNotEqualTo(String value) {
            addCriterion("blog_category_memo <>", value, "blogCategoryMemo");
            return (Criteria) this;
        }

        public Criteria andBlogCategoryMemoGreaterThan(String value) {
            addCriterion("blog_category_memo >", value, "blogCategoryMemo");
            return (Criteria) this;
        }

        public Criteria andBlogCategoryMemoGreaterThanOrEqualTo(String value) {
            addCriterion("blog_category_memo >=", value, "blogCategoryMemo");
            return (Criteria) this;
        }

        public Criteria andBlogCategoryMemoLessThan(String value) {
            addCriterion("blog_category_memo <", value, "blogCategoryMemo");
            return (Criteria) this;
        }

        public Criteria andBlogCategoryMemoLessThanOrEqualTo(String value) {
            addCriterion("blog_category_memo <=", value, "blogCategoryMemo");
            return (Criteria) this;
        }

        public Criteria andBlogCategoryMemoLike(String value) {
            addCriterion("blog_category_memo like", value, "blogCategoryMemo");
            return (Criteria) this;
        }

        public Criteria andBlogCategoryMemoNotLike(String value) {
            addCriterion("blog_category_memo not like", value, "blogCategoryMemo");
            return (Criteria) this;
        }

        public Criteria andBlogCategoryMemoIn(List<String> values) {
            addCriterion("blog_category_memo in", values, "blogCategoryMemo");
            return (Criteria) this;
        }

        public Criteria andBlogCategoryMemoNotIn(List<String> values) {
            addCriterion("blog_category_memo not in", values, "blogCategoryMemo");
            return (Criteria) this;
        }

        public Criteria andBlogCategoryMemoBetween(String value1, String value2) {
            addCriterion("blog_category_memo between", value1, value2, "blogCategoryMemo");
            return (Criteria) this;
        }

        public Criteria andBlogCategoryMemoNotBetween(String value1, String value2) {
            addCriterion("blog_category_memo not between", value1, value2, "blogCategoryMemo");
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

        public Criteria andBlogTitleIsNull() {
            addCriterion("blog_title is null");
            return (Criteria) this;
        }

        public Criteria andBlogTitleIsNotNull() {
            addCriterion("blog_title is not null");
            return (Criteria) this;
        }

        public Criteria andBlogTitleEqualTo(String value) {
            addCriterion("blog_title =", value, "blogTitle");
            return (Criteria) this;
        }

        public Criteria andBlogTitleNotEqualTo(String value) {
            addCriterion("blog_title <>", value, "blogTitle");
            return (Criteria) this;
        }

        public Criteria andBlogTitleGreaterThan(String value) {
            addCriterion("blog_title >", value, "blogTitle");
            return (Criteria) this;
        }

        public Criteria andBlogTitleGreaterThanOrEqualTo(String value) {
            addCriterion("blog_title >=", value, "blogTitle");
            return (Criteria) this;
        }

        public Criteria andBlogTitleLessThan(String value) {
            addCriterion("blog_title <", value, "blogTitle");
            return (Criteria) this;
        }

        public Criteria andBlogTitleLessThanOrEqualTo(String value) {
            addCriterion("blog_title <=", value, "blogTitle");
            return (Criteria) this;
        }

        public Criteria andBlogTitleLike(String value) {
            addCriterion("blog_title like", value, "blogTitle");
            return (Criteria) this;
        }

        public Criteria andBlogTitleNotLike(String value) {
            addCriterion("blog_title not like", value, "blogTitle");
            return (Criteria) this;
        }

        public Criteria andBlogTitleIn(List<String> values) {
            addCriterion("blog_title in", values, "blogTitle");
            return (Criteria) this;
        }

        public Criteria andBlogTitleNotIn(List<String> values) {
            addCriterion("blog_title not in", values, "blogTitle");
            return (Criteria) this;
        }

        public Criteria andBlogTitleBetween(String value1, String value2) {
            addCriterion("blog_title between", value1, value2, "blogTitle");
            return (Criteria) this;
        }

        public Criteria andBlogTitleNotBetween(String value1, String value2) {
            addCriterion("blog_title not between", value1, value2, "blogTitle");
            return (Criteria) this;
        }

        public Criteria andBlogContentIsNull() {
            addCriterion("blog_content is null");
            return (Criteria) this;
        }

        public Criteria andBlogContentIsNotNull() {
            addCriterion("blog_content is not null");
            return (Criteria) this;
        }

        public Criteria andBlogContentEqualTo(String value) {
            addCriterion("blog_content =", value, "blogContent");
            return (Criteria) this;
        }

        public Criteria andBlogContentNotEqualTo(String value) {
            addCriterion("blog_content <>", value, "blogContent");
            return (Criteria) this;
        }

        public Criteria andBlogContentGreaterThan(String value) {
            addCriterion("blog_content >", value, "blogContent");
            return (Criteria) this;
        }

        public Criteria andBlogContentGreaterThanOrEqualTo(String value) {
            addCriterion("blog_content >=", value, "blogContent");
            return (Criteria) this;
        }

        public Criteria andBlogContentLessThan(String value) {
            addCriterion("blog_content <", value, "blogContent");
            return (Criteria) this;
        }

        public Criteria andBlogContentLessThanOrEqualTo(String value) {
            addCriterion("blog_content <=", value, "blogContent");
            return (Criteria) this;
        }

        public Criteria andBlogContentLike(String value) {
            addCriterion("blog_content like", value, "blogContent");
            return (Criteria) this;
        }

        public Criteria andBlogContentNotLike(String value) {
            addCriterion("blog_content not like", value, "blogContent");
            return (Criteria) this;
        }

        public Criteria andBlogContentIn(List<String> values) {
            addCriterion("blog_content in", values, "blogContent");
            return (Criteria) this;
        }

        public Criteria andBlogContentNotIn(List<String> values) {
            addCriterion("blog_content not in", values, "blogContent");
            return (Criteria) this;
        }

        public Criteria andBlogContentBetween(String value1, String value2) {
            addCriterion("blog_content between", value1, value2, "blogContent");
            return (Criteria) this;
        }

        public Criteria andBlogContentNotBetween(String value1, String value2) {
            addCriterion("blog_content not between", value1, value2, "blogContent");
            return (Criteria) this;
        }

        public Criteria andBlogCreatetimeIsNull() {
            addCriterion("blog_createtime is null");
            return (Criteria) this;
        }

        public Criteria andBlogCreatetimeIsNotNull() {
            addCriterion("blog_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andBlogCreatetimeEqualTo(Date value) {
            addCriterion("blog_createtime =", value, "blogCreatetime");
            return (Criteria) this;
        }

        public Criteria andBlogCreatetimeNotEqualTo(Date value) {
            addCriterion("blog_createtime <>", value, "blogCreatetime");
            return (Criteria) this;
        }

        public Criteria andBlogCreatetimeGreaterThan(Date value) {
            addCriterion("blog_createtime >", value, "blogCreatetime");
            return (Criteria) this;
        }

        public Criteria andBlogCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("blog_createtime >=", value, "blogCreatetime");
            return (Criteria) this;
        }

        public Criteria andBlogCreatetimeLessThan(Date value) {
            addCriterion("blog_createtime <", value, "blogCreatetime");
            return (Criteria) this;
        }

        public Criteria andBlogCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("blog_createtime <=", value, "blogCreatetime");
            return (Criteria) this;
        }

        public Criteria andBlogCreatetimeIn(List<Date> values) {
            addCriterion("blog_createtime in", values, "blogCreatetime");
            return (Criteria) this;
        }

        public Criteria andBlogCreatetimeNotIn(List<Date> values) {
            addCriterion("blog_createtime not in", values, "blogCreatetime");
            return (Criteria) this;
        }

        public Criteria andBlogCreatetimeBetween(Date value1, Date value2) {
            addCriterion("blog_createtime between", value1, value2, "blogCreatetime");
            return (Criteria) this;
        }

        public Criteria andBlogCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("blog_createtime not between", value1, value2, "blogCreatetime");
            return (Criteria) this;
        }

        public Criteria andBlogUpdatetimeIsNull() {
            addCriterion("blog_updatetime is null");
            return (Criteria) this;
        }

        public Criteria andBlogUpdatetimeIsNotNull() {
            addCriterion("blog_updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andBlogUpdatetimeEqualTo(Date value) {
            addCriterion("blog_updatetime =", value, "blogUpdatetime");
            return (Criteria) this;
        }

        public Criteria andBlogUpdatetimeNotEqualTo(Date value) {
            addCriterion("blog_updatetime <>", value, "blogUpdatetime");
            return (Criteria) this;
        }

        public Criteria andBlogUpdatetimeGreaterThan(Date value) {
            addCriterion("blog_updatetime >", value, "blogUpdatetime");
            return (Criteria) this;
        }

        public Criteria andBlogUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("blog_updatetime >=", value, "blogUpdatetime");
            return (Criteria) this;
        }

        public Criteria andBlogUpdatetimeLessThan(Date value) {
            addCriterion("blog_updatetime <", value, "blogUpdatetime");
            return (Criteria) this;
        }

        public Criteria andBlogUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("blog_updatetime <=", value, "blogUpdatetime");
            return (Criteria) this;
        }

        public Criteria andBlogUpdatetimeIn(List<Date> values) {
            addCriterion("blog_updatetime in", values, "blogUpdatetime");
            return (Criteria) this;
        }

        public Criteria andBlogUpdatetimeNotIn(List<Date> values) {
            addCriterion("blog_updatetime not in", values, "blogUpdatetime");
            return (Criteria) this;
        }

        public Criteria andBlogUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("blog_updatetime between", value1, value2, "blogUpdatetime");
            return (Criteria) this;
        }

        public Criteria andBlogUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("blog_updatetime not between", value1, value2, "blogUpdatetime");
            return (Criteria) this;
        }

        public Criteria andBlogMemoIsNull() {
            addCriterion("blog_memo is null");
            return (Criteria) this;
        }

        public Criteria andBlogMemoIsNotNull() {
            addCriterion("blog_memo is not null");
            return (Criteria) this;
        }

        public Criteria andBlogMemoEqualTo(String value) {
            addCriterion("blog_memo =", value, "blogMemo");
            return (Criteria) this;
        }

        public Criteria andBlogMemoNotEqualTo(String value) {
            addCriterion("blog_memo <>", value, "blogMemo");
            return (Criteria) this;
        }

        public Criteria andBlogMemoGreaterThan(String value) {
            addCriterion("blog_memo >", value, "blogMemo");
            return (Criteria) this;
        }

        public Criteria andBlogMemoGreaterThanOrEqualTo(String value) {
            addCriterion("blog_memo >=", value, "blogMemo");
            return (Criteria) this;
        }

        public Criteria andBlogMemoLessThan(String value) {
            addCriterion("blog_memo <", value, "blogMemo");
            return (Criteria) this;
        }

        public Criteria andBlogMemoLessThanOrEqualTo(String value) {
            addCriterion("blog_memo <=", value, "blogMemo");
            return (Criteria) this;
        }

        public Criteria andBlogMemoLike(String value) {
            addCriterion("blog_memo like", value, "blogMemo");
            return (Criteria) this;
        }

        public Criteria andBlogMemoNotLike(String value) {
            addCriterion("blog_memo not like", value, "blogMemo");
            return (Criteria) this;
        }

        public Criteria andBlogMemoIn(List<String> values) {
            addCriterion("blog_memo in", values, "blogMemo");
            return (Criteria) this;
        }

        public Criteria andBlogMemoNotIn(List<String> values) {
            addCriterion("blog_memo not in", values, "blogMemo");
            return (Criteria) this;
        }

        public Criteria andBlogMemoBetween(String value1, String value2) {
            addCriterion("blog_memo between", value1, value2, "blogMemo");
            return (Criteria) this;
        }

        public Criteria andBlogMemoNotBetween(String value1, String value2) {
            addCriterion("blog_memo not between", value1, value2, "blogMemo");
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