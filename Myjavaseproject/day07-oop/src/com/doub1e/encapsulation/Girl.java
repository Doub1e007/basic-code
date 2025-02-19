package com.doub1e.encapsulation;

public class Girl {
    private String name;
    //封装第一步规范 合理隐藏 私有成员变量 使用private修饰
    //private修饰的成员变量只能在本类中访问 其他地方不能直接访问

    private int age;
    private double chinese;
    private double math;

    //封装第二步规范 合理暴露
    //给私有的成员变量提供公开的set方法和get方法
    //public修饰的成员就是公开的意思 他修饰的成员可以在任意地方直接访问
    //赋值 set
    public void setAge(int age){
        if(age > 0 && age < 100){
            this.age = age;
        }else{
            System.out.println("年龄不合法");
        }
    }

    //取值 get
    public int getAge(){
        return age;
    }



    public void printAllScore() {}
    public void printAverageScore() {}
}
