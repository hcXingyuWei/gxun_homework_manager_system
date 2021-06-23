package org.gxun.homework.manager.core.api.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@ApiModel(value="主键通用响应类", description="主键通用响应类")
@AllArgsConstructor
@NoArgsConstructor
public class BaseIdRespDTO extends BaseDTO {

    @ApiModelProperty(value = "主键ID", required=true)
    private String id;
}
