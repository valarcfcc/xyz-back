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
 * 应用管理
 * </p>
 *
 * @author valarcfcc
 * @since 2021-01-31
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("mnt_app")
@ApiModel(value="App对象", description="应用管理")
public class App implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "ID")
    @TableId(value = "app_id", type = IdType.AUTO)
    private Long appId;

    @ApiModelProperty(value = "应用名称")
    private String name;

    @ApiModelProperty(value = "上传目录")
    private String uploadPath;

    @ApiModelProperty(value = "部署路径")
    private String deployPath;

    @ApiModelProperty(value = "备份路径")
    private String backupPath;

    @ApiModelProperty(value = "应用端口")
    private Integer port;

    @ApiModelProperty(value = "启动脚本")
    private String startScript;

    @ApiModelProperty(value = "部署脚本")
    private String deployScript;

    @ApiModelProperty(value = "创建者")
    private String createBy;

    @ApiModelProperty(value = "更新者")
    private String updateBy;

    @ApiModelProperty(value = "创建日期")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "更新时间")
    private LocalDateTime updateTime;


}
