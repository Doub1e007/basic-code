package com.doub1e.Abstract;

public class Test {
    public static void main(String[] args) {
        //抽象类 及其 特点
        //抽象类核心特点： 抽象类不能创建对象

        //A a = new A(); //报错
        //一个类继承抽象类 必须重写完抽象类的全部抽象方法 否则这个类也必须是抽象类
        B b = new B();
    }
}
