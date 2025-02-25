package com.doub1e.genericity;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        //泛型
//        ArrayList list = new ArrayList();
//        list.add("北京");
//        list.add("CSGO");
//        list.add("1");
//        list.add(99);
//
//        //1.开发中很多时间需要统一数据类型（如果不使用泛型 类型没办法统一 需要进行强制转换
//        for (int i = 0; i < list.size(); i++) {
//            Object ele = list.get(i);
//            String result = (String) ele; //强制转换
//            System.out.println(result);
//        }
        System.out.println("-----------------------------");

        // ArrayList<String> list2 = new ArrayList<String>();
        ArrayList<String> list2 = new ArrayList<>(); //jdk1.7开始后面类型可以不写
        list2.add("北京");
        list2.add("CSGO");
        list2.add("1");
        for (int i = 0; i < list2.size(); i++) {
            String els = list2.get(i);
            System.out.println(els);
        }

    }
}
