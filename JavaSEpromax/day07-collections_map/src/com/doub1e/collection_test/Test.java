package com.doub1e.collection_test;

public class Test {
    public static void main(String[] args) {
        //斗地主案例实现
        //{"3","4","5","6","7","8","9","10","J","Q","K","A","2"}
        //{"♠","♥","♣","■"}
        //每张牌是一个对象 设计一个牌类
        //设计一个房间类 用于创建房间对象 开启游戏
        Room r = new Room();
        r.start();
    }
}
