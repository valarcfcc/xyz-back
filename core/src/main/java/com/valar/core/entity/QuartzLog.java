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
 * 定时任务日志
 * </p>
 *
 * @author valarcfcc
 * @since 2021-01-31
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("sys_quartz_log")
@ApiModel(value="QuartzLog对象", description="定时任务日志")
public class QuartzLog implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "ID")
    @TableId(value = "log_id", type = IdType.AUTO)
    private Long logId;

    private String beanName;

    private LocalDateTime createTime;

    private String cronExpression;

    private String exceptionDetail;

    private Boolean isSuccess;

    private String jobName;

    private String methodName;

    private String params;

    private Long time;


}
