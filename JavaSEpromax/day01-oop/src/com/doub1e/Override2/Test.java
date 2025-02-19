package com.doub1e.Override2;

public class Test {
    public static void main(String[] args) {
        //搞清楚方法重写实际应用
        Student s = new Student("赵敏",'女',18,"执着 真诚");
        //System.out.println(s.toString());//输出对象 默认是调用继承自父类Object的toString返回的所谓地址值
        System.out.println(s);
    }
}
