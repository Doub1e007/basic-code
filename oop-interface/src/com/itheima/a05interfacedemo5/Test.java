package com.itheima.a05interfacedemo5;

public class Test {
    public static void main(String[] args) {
        //创建运动员和教练的对象
        PingPongSporter pps = new PingPongSporter("马龙",30);
        System.out.println(pps.getName() + "," + pps.getAge());
        pps.study();
        pps.speakEnglish();
    }
}
