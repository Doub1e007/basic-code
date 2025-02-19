package com.doub1e.Extends_feature;

public class Test {
    public static void main(String[] args) {
        //继承的特点
        M m = new M();
    }
}
//1.Java是单继承的 一个类只能继承一个直接父类
//2.Java不支持多继承
//class A{}
//class B{}
//class C extends A,B{}//错误

//3.Java支持多层继承
//4.Java中所有的类都直接或间接的继承自Object类
class M extends Object{}
class N extends M{}
class P extends N{}