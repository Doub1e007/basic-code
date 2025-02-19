package com.doub1e.Statci_code;

import java.util.ArrayList;

public class CodeTest2 {
    private String name;
    private ArrayList<String> names = new ArrayList<>();
    // 实例代码块：属于类的每个对象的 每次创建对象时都会自动执行一次 而且是在构造器之前执行
    //作用：完成实例变量初始化
    {
        System.out.println("===实例代码块===");
        names.add("张三");
        names.add("李四");

    }

    public CodeTest2() {
        System.out.println("===构造器===");
    }
    public static void main(String[] args) {
        //搞清实例代码块作用 应用场景
        new CodeTest2();

    }
}
