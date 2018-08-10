package com.ds.util;


/**
 * 异常信息类
 */
public class DsException extends Exception{
    //异常信息
    public String message;

    public DsException(String message){
        super(message);
        this.message = message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {

        return message;
    }
}
