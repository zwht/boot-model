package com.zw.dao.entity;

import java.util.ArrayList;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andLoginNameIsNull() {
            addCriterion("login_name is null");
            return (Criteria) this;
        }

        public Criteria andLoginNameIsNotNull() {
            addCriterion("login_name is not null");
            return (Criteria) this;
        }

        public Criteria andLoginNameEqualTo(String value) {
            addCriterion("login_name =", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotEqualTo(String value) {
            addCriterion("login_name <>", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameGreaterThan(String value) {
            addCriterion("login_name >", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameGreaterThanOrEqualTo(String value) {
            addCriterion("login_name >=", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameLessThan(String value) {
            addCriterion("login_name <", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameLessThanOrEqualTo(String value) {
            addCriterion("login_name <=", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameLike(String value) {
            addCriterion("login_name like", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotLike(String value) {
            addCriterion("login_name not like", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameIn(List<String> values) {
            addCriterion("login_name in", values, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotIn(List<String> values) {
            addCriterion("login_name not in", values, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameBetween(String value1, String value2) {
            addCriterion("login_name between", value1, value2, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotBetween(String value1, String value2) {
            addCriterion("login_name not between", value1, value2, "loginName");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Short value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Short value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Short value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Short value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Short value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Short value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Short> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Short> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Short value1, Short value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Short value1, Short value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andAbilityIsNull() {
            addCriterion("ability is null");
            return (Criteria) this;
        }

        public Criteria andAbilityIsNotNull() {
            addCriterion("ability is not null");
            return (Criteria) this;
        }

        public Criteria andAbilityEqualTo(String value) {
            addCriterion("ability =", value, "ability");
            return (Criteria) this;
        }

        public Criteria andAbilityNotEqualTo(String value) {
            addCriterion("ability <>", value, "ability");
            return (Criteria) this;
        }

        public Criteria andAbilityGreaterThan(String value) {
            addCriterion("ability >", value, "ability");
            return (Criteria) this;
        }

        public Criteria andAbilityGreaterThanOrEqualTo(String value) {
            addCriterion("ability >=", value, "ability");
            return (Criteria) this;
        }

        public Criteria andAbilityLessThan(String value) {
            addCriterion("ability <", value, "ability");
            return (Criteria) this;
        }

        public Criteria andAbilityLessThanOrEqualTo(String value) {
            addCriterion("ability <=", value, "ability");
            return (Criteria) this;
        }

        public Criteria andAbilityLike(String value) {
            addCriterion("ability like", value, "ability");
            return (Criteria) this;
        }

        public Criteria andAbilityNotLike(String value) {
            addCriterion("ability not like", value, "ability");
            return (Criteria) this;
        }

        public Criteria andAbilityIn(List<String> values) {
            addCriterion("ability in", values, "ability");
            return (Criteria) this;
        }

        public Criteria andAbilityNotIn(List<String> values) {
            addCriterion("ability not in", values, "ability");
            return (Criteria) this;
        }

        public Criteria andAbilityBetween(String value1, String value2) {
            addCriterion("ability between", value1, value2, "ability");
            return (Criteria) this;
        }

        public Criteria andAbilityNotBetween(String value1, String value2) {
            addCriterion("ability not between", value1, value2, "ability");
            return (Criteria) this;
        }

        public Criteria andRolesIsNull() {
            addCriterion("roles is null");
            return (Criteria) this;
        }

        public Criteria andRolesIsNotNull() {
            addCriterion("roles is not null");
            return (Criteria) this;
        }

        public Criteria andRolesEqualTo(String value) {
            addCriterion("roles =", value, "roles");
            return (Criteria) this;
        }

        public Criteria andRolesNotEqualTo(String value) {
            addCriterion("roles <>", value, "roles");
            return (Criteria) this;
        }

        public Criteria andRolesGreaterThan(String value) {
            addCriterion("roles >", value, "roles");
            return (Criteria) this;
        }

        public Criteria andRolesGreaterThanOrEqualTo(String value) {
            addCriterion("roles >=", value, "roles");
            return (Criteria) this;
        }

        public Criteria andRolesLessThan(String value) {
            addCriterion("roles <", value, "roles");
            return (Criteria) this;
        }

        public Criteria andRolesLessThanOrEqualTo(String value) {
            addCriterion("roles <=", value, "roles");
            return (Criteria) this;
        }

        public Criteria andRolesLike(String value) {
            addCriterion("roles like", value, "roles");
            return (Criteria) this;
        }

        public Criteria andRolesNotLike(String value) {
            addCriterion("roles not like", value, "roles");
            return (Criteria) this;
        }

        public Criteria andRolesIn(List<String> values) {
            addCriterion("roles in", values, "roles");
            return (Criteria) this;
        }

        public Criteria andRolesNotIn(List<String> values) {
            addCriterion("roles not in", values, "roles");
            return (Criteria) this;
        }

        public Criteria andRolesBetween(String value1, String value2) {
            addCriterion("roles between", value1, value2, "roles");
            return (Criteria) this;
        }

        public Criteria andRolesNotBetween(String value1, String value2) {
            addCriterion("roles not between", value1, value2, "roles");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordKeyIsNull() {
            addCriterion("password_key is null");
            return (Criteria) this;
        }

        public Criteria andPasswordKeyIsNotNull() {
            addCriterion("password_key is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordKeyEqualTo(String value) {
            addCriterion("password_key =", value, "passwordKey");
            return (Criteria) this;
        }

        public Criteria andPasswordKeyNotEqualTo(String value) {
            addCriterion("password_key <>", value, "passwordKey");
            return (Criteria) this;
        }

        public Criteria andPasswordKeyGreaterThan(String value) {
            addCriterion("password_key >", value, "passwordKey");
            return (Criteria) this;
        }

        public Criteria andPasswordKeyGreaterThanOrEqualTo(String value) {
            addCriterion("password_key >=", value, "passwordKey");
            return (Criteria) this;
        }

        public Criteria andPasswordKeyLessThan(String value) {
            addCriterion("password_key <", value, "passwordKey");
            return (Criteria) this;
        }

        public Criteria andPasswordKeyLessThanOrEqualTo(String value) {
            addCriterion("password_key <=", value, "passwordKey");
            return (Criteria) this;
        }

        public Criteria andPasswordKeyLike(String value) {
            addCriterion("password_key like", value, "passwordKey");
            return (Criteria) this;
        }

        public Criteria andPasswordKeyNotLike(String value) {
            addCriterion("password_key not like", value, "passwordKey");
            return (Criteria) this;
        }

        public Criteria andPasswordKeyIn(List<String> values) {
            addCriterion("password_key in", values, "passwordKey");
            return (Criteria) this;
        }

        public Criteria andPasswordKeyNotIn(List<String> values) {
            addCriterion("password_key not in", values, "passwordKey");
            return (Criteria) this;
        }

        public Criteria andPasswordKeyBetween(String value1, String value2) {
            addCriterion("password_key between", value1, value2, "passwordKey");
            return (Criteria) this;
        }

        public Criteria andPasswordKeyNotBetween(String value1, String value2) {
            addCriterion("password_key not between", value1, value2, "passwordKey");
            return (Criteria) this;
        }

        public Criteria andCorporationIdIsNull() {
            addCriterion("corporation_id is null");
            return (Criteria) this;
        }

        public Criteria andCorporationIdIsNotNull() {
            addCriterion("corporation_id is not null");
            return (Criteria) this;
        }

        public Criteria andCorporationIdEqualTo(String value) {
            addCriterion("corporation_id =", value, "corporationId");
            return (Criteria) this;
        }

        public Criteria andCorporationIdNotEqualTo(String value) {
            addCriterion("corporation_id <>", value, "corporationId");
            return (Criteria) this;
        }

        public Criteria andCorporationIdGreaterThan(String value) {
            addCriterion("corporation_id >", value, "corporationId");
            return (Criteria) this;
        }

        public Criteria andCorporationIdGreaterThanOrEqualTo(String value) {
            addCriterion("corporation_id >=", value, "corporationId");
            return (Criteria) this;
        }

        public Criteria andCorporationIdLessThan(String value) {
            addCriterion("corporation_id <", value, "corporationId");
            return (Criteria) this;
        }

        public Criteria andCorporationIdLessThanOrEqualTo(String value) {
            addCriterion("corporation_id <=", value, "corporationId");
            return (Criteria) this;
        }

        public Criteria andCorporationIdLike(String value) {
            addCriterion("corporation_id like", value, "corporationId");
            return (Criteria) this;
        }

        public Criteria andCorporationIdNotLike(String value) {
            addCriterion("corporation_id not like", value, "corporationId");
            return (Criteria) this;
        }

        public Criteria andCorporationIdIn(List<String> values) {
            addCriterion("corporation_id in", values, "corporationId");
            return (Criteria) this;
        }

        public Criteria andCorporationIdNotIn(List<String> values) {
            addCriterion("corporation_id not in", values, "corporationId");
            return (Criteria) this;
        }

        public Criteria andCorporationIdBetween(String value1, String value2) {
            addCriterion("corporation_id between", value1, value2, "corporationId");
            return (Criteria) this;
        }

        public Criteria andCorporationIdNotBetween(String value1, String value2) {
            addCriterion("corporation_id not between", value1, value2, "corporationId");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andImgIdIsNull() {
            addCriterion("img_id is null");
            return (Criteria) this;
        }

        public Criteria andImgIdIsNotNull() {
            addCriterion("img_id is not null");
            return (Criteria) this;
        }

        public Criteria andImgIdEqualTo(String value) {
            addCriterion("img_id =", value, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdNotEqualTo(String value) {
            addCriterion("img_id <>", value, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdGreaterThan(String value) {
            addCriterion("img_id >", value, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdGreaterThanOrEqualTo(String value) {
            addCriterion("img_id >=", value, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdLessThan(String value) {
            addCriterion("img_id <", value, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdLessThanOrEqualTo(String value) {
            addCriterion("img_id <=", value, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdLike(String value) {
            addCriterion("img_id like", value, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdNotLike(String value) {
            addCriterion("img_id not like", value, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdIn(List<String> values) {
            addCriterion("img_id in", values, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdNotIn(List<String> values) {
            addCriterion("img_id not in", values, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdBetween(String value1, String value2) {
            addCriterion("img_id between", value1, value2, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdNotBetween(String value1, String value2) {
            addCriterion("img_id not between", value1, value2, "imgId");
            return (Criteria) this;
        }

        public Criteria andFlagIsNull() {
            addCriterion("flag is null");
            return (Criteria) this;
        }

        public Criteria andFlagIsNotNull() {
            addCriterion("flag is not null");
            return (Criteria) this;
        }

        public Criteria andFlagEqualTo(Short value) {
            addCriterion("flag =", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotEqualTo(Short value) {
            addCriterion("flag <>", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThan(Short value) {
            addCriterion("flag >", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThanOrEqualTo(Short value) {
            addCriterion("flag >=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThan(Short value) {
            addCriterion("flag <", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThanOrEqualTo(Short value) {
            addCriterion("flag <=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagIn(List<Short> values) {
            addCriterion("flag in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotIn(List<Short> values) {
            addCriterion("flag not in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagBetween(Short value1, Short value2) {
            addCriterion("flag between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotBetween(Short value1, Short value2) {
            addCriterion("flag not between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andGxIdsIsNull() {
            addCriterion("gx_ids is null");
            return (Criteria) this;
        }

        public Criteria andGxIdsIsNotNull() {
            addCriterion("gx_ids is not null");
            return (Criteria) this;
        }

        public Criteria andGxIdsEqualTo(String value) {
            addCriterion("gx_ids =", value, "gxIds");
            return (Criteria) this;
        }

        public Criteria andGxIdsNotEqualTo(String value) {
            addCriterion("gx_ids <>", value, "gxIds");
            return (Criteria) this;
        }

        public Criteria andGxIdsGreaterThan(String value) {
            addCriterion("gx_ids >", value, "gxIds");
            return (Criteria) this;
        }

        public Criteria andGxIdsGreaterThanOrEqualTo(String value) {
            addCriterion("gx_ids >=", value, "gxIds");
            return (Criteria) this;
        }

        public Criteria andGxIdsLessThan(String value) {
            addCriterion("gx_ids <", value, "gxIds");
            return (Criteria) this;
        }

        public Criteria andGxIdsLessThanOrEqualTo(String value) {
            addCriterion("gx_ids <=", value, "gxIds");
            return (Criteria) this;
        }

        public Criteria andGxIdsLike(String value) {
            addCriterion("gx_ids like", value, "gxIds");
            return (Criteria) this;
        }

        public Criteria andGxIdsNotLike(String value) {
            addCriterion("gx_ids not like", value, "gxIds");
            return (Criteria) this;
        }

        public Criteria andGxIdsIn(List<String> values) {
            addCriterion("gx_ids in", values, "gxIds");
            return (Criteria) this;
        }

        public Criteria andGxIdsNotIn(List<String> values) {
            addCriterion("gx_ids not in", values, "gxIds");
            return (Criteria) this;
        }

        public Criteria andGxIdsBetween(String value1, String value2) {
            addCriterion("gx_ids between", value1, value2, "gxIds");
            return (Criteria) this;
        }

        public Criteria andGxIdsNotBetween(String value1, String value2) {
            addCriterion("gx_ids not between", value1, value2, "gxIds");
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