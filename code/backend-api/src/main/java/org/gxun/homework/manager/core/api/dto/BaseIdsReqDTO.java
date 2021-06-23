package org.gxun.homework.manager.core.api.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
@ApiModel(value="删除参数", description="删除参数")
public class BaseIdsReqDTO extends BaseDTO {


    @JsonIgnore
    private String userId;

    @ApiModelProperty(value = "要删除的ID列表", required = true)
    private List<String> ids;
}
