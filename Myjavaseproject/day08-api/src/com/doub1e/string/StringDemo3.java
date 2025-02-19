package com.doub1e.string;

public class StringDemo3 {
    public static void main(String[] args) {
        //理解String的对象时不可变的
        String name = "哪吒";
        name += "魔童闹海";
        name += "全球动画";
        System.out.println(name);

        String s1 = "abc";
        String s2 = "ab";
        String s3 = s2 + "c";
        System.out.println(s1 == s3);//false

        String t1 = "abc";
        String t2 = "a" + "b" + "c";
        System.out.println(t1 == t2);//true
    }
}
