package com.doub1e.exception;

public class ExceptionDemo3 {
    public static void main(String[] args) {
        //自定义异常
    }
    public static void save(int age){
        if(age <= 0 || age > 150 ){
            //这个年龄异常
        }
    }
}
