package com.itheima.demo3;

import java.util.Random;

public class test3 {
    public static void main(String[] args) {
        /* 定义方法随机生成一个5位验证码
        格式：
        长度为5
        前四位字母（大小写随机）
        第五位数字
        */
        //分析
        //大小写字母放到数组中
        char[] chs = new char[52];
        for (int i = 0; i < chs.length; i++) {
            //ASCII码表
            if (i <= 25) {
                //添加小写字母
                chs[i] = (char) (97 + i);
            } else {
                //添加大写字母
                chs[i] = (char) (65 + i - 26);
            }
        }
        //定义一个字符串类型变量 记录最终结果
        String result = "";

        //随机抽取4次
        //随机抽取数组索引
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            int randomIndex = r.nextInt(chs.length);
            //利用随机索引获取元素
            //System.out.println(chs[randomIndex]);
            result = result + chs[randomIndex];
        }
        //System.out.println(result);
        //随机抽取一个数字0~9
        int randomNumber = r.nextInt(10);
        //最终结果
        result = result + randomNumber;
        System.out.println(result);
    }

}
