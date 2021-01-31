package com.valar.core.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 七牛云配置
 * </p>
 *
 * @author valarcfcc
 * @since 2021-01-31
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("tool_qiniu_config")
@ApiModel(value="QiniuConfig对象", description="七牛云配置")
public class QiniuConfig implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "ID")
    private Long configId;

    @ApiModelProperty(value = "accessKey")
    private String accessKey;

    @ApiModelProperty(value = "Bucket 识别符")
    private String bucket;

    @ApiModelProperty(value = "外链域名")
    private String host;

    @ApiModelProperty(value = "secretKey")
    private String secretKey;

    @ApiModelProperty(value = "空间类型")
    private String type;

    @ApiModelProperty(value = "机房")
    private String zone;


}
