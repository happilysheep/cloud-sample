package com.cloud.common.util;

public enum MessageConstants {
    NotFound(404,"service is not found");

    private int code;

    private String Msg;

    MessageConstants(int code, String msg) {
        this.code = code;
        Msg = msg;
    }

    public int getCode() {

        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return Msg;
    }

    public void setMsg(String msg) {
        Msg = msg;
    }
}
