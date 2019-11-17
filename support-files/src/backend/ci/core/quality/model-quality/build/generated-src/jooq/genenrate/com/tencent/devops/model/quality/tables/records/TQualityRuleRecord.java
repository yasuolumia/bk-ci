/*
 * This file is generated by jOOQ.
*/
package com.tencent.devops.model.quality.tables.records;


import com.tencent.devops.model.quality.tables.TQualityRule;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record16;
import org.jooq.Row16;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TQualityRuleRecord extends UpdatableRecordImpl<TQualityRuleRecord> implements Record16<Long, String, String, String, String, String, String, String, String, LocalDateTime, LocalDateTime, Boolean, String, Integer, Integer, String> {

    private static final long serialVersionUID = 1079440236;

    /**
     * Setter for <code>devops_quality.T_QUALITY_RULE.ID</code>.
     */
    public TQualityRuleRecord setId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>devops_quality.T_QUALITY_RULE.ID</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>devops_quality.T_QUALITY_RULE.NAME</code>. 模板名称
     */
    public TQualityRuleRecord setName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>devops_quality.T_QUALITY_RULE.NAME</code>. 模板名称
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>devops_quality.T_QUALITY_RULE.DESC</code>. 模板类型(指标集, 模板)
     */
    public TQualityRuleRecord setDesc(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>devops_quality.T_QUALITY_RULE.DESC</code>. 模板类型(指标集, 模板)
     */
    public String getDesc() {
        return (String) get(2);
    }

    /**
     * Setter for <code>devops_quality.T_QUALITY_RULE.PIPELINE_TEMPLATE_RANGE</code>. 流水线模板生效范围
     */
    public TQualityRuleRecord setPipelineTemplateRange(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>devops_quality.T_QUALITY_RULE.PIPELINE_TEMPLATE_RANGE</code>. 流水线模板生效范围
     */
    public String getPipelineTemplateRange() {
        return (String) get(3);
    }

    /**
     * Setter for <code>devops_quality.T_QUALITY_RULE.INDICATOR_RANGE</code>. 模板生效范围
     */
    public TQualityRuleRecord setIndicatorRange(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>devops_quality.T_QUALITY_RULE.INDICATOR_RANGE</code>. 模板生效范围
     */
    public String getIndicatorRange() {
        return (String) get(4);
    }

    /**
     * Setter for <code>devops_quality.T_QUALITY_RULE.CONTROL_POINT</code>. 控制点原子类型
     */
    public TQualityRuleRecord setControlPoint(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>devops_quality.T_QUALITY_RULE.CONTROL_POINT</code>. 控制点原子类型
     */
    public String getControlPoint() {
        return (String) get(5);
    }

    /**
     * Setter for <code>devops_quality.T_QUALITY_RULE.CONTROL_POINT_POSITION</code>. 控制点红线位置
     */
    public TQualityRuleRecord setControlPointPosition(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>devops_quality.T_QUALITY_RULE.CONTROL_POINT_POSITION</code>. 控制点红线位置
     */
    public String getControlPointPosition() {
        return (String) get(6);
    }

    /**
     * Setter for <code>devops_quality.T_QUALITY_RULE.CREATE_USER</code>. 创建用户
     */
    public TQualityRuleRecord setCreateUser(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>devops_quality.T_QUALITY_RULE.CREATE_USER</code>. 创建用户
     */
    public String getCreateUser() {
        return (String) get(7);
    }

    /**
     * Setter for <code>devops_quality.T_QUALITY_RULE.UPDATE_USER</code>. 更新用户
     */
    public TQualityRuleRecord setUpdateUser(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>devops_quality.T_QUALITY_RULE.UPDATE_USER</code>. 更新用户
     */
    public String getUpdateUser() {
        return (String) get(8);
    }

    /**
     * Setter for <code>devops_quality.T_QUALITY_RULE.CREATE_TIME</code>. 创建时间
     */
    public TQualityRuleRecord setCreateTime(LocalDateTime value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>devops_quality.T_QUALITY_RULE.CREATE_TIME</code>. 创建时间
     */
    public LocalDateTime getCreateTime() {
        return (LocalDateTime) get(9);
    }

    /**
     * Setter for <code>devops_quality.T_QUALITY_RULE.UPDATE_TIME</code>. 更新时间
     */
    public TQualityRuleRecord setUpdateTime(LocalDateTime value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>devops_quality.T_QUALITY_RULE.UPDATE_TIME</code>. 更新时间
     */
    public LocalDateTime getUpdateTime() {
        return (LocalDateTime) get(10);
    }

    /**
     * Setter for <code>devops_quality.T_QUALITY_RULE.ENABLE</code>. 是否启用
     */
    public TQualityRuleRecord setEnable(Boolean value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>devops_quality.T_QUALITY_RULE.ENABLE</code>. 是否启用
     */
    public Boolean getEnable() {
        return (Boolean) get(11);
    }

    /**
     * Setter for <code>devops_quality.T_QUALITY_RULE.PROJECT_ID</code>. 项目id
     */
    public TQualityRuleRecord setProjectId(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>devops_quality.T_QUALITY_RULE.PROJECT_ID</code>. 项目id
     */
    public String getProjectId() {
        return (String) get(12);
    }

    /**
     * Setter for <code>devops_quality.T_QUALITY_RULE.INTERCEPT_TIMES</code>. 拦截次数
     */
    public TQualityRuleRecord setInterceptTimes(Integer value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>devops_quality.T_QUALITY_RULE.INTERCEPT_TIMES</code>. 拦截次数
     */
    public Integer getInterceptTimes() {
        return (Integer) get(13);
    }

    /**
     * Setter for <code>devops_quality.T_QUALITY_RULE.EXECUTE_COUNT</code>. 生效流水线执行数
     */
    public TQualityRuleRecord setExecuteCount(Integer value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>devops_quality.T_QUALITY_RULE.EXECUTE_COUNT</code>. 生效流水线执行数
     */
    public Integer getExecuteCount() {
        return (Integer) get(14);
    }

    /**
     * Setter for <code>devops_quality.T_QUALITY_RULE.GATEWAY_ID</code>. 用户定义的红线规则id
     */
    public TQualityRuleRecord setGatewayId(String value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>devops_quality.T_QUALITY_RULE.GATEWAY_ID</code>. 用户定义的红线规则id
     */
    public String getGatewayId() {
        return (String) get(15);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record16 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row16<Long, String, String, String, String, String, String, String, String, LocalDateTime, LocalDateTime, Boolean, String, Integer, Integer, String> fieldsRow() {
        return (Row16) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row16<Long, String, String, String, String, String, String, String, String, LocalDateTime, LocalDateTime, Boolean, String, Integer, Integer, String> valuesRow() {
        return (Row16) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return TQualityRule.T_QUALITY_RULE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TQualityRule.T_QUALITY_RULE.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TQualityRule.T_QUALITY_RULE.DESC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return TQualityRule.T_QUALITY_RULE.PIPELINE_TEMPLATE_RANGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return TQualityRule.T_QUALITY_RULE.INDICATOR_RANGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return TQualityRule.T_QUALITY_RULE.CONTROL_POINT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return TQualityRule.T_QUALITY_RULE.CONTROL_POINT_POSITION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return TQualityRule.T_QUALITY_RULE.CREATE_USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return TQualityRule.T_QUALITY_RULE.UPDATE_USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field10() {
        return TQualityRule.T_QUALITY_RULE.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field11() {
        return TQualityRule.T_QUALITY_RULE.UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field12() {
        return TQualityRule.T_QUALITY_RULE.ENABLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return TQualityRule.T_QUALITY_RULE.PROJECT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field14() {
        return TQualityRule.T_QUALITY_RULE.INTERCEPT_TIMES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field15() {
        return TQualityRule.T_QUALITY_RULE.EXECUTE_COUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field16() {
        return TQualityRule.T_QUALITY_RULE.GATEWAY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getDesc();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getPipelineTemplateRange();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getIndicatorRange();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getControlPoint();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getControlPointPosition();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getCreateUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getUpdateUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value10() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value11() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value12() {
        return getEnable();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getProjectId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value14() {
        return getInterceptTimes();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value15() {
        return getExecuteCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value16() {
        return getGatewayId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TQualityRuleRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TQualityRuleRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TQualityRuleRecord value3(String value) {
        setDesc(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TQualityRuleRecord value4(String value) {
        setPipelineTemplateRange(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TQualityRuleRecord value5(String value) {
        setIndicatorRange(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TQualityRuleRecord value6(String value) {
        setControlPoint(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TQualityRuleRecord value7(String value) {
        setControlPointPosition(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TQualityRuleRecord value8(String value) {
        setCreateUser(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TQualityRuleRecord value9(String value) {
        setUpdateUser(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TQualityRuleRecord value10(LocalDateTime value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TQualityRuleRecord value11(LocalDateTime value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TQualityRuleRecord value12(Boolean value) {
        setEnable(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TQualityRuleRecord value13(String value) {
        setProjectId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TQualityRuleRecord value14(Integer value) {
        setInterceptTimes(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TQualityRuleRecord value15(Integer value) {
        setExecuteCount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TQualityRuleRecord value16(String value) {
        setGatewayId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TQualityRuleRecord values(Long value1, String value2, String value3, String value4, String value5, String value6, String value7, String value8, String value9, LocalDateTime value10, LocalDateTime value11, Boolean value12, String value13, Integer value14, Integer value15, String value16) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TQualityRuleRecord
     */
    public TQualityRuleRecord() {
        super(TQualityRule.T_QUALITY_RULE);
    }

    /**
     * Create a detached, initialised TQualityRuleRecord
     */
    public TQualityRuleRecord(Long id, String name, String desc, String pipelineTemplateRange, String indicatorRange, String controlPoint, String controlPointPosition, String createUser, String updateUser, LocalDateTime createTime, LocalDateTime updateTime, Boolean enable, String projectId, Integer interceptTimes, Integer executeCount, String gatewayId) {
        super(TQualityRule.T_QUALITY_RULE);

        set(0, id);
        set(1, name);
        set(2, desc);
        set(3, pipelineTemplateRange);
        set(4, indicatorRange);
        set(5, controlPoint);
        set(6, controlPointPosition);
        set(7, createUser);
        set(8, updateUser);
        set(9, createTime);
        set(10, updateTime);
        set(11, enable);
        set(12, projectId);
        set(13, interceptTimes);
        set(14, executeCount);
        set(15, gatewayId);
    }
}