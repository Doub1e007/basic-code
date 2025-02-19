package com.doub1e.ploymorphism;

public class Cat extends Animal{
    String name = "Cat名称";
    @Override
    public void cry(){
        System.out.println("猫喵喵喵叫");
    }
    public void catchMouse(){
        System.out.println("猫抓老鼠");
    }
}
