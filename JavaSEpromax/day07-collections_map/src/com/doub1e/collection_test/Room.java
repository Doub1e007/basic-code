package com.doub1e.collection_test;
//房间对象

import java.util.ArrayList;

public class Room {
    //1.准备一副牌
    private ArrayList<Card> allCards = new ArrayList<>();
    //2.初始化54张牌
    {
        //3.准备点数 个数确定 类型确定 用数组存储
        String[] numbers = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        //4.准备花色 个数确定 类型确定 用数组存储
        String[] colors = {"♠","♥","♣","■"};
        //5.准备组装每一张牌对象
        for (String number : numbers) {
            for (String color : colors) {
                //6.创建对象封装这张牌数据
                Card c = new Card(number, color);
                //7.加入到集合中
                allCards.add(c);
            }
        }
        //8.单独加入大小王
        allCards.add(new Card("",""));
        allCards.add(new Card("",""));
    }
    public void start() {

    }


}
