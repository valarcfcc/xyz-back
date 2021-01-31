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
 * 邮箱配置
 * </p>
 *
 * @author valarcfcc
 * @since 2021-01-31
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("tool_email_config")
@ApiModel(value="EmailConfig对象", description="邮箱配置")
public class EmailConfig implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "ID")
    private Long configId;

    @ApiModelProperty(value = "收件人")
    private String fromUser;

    @ApiModelProperty(value = "邮件服务器SMTP地址")
    private String host;

    @ApiModelProperty(value = "密码")
    private String pass;

    @ApiModelProperty(value = "端口")
    private String port;

    @ApiModelProperty(value = "发件者用户名")
    private String user;


}
