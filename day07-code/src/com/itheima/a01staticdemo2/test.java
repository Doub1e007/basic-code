package com.itheima.a01staticdemo2;

public class test {
    public static void main(String[] args) {
        //创建对象
        StringBuilder sb = new StringBuilder("abc");

        //添加元素
        /*sb.append(1);
        sb.append(2.3);
        sb.append("lmh");*/
        //反转
        sb.reverse();

        //长度
        int len = sb.length();
        System.out.println(len);
        //打印
        System.out.println(sb);
    }

}
