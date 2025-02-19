package com.doub1e.Static_SingleStance;

public class B {
    //2.定义一个静态变量用于记住类的一个唯一对象
    private static B b;//b == null

    //1.私有构造器
    private B(){

    }

    //3.提供一个静态的get方法 返回一个唯一的对象
    public static B getInstance(){
        //第一次来拿对象的时候 是需要创造对象的 后面不创建
        if(b == null){
            //第一次拿对象;
            b = new B();
        }
        return b;
    }
}
