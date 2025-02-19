package com.doub1e.pkg;

import com.doub1e.pkg2.Car;
import com.doub1e.pkg3.Tiger;

import java.util.Random;

public class Test1 {
    public static void main(String[] args) {
        //目的：在自己包下的程序中调用其他包下的程序
        //注意事项
        //1.如果当前程序中 要调用自己所在包下的其他程序 可以直接调用（同一个包下的类，互相可以直接调用
        Student s1 = new Student();

        //2.如果当前程序中 要调用其他包下的程序，需要先导入包才可以访问 格式：import 包名.类名;
        Car c = new Car();

        //3.如果当前程序中，要调用Java提供的程序，也需要先导包才可以使用，但是Java.lang包下的程序不需要导包 可直接使用
        Random r = new Random();
        System.out.println();
        String name = "abc";

        //4.如果当前程序中，要调用多个不同包下的程序，而这些程序名正好一样，此时默认只能导入一个程序，另一个程序需带包名访问
        Tiger t = new Tiger();
        t.run();
        com.doub1e.pkg2.Tiger t2 = new com.doub1e.pkg2.Tiger();
        t2.run();
    }
}
