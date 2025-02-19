package com.doub1e.string;

import com.doub1e.pkg.Student;

public class StringDemo1 {
    public static void main(String[] args) {
        //掌握String创建字符串对象 封装字符串数据的方法
        //1.方式一 直接“内容”就可以得到字符串对象 封装字符串数据（推荐
        String name = "小黑";
        String school = "tcc";

        //2.方式二 通过调用构造器初始化字符串对象 封装字符串数据
        String s1 = new String();  // s1 = "";
        System.out.println(s1);

        String s2 = new String("橙留香");
        System.out.println(s2);     // s2 = "橙留香";

        char[] chars = {'a','b','c','中','国'};
        String s3 = new String(chars);
        System.out.println(s3);     // s3 = "abc中国";

        byte[] bytes = {97,98,99,65,66,67};
        String s4 = new String(bytes);
        System.out.println(s4);     // s4 = "abcABC";
    }
}
