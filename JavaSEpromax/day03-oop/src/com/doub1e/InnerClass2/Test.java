package com.doub1e.InnerClass2;

public class Test {
    public static void main(String[] args) {
        //静态内部类
        //外部类名.内部类 对象名 = new 外部类名.静态内部类();
        Outer.Inner in = new Outer.Inner();
        in.show();

    }
}
