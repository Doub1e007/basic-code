package com.itheima.test1;

public class Test {
    public static void main(String[] args) {
        /*
        final修改基本数据类型：记录的值不能发送改变
        final修饰引用数据类型：记录的地址值不能发生改变，内部的属性值可以改变
         */
        final double PI = 3.14;
        final Student S = new Student("zhangsan",23);
        //S = new Student();
        S.setName("李四");
        S.setAge(24);
    }
}
