package com.es.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "统一返回DTO")
public class CommonResult<T> {
    @ApiModelProperty(value = "返回信息", name = "msg", required = true)
    private String msg;
    @ApiModelProperty(value = "返回数据", name = "data")
    private T data;
    @ApiModelProperty(value = "返回代码", name = "code", required = true)
    private int code;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public CommonResult() {
    }

    public CommonResult(String msg, T data, int code) {
        this.msg = msg;
        this.data = data;
        this.code = code;
    }
}
