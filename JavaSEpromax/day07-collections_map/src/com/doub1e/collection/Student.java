package com.doub1e.collection;

public class Student implements Comparable<Student>{
    private String name;
    private int age;
    private double height;

    public Student() {
    }

    public Student(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
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

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }

    //重写compare比较方法
    //s1.compareTo(s2)
    //左边对象 s1 == this
    //右边对象 s2 == o
    @Override
    public int compareTo(Student o) {
//        if (this.age > o.age){
//            return 1;
//        }else if (this.age < o.age){
//            return -1;
//        }
//        return 0;
//        //return this.age - o.age //升序
        return o.age - this.age; //降序
    }
}
