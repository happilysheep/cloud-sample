package com.cloud.common.util;

import java.io.Serializable;

public class MessageResult<T> implements Serializable {

    private int code;

    private String msg;

    private String token;

    private T data;

    public MessageResult(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public MessageResult(int code, String msg, String token, T data) {

        this.code = code;
        this.msg = msg;
        this.token = token;
        this.data = data;
    }

    public MessageResult() {

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

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
