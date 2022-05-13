package com.hnie.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName volunteer
 */
@TableName(value ="volunteer")
@Data
public class Volunteer implements Serializable {
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
     * 昵称
     */
    @TableField(value = "nickname")
    private String nickname;

    /**
     * 真名
     */
    @TableField(value = "real_name")
    private String realName;

    /**
     * 服务时间
     */
    @TableField(value = "service_duration")
    private Long serviceDuration;

    /**
     * 身份证号
     */
    @TableField(value = "id_card")
    private String idCard;

    /**
     * 加入的组织
     */
    @TableField(value = "organization_id")
    private String organizationId;

    /**
     * 地址
     */
    @TableField(value = "address")
    private String address;

    /**
     * 手机号
     */
    @TableField(value = "phone_number")
    private String phoneNumber;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @TableLogic//逻辑删除字段  1删除  0未删除
    private Integer isDeleted;
}
