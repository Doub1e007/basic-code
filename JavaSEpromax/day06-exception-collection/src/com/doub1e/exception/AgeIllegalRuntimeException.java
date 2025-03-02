package com.doub1e.exception;
//自定义运行时异常

/*
* 1.继承RuntimeException
* 2.重写构造器
* */
public class AgeIllegalRuntimeException extends RuntimeException {
    public AgeIllegalRuntimeException() {
    }

    public AgeIllegalRuntimeException(String message) {
        super(message);
    }
}
