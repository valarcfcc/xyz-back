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
 * 支付宝配置类
 * </p>
 *
 * @author valarcfcc
 * @since 2021-01-31
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("tool_alipay_config")
@ApiModel(value="AlipayConfig对象", description="支付宝配置类")
public class AlipayConfig implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "ID")
    private Long configId;

    @ApiModelProperty(value = "应用ID")
    private String appId;

    @ApiModelProperty(value = "编码")
    private String charset;

    @ApiModelProperty(value = "类型 固定格式json")
    private String format;

    @ApiModelProperty(value = "网关地址")
    private String gatewayUrl;

    @ApiModelProperty(value = "异步回调")
    private String notifyUrl;

    @ApiModelProperty(value = "私钥")
    private String privateKey;

    @ApiModelProperty(value = "公钥")
    private String publicKey;

    @ApiModelProperty(value = "回调地址")
    private String returnUrl;

    @ApiModelProperty(value = "签名方式")
    private String signType;

    @ApiModelProperty(value = "商户号")
    private String sysServiceProviderId;


}
