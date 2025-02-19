package com.doub1e.StaticField;

public class Test {
    public static void main(String[] args) {
        //理解static修饰成员变量的用法
        //1.类名.静态变量 （推荐
        Student.name = "袁华";
        System.out.println(Student.name);

        //对象.静态变量 （不推荐
        Student s1 = new Student();
        s1.name = "马冬梅";

        //对象.静态变量 （不推荐
        Student s2 = new Student();
        s2.name = "秋雅";

        System.out.println(s1.name); //秋雅

        //2.对象.实例变量
        s1.age = 18;
        s2.age = 19;
        System.out.println(s1.age); //18

    }
}
