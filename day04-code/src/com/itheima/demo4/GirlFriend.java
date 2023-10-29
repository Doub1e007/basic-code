package com.itheima.demo4;
//java中须先设计类，才能获取对象
public class GirlFriend {
    private String name;
    private int age;
    private String gender;


    //set方法：给成员变量赋值
    //get方法：对外提供成员变量的值
    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
       if(age >= 18 && age<= 50){
           this.age = age;
       }else {
           System.out.println("非法数据");
       }
    }
    public int getAge(){
        return age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public String setGender(){
        return gender;
    }

    public void sleep(){
        System.out.println("女朋友在睡觉");
    }
    public void eat(){
        System.out.println("女朋友在干饭");
    }
}
