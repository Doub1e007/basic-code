package com.doub1e.Enum;

public class Test {
    public static void main(String[] args) {
        //枚举类及其特点
        //A a = new A(); //报错
        A a1 = A.X;
        A a2 = A.Y;
        A a3 = A.Z;
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

        System.out.println("-----------------------------");

        //values是拿到枚举类的全部对象 放到数组中返回
        A[] as = A.values();
        for (int i = 0; i < as.length; i++) {
            A a = as[i];
            System.out.println(a);
        }
        A y = A.valueOf("Y");
        System.out.println(y == a2);

        //ordinal拿对象的索引
        System.out.println(a1.ordinal()); //0
        System.out.println(a2.ordinal()); //1
    }
}
