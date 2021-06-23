package org.gxun.homework.manager.core.api.controller;


import org.gxun.homework.manager.core.api.ApiRest;
import org.gxun.homework.manager.core.exception.ServiceException;

public class BaseController {

    private static final Integer CODE_SUCCESS = 0;
    private static final String MSG_SUCCESS = "操作成功！";

    private static final Integer CODE_FAILURE = 1;
    private static final String MSG_FAILURE = "请求失败！";


    protected <T> ApiRest<T> message(Integer code, String message, T data){
        ApiRest<T> response = new ApiRest<>();
        response.setCode(code);
        response.setMsg(message);
        if(data!=null) {
            response.setData(data);
        }
        return response;
    }

    protected <T> ApiRest<T> success(){
        return message(0, "请求成功！", null);
    }



    protected <T> ApiRest<T> success(String message, T data){
        return message(CODE_SUCCESS, message, data);
    }


    protected <T> ApiRest<T> success(T data){
        return message(CODE_SUCCESS, MSG_SUCCESS, data);
    }


    protected <T> ApiRest<T> failure(Integer code, String message, T data){
        return message(code, message, data);
    }

    protected <T> ApiRest<T> failure(String message, T data){
        return message(CODE_FAILURE, message, data);
    }

    protected <T> ApiRest<T> failure(String message){
        return message(CODE_FAILURE, message, null);
    }

    protected <T> ApiRest<T> failure(T data){
        return message(CODE_FAILURE, MSG_FAILURE, data);
    }


    /**
     * 请求失败，仅内容
     * @param <T>
     * @return
     */
    protected <T> ApiRest<T> failure(){
        return message(CODE_FAILURE, MSG_FAILURE, null);
    }



    /**
     * 请求失败，仅内容
     * @param <T>
     * @return
     */
    protected <T> ApiRest<T> failure(ApiError error, T data){
        return message(error.getCode(), error.msg, data);
    }



    /**
     * 请求失败，仅内容
     * @param ex
     * @param <T>
     * @return
     */
    protected <T> ApiRest<T> failure(ServiceException ex){
        ApiRest<T> apiRest = message(ex.getCode(), ex.getMsg(), null);
        return apiRest;
    }
}
