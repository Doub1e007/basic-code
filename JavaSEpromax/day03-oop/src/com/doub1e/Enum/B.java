package com.doub1e.Enum;
//单例模式
public enum B {
    X;
    private String name;
    private int age;

    B(String name, int age) {
        this.name = name;
        this.age = age;
    }

    B() {
    }

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
