package com.doub1e.reflect;

public class Cat {
    public static int a;
    public static final String COUNTRY = "中国";
    private String name;
    private int age;
    public Cat() {
        System.out.println("无参构造器执行了");
    }
    private Cat(String name, int age) {
        System.out.println("有参构造器执行了");
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    private void run(){
        System.out.println("猫跑的贼快");
    }
    public void eat(){
        System.out.println("猫爱吃猫粮");
    }
    private String eat(String name){
        return "猫最爱吃：" + name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
