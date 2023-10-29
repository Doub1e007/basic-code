package com.itheima.demo4;

public class Student {
    //如果没有定义构造方法 虚拟机会自动加一个空参构造方法
    private int age;
    private String name;
    /*public Student(String name,int age){
        this.age = age;
        this.name = name;
    }*/

    public void setName(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
}
