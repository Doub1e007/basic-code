package com.doub1e.Extends;

public class B extends A{
    public int k;
    public void print3(){
        //继承特点 子类中只能继承父类非私有成员
        System.out.println(i);
        print1();

        //System.out.println(j);
        //print2();
    }

}
