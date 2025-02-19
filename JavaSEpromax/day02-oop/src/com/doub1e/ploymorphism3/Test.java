package com.doub1e.ploymorphism3;

import com.doub1e.ploymorphism.Animal;
import com.doub1e.ploymorphism.Cat;
import com.doub1e.ploymorphism.Dog;

import static com.doub1e.ploymorphism2.Test.go;

public class Test {
    public static void main(String[] args) {
        //多态下的类型转换问题
        Animal a = new Dog();
        a.cry();
        //强制类型转换 解决多态下不能直接调用子类独有方法的问题
        Dog d1 = (Dog)a;
        d1.lookDoor();
        //强制类型转换注意事项1.只有有继承或者实现关系的两个类就可以强制转换
        //编译阶段不会报错（写代码  但是运行可能出现强制类型转换异常
        //Cat c1 = (Cat)a;  编译阶段不报错 运行出现异常

        Cat c = new Cat();
        go(c);

        Dog d = new Dog();
        go(d);
    }

    public static void go(Animal a){
        System.out.println("开始。。。");
        a.cry();
        //Java中建议强制转换前 先判断对象的真实类型 再进行强制转换
        if(a instanceof Dog){
            Dog d2 = (Dog)a;
            d2.lookDoor();
        } else if (a instanceof Cat) {
            Cat c2 = (Cat)a;
            c2.catchMouse();
        }
        System.out.println("结束。。。");
    }
}
