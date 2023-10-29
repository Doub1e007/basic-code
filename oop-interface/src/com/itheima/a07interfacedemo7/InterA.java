package com.itheima.a07interfacedemo7;

public interface InterA {
    public static void show1(){
        System.out.println("show1方法开始执行");
        show4();
    }

    public static void show2(){
        System.out.println("show2方法开始执行");
        show4();
    }

    //静态的私有方法 给默认方法服务
    private static void show4(){
        System.out.println("记录程序在运行中的各种细节");
    }
    //普通的私有方法 给静态方法服务
}
