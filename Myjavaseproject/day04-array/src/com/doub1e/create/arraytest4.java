package com.doub1e.create;

public class arraytest4 {
    public static void main(String[] args) {
        //数组遍历
        int money[] = {16,23,32,100,99,5};

        int sum = 0;

        for (int i = 0; i < money.length; i++) {
            sum += money[i];
        }
        System.out.println("总金额为：" + sum);
    }
}
