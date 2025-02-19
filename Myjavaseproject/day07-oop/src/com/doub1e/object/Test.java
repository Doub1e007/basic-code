package com.doub1e.object;

public class Test {
    public static void main(String[] args) {
        //创建对象的格式 类名 对象名 = new 类名();
        Student s1 = new Student();
        s1.name = "张三";
        s1.chinese = 100;
        s1.math = 100;
        s1.printScore();
        s1.printAverageScore();

        Student s2 = new Student();
        s2.name = "messi";
        s2.chinese = 10;
        s2.math = 90;
        s2.printScore();
        s2.printAverageScore();

    }
}
