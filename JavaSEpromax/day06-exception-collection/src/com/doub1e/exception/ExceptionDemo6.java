package com.doub1e.exception;

import java.util.Scanner;

public class ExceptionDemo6 {
    public static void main(String[] args) {
        //异常处理方式2 捕获异常 尝试修复
        while (true){
            try {
                double price = getPrice();
                System.out.println("本商品定价是：" + price);
                break;
            } catch (Exception e) {
                System.out.println("瞎几把搞");
            }
        }
    }
    public static double getPrice(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请你输入一个合法的价格");
        double price = sc.nextDouble();
        return price;
    }
}
