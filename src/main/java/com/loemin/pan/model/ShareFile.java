package com.loemin.pan.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 分享文件表
 * @TableName share_file
 */
@TableName(value ="share_file")
@Data
public class ShareFile implements Serializable {
    /**
     * 主键
     */
    @TableId
    private Long id;

    /**
     * 所属用户文件id
     */
    private Long userFileId;

    /**
     * 所属分享id
     */
    private Long shareId;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}