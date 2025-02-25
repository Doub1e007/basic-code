package com.doub1e.object;

public class Test {
    public static void main(String[] args) {
        //Object的常用方法
        Student s1 = new Student("小王",21,100);
        //1.toString默认返回对象的所谓的地址形式其实是没有意义的 因此toString是为了让子类重写
        System.out.println(s1.toString());//直接输出对象时 toString可以不写
        System.out.println(s1);

        System.out.println("-------------------------");
        //2.equals方法默认是比较两个对象的地址是否一样
        //比较两个对象的地址是否一致可以直接用 == 比较 没必要用equals比较
        //因此Object提供equals是为了让子类重写 以便自己制定比较规则(按内容比较
        Student t1 = new Student("赵敏",22,88);
        Student t2 = new Student("赵敏",22,88);
        System.out.println(t1.equals(t2)); //false
        System.out.println(t1 == t2); //false
    }
}
