/*
 * This file is generated by jOOQ.
*/
package com.tencent.devops.model.plugin.tables.records;


import com.tencent.devops.model.plugin.tables.TPluginCodecc;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TPluginCodeccRecord extends UpdatableRecordImpl<TPluginCodeccRecord> implements Record6<Long, String, String, String, String, String> {

    private static final long serialVersionUID = -2121095497;

    /**
     * Setter for <code>devops_plugin.T_PLUGIN_CODECC.ID</code>.
     */
    public TPluginCodeccRecord setId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>devops_plugin.T_PLUGIN_CODECC.ID</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>devops_plugin.T_PLUGIN_CODECC.PROJECT_ID</code>.
     */
    public TPluginCodeccRecord setProjectId(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>devops_plugin.T_PLUGIN_CODECC.PROJECT_ID</code>.
     */
    public String getProjectId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>devops_plugin.T_PLUGIN_CODECC.PIPELINE_ID</code>.
     */
    public TPluginCodeccRecord setPipelineId(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>devops_plugin.T_PLUGIN_CODECC.PIPELINE_ID</code>.
     */
    public String getPipelineId() {
        return (String) get(2);
    }

    /**
     * Setter for <code>devops_plugin.T_PLUGIN_CODECC.BUILD_ID</code>.
     */
    public TPluginCodeccRecord setBuildId(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>devops_plugin.T_PLUGIN_CODECC.BUILD_ID</code>.
     */
    public String getBuildId() {
        return (String) get(3);
    }

    /**
     * Setter for <code>devops_plugin.T_PLUGIN_CODECC.TASK_ID</code>.
     */
    public TPluginCodeccRecord setTaskId(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>devops_plugin.T_PLUGIN_CODECC.TASK_ID</code>.
     */
    public String getTaskId() {
        return (String) get(4);
    }

    /**
     * Setter for <code>devops_plugin.T_PLUGIN_CODECC.TOOL_SNAPSHOT_LIST</code>.
     */
    public TPluginCodeccRecord setToolSnapshotList(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>devops_plugin.T_PLUGIN_CODECC.TOOL_SNAPSHOT_LIST</code>.
     */
    public String getToolSnapshotList() {
        return (String) get(5);
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
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Long, String, String, String, String, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Long, String, String, String, String, String> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return TPluginCodecc.T_PLUGIN_CODECC.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TPluginCodecc.T_PLUGIN_CODECC.PROJECT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TPluginCodecc.T_PLUGIN_CODECC.PIPELINE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return TPluginCodecc.T_PLUGIN_CODECC.BUILD_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return TPluginCodecc.T_PLUGIN_CODECC.TASK_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return TPluginCodecc.T_PLUGIN_CODECC.TOOL_SNAPSHOT_LIST;
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
        return getProjectId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getPipelineId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getBuildId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getTaskId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getToolSnapshotList();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPluginCodeccRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPluginCodeccRecord value2(String value) {
        setProjectId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPluginCodeccRecord value3(String value) {
        setPipelineId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPluginCodeccRecord value4(String value) {
        setBuildId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPluginCodeccRecord value5(String value) {
        setTaskId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPluginCodeccRecord value6(String value) {
        setToolSnapshotList(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPluginCodeccRecord values(Long value1, String value2, String value3, String value4, String value5, String value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TPluginCodeccRecord
     */
    public TPluginCodeccRecord() {
        super(TPluginCodecc.T_PLUGIN_CODECC);
    }

    /**
     * Create a detached, initialised TPluginCodeccRecord
     */
    public TPluginCodeccRecord(Long id, String projectId, String pipelineId, String buildId, String taskId, String toolSnapshotList) {
        super(TPluginCodecc.T_PLUGIN_CODECC);

        set(0, id);
        set(1, projectId);
        set(2, pipelineId);
        set(3, buildId);
        set(4, taskId);
        set(5, toolSnapshotList);
    }
}