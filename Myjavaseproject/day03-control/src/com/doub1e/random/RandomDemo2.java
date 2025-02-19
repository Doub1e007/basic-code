package com.doub1e.random;

import java.util.Random;

public class RandomDemo2 {
    public static void main(String[] args) {
        //生成指定区间的随机数
        Random r = new Random();
//        int num = r.nextInt(1,11); //JDK17开始才可使用
//        System.out.println(num);

        //传统方式得到指定区间的随机数  加减法
        //(1 -> 10 ) ===> (0 -> 9) + 1
        int number2 = r.nextInt(10) + 1;
        System.out.println(number2);
        System.out.println("--------------------------------");

        //(3 -> 17 ) ===> (0 -> 14) + 3
        int number3 = r.nextInt(15) + 3;
        System.out.println(number3);
    }
}
