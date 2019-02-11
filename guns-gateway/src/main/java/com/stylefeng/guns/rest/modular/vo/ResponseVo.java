package com.stylefeng.guns.rest.modular.vo;

import lombok.Data;

@Data
public class ResponseVo<T> {

    private Integer code;

    private String msg;

    private T data;

    private ResponseVo(){}

    /**
     * 成功返回
     * @param data
     * @param <T>
     * @return
     */
    public static<T> ResponseVo success(T data){
        ResponseVo responseVo = new ResponseVo();
        responseVo.setCode(0);
        responseVo.setData(data);
        return responseVo;
    }


    /**
     * 业务异常
     * @param msg
     * @return
     */
    public static ResponseVo serviceFail(String msg){
        ResponseVo responseVo = new ResponseVo();
        responseVo.setCode(1);
        responseVo.setMsg(msg);
        return responseVo;
    }

    /**
     * 系统异常
     * @param msg
     * @return
     */
    public static ResponseVo appFail(String msg){
        ResponseVo responseVo = new ResponseVo();
        responseVo.setCode(999);
        responseVo.setMsg(msg);
        return responseVo;
    }


}
