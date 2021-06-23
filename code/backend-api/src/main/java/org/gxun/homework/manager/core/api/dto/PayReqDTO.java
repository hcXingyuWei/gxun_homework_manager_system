package org.gxun.homework.manager.core.api.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value="支付通用请求类", description="支付通用请求类")
public class PayReqDTO extends BaseDTO {

    @ApiModelProperty(value = "下单成功的订单号", required=true)
    private String orderId;
}
