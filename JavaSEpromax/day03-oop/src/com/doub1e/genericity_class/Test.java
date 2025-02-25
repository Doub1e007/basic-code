package com.doub1e.genericity_class;

public class Test {
    public static void main(String[] args) {
        //泛型类的定义
        //模拟ArrayList集合 自定义一个MyArrayList的泛型类
        MyArrayList<String> list = new MyArrayList<>();
        list.add("阿德欢乐世界");
        list.add("嘎达地方");
        list.add("公司东方大厦");
        list.remove("阿德欢乐世界");
        System.out.println(list);

    }
}
