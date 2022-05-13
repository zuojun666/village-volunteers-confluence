package com.hnie.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName activity
 */
@TableName(value ="activity")
@Data
public class Activity implements Serializable {
    /**
     * id
     */
    @TableId(value = "id")
    private String id;

    /**
     * 活动标题
     */
    @TableField(value = "title")
    private String title;

    /**
     * 活动图片路径
     */
    @TableField(value = "activity_picture_path")
    private String activityPicturePath;

    /**
     * 开始时间
     */
    @TableField(value = "start_time")
    private Date startTime;

    /**
     * 结束时间
     */
    @TableField(value = "end_time")
    private Date endTime;

    /**
     * 所需人数
     */
    @TableField(value = "number_of_people_required")
    private Integer numberOfPeopleRequired;

    /**
     * 已报人数
     */
    @TableField(value = "number_of_applicants")
    private Integer numberOfApplicants;

    /**
     * 发起组织id
     */
    @TableField(value = "organization_id")
    private String organizationId;

    /**
     * 活动地点
     */
    @TableField(value = "place")
    private String place;

    /**
     * 负责人
     */
    @TableField(value = "person_in_charge")
    private String personInCharge;

    /**
     * 活动详情
     */
    @TableField(value = "details")
    private String details;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @TableLogic//逻辑删除字段  1删除  0未删除
    private Integer isDeleted;
}