package com.doub1e.javabean;

public class Test {
    public static void main(String[] args) {
        //认识实体类 搞清实体类的应用场景
        //实体类的作用
        //1.实体类的对象本身只负责存取对象的数据

        Student s1 = new Student("张三",'男',175,99);
        System.out.println(s1.getName());
        System.out.println(s1.getSex());
        System.out.println(s1.getHeight());
        System.out.println(s1.getScore());

        //2.实体类的对象只负责数据的存和取，而对于数据的业务处理应交给另一个类的对象来处理
        //这里软件设计中很流行的一种设计思想 分层思想
        StudentOperator operator = new StudentOperator(s1);
        operator.printPass();   //业务处理
    }
}
