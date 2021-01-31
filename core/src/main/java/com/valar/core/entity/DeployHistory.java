package com.valar.core.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 部署历史管理
 * </p>
 *
 * @author valarcfcc
 * @since 2021-01-31
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("mnt_deploy_history")
@ApiModel(value="DeployHistory对象", description="部署历史管理")
public class DeployHistory implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "ID")
    private String historyId;

    @ApiModelProperty(value = "应用名称")
    private String appName;

    @ApiModelProperty(value = "部署日期")
    private LocalDateTime deployDate;

    @ApiModelProperty(value = "部署用户")
    private String deployUser;

    @ApiModelProperty(value = "服务器IP")
    private String ip;

    @ApiModelProperty(value = "部署编号")
    private Long deployId;


}
