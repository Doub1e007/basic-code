package com.doub1e.random;

import java.util.Random;
import java.util.Scanner;

public class randomTest {
    public static void main(String[] args) {
        // 猜数游戏案例
        //得到1-100之间一个随机数作为幸运号码
        Random r = new Random();
        int lucknum = r.nextInt(100) + 1;

        //死循环让用户猜数
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入你猜的数字：");
            int guessnum = sc.nextInt();
            if (guessnum > lucknum) {
                System.out.println("猜大了");
            } else if (guessnum < lucknum) {
                System.out.println("猜小了");
            }else {
                System.out.println("恭喜你猜对了");
                break;
            }
        }
    }
}
