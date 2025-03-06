package com.doub1e.collection_travesal;

import java.util.ArrayList;

public class CollectionDemo2 {
    public static void main(String[] args) {
        //Collection集合的遍历方式二：增强for循环
        //1.准备一个集合
        ArrayList<String> list = new ArrayList<>();
        list.add("梅西");
        list.add("C罗");
        list.add("内马尔");

        //2.增强for循环遍历集合
        for (String s : list) {
            System.out.println(s);
        }

        //3.增强for也可以遍历数组
        int[] ages = {19,18,26,22};
        for (int age : ages) {
            System.out.println(age);
        }
    }
}
