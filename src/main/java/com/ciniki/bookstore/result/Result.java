package com.ciniki.bookstore.result;

//响应码类
public class Result {
    private int code;       //响应码的值

    //生成响应码
    public Result(int code) {
        this.code = code;
    }

    //获取响应码
    public int getCode() {
        return code;
    }

    //修改响应码
    public void setCode(int code) {
        this.code = code;
    }
}
