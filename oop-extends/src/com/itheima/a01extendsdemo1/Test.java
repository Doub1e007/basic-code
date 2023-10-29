package com.itheima.a01extendsdemo1;

public class Test {
    public static void main(String[] args) {
        //创建对象并调用方法
        //
        Ragdoll rd = new Ragdoll();
        rd.eat();
        rd.drink();
        rd.catchMouse();

        System.out.println("------------------------");

        Husky h = new Husky();
        h.eat();
        h.drink();
        h.lookHome();
        h.breakHome();
    }
}
