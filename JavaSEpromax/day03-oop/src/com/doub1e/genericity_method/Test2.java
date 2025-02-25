package com.doub1e.genericity_method;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        //通配符和上下限
        //所有汽车要一起参加比赛
        ArrayList<TSL> tsls = new ArrayList<TSL>();
        tsls.add(new TSL());
        tsls.add(new TSL());
        tsls.add(new TSL());
        go(tsls);

        ArrayList<LX> lxes = new ArrayList<LX>();
        lxes.add(new LX());
        lxes.add(new LX());
        lxes.add(new LX());
        go(lxes);

//        ArrayList<Dog> dogs = new ArrayList<Dog>();
//        dogs.add(new Dog());
//        dogs.add(new Dog());
//        dogs.add(new Dog());
//        go(dogs);
    }
    //虽然LX和TSL都是Car的子类 但是ArrayList<LX>和ArrayList<TSL>与ArrayList<Car>没有关系
    //通配符：就是？ 可以在使用泛型的时候代表一切类型  E T K V是定义时使用
    //泛型的上下限  ? extends Car(上限，?必须是Car或Car的子类
    //           ? super Car(下限，?必须是Car或Car的父类
    public static void go(ArrayList<? extends Car> cars){

    }

}
class Car{

}
class TSL extends Car{

}
class LX extends Car{

}
class Dog {}