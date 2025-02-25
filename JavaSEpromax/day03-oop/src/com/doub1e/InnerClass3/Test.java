package com.doub1e.InnerClass3;

public class Test {
    public static void main(String[] args) {
        //匿名内部类
        //匿名内部类是一个子类 同时会立即创建一个子类对象
        //匿名内部类的名称：当前类名&编号
        Animal a = new Animal(){
            @Override
            public void cry() {
                System.out.println("狗是旺旺叫的~");
            }
        };
        a.cry();
    }
}
//class Dog extends Animal{
//    @Override
//    public void cry() {
//        System.out.println("狗叫");
//    }
//}

abstract class Animal{
    public abstract void cry();
}