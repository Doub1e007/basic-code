package com.doub1e.exception;

public class ExceptionDemo3 {
    public static void main(String[] args) {
        //自定义异常
        System.out.println("===开始===");
        try {
            save(50);
            System.out.println("执行成功");
        } catch (Exception e) {
            e.printStackTrace();//打印异常信息
            System.out.println("执行失败");
        }
        System.out.println("===结束===");
    }
    public static void save(int age){
        if(age <= 0 || age > 150 ){
            //这个年龄异常 创建异常对象并立即抛出
            throw new AgeIllegalRuntimeException("age is wrong");
        }
        System.out.println("年龄保存成功！年龄是" + age);
    }
}
