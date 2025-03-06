package com.doub1e.collection_travesal;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionDemo1 {
    public static void main(String[] args) {
        //Collection集合的遍历方式一：迭代器遍历
        //1.准备一个集合
        ArrayList<String> list = new ArrayList<>();
        list.add("梅西");
        list.add("C罗");
        list.add("内马尔");
        System.out.println(list);
        //list = [梅西, C罗, 内马尔]
        //         it

        //2.得到这个集合对象的迭代器对象
        Iterator<String> it = list.iterator();

//        System.out.println(it.next());
//        System.out.println(it.next());
//        System.out.println(it.next());
        //System.out.println(it.next());

        //3.使用循环改进
        while (it.hasNext()) {
            String ele = it.next();
            System.out.println(ele);
        }

    }
}
