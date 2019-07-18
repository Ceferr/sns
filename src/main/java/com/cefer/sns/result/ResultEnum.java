package com.cefer.sns.result;

public enum ResultEnum {
    SUCCESS(0,"success"),
    NOT_FOUND(-1,"Not Found[数据不存在或数据为空]"),
    ERROR(-1,"未知异常");


    private int code;
    private String message;

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    ResultEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
