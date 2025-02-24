package com.doub1e.InnerClass;

public class Test {
    public static void main(String[] args) {
        //掌握成员内部类
        //外部类名.内部类名 对象名 = new 外部类名().new 内部类名();
        Outer.Inner in = new Outer().new Inner();
        in.setName("张三");
        in.show();

        People.Heart h = new People().new Heart();
        h.show();
    }
}
