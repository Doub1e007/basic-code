package com.doub1e.Interface_test;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        //班级学生管理系统
        //1.每个学生是一个对象 先定义学生类 用于创建学生对象 封装学生数据
        //2.定义接口 ClassData
        //3.定义两套实现类 分别处理 以便解耦合
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("里奥",'男',88));
        students.add(new Student("詹姆斯",'男',68));
        students.add(new Student("钟灵",'女',90));
        students.add(new Student("王语嫣",'女',75));
        students.add(new Student("和尚",'男',85));
        students.add(new Student("问天",'男',77));
        students.add(new Student("敖光",'男',93));
        students.add(new Student("申公豹",'男',100));
        students.add(new Student("佳腾",'男',96));

        ClassData data = new ClassDataImpl1(students);
        data.printAllStudentInfo();
        data.printAllStudentAverageScore();
    }
}
