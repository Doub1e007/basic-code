package com.doub1e.arraylist;

public class ArrayListTest3 {
    public static void main(String[] args) {
        //完成菜品上架 浏览功能 结合面向对象编程和ArrayList
        //1.每个菜品是一个对象 定义一个菜品类 用于创建菜品对象 封装菜品数据
        //2.定义一个菜品操作类 用于创建菜品操作对象负责对菜品数据进行业务处理
        FoodOperator operator = new FoodOperator();
        operator.start();
    }
}
