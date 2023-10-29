package com.itheima.a01staticdemo2;

import java.util.StringJoiner;

public class test2 {
    public static void main(String[] args) {
        //创建一个对象 并指定分割符
        StringJoiner sj = new StringJoiner(",","[","]");

        sj.add("aaa").add("bbb").add("ccc");
        int len = sj.length();

        System.out.println(len);
        System.out.println(sj);

        String str = sj.toString();
        System.out.println(str);

    }
}
