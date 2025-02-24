package com.doub1e.InnerClass2;
//外部类
public class Outer {
    //静态内部类 由static修饰 属于外部类本身
    public static String schoolName = "清华大学";
    public static void inAddr(){
        System.out.println("北京海淀区中关村大街1号");
    }
    private double height;

    public static class Inner{
        //类有的成分都有
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
            //1.静态内部类中，是否可以直接访问外部类的静态成员？ 可以
            System.out.println(schoolName);
            inAddr();
            //2.静态内部类中，是否可以直接访问外部类的实例成员？ 不可以
            //System.out.println(height); //报错
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
