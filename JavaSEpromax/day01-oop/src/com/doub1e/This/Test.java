package com.doub1e.This;

public class Test {
    public static void main(String[] args) {
        //掌握this兄弟构造器的作用
        //1.创建对象封装数据
        Student s1 = new Student("孙悟空", 18,"三星堆");
        System.out.println(s1.getName());
        System.out.println(s1.getAge());
        System.out.println(s1.getSchool());

        //需求 只要不给学校 默认是水帘洞
        //this(..) super(..)不能同时出现 且必须出现在构造器第一行
        Student s2 = new Student("蜘蛛精", 30);
        System.out.println(s2.getName());
        System.out.println(s2.getAge());
        System.out.println(s2.getSchool());
    }
}
