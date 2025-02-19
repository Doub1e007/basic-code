package com.doub1e.javabean;

public class Student {
    //1.私有成员变量
    private String name;
    private char sex;
    private double height;
    private double score;

    //2.提供公共的无参数构造器 默认存在


    public Student() {
    }

    public Student(String name, char sex, double height,double score) {
        this.name = name;
        this.sex = sex;
        this.height = height;
        this.score = score;
    }


    //3.提供公共的成员方法 get set 方法

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

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public double getScore() {
        return score;
    }
}
