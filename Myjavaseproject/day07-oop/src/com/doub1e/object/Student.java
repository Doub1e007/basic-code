package com.doub1e.object;
//类：对象的数据结构（对象的模板）
public class Student {
    //成员变量（对象的属性）
    String name; //名称
    double chinese; //语文成绩
    double math; //数学成绩

    //成员方法 (对象的行为)
    // 打印总成绩、平均成绩
    public void printScore() {
        System.out.println(name + "的总成绩是：" + (chinese + math));
    }

    public void printAverageScore() {

   System.out.println(name + "的平均成绩是：" + ((chinese + math) / 2)); }
}
