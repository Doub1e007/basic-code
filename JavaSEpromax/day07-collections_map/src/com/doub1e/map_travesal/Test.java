package com.doub1e.map_travesal;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        //Map集合完成投票案例
        //1.把80个学生选择的景点找出来
        String[] location = {"玉龙雪山","伶仃岛","三亚","巴厘岛"};
        //                      0        1      2      3

        //2.定义一个List集合 随机挑选80个学生想去的景点
        List<String> data = new ArrayList<String>();
        Random r = new Random();
        for (int i = 0; i < 80; i++) {
            data.add(location[r.nextInt(location.length)]);
        }
        System.out.println(data);

        //3.定义一个Map集合 键存储景点 值存储想去的人数
        Map<String,Integer> map = new HashMap<String,Integer>();// map = {}
        for (String s : data) {
            //4.判断map集合中是否出现了该景点 如果没出现说明是第一次添加
            if (map.containsKey(s)) {
                //之前统计过 值加1
                map.put(s, map.get(s) + 1);
            } else {
                //第一次添加
                map.put(s,1);
                
            }
        }
        map.forEach((k,v)->{
            System.out.println(k + "选择人数是：" + v);

        });
    }
}
