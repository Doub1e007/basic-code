package com.doub1e.charset;

import java.util.Arrays;

public class CharSetDemo {
    public static void main(String[] args) throws Exception {
        //字符的编码和解码
        String info = "我在巴塞罗那看messi踢球";

        //1.编码成字节
        byte[] bytes = info.getBytes(); //默认用平台编码UTF-8编码
        System.out.println(Arrays.toString(bytes));

        byte[] bytes2 = info.getBytes("GBK"); //指定GBK编码
        System.out.println(Arrays.toString(bytes2));

        //2.解码成字符
        String rs1 = new String(bytes);//默认用平台编码UTF-8解码
        System.out.println(rs1);

        String rs2 = new String(bytes2,"GBK");//用GBK解码
        System.out.println(rs2);
    }
}
