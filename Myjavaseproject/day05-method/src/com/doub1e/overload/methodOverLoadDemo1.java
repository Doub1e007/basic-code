package com.doub1e.overload;

public class methodOverLoadDemo1 {
    public static void main(String[] args) {
        //认识方法重载
        //同一个类中 方法名称相同 形参列表必须不同
        test();
        test(10);

        //形参类别不同指的是：个数不同 类型不同 顺序不同
    }
    public static void test(){}
    public static void test(int a){}
    public static void test(double a){}
    public static void test(double a,int b){}
    public static void test(int b,double a){}

}
