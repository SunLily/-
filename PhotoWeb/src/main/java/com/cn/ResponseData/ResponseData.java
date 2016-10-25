package com.cn.ResponseData;

/**
 * Created by alfa7055 on 2016/10/15.
 */
public class ResponseData<T> {
    private T data;
    private String message;
    private Integer code;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
