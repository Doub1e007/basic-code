package com.doub1e.object;

import java.util.Objects;

public class Student {
    private String name;
    private int age;
    private double score;

    public Student() {
    }

    public Student(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
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

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
/*
* 比较者   t1 ==> this
* 被比较者 t2 ==> o
* */
    @Override
    public boolean equals(Object o) {
        //1.判断o如果是null 直接返回false 或者两个对象的类型不一样也直接返回false
        if (o == null || getClass() != o.getClass()) return false;
        //2.说明两个对象都是学生类型 且是不同对象 开始对比内容
        Student student = (Student) o;
        return age == student.age && Double.compare(score, student.score) == 0 && Objects.equals(name, student.name);
    }

}
