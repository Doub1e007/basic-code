package com.itheima.demo1;

import java.util.Random;
import java.util.Scanner;

public class test1 {
    public static void main(String[]args){
        Random r =new Random();
        int number=r.nextInt(100)+1;

        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("请输入你猜的数字");
            int guseeNumber =sc.nextInt();
            if(guseeNumber>number){
                System.out.println("大了");
            } else if (guseeNumber<number) {
                System.out.println("小了");
            }else{
                System.out.println("猜中了");
                break;
            }

        }

    }
}
