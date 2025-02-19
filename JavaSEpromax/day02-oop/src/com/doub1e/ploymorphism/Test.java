package com.doub1e.ploymorphism;

public class Test {
    public static void main(String[] args) {
        //认识多态
        //1.对象多态  行为多态
        Animal a1 = new Cat();
        a1.cry(); // 方法 编译看左边 行为看右边
        System.out.println(a1.name);//成员变量 编译看左边 运行也看左边

        Animal a2 = new Dog();
        a2.cry(); //方法 编译看左边 行为看右边
        System.out.println(a2.name);//成员变量 编译看左边 运行也看左边
    }
}
