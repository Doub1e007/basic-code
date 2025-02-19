package com.doub1e.param;

public class methodParamDemo1 {
    public static void main(String[] args) {
        //掌握基本类型参数的传递机制 值传递 传递的书实参存储值的副本
        int a = 10;
        change(a);
        System.out.println(a);

    }
    public static void change(int a){
        System.out.println(a);
        a = 20;
        System.out.println(a);
    }
}
