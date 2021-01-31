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
 * 应用与服务器关联
 * </p>
 *
 * @author valarcfcc
 * @since 2021-01-31
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("mnt_deploy_server")
@ApiModel(value="DeployServer对象", description="应用与服务器关联")
public class DeployServer implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "部署ID")
    private Long deployId;

    @ApiModelProperty(value = "服务ID")
    private Long serverId;


}
