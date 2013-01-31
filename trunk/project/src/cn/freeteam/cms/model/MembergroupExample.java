package cn.freeteam.cms.model;

import java.util.ArrayList;
import java.util.List;

public class MembergroupExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table freecms_memberGroup
     *
     * @mbggenerated Thu Jan 31 19:12:30 CST 2013
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table freecms_memberGroup
     *
     * @mbggenerated Thu Jan 31 19:12:30 CST 2013
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table freecms_memberGroup
     *
     * @mbggenerated Thu Jan 31 19:12:30 CST 2013
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_memberGroup
     *
     * @mbggenerated Thu Jan 31 19:12:30 CST 2013
     */
    public MembergroupExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_memberGroup
     *
     * @mbggenerated Thu Jan 31 19:12:30 CST 2013
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_memberGroup
     *
     * @mbggenerated Thu Jan 31 19:12:30 CST 2013
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_memberGroup
     *
     * @mbggenerated Thu Jan 31 19:12:30 CST 2013
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_memberGroup
     *
     * @mbggenerated Thu Jan 31 19:12:30 CST 2013
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_memberGroup
     *
     * @mbggenerated Thu Jan 31 19:12:30 CST 2013
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_memberGroup
     *
     * @mbggenerated Thu Jan 31 19:12:30 CST 2013
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_memberGroup
     *
     * @mbggenerated Thu Jan 31 19:12:30 CST 2013
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_memberGroup
     *
     * @mbggenerated Thu Jan 31 19:12:30 CST 2013
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_memberGroup
     *
     * @mbggenerated Thu Jan 31 19:12:30 CST 2013
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_memberGroup
     *
     * @mbggenerated Thu Jan 31 19:12:30 CST 2013
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table freecms_memberGroup
     *
     * @mbggenerated Thu Jan 31 19:12:30 CST 2013
     */
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
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

        public Criteria andOrdernumIsNull() {
            addCriterion("orderNum is null");
            return (Criteria) this;
        }

        public Criteria andOrdernumIsNotNull() {
            addCriterion("orderNum is not null");
            return (Criteria) this;
        }

        public Criteria andOrdernumEqualTo(Integer value) {
            addCriterion("orderNum =", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumNotEqualTo(Integer value) {
            addCriterion("orderNum <>", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumGreaterThan(Integer value) {
            addCriterion("orderNum >", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderNum >=", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumLessThan(Integer value) {
            addCriterion("orderNum <", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumLessThanOrEqualTo(Integer value) {
            addCriterion("orderNum <=", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumIn(List<Integer> values) {
            addCriterion("orderNum in", values, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumNotIn(List<Integer> values) {
            addCriterion("orderNum not in", values, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumBetween(Integer value1, Integer value2) {
            addCriterion("orderNum between", value1, value2, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumNotBetween(Integer value1, Integer value2) {
            addCriterion("orderNum not between", value1, value2, "ordernum");
            return (Criteria) this;
        }

        public Criteria andBegincreditIsNull() {
            addCriterion("beginCredit is null");
            return (Criteria) this;
        }

        public Criteria andBegincreditIsNotNull() {
            addCriterion("beginCredit is not null");
            return (Criteria) this;
        }

        public Criteria andBegincreditEqualTo(Integer value) {
            addCriterion("beginCredit =", value, "begincredit");
            return (Criteria) this;
        }

        public Criteria andBegincreditNotEqualTo(Integer value) {
            addCriterion("beginCredit <>", value, "begincredit");
            return (Criteria) this;
        }

        public Criteria andBegincreditGreaterThan(Integer value) {
            addCriterion("beginCredit >", value, "begincredit");
            return (Criteria) this;
        }

        public Criteria andBegincreditGreaterThanOrEqualTo(Integer value) {
            addCriterion("beginCredit >=", value, "begincredit");
            return (Criteria) this;
        }

        public Criteria andBegincreditLessThan(Integer value) {
            addCriterion("beginCredit <", value, "begincredit");
            return (Criteria) this;
        }

        public Criteria andBegincreditLessThanOrEqualTo(Integer value) {
            addCriterion("beginCredit <=", value, "begincredit");
            return (Criteria) this;
        }

        public Criteria andBegincreditIn(List<Integer> values) {
            addCriterion("beginCredit in", values, "begincredit");
            return (Criteria) this;
        }

        public Criteria andBegincreditNotIn(List<Integer> values) {
            addCriterion("beginCredit not in", values, "begincredit");
            return (Criteria) this;
        }

        public Criteria andBegincreditBetween(Integer value1, Integer value2) {
            addCriterion("beginCredit between", value1, value2, "begincredit");
            return (Criteria) this;
        }

        public Criteria andBegincreditNotBetween(Integer value1, Integer value2) {
            addCriterion("beginCredit not between", value1, value2, "begincredit");
            return (Criteria) this;
        }

        public Criteria andEndcreditIsNull() {
            addCriterion("endCredit is null");
            return (Criteria) this;
        }

        public Criteria andEndcreditIsNotNull() {
            addCriterion("endCredit is not null");
            return (Criteria) this;
        }

        public Criteria andEndcreditEqualTo(Integer value) {
            addCriterion("endCredit =", value, "endcredit");
            return (Criteria) this;
        }

        public Criteria andEndcreditNotEqualTo(Integer value) {
            addCriterion("endCredit <>", value, "endcredit");
            return (Criteria) this;
        }

        public Criteria andEndcreditGreaterThan(Integer value) {
            addCriterion("endCredit >", value, "endcredit");
            return (Criteria) this;
        }

        public Criteria andEndcreditGreaterThanOrEqualTo(Integer value) {
            addCriterion("endCredit >=", value, "endcredit");
            return (Criteria) this;
        }

        public Criteria andEndcreditLessThan(Integer value) {
            addCriterion("endCredit <", value, "endcredit");
            return (Criteria) this;
        }

        public Criteria andEndcreditLessThanOrEqualTo(Integer value) {
            addCriterion("endCredit <=", value, "endcredit");
            return (Criteria) this;
        }

        public Criteria andEndcreditIn(List<Integer> values) {
            addCriterion("endCredit in", values, "endcredit");
            return (Criteria) this;
        }

        public Criteria andEndcreditNotIn(List<Integer> values) {
            addCriterion("endCredit not in", values, "endcredit");
            return (Criteria) this;
        }

        public Criteria andEndcreditBetween(Integer value1, Integer value2) {
            addCriterion("endCredit between", value1, value2, "endcredit");
            return (Criteria) this;
        }

        public Criteria andEndcreditNotBetween(Integer value1, Integer value2) {
            addCriterion("endCredit not between", value1, value2, "endcredit");
            return (Criteria) this;
        }

        public Criteria andImgIsNull() {
            addCriterion("img is null");
            return (Criteria) this;
        }

        public Criteria andImgIsNotNull() {
            addCriterion("img is not null");
            return (Criteria) this;
        }

        public Criteria andImgEqualTo(String value) {
            addCriterion("img =", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotEqualTo(String value) {
            addCriterion("img <>", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgGreaterThan(String value) {
            addCriterion("img >", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgGreaterThanOrEqualTo(String value) {
            addCriterion("img >=", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLessThan(String value) {
            addCriterion("img <", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLessThanOrEqualTo(String value) {
            addCriterion("img <=", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLike(String value) {
            addCriterion("img like", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotLike(String value) {
            addCriterion("img not like", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgIn(List<String> values) {
            addCriterion("img in", values, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotIn(List<String> values) {
            addCriterion("img not in", values, "img");
            return (Criteria) this;
        }

        public Criteria andImgBetween(String value1, String value2) {
            addCriterion("img between", value1, value2, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotBetween(String value1, String value2) {
            addCriterion("img not between", value1, value2, "img");
            return (Criteria) this;
        }

        public Criteria andColorIsNull() {
            addCriterion("color is null");
            return (Criteria) this;
        }

        public Criteria andColorIsNotNull() {
            addCriterion("color is not null");
            return (Criteria) this;
        }

        public Criteria andColorEqualTo(String value) {
            addCriterion("color =", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotEqualTo(String value) {
            addCriterion("color <>", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThan(String value) {
            addCriterion("color >", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThanOrEqualTo(String value) {
            addCriterion("color >=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThan(String value) {
            addCriterion("color <", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThanOrEqualTo(String value) {
            addCriterion("color <=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLike(String value) {
            addCriterion("color like", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotLike(String value) {
            addCriterion("color not like", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorIn(List<String> values) {
            addCriterion("color in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotIn(List<String> values) {
            addCriterion("color not in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorBetween(String value1, String value2) {
            addCriterion("color between", value1, value2, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotBetween(String value1, String value2) {
            addCriterion("color not between", value1, value2, "color");
            return (Criteria) this;
        }

        public Criteria andMaxattchsizeIsNull() {
            addCriterion("maxAttchSize is null");
            return (Criteria) this;
        }

        public Criteria andMaxattchsizeIsNotNull() {
            addCriterion("maxAttchSize is not null");
            return (Criteria) this;
        }

        public Criteria andMaxattchsizeEqualTo(Integer value) {
            addCriterion("maxAttchSize =", value, "maxattchsize");
            return (Criteria) this;
        }

        public Criteria andMaxattchsizeNotEqualTo(Integer value) {
            addCriterion("maxAttchSize <>", value, "maxattchsize");
            return (Criteria) this;
        }

        public Criteria andMaxattchsizeGreaterThan(Integer value) {
            addCriterion("maxAttchSize >", value, "maxattchsize");
            return (Criteria) this;
        }

        public Criteria andMaxattchsizeGreaterThanOrEqualTo(Integer value) {
            addCriterion("maxAttchSize >=", value, "maxattchsize");
            return (Criteria) this;
        }

        public Criteria andMaxattchsizeLessThan(Integer value) {
            addCriterion("maxAttchSize <", value, "maxattchsize");
            return (Criteria) this;
        }

        public Criteria andMaxattchsizeLessThanOrEqualTo(Integer value) {
            addCriterion("maxAttchSize <=", value, "maxattchsize");
            return (Criteria) this;
        }

        public Criteria andMaxattchsizeIn(List<Integer> values) {
            addCriterion("maxAttchSize in", values, "maxattchsize");
            return (Criteria) this;
        }

        public Criteria andMaxattchsizeNotIn(List<Integer> values) {
            addCriterion("maxAttchSize not in", values, "maxattchsize");
            return (Criteria) this;
        }

        public Criteria andMaxattchsizeBetween(Integer value1, Integer value2) {
            addCriterion("maxAttchSize between", value1, value2, "maxattchsize");
            return (Criteria) this;
        }

        public Criteria andMaxattchsizeNotBetween(Integer value1, Integer value2) {
            addCriterion("maxAttchSize not between", value1, value2, "maxattchsize");
            return (Criteria) this;
        }

        public Criteria andMaxfriendnumIsNull() {
            addCriterion("maxFriendNum is null");
            return (Criteria) this;
        }

        public Criteria andMaxfriendnumIsNotNull() {
            addCriterion("maxFriendNum is not null");
            return (Criteria) this;
        }

        public Criteria andMaxfriendnumEqualTo(Integer value) {
            addCriterion("maxFriendNum =", value, "maxfriendnum");
            return (Criteria) this;
        }

        public Criteria andMaxfriendnumNotEqualTo(Integer value) {
            addCriterion("maxFriendNum <>", value, "maxfriendnum");
            return (Criteria) this;
        }

        public Criteria andMaxfriendnumGreaterThan(Integer value) {
            addCriterion("maxFriendNum >", value, "maxfriendnum");
            return (Criteria) this;
        }

        public Criteria andMaxfriendnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("maxFriendNum >=", value, "maxfriendnum");
            return (Criteria) this;
        }

        public Criteria andMaxfriendnumLessThan(Integer value) {
            addCriterion("maxFriendNum <", value, "maxfriendnum");
            return (Criteria) this;
        }

        public Criteria andMaxfriendnumLessThanOrEqualTo(Integer value) {
            addCriterion("maxFriendNum <=", value, "maxfriendnum");
            return (Criteria) this;
        }

        public Criteria andMaxfriendnumIn(List<Integer> values) {
            addCriterion("maxFriendNum in", values, "maxfriendnum");
            return (Criteria) this;
        }

        public Criteria andMaxfriendnumNotIn(List<Integer> values) {
            addCriterion("maxFriendNum not in", values, "maxfriendnum");
            return (Criteria) this;
        }

        public Criteria andMaxfriendnumBetween(Integer value1, Integer value2) {
            addCriterion("maxFriendNum between", value1, value2, "maxfriendnum");
            return (Criteria) this;
        }

        public Criteria andMaxfriendnumNotBetween(Integer value1, Integer value2) {
            addCriterion("maxFriendNum not between", value1, value2, "maxfriendnum");
            return (Criteria) this;
        }

        public Criteria andCommentneedcheckIsNull() {
            addCriterion("commentNeedCheck is null");
            return (Criteria) this;
        }

        public Criteria andCommentneedcheckIsNotNull() {
            addCriterion("commentNeedCheck is not null");
            return (Criteria) this;
        }

        public Criteria andCommentneedcheckEqualTo(Integer value) {
            addCriterion("commentNeedCheck =", value, "commentneedcheck");
            return (Criteria) this;
        }

        public Criteria andCommentneedcheckNotEqualTo(Integer value) {
            addCriterion("commentNeedCheck <>", value, "commentneedcheck");
            return (Criteria) this;
        }

        public Criteria andCommentneedcheckGreaterThan(Integer value) {
            addCriterion("commentNeedCheck >", value, "commentneedcheck");
            return (Criteria) this;
        }

        public Criteria andCommentneedcheckGreaterThanOrEqualTo(Integer value) {
            addCriterion("commentNeedCheck >=", value, "commentneedcheck");
            return (Criteria) this;
        }

        public Criteria andCommentneedcheckLessThan(Integer value) {
            addCriterion("commentNeedCheck <", value, "commentneedcheck");
            return (Criteria) this;
        }

        public Criteria andCommentneedcheckLessThanOrEqualTo(Integer value) {
            addCriterion("commentNeedCheck <=", value, "commentneedcheck");
            return (Criteria) this;
        }

        public Criteria andCommentneedcheckIn(List<Integer> values) {
            addCriterion("commentNeedCheck in", values, "commentneedcheck");
            return (Criteria) this;
        }

        public Criteria andCommentneedcheckNotIn(List<Integer> values) {
            addCriterion("commentNeedCheck not in", values, "commentneedcheck");
            return (Criteria) this;
        }

        public Criteria andCommentneedcheckBetween(Integer value1, Integer value2) {
            addCriterion("commentNeedCheck between", value1, value2, "commentneedcheck");
            return (Criteria) this;
        }

        public Criteria andCommentneedcheckNotBetween(Integer value1, Integer value2) {
            addCriterion("commentNeedCheck not between", value1, value2, "commentneedcheck");
            return (Criteria) this;
        }

        public Criteria andCommentneedcaptchaIsNull() {
            addCriterion("commentNeedCaptcha is null");
            return (Criteria) this;
        }

        public Criteria andCommentneedcaptchaIsNotNull() {
            addCriterion("commentNeedCaptcha is not null");
            return (Criteria) this;
        }

        public Criteria andCommentneedcaptchaEqualTo(Integer value) {
            addCriterion("commentNeedCaptcha =", value, "commentneedcaptcha");
            return (Criteria) this;
        }

        public Criteria andCommentneedcaptchaNotEqualTo(Integer value) {
            addCriterion("commentNeedCaptcha <>", value, "commentneedcaptcha");
            return (Criteria) this;
        }

        public Criteria andCommentneedcaptchaGreaterThan(Integer value) {
            addCriterion("commentNeedCaptcha >", value, "commentneedcaptcha");
            return (Criteria) this;
        }

        public Criteria andCommentneedcaptchaGreaterThanOrEqualTo(Integer value) {
            addCriterion("commentNeedCaptcha >=", value, "commentneedcaptcha");
            return (Criteria) this;
        }

        public Criteria andCommentneedcaptchaLessThan(Integer value) {
            addCriterion("commentNeedCaptcha <", value, "commentneedcaptcha");
            return (Criteria) this;
        }

        public Criteria andCommentneedcaptchaLessThanOrEqualTo(Integer value) {
            addCriterion("commentNeedCaptcha <=", value, "commentneedcaptcha");
            return (Criteria) this;
        }

        public Criteria andCommentneedcaptchaIn(List<Integer> values) {
            addCriterion("commentNeedCaptcha in", values, "commentneedcaptcha");
            return (Criteria) this;
        }

        public Criteria andCommentneedcaptchaNotIn(List<Integer> values) {
            addCriterion("commentNeedCaptcha not in", values, "commentneedcaptcha");
            return (Criteria) this;
        }

        public Criteria andCommentneedcaptchaBetween(Integer value1, Integer value2) {
            addCriterion("commentNeedCaptcha between", value1, value2, "commentneedcaptcha");
            return (Criteria) this;
        }

        public Criteria andCommentneedcaptchaNotBetween(Integer value1, Integer value2) {
            addCriterion("commentNeedCaptcha not between", value1, value2, "commentneedcaptcha");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table freecms_memberGroup
     *
     * @mbggenerated do_not_delete_during_merge Thu Jan 31 19:12:30 CST 2013
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table freecms_memberGroup
     *
     * @mbggenerated Thu Jan 31 19:12:30 CST 2013
     */
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