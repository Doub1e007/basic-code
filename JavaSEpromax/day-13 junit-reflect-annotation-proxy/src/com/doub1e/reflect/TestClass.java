package com.doub1e.reflect;

public class TestClass {
    public static void main(String[] args) throws Exception {
        // 反射第一步 获取Class对象
        // 方式一 类名.class
        Class c1 = Student.class;
        System.out.println(c1);

        // 方式二 Class.forName(全类名)
        Class c2 = Class.forName("com.doub1e.reflect.Student");
        System.out.println(c2);

        // 方式三 对象.getClass()
        Student s1 = new Student();
        Class c3 = s1.getClass();
        System.out.println(c3);

        System.out.println(c1 == c2);
        System.out.println(c2 == c3);
    }
}
