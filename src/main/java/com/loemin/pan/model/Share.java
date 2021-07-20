package com.loemin.pan.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 分享表
 * @TableName share
 */
@TableName(value ="share")
@Data
public class Share implements Serializable {
    /**
     * 主键
     */
    @TableId
    private Long id;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 到期时间
     */
    private Date expiryTime;

    /**
     * 所属用户
     */
    private Long userId;

    /**
     * 是否加密
     */
    private Integer isEncrypt;

    /**
     * 访问码
     */
    private String accessCode;

    /**
     * 保存次数
     */
    private Integer saveCount;

    /**
     * 下载次数
     */
    private Integer downloadCount;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}