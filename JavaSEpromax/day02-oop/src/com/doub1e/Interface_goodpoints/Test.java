package com.doub1e.Interface_goodpoints;

public class Test {
    public static void main(String[] args) {
        //接口的好处
        //1.弥补类单继承的不足  接口让一个对象拥有更多角色更强能力
        People p = new Student();

        Driver d = new Student();//多态
        Doctor d2 = new Student();

        //2.面向接口编程能更灵活实现解耦合
        Driver d3 = new Teacher();
        Driver d4 = new Student();
    }
}
