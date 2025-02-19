package com.doub1e.constructor;

public class Test2 {
    public static void main(String[] args) {
        //构造器作用：1.创建对象时同时为对象赋值
        //特点：类默认自带无参构造器，写不写都有
        //如果写了一个有参构造器，那么默认的无参构造器就不存在了
        //如果还想使用无参构造器，需要手动写出来
        Girl g1 = new Girl();
        g1.name = "小丽";
        g1.height = 165;
        g1.weight = 45;
        g1.color = "white";
        System.out.println(g1.name);
        System.out.println(g1.height);
        System.out.println(g1.weight);
        System.out.println(g1.color);

        Girl g2 = new Girl("汤圆", 165, 50, "yellow");
        System.out.println(g2.name);
        System.out.println(g2.height);
        System.out.println(g2.weight);
        System.out.println(g2.color);
    }
}
