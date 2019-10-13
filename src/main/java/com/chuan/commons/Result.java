package com.chuan.commons;

/**
 * @author qq491
 */
public class Result {
    private int bizNo;
    private String bizMsg;
    private Object data;

    public static Result success(){
        return new Result(1,"",null);
    }

    public static Result success(Object data) {
        return new Result(1, "", data);
    }

    public static Result errorParam() {
        return new Result(-1, "参数输入错误", null);
    }

    public static Result error(String message) {
        return new Result(-1, message, null);
    }

    public Result(int bizNo, String bizMsg, Object data) {
        this.bizNo = bizNo;
        this.bizMsg = bizMsg;
        this.data = data;
    }

    public int getBizNo() {
        return bizNo;
    }

    public void setBizNo(int bizNo) {
        this.bizNo = bizNo;
    }

    public String getBizMsg() {
        return bizMsg;
    }

    public void setBizMsg(String bizMsg) {
        this.bizMsg = bizMsg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
