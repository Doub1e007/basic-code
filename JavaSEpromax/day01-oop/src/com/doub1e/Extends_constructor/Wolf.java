package com.doub1e.Extends_constructor;

public class Wolf extends Animal{
    public Wolf(){
        //super(); //写不写都存在 调用父类无参构造器的
        System.out.println("===子类Wolf的无参数构造器执行===");
    }
    public Wolf(String n){
        //super(); 写不写都存在 调用父类无参构造器的
        System.out.println("===子类Wolf的有参数构造器执行===");
    }
}
