package com.doub1e.Abstract_Demo;

public class Test {
    public static void main(String[] args) {
        //抽象类应用场景
        Animal a = new Cat();
        a.cry();

        Animal a2 = new Dog();
        a2.cry();

    }
}
