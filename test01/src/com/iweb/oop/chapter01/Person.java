package com.iweb.oop.chapter01;

public class Person {
	private String name;
	private int age;
    private String gender;

    public Person() {
        System.out.println("我是无参构造方法");
    }

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    //最先被执行且只执行一次
    static {
        System.out.println("我是静态代码块");
    }

    public void eatting(){}
    public void sleeping(){
        int a = 10;
    }

    private void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
//        Person p1 = new Person();
//        p1.setName("李四");
//        Person p2 = new Person();
        Person p3 = new Person("张三",20,"男");
        Person p1 = new Person();
        //ctrl + alt + enter向上一行    shift + enter 向下一行
        System.out.println();
    }

}
