package com.doub1e.Static_SingleStance;

public class Test {
    public static void main(String[] args) {
        //实现单例设计模式 饿汉式单例
        A a1 = A.getInstance();
        A a2 = A.getInstance();
        System.out.println(a1);
        System.out.println(a2);



    }
}
