package com.zjx.opensource.codegen.util;

import java.io.Serializable;

public class ResponseResult implements Serializable {

    private int code;

    private String msg;

    private Object data;

    public static ResponseResult getSuccessResult() {
        return new ResponseResult(1, "ok", "");
    }

    public static ResponseResult getSuccessResult(Object data) {
        return new ResponseResult(1, "ok", data);
    }

    public static ResponseResult getFailResult() {
        return new ResponseResult(0, "fail", "");
    }

    public static ResponseResult getFailResult(Object data) {
        return new ResponseResult(0, "fail", data);
    }

    public static ResponseResult getParamErrorResult() {
        return new ResponseResult(100, "param error", "");
    }

    private ResponseResult(int code, String msg, Object data) {
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

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
