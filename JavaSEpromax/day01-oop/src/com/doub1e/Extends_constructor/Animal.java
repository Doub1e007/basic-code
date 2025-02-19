package com.doub1e.Extends_constructor;

public class Animal {
    public Animal(){
        System.out.println("===父类Animal的无参数构造器执行了===");
    }

    public Animal(String n){
        System.out.println("===父类Animal的有参数构造器执行了===" + n);
    }
}
