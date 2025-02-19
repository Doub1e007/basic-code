package com.doub1e.ploymorphism2;

import com.doub1e.ploymorphism.Animal;
import com.doub1e.ploymorphism.Cat;
import com.doub1e.ploymorphism.Dog;

public class Test {
    public static void main(String[] args) {
        //搞清使用多态的好处
        //1.多态下右边对象是解耦合的
        Animal a = new Dog();
        a.cry();
        //多态下的一个问题：不能直接调用子类独有的功能
        //a.lookDoor();  //报错

        Cat c = new Cat();
        go(c);

        Dog d = new Dog();
        go(d);

        System.out.println("-------------------------------------");

    }
    //2.多态下父类类型作为方法的形参 可以接收一切子类对象 方法更便利
    public static void go(Animal a){
        System.out.println("开始");
        a.cry();  //对象回调
        //多态下的一个问题：不能直接调用子类独有的功能
        //a.lookDoor();  //报错
        System.out.println("结束");
    }
}
