package org.gxun.homework.manager.core.api;


import org.gxun.homework.manager.core.exception.ServiceException;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@ApiModel(value="接口响应", description="接口响应")
public class ApiRest<T>{


    @ApiModelProperty(value = "响应消息")
    private String msg;

    @ApiModelProperty(value = "响应代码,0为成功,1为失败", required = true)
    private Integer code;

    @ApiModelProperty(value = "响应内容")
    protected T data;


    public boolean isSuccess(){
        return code.equals(0);
    }

    public ApiRest(ServiceException error){
        this.code = error.getCode();
        this.msg = error.getMsg();
    }

    public ApiRest(ApiError error){
        this.code = error.getCode();
        this.msg = error.msg;
    }
}
