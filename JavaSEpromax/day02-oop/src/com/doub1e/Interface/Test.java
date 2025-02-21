package com.doub1e.Interface;

public class Test {
    public static void main(String[] args) {
        //认识接口及其特点
        //接口最值得注意的一点是： 不能创建对象
        //A a = new A();
        BImpl b = new BImpl();
        b.go();
        b.cry();
        b.eat();

    }
}
