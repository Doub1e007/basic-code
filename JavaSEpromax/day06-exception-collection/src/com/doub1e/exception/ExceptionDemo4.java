package com.doub1e.exception;

public class ExceptionDemo4 {
    public static void main(String[] args) {
        //自定义异常2
        System.out.println("===开始===");
        try {
            save(50);
        } catch (AgeIllegalException e) {
            e.printStackTrace();//打印异常对象信息
        }
        System.out.println("===结束===");
    }
    public static void save(int age) throws AgeIllegalException {
        //throw 方法内部使用的 创建异常并从此点抛出
        //throws 方法上 抛出方法内部的异常给调用者
        if(age <= 0 || age > 150 ){
            //这个年龄异常 创建异常对象并立即抛出
            throw new AgeIllegalException("age is wrong");
        }
        System.out.println("年龄保存成功！年龄是" + age);
    }
}