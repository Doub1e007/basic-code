package com.doub1e.Extends_demo;

public class Test {
    public static void main(String[] args) {
        //继承的好处
        Teacher t = new Teacher();
        t.setName("张三");
        t.setSkill("打手枪");
        System.out.println(t.getName());
        System.out.println(t.getSkill());
    }
}
