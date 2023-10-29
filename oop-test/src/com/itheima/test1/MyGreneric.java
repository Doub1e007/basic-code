package com.itheima.test1;

public class MyGreneric<T> {
    private T t;
    public T getT(){
        return t;
    }
    public void setT(T t){
        this.t = t;
    }


    public static void main(String[] args) {
        MyGreneric<Integer> myGreneric = new MyGreneric<>();
        myGreneric.setT(10);//10:基本类型 自动装箱 基本类型->包装类

    }
}
