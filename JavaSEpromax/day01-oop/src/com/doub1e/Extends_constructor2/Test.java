package com.doub1e.Extends_constructor2;

public class Test {
    public static void main(String[] args) {
        //子类为什么要调用父类构造器：初始化继承自父类部分数据
        Teacher t1 = new Teacher();
        t1.setName("张三");
        t1.setAge(30);
        t1.setSkill("教学");
        System.out.println(t1.getName());
        System.out.println(t1.getAge());
        System.out.println(t1.getSkill());

        Teacher t2 = new Teacher("李四", 40, "吹牛逼");
        System.out.println(t2.getName());
        System.out.println(t2.getAge());
        System.out.println(t2.getSkill());
    }
}
