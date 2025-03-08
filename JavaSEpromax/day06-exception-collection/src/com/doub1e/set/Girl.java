package com.doub1e.set;
//法一 让类实现Comparable接口 重写compareTo方法
public class Girl implements Comparable<Girl> {
    private String name;
    private char sex;
    private int age;
    private double height;

    public Girl() {
    }

    public Girl(String name, char sex, int age, double height) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Girl{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", height=" + height +
                '}' + "\n";
    }

    @Override
    public int compareTo(Girl o) {
        return o.age - this.age >= 0 ? 1 : -1;
    }
}
