package com.doub1e.ploymorphism;

public class Dog extends Animal{
    String name = "Dog名称";
    @Override
    public void cry(){
        System.out.println("狗汪汪汪叫---");
    }

    public void lookDoor(){
        System.out.println("狗看门");
    }
}
