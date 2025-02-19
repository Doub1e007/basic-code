package com.doub1e.constructor;

public class Student {
    //构造器要求 名称必须和类名一致 不能写返回值声明
    //构造器特点：每次创建对象时，对象会立即调用构造器
    //构造器作用：1.创建对象时同时为对象赋值
    //1.无参数构造器
    public Student() {
        System.out.println("==Student的无参数构造器执行==");
    }

    //2.有参数构造器
    public Student(String n,double s){
        System.out.println("==Student的有2个参数构造器执行==");
    }
    public Student(String n){
        System.out.println("==Student的有1个参数构造器执行==");
    }

}
