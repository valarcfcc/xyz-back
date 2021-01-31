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
 * 角色部门关联
 * </p>
 *
 * @author valarcfcc
 * @since 2021-01-31
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("sys_roles_depts")
@ApiModel(value="RolesDepts对象", description="角色部门关联")
public class RolesDepts implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long roleId;

    private Long deptId;


}
