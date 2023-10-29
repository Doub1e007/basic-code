package com.itheima.demo2;

public class method1 {
    public static void main(String[] args) {
        //调用方法
        int sum1 = getSum(10, 20, 30);
        int sum2 = getSum(10, 20, 30);
        int sum3 = getSum(10, 20, 30);
        int sum = sum1 + sum2 + sum3;
        System.out.println(sum);
    }

    public static int getSum(int number1, int number2, int number3){;

    int result = number1 + number2 + number3;
    return result;
}
}
