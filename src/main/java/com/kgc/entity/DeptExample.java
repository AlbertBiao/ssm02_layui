package com.kgc.entity;

import java.util.ArrayList;
import java.util.List;

public class DeptExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DeptExample() {
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

        public Criteria andDeptidIsNull() {
            addCriterion("deptId is null");
            return (Criteria) this;
        }

        public Criteria andDeptidIsNotNull() {
            addCriterion("deptId is not null");
            return (Criteria) this;
        }

        public Criteria andDeptidEqualTo(Integer value) {
            addCriterion("deptId =", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidNotEqualTo(Integer value) {
            addCriterion("deptId <>", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidGreaterThan(Integer value) {
            addCriterion("deptId >", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidGreaterThanOrEqualTo(Integer value) {
            addCriterion("deptId >=", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidLessThan(Integer value) {
            addCriterion("deptId <", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidLessThanOrEqualTo(Integer value) {
            addCriterion("deptId <=", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidIn(List<Integer> values) {
            addCriterion("deptId in", values, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidNotIn(List<Integer> values) {
            addCriterion("deptId not in", values, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidBetween(Integer value1, Integer value2) {
            addCriterion("deptId between", value1, value2, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidNotBetween(Integer value1, Integer value2) {
            addCriterion("deptId not between", value1, value2, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptnnameIsNull() {
            addCriterion("deptnName is null");
            return (Criteria) this;
        }

        public Criteria andDeptnnameIsNotNull() {
            addCriterion("deptnName is not null");
            return (Criteria) this;
        }

        public Criteria andDeptnnameEqualTo(String value) {
            addCriterion("deptnName =", value, "deptnname");
            return (Criteria) this;
        }

        public Criteria andDeptnnameNotEqualTo(String value) {
            addCriterion("deptnName <>", value, "deptnname");
            return (Criteria) this;
        }

        public Criteria andDeptnnameGreaterThan(String value) {
            addCriterion("deptnName >", value, "deptnname");
            return (Criteria) this;
        }

        public Criteria andDeptnnameGreaterThanOrEqualTo(String value) {
            addCriterion("deptnName >=", value, "deptnname");
            return (Criteria) this;
        }

        public Criteria andDeptnnameLessThan(String value) {
            addCriterion("deptnName <", value, "deptnname");
            return (Criteria) this;
        }

        public Criteria andDeptnnameLessThanOrEqualTo(String value) {
            addCriterion("deptnName <=", value, "deptnname");
            return (Criteria) this;
        }

        public Criteria andDeptnnameLike(String value) {
            addCriterion("deptnName like", value, "deptnname");
            return (Criteria) this;
        }

        public Criteria andDeptnnameNotLike(String value) {
            addCriterion("deptnName not like", value, "deptnname");
            return (Criteria) this;
        }

        public Criteria andDeptnnameIn(List<String> values) {
            addCriterion("deptnName in", values, "deptnname");
            return (Criteria) this;
        }

        public Criteria andDeptnnameNotIn(List<String> values) {
            addCriterion("deptnName not in", values, "deptnname");
            return (Criteria) this;
        }

        public Criteria andDeptnnameBetween(String value1, String value2) {
            addCriterion("deptnName between", value1, value2, "deptnname");
            return (Criteria) this;
        }

        public Criteria andDeptnnameNotBetween(String value1, String value2) {
            addCriterion("deptnName not between", value1, value2, "deptnname");
            return (Criteria) this;
        }

        public Criteria andDeptloactionIsNull() {
            addCriterion("deptLoaction is null");
            return (Criteria) this;
        }

        public Criteria andDeptloactionIsNotNull() {
            addCriterion("deptLoaction is not null");
            return (Criteria) this;
        }

        public Criteria andDeptloactionEqualTo(String value) {
            addCriterion("deptLoaction =", value, "deptloaction");
            return (Criteria) this;
        }

        public Criteria andDeptloactionNotEqualTo(String value) {
            addCriterion("deptLoaction <>", value, "deptloaction");
            return (Criteria) this;
        }

        public Criteria andDeptloactionGreaterThan(String value) {
            addCriterion("deptLoaction >", value, "deptloaction");
            return (Criteria) this;
        }

        public Criteria andDeptloactionGreaterThanOrEqualTo(String value) {
            addCriterion("deptLoaction >=", value, "deptloaction");
            return (Criteria) this;
        }

        public Criteria andDeptloactionLessThan(String value) {
            addCriterion("deptLoaction <", value, "deptloaction");
            return (Criteria) this;
        }

        public Criteria andDeptloactionLessThanOrEqualTo(String value) {
            addCriterion("deptLoaction <=", value, "deptloaction");
            return (Criteria) this;
        }

        public Criteria andDeptloactionLike(String value) {
            addCriterion("deptLoaction like", value, "deptloaction");
            return (Criteria) this;
        }

        public Criteria andDeptloactionNotLike(String value) {
            addCriterion("deptLoaction not like", value, "deptloaction");
            return (Criteria) this;
        }

        public Criteria andDeptloactionIn(List<String> values) {
            addCriterion("deptLoaction in", values, "deptloaction");
            return (Criteria) this;
        }

        public Criteria andDeptloactionNotIn(List<String> values) {
            addCriterion("deptLoaction not in", values, "deptloaction");
            return (Criteria) this;
        }

        public Criteria andDeptloactionBetween(String value1, String value2) {
            addCriterion("deptLoaction between", value1, value2, "deptloaction");
            return (Criteria) this;
        }

        public Criteria andDeptloactionNotBetween(String value1, String value2) {
            addCriterion("deptLoaction not between", value1, value2, "deptloaction");
            return (Criteria) this;
        }

        public Criteria andPdeptidIsNull() {
            addCriterion("pdeptId is null");
            return (Criteria) this;
        }

        public Criteria andPdeptidIsNotNull() {
            addCriterion("pdeptId is not null");
            return (Criteria) this;
        }

        public Criteria andPdeptidEqualTo(Integer value) {
            addCriterion("pdeptId =", value, "pdeptid");
            return (Criteria) this;
        }

        public Criteria andPdeptidNotEqualTo(Integer value) {
            addCriterion("pdeptId <>", value, "pdeptid");
            return (Criteria) this;
        }

        public Criteria andPdeptidGreaterThan(Integer value) {
            addCriterion("pdeptId >", value, "pdeptid");
            return (Criteria) this;
        }

        public Criteria andPdeptidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pdeptId >=", value, "pdeptid");
            return (Criteria) this;
        }

        public Criteria andPdeptidLessThan(Integer value) {
            addCriterion("pdeptId <", value, "pdeptid");
            return (Criteria) this;
        }

        public Criteria andPdeptidLessThanOrEqualTo(Integer value) {
            addCriterion("pdeptId <=", value, "pdeptid");
            return (Criteria) this;
        }

        public Criteria andPdeptidIn(List<Integer> values) {
            addCriterion("pdeptId in", values, "pdeptid");
            return (Criteria) this;
        }

        public Criteria andPdeptidNotIn(List<Integer> values) {
            addCriterion("pdeptId not in", values, "pdeptid");
            return (Criteria) this;
        }

        public Criteria andPdeptidBetween(Integer value1, Integer value2) {
            addCriterion("pdeptId between", value1, value2, "pdeptid");
            return (Criteria) this;
        }

        public Criteria andPdeptidNotBetween(Integer value1, Integer value2) {
            addCriterion("pdeptId not between", value1, value2, "pdeptid");
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