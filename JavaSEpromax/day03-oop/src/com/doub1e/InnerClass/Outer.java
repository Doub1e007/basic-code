package com.doub1e.InnerClass;
//外部类
public class Outer {
    public static String schoolName = "清华大学";
    public static void inAddr(){
        System.out.println("北京海淀区中关村大街1号");
    }
    private String hobby;
    private double height;
    public void run(){
        System.out.println("跑步");
    }
    //成员内部类
    //特点 无static修饰 属于外部类的对象修饰
    //必须存在外部类对象 才会有这个成员内部类
    public class Inner{
        private String name;
        private int age;

        public Inner() {
        }

        public Inner(String name, int age) {
            this.name = name;
            this.age = age;
        }

        //拓展 成员内部类访问外部类的成员特点
        public void show(){
            //1.成员内部类中，是否可以直接访问外部类的静态成员？ 可以
            System.out.println(schoolName);
            inAddr();

            //2.成员内部类中，是否可以直接访问外部类的实例成员？ 可以
            System.out.println(hobby);
            System.out.println(height);
            run();
        }
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}
