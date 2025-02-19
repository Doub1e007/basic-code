package com.doub1e.Static_Method;

public class Student {
    double score;
    // 静态方法 有static修饰 属于类持有 建议用类名访问 也可用对象访问
    public static void printHelloWorld(){
        for (int i = 0; i < 3; i++) {
            System.out.println("Hello World");
        }
    }
    //实例方法 对象的方法 必须用对象触发访问
    public void printPass(){
        System.out.println(score >= 60 ? "通过" : "不通过");

    }
}
