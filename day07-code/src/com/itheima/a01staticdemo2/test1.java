package com.itheima.a01staticdemo2;

public class test1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        sb.append("aaa");
        sb.append("bbb");
        sb.append("ccc");
        sb.append("ddd");

        //链式编程
        // sb.append("aaa").append("bbb").append("ccc").append("ddd");

        System.out.println(sb);

        //变回字符串
        String str = sb.toString();
        System.out.println(str);
    }
}
