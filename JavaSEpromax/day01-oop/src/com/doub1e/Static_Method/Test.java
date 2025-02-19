package com.doub1e.Static_Method;

public class Test {
    public static void main(String[] args) {
        //理解静态方法 实例方法的使用
        //1.类名.静态方法(推荐)
        Student.printHelloWorld();

        //2.对象名.静态方法（不推荐
        Student s = new Student();
        s.printHelloWorld();

        //3.对象名.实例方法
        Student s1 = new Student();
        s1.score = 50;
        s1.printPass();
    }
}
