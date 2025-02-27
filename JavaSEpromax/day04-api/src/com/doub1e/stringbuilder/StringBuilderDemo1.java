package com.doub1e.stringbuilder;

public class StringBuilderDemo1 {
    public static void main(String[] args) {
        //使用StringBuilder
        //1.创建StringBuilder对象
        StringBuilder sb = new StringBuilder(); // sb = ""
        StringBuilder sb2 = new StringBuilder("北京"); //sb2 = "北京"
        System.out.println(sb);
        System.out.println(sb2);

        //2.拼接内容
        sb.append("国科大研究院").append("大模型").append("Python").append(true);
        System.out.println(sb);

        //3.反转内容
        sb.reverse();
        System.out.println(sb);

        //4.取长度
        System.out.println(sb.length());

        //5.把StringBuilder对象转换成String对象
        //StringBuilder是字符串拼接的手段
        //String才是开发的目的
        String result = sb.toString();
        System.out.println(result);
    }
}
