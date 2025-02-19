package com.doub1e.StaticField;

public class Test2 {
    public static void main(String[] args) {
        //搞清static修饰成员变量的应用场景
        new User();
        new User();
        new User();
        System.out.println("创建了几个对象：" + User.number);
    }
}
