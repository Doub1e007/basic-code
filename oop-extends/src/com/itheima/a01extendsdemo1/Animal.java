package com.itheima.a01extendsdemo1;

public class Animal {

    //子类只能访问父类非私有成员
    public void eat(){
        System.out.println("吃东西");
    }

    public void drink(){
        System.out.println("喝水");
    }
}
