package com.doub1e.StaticField;

public class User {
    public static int number;//静态变量 只有一份 可以被共享

    public User(){
        //User.number++;
        //注意 访问当前类中的静态变量 可以省略类名不写
        number++;
    }
}
