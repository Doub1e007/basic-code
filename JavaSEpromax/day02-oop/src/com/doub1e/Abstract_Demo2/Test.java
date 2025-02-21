package com.doub1e.Abstract_Demo2;

public class Test {
    public static void main(String[] args) {
        //完成学生老师写作文模块(模板方法改进
        //写作步骤和架构是统一的
        // 1.第一步：写标题《我的爸爸》
        // 2.第一段：是一样的
        // 3.第二步：写正文 但是内容随意发挥
        // 4.第三步：是一样的
        People s = new Teacher();
        s.write();
    }
}
