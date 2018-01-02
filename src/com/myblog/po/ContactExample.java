package com.myblog.po;

import java.util.ArrayList;
import java.util.List;

public class ContactExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ContactExample() {
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

        public Criteria andUserContactIdIsNull() {
            addCriterion("user_contact_id is null");
            return (Criteria) this;
        }

        public Criteria andUserContactIdIsNotNull() {
            addCriterion("user_contact_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserContactIdEqualTo(String value) {
            addCriterion("user_contact_id =", value, "userContactId");
            return (Criteria) this;
        }

        public Criteria andUserContactIdNotEqualTo(String value) {
            addCriterion("user_contact_id <>", value, "userContactId");
            return (Criteria) this;
        }

        public Criteria andUserContactIdGreaterThan(String value) {
            addCriterion("user_contact_id >", value, "userContactId");
            return (Criteria) this;
        }

        public Criteria andUserContactIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_contact_id >=", value, "userContactId");
            return (Criteria) this;
        }

        public Criteria andUserContactIdLessThan(String value) {
            addCriterion("user_contact_id <", value, "userContactId");
            return (Criteria) this;
        }

        public Criteria andUserContactIdLessThanOrEqualTo(String value) {
            addCriterion("user_contact_id <=", value, "userContactId");
            return (Criteria) this;
        }

        public Criteria andUserContactIdLike(String value) {
            addCriterion("user_contact_id like", value, "userContactId");
            return (Criteria) this;
        }

        public Criteria andUserContactIdNotLike(String value) {
            addCriterion("user_contact_id not like", value, "userContactId");
            return (Criteria) this;
        }

        public Criteria andUserContactIdIn(List<String> values) {
            addCriterion("user_contact_id in", values, "userContactId");
            return (Criteria) this;
        }

        public Criteria andUserContactIdNotIn(List<String> values) {
            addCriterion("user_contact_id not in", values, "userContactId");
            return (Criteria) this;
        }

        public Criteria andUserContactIdBetween(String value1, String value2) {
            addCriterion("user_contact_id between", value1, value2, "userContactId");
            return (Criteria) this;
        }

        public Criteria andUserContactIdNotBetween(String value1, String value2) {
            addCriterion("user_contact_id not between", value1, value2, "userContactId");
            return (Criteria) this;
        }

        public Criteria andUserContactTypeNameIsNull() {
            addCriterion("user_contact_type_name is null");
            return (Criteria) this;
        }

        public Criteria andUserContactTypeNameIsNotNull() {
            addCriterion("user_contact_type_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserContactTypeNameEqualTo(String value) {
            addCriterion("user_contact_type_name =", value, "userContactTypeName");
            return (Criteria) this;
        }

        public Criteria andUserContactTypeNameNotEqualTo(String value) {
            addCriterion("user_contact_type_name <>", value, "userContactTypeName");
            return (Criteria) this;
        }

        public Criteria andUserContactTypeNameGreaterThan(String value) {
            addCriterion("user_contact_type_name >", value, "userContactTypeName");
            return (Criteria) this;
        }

        public Criteria andUserContactTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_contact_type_name >=", value, "userContactTypeName");
            return (Criteria) this;
        }

        public Criteria andUserContactTypeNameLessThan(String value) {
            addCriterion("user_contact_type_name <", value, "userContactTypeName");
            return (Criteria) this;
        }

        public Criteria andUserContactTypeNameLessThanOrEqualTo(String value) {
            addCriterion("user_contact_type_name <=", value, "userContactTypeName");
            return (Criteria) this;
        }

        public Criteria andUserContactTypeNameLike(String value) {
            addCriterion("user_contact_type_name like", value, "userContactTypeName");
            return (Criteria) this;
        }

        public Criteria andUserContactTypeNameNotLike(String value) {
            addCriterion("user_contact_type_name not like", value, "userContactTypeName");
            return (Criteria) this;
        }

        public Criteria andUserContactTypeNameIn(List<String> values) {
            addCriterion("user_contact_type_name in", values, "userContactTypeName");
            return (Criteria) this;
        }

        public Criteria andUserContactTypeNameNotIn(List<String> values) {
            addCriterion("user_contact_type_name not in", values, "userContactTypeName");
            return (Criteria) this;
        }

        public Criteria andUserContactTypeNameBetween(String value1, String value2) {
            addCriterion("user_contact_type_name between", value1, value2, "userContactTypeName");
            return (Criteria) this;
        }

        public Criteria andUserContactTypeNameNotBetween(String value1, String value2) {
            addCriterion("user_contact_type_name not between", value1, value2, "userContactTypeName");
            return (Criteria) this;
        }

        public Criteria andUserContactIsNull() {
            addCriterion("user_contact is null");
            return (Criteria) this;
        }

        public Criteria andUserContactIsNotNull() {
            addCriterion("user_contact is not null");
            return (Criteria) this;
        }

        public Criteria andUserContactEqualTo(String value) {
            addCriterion("user_contact =", value, "userContact");
            return (Criteria) this;
        }

        public Criteria andUserContactNotEqualTo(String value) {
            addCriterion("user_contact <>", value, "userContact");
            return (Criteria) this;
        }

        public Criteria andUserContactGreaterThan(String value) {
            addCriterion("user_contact >", value, "userContact");
            return (Criteria) this;
        }

        public Criteria andUserContactGreaterThanOrEqualTo(String value) {
            addCriterion("user_contact >=", value, "userContact");
            return (Criteria) this;
        }

        public Criteria andUserContactLessThan(String value) {
            addCriterion("user_contact <", value, "userContact");
            return (Criteria) this;
        }

        public Criteria andUserContactLessThanOrEqualTo(String value) {
            addCriterion("user_contact <=", value, "userContact");
            return (Criteria) this;
        }

        public Criteria andUserContactLike(String value) {
            addCriterion("user_contact like", value, "userContact");
            return (Criteria) this;
        }

        public Criteria andUserContactNotLike(String value) {
            addCriterion("user_contact not like", value, "userContact");
            return (Criteria) this;
        }

        public Criteria andUserContactIn(List<String> values) {
            addCriterion("user_contact in", values, "userContact");
            return (Criteria) this;
        }

        public Criteria andUserContactNotIn(List<String> values) {
            addCriterion("user_contact not in", values, "userContact");
            return (Criteria) this;
        }

        public Criteria andUserContactBetween(String value1, String value2) {
            addCriterion("user_contact between", value1, value2, "userContact");
            return (Criteria) this;
        }

        public Criteria andUserContactNotBetween(String value1, String value2) {
            addCriterion("user_contact not between", value1, value2, "userContact");
            return (Criteria) this;
        }

        public Criteria andUserContactMemoIsNull() {
            addCriterion("user_contact_memo is null");
            return (Criteria) this;
        }

        public Criteria andUserContactMemoIsNotNull() {
            addCriterion("user_contact_memo is not null");
            return (Criteria) this;
        }

        public Criteria andUserContactMemoEqualTo(String value) {
            addCriterion("user_contact_memo =", value, "userContactMemo");
            return (Criteria) this;
        }

        public Criteria andUserContactMemoNotEqualTo(String value) {
            addCriterion("user_contact_memo <>", value, "userContactMemo");
            return (Criteria) this;
        }

        public Criteria andUserContactMemoGreaterThan(String value) {
            addCriterion("user_contact_memo >", value, "userContactMemo");
            return (Criteria) this;
        }

        public Criteria andUserContactMemoGreaterThanOrEqualTo(String value) {
            addCriterion("user_contact_memo >=", value, "userContactMemo");
            return (Criteria) this;
        }

        public Criteria andUserContactMemoLessThan(String value) {
            addCriterion("user_contact_memo <", value, "userContactMemo");
            return (Criteria) this;
        }

        public Criteria andUserContactMemoLessThanOrEqualTo(String value) {
            addCriterion("user_contact_memo <=", value, "userContactMemo");
            return (Criteria) this;
        }

        public Criteria andUserContactMemoLike(String value) {
            addCriterion("user_contact_memo like", value, "userContactMemo");
            return (Criteria) this;
        }

        public Criteria andUserContactMemoNotLike(String value) {
            addCriterion("user_contact_memo not like", value, "userContactMemo");
            return (Criteria) this;
        }

        public Criteria andUserContactMemoIn(List<String> values) {
            addCriterion("user_contact_memo in", values, "userContactMemo");
            return (Criteria) this;
        }

        public Criteria andUserContactMemoNotIn(List<String> values) {
            addCriterion("user_contact_memo not in", values, "userContactMemo");
            return (Criteria) this;
        }

        public Criteria andUserContactMemoBetween(String value1, String value2) {
            addCriterion("user_contact_memo between", value1, value2, "userContactMemo");
            return (Criteria) this;
        }

        public Criteria andUserContactMemoNotBetween(String value1, String value2) {
            addCriterion("user_contact_memo not between", value1, value2, "userContactMemo");
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