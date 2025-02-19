package com.doub1e.Statci_code;

import java.util.ArrayList;

public class CodeTest1 {
    public static String schoolName ;
    public static ArrayList<String> names = new ArrayList<String>() ;
    //静态代码块 有static修饰 属于类持有 与类一起优先加载 自动执行一次
    //作用：可以用来初始化静态变量的数据
    static {
        System.out.println("===静态代码块执行了===");
        schoolName = "清华大学" ;
        names.add("张三");
        names.add("李四");
    }

    public static void main(String[] args) {
        //搞清楚静态代码块的特点 了解其应用场景
        System.out.println("===main方法执行了===");
        System.out.println(names);
    }

}
