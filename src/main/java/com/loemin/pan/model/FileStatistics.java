package com.loemin.pan.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 文件统计表
 * @TableName file_statistics
 */
@TableName(value ="file_statistics")
@Data
public class FileStatistics implements Serializable {
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
     * 所有文件数量
     */
    private Integer fileCount;

    /**
     * 空间容量
     */
    private Long totalCapacity;

    /**
     * 已使用容量
     */
    private Long usedCapacity;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}