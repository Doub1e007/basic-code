package com.doub1e.recursion;

public class RecursionTest1 {
    public static void main(String[] args) {
        //递归的形式
        test1();//直接递归
        test2();//间接递归
    }
    public static void test1(){
        System.out.println("test1");
        test1();
    }
    public static void test2(){
        System.out.println("test2");
        test3();
    }

    private static void test3() {
        test2();
    }
}
