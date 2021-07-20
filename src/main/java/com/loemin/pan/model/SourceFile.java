package com.loemin.pan.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 源文件表
 * @TableName source_file
 */
@TableName(value ="source_file")
@Data
public class SourceFile implements Serializable {
    /**
     * 主键
     */
    @TableId
    private Long id;

    /**
     * 文件md5
     */
    private String md5;

    /**
     * 文件路径
     */
    private String path;

    /**
     * 文件大小
     */
    private Integer size;

    /**
     * 文件引用计数
     */
    private Integer referenceCount;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}