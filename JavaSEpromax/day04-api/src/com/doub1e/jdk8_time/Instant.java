package com.doub1e.jdk8_time;

public class Instant {
    public static void main(String[] args) {
        //1.创建Instant的对象 获取此刻时间信息
        java.time.Instant now = java.time.Instant.now();
        System.out.println(now);

        //2.获取总秒数
        System.out.println(now.getEpochSecond());
        //3.不够1秒的纳秒数
        System.out.println(now.getNano());

        //Instant对象的作用：做代码性能分析

    }
}
