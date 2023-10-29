package com.itheima.a03extendsdemo3;

public class Person {
    String name;
    int age;

    public Person(){
        System.out.println("父类的无参构造");
    }
    public Person(String name,int age){
        this.name = name ;
        this.age = age ;
    }
}
