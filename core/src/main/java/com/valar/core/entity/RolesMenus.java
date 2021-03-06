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
 * 角色菜单关联
 * </p>
 *
 * @author valarcfcc
 * @since 2021-01-31
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("sys_roles_menus")
@ApiModel(value="RolesMenus对象", description="角色菜单关联")
public class RolesMenus implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "菜单ID")
    private Long menuId;

    @ApiModelProperty(value = "角色ID")
    private Long roleId;


}
