package com.doub1e.list;

import java.util.ArrayList;

public class ListTest {
    public static void main(String[] args) {
        //底层基于数组 根据索引查询块 增删相对较慢
        ArrayList<String> list = new ArrayList<>();
        list.add("java1");//第一次加数据开始扩容
        list.add("java2");
        list.add("java3");
        list.add("java4");
        list.add("java5");
        list.add("java6");
        list.add("java7");
        list.add("java8");
        list.add("java9");
        list.add("java10");
        list.add("java11");

        list.remove(2);
    }
}
