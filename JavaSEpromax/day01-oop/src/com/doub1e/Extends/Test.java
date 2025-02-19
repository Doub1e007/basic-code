package com.doub1e.Extends;

public class Test {
    public static void main(String[] args) {
        //认识继承 以及继承后子类创建对象的特点
        //子类对象创建特点 会由子类和父类等多张设计图共同创建出子类对象 但是能访问什么看权限
        B b = new B();
        System.out.println(b.i);
        //System.out.println(b.j); 报错
        //System.out.println(b.k); 报错
        b.print1();
        //b.print2();
        b.print3();
    }
}
