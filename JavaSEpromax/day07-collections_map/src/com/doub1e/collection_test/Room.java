package com.doub1e.collection_test;
//房间对象

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

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
        int size = 0;
        for (String number : numbers) {
            size++;
            for (String color : colors) {
                //6.创建对象封装这张牌数据
                Card c = new Card(number, color, size);
                //7.加入到集合中
                allCards.add(c);
            }
        }
        //8.单独加入大小王
        allCards.add(new Card("","red joker",++size));
        allCards.add(new Card("","block joker",++size));
        System.out.println("新牌是：" + allCards);
    }
    public void start() {
        //9.洗牌
        Collections.shuffle(allCards);
        System.out.println("洗牌后：" + allCards);

        //10.发牌
        //定义三个玩家
        List<Card> Messi = new ArrayList<>();
        List<Card> Ronaldo = new ArrayList<>();
        List<Card> Neymar = new ArrayList<>();

        //发出去51张
        for (int i = 0; i < allCards.size() - 3; i++) {
            Card c = allCards.get(i);
            //轮询
            if(i % 3 ==0){
                //Messi接牌
                Messi.add(c);
            } else if (i % 3 == 1) {
                //Ronaldo接牌
                Ronaldo.add(c);
            } else if (i % 3 == 2) {
                //Neymar接牌
                Neymar.add(c);
            }
        }

        //拿到最后三张底牌
        List<Card> lastThreeCards = allCards.subList(allCards.size() - 3, allCards.size());

        //抢地主
        Messi.addAll(lastThreeCards);

        //11.对牌排序
        sortCards(Messi);
        sortCards(Ronaldo);
        sortCards(Neymar);

        //12.看牌
        System.out.println("Messi：" + Messi);
        System.out.println("Ronaldo：" + Ronaldo);
        System.out.println("Neymar：" + Neymar);
    }

    public void sortCards(List<Card> cards) {
        Collections.sort(cards, new Comparator<Card>() {
            @Override
            public int compare(Card o1, Card o2) {
                //o1
                //o2
                return o1.getSize() - o2.getSize();
            }
        });
    }


}
