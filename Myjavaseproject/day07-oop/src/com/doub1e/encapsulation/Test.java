package com.doub1e.encapsulation;

public class Test {
    public static void main(String[] args) {
        //认识封装 搞清封装的设计规范：合理隐藏 合理暴露
        Girl g = new Girl();
//      g.name = "小丽";
        g.setAge(-18);
        System.out.println(g.getAge());
    }
}
