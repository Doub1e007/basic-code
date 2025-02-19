package com.doub1e.Static_SingleStance;

public class Test2 {
    public static void main(String[] args) {
        //实现单例设计模式 懒汉式单例
        B b1 = B.getInstance();
        B b2 = B.getInstance();
        System.out.println(b1);
        System.out.println(b2);

    }
}
