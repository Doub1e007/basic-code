package com.itheima.a04extendsdemo4;

public class Student {
     String name;
     int age;
     String school;

    public Student() {
        //表示调用本类其他构造方法
        this(null,0,"黑马学院");
    }

    public Student(String name, int age, String school) {
        this.name = name;
        this.age = age;
        this.school = school;
    }
         
}
