package com.itheima.a01staticdemo1;

public class StudentTest {
    public static void main(String[] args) {
        //创建学生对象

        Student.teacherName="狗博士";//通过类名也可直接调用
        Student s1 = new Student();
        s1.setName("张三");
        s1.setAge(23);
        s1.setGender("男");
        //s1.teacherName="猴博士";

        s1.study();
        s1.show();


        Student s2 = new Student();
        s2.setName("李四");
        s2.setAge(20);
        s2.setGender("女");

        s2.study();
        s2.show();
    }

}
