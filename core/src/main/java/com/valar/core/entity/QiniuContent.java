package com.valar.core.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 七牛云文件存储
 * </p>
 *
 * @author valarcfcc
 * @since 2021-01-31
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("tool_qiniu_content")
@ApiModel(value="QiniuContent对象", description="七牛云文件存储")
public class QiniuContent implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "ID")
    @TableId(value = "content_id", type = IdType.AUTO)
    private Long contentId;

    @ApiModelProperty(value = "Bucket 识别符")
    private String bucket;

    @ApiModelProperty(value = "文件名称")
    private String name;

    @ApiModelProperty(value = "文件大小")
    private String size;

    @ApiModelProperty(value = "文件类型：私有或公开")
    private String type;

    @ApiModelProperty(value = "文件url")
    private String url;

    @ApiModelProperty(value = "文件后缀")
    private String suffix;

    @ApiModelProperty(value = "上传或同步的时间")
    private LocalDateTime updateTime;


}
