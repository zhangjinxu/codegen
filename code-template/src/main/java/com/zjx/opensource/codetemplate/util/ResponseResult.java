package com.zjx.opensource.codetemplate.util;

import javax.xml.ws.Response;

public class ResponseResult<T> {

    private int code;

    private String msg;

    private T data;


    public static ResponseResult getSuccessResult() {
        return new ResponseResult(1, "", null);
    }

    public static <E> ResponseResult getSuccessResult(E data) {
        return new ResponseResult(1, "", data);
    }

    public static ResponseResult getFailResult() {
        return new ResponseResult(0, "", null);
    }

    private ResponseResult() {
    }

    private ResponseResult(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

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
}
