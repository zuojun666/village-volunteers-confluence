package com.hnie.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName organization
 */
@TableName(value ="organization")
@Data
public class Organization implements Serializable {
    /**
     * id
     */
    @TableId(value = "id")
    private String id;

    /**
     * 头像路径
     */
    @TableField(value = "head_portrait_path")
    private String headPortraitPath;

    /**
     * 组织名
     */
    @TableField(value = "name")
    private String name;

    /**
     * 简介
     */
    @TableField(value = "brief_introduction")
    private String briefIntroduction;

    /**
     * 活动地点
     */
    @TableField(value = "address")
    private String address;

    /**
     * 志愿时长
     */
    @TableField(value = "volunteer_time")
    private Long volunteerTime;

    /**
     * 活动数量
     */
    @TableField(value = "number_of_activities")
    private Object numberOfActivities;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @TableLogic//逻辑删除字段  1删除  0未删除
    private Integer isDeleted;
}