package com.loemin.pan.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 用户文件表
 * @TableName user_file
 */
@TableName(value ="user_file")
@Data
public class UserFile implements Serializable {
    /**
     * 主键
     */
    @TableId
    private Long id;

    /**
     * 所属用户
     */
    private Long userId;

    /**
     * 是否目录
     */
    private Integer isDir;

    /**
     * 源文件id
     */
    private Long sourceFileId;

    /**
     * 路径
     */
    private String path;

    /**
     * 文件名称
     */
    private String fileName;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 文件类别
     */
    private Integer category;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}