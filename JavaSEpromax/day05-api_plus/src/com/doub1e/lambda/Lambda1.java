package com.doub1e.lambda;

public class Lambda1 {
    public static void main(String[] args) {
        //lambda是如何简化匿名内部类的
        Animal a1 = new Animal() {
            @Override
            public void run() {
                System.out.println("老虎跑得快");
            }
        };
        a1.run();

        //Lambda表达式只能简化函数式接口的匿名内部类
//        Animal a2 = () -> {
//                System.out.println("老虎跑得快");
//            }
//        };
//        a2.run();
        Swimming s1 = new Swimming() {
            @Override
            public void swim() {
                System.out.println("学生游泳快");
            }
        };
        s1.swim();

        //Lmabda可以简化函数式接口匿名内部类
        //可以上下文推断出真实代码形式
        Swimming s2 = () -> {
                System.out.println("学生游泳快");
        };
        s2.swim();
    }
}
@FunctionalInterface //函数式接口中有且仅有一个抽象方法
interface Swimming{
    void swim();
}

abstract class Animal {
    public abstract void run();
}