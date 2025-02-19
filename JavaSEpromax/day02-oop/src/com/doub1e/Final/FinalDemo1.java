package com.doub1e.Final;

public class FinalDemo1 {
    //5.final修饰静态成员变量 称为常量
    //static final修饰的成员变量今后叫做常量 值只有一个而且不能被改变
    //常量命名规范 全部大写 多个单词用下划线连接
    public static final String SCHOOL_NAME = "南方科技大学";
    public static final String SCHOOL_NAME2 ;
    static {
        SCHOOL_NAME2 = "北京理工大学";
    }

    //6.final修饰实例成员变量（语法
    private final String name = "赵今麦";  //无意义

    public static void main(String[] args) {
        //掌握final关键字
        //3.final修饰变量 有且仅能赋值一次
        //Java变量有两种
        /*
        局部变量 方法内，形参，for循环变量，构造器的变量都是局部变量
        成员变量
            静态成员变量
            实例成员变量
        * */
        //4.final修饰局部变量
        final int a = 10;
        //a = 15;  //二次赋值报错
        final double PI = 3.14;
        buy(0.7);

        //SCHOOL_NAME = "北京理工大学"; //二次赋值报错
    }
    public static void buy(final double z){
        // z = 0.1 //二次赋值报错
    }
}
//1.final修饰类 类不能被继承
//final class A{}
//class B extends A{}

//2.final修饰方法 方法不能被重写
//
//class C{
//    public final void run(){
//
//    }
//}
//
//class D extends C{
//    @Override
//    public void run() {
//
//    }
//}

