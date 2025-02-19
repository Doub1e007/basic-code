package com.doub1e.Abstract;
//抽象类 使用abstract修饰
public abstract class A {
    private String name;
    private int age;

    public A() {
    }

    public A(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //抽象方法 使用abstract修饰 只能有方法签名没有方法体
    public abstract void go();
    public abstract void run();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
