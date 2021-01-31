package com.valar.core.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 代码生成字段信息存储
 * </p>
 *
 * @author valarcfcc
 * @since 2021-01-31
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("code_column_config")
@ApiModel(value="ColumnConfig对象", description="代码生成字段信息存储")
public class ColumnConfig implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "ID")
    @TableId(value = "column_id", type = IdType.AUTO)
    private Long columnId;

    private String tableName;

    private String columnName;

    private String columnType;

    private String dictName;

    private String extra;

    private Boolean formShow;

    private String formType;

    private String keyType;

    private Boolean listShow;

    private Boolean notNull;

    private String queryType;

    private String remark;

    private String dateAnnotation;


}
