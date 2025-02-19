package com.doub1e.arraylist;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        //掌握ArrayList集合的创建和使用
        //1.创建ArrayList集合对象代表一个容器（是一个容器 大小可变 数据可重复 有索引

        ArrayList<String> list = new ArrayList<String>(); //JDK7之后后面类型可以不写
        list.add("Java1");
        list.add("Java1");
        list.add("集合");
        System.out.println(list);
        //list = [Java1, Java1, 集合]

        //2.插入数据
        list.add(1,"全栈");
        System.out.println(list);

        //3.根据索引获取数据：
        String ele = list.get(3);
        System.out.println(ele);

        //4.获取集合的大小（元素个数
        System.out.println("集合的元素个数：" + list.size());

        //5.根据索引删除数据 返回被删除数据
        System.out.println(list.remove(1));
        System.out.println(list);

        //6.直接删除数据 返回真假 默认只能删除第一个出现的
        System.out.println(list.remove("Java1"));
        System.out.println(list);

        //7.修改某个索引位置处的数据  返回修改前的数据
        System.out.println(list.set(1, "你瞅啥"));
        System.out.println(list);
    }
}
