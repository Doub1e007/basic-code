package com.doub1e.Interface;
//接口
public interface A {
    //1.常量  接口中定义常量可以省略 public static final不写，默认会加上

    //public static final String SCHOOL_NAME = "苏州大学";
    String SCHOOL_NAME = "苏州大学";

    //2.抽象方法 接口中定义抽象方法可以省略public abstract不写，默认会加上

    //public abstract void cry();
    void cry();
    void go();
}
