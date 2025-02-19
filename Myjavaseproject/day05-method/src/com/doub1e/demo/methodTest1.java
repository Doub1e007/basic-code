package com.doub1e.demo;

public class methodTest1 {
    public static void main(String[] args) {
        //完成使用方法求1-n的和并返回
        System.out.println("1-10的和是" + sum(10));
        System.out.println("1-100的和是" + sum(100));
    }
    public static int sum(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
