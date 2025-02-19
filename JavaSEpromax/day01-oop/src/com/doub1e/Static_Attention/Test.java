package com.doub1e.Static_Attention;

public class Test {
    //静态变量
    public static String schoolName = "深圳大学";
    //静态变量
    public static void inArr(){
        System.out.println("我们都在广东深圳");
    }
    //实例变量
    private String name ;
    //实例方法
    public void printInfo(){
        System.out.println("姓名是："+name);
    }
    public static void main(String[] args) {
        //理解使用static的注意事项
        Test t = new Test();
        t.testNoStatic();

        //3.实例方法中可以出现this关键字 静态方法中不可以出现this关键字

    }
    //1.静态方法中可以直接访问类的成员 不可以直接访问实例成员
    public static void testStatic(){
        System.out.println(schoolName);
        inArr();

        //System.out.println(this);  报错
        //System.out.println(name);  报错
        //printInfo();   报错
    }

    //2.实例方法中既可以直接访问静态成员 也可以直接访问实例成员
    public void testNoStatic(){
        System.out.println(schoolName);
        inArr();
        System.out.println(this);

        System.out.println(name);
        printInfo();
    }
}
