package com.doub1e.math;

public class Math {
    public static void main(String[] args) {
        //math提供的常见方法

        //1.public static int abs(int a):取绝对值（拿到的结果一定是正数
        //  public static double abs (double a)
        System.out.println(java.lang.Math.abs(-12)); //12
        System.out.println(java.lang.Math.abs(123)); //123
        System.out.println(java.lang.Math.abs(-3.14)); //3.14

        //2.public static double ceil(double a):向上取整
        System.out.println(java.lang.Math.ceil(4.00001));
        System.out.println(java.lang.Math.ceil(4.0));

        //3.public static double floor(double a):向下取整
        System.out.println(java.lang.Math.floor(4.999));
        System.out.println(java.lang.Math.floor(4.0));

        //4.public static long round(double a):四舍五入
        System.out.println(java.lang.Math.round(4.999));
        System.out.println(java.lang.Math.round(3.5001));

        //5.public static int max(int a,int b):取较大值
        //  public static int min(int a,int b):取较小值
        System.out.println(java.lang.Math.max(10,20));
        System.out.println(java.lang.Math.min(10,20));

        //6.public static double pow(double a,double b)取次方
        System.out.println(java.lang.Math.pow(2,3)); //8.0
        System.out.println(java.lang.Math.pow(3,2)); //9.0

        //7.public static double random()：取随机数[0.0,1.0) 包前不包后
        System.out.println(java.lang.Math.random());
    }
}
