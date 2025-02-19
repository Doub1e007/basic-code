package com.doub1e.demo;

import java.util.Random;

public class Test2_code {
    public static void main(String[] args) {
        //生成验证码
        System.out.println("四位验证码" + createCode(4));
        System.out.println("六位验证码" + createCode(6));

    }
    public static String createCode(int length){
        //准备一个字符串变量用于拼接每位随机字符作为验证码
        String code = " ";
        //循环产生随机字符
        Random r = new Random();
        for (int i = 0; i < length; i++) {
            //随机生成一个字符 数字 大小写字母
            //随机三个数字 表示当前随机数字是 大写0 小写1 还是数字2
            int type = r.nextInt(3); //0-2
            switch (type){
                case 0:
                    //随机数字
                    int number = r.nextInt(10);
                    code += number;
                    break;
                case 1:
                    //随机大写：A - Z 65 -> 90
                    char c1 = (char)(r.nextInt(26) + 65);
                    code += c1;
                    break;
                case 2:
                    //随机小写：a - z 97 -> 97+25
                    char c2 = (char)(r.nextInt(26) + 97);
                    code += c2;
                    break;
            }

        }
        return code;
    }
}
