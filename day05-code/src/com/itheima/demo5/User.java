package com.itheima.demo5;

public class User {
    //属性
    private String username;
    private String password;
    private int age;
    private String gender;

    //空参
    public User(){};
    //全部参数
    public User(String username,String password,int age,String gender){
        this.username=username;
        this.age=age;
        this.password=password;
        this.gender=gender;
    };
    //方法

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge(){
        return age;
    }

    public void setGender(String gender){
        this.gender=gender;
    }
    public String getGender(){
        return gender;
    }
    //快捷键：alt+insert
    //一键生成标准javabean  插件gtp

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
