package com.itheima.a01polymorphismdemo1;

public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("张三");
        s.setAge(18);

        Teacher t = new Teacher();
        t.setName("川建国");
        t.setAge(30);

        Administrator a = new Administrator();
        a.setName("管理员");
        a.setAge(35);

        register(s);
        register(t);
        register(a);

    }
    //能接收多种成员
    public static void register(Person p){
        p.show();
    }
}
