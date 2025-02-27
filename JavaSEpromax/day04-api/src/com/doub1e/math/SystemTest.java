package com.doub1e.math;

public class SystemTest {
    public static void main(String[] args) {
        //1.public static void exit(int status)
        //终止当前运行的Java虚拟机
        //该参数用作状态代码 非零状态代码表示异常终止
        System.out.println("开始。。");
        //System.exit(0);  0代表是正常终止JVM虚拟机（禁止使用

        //2.public static long currentTimeMills():返回的是从1970-1-1 00：00:00走到此刻的总毫秒量（1s = 1000ms
        long time = System.currentTimeMillis(); //获取系统的时间毫秒值
        System.out.println(time);

        //可做性能统计
        for (int i = 0; i < 1000000; i++) {
            System.out.println(i);
        }
        long time2 = System.currentTimeMillis(); //获取系统的时间毫秒值
        System.out.println((time2 - time)/1000.0 + "s");
    }
}
