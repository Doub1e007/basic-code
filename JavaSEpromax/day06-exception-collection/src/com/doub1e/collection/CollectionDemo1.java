package com.doub1e.collection;

import java.util.ArrayList;
import java.util.HashSet;

public class CollectionDemo1 {
    public static void main(String[] args) {
        //集合的特点
        //1.创建ArrayList集合对象 有序、可重复、有索引
        ArrayList<String> list = new ArrayList<>();
        list.add("梅西");
        list.add("罗纳尔多");
        list.add("坎塞洛");
        list.add("坎塞洛");
        list.add("瓜迪奥拉");
        list.add("莫德里奇");
        System.out.println(list);
        System.out.println(list.get(0));

        //2.Set集合 无序、不重复、无索引
        //shift + f6 同步修改
        HashSet<String> set = new HashSet<>();
        set.add("梅西");
        set.add("罗纳尔多");
        set.add("坎塞洛");
        set.add("坎塞洛");
        set.add("瓜迪奥拉");
        set.add("莫德里奇");
        System.out.println(set);
    }
}
