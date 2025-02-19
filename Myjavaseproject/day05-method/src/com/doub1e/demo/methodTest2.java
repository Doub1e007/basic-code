package com.doub1e.demo;

public class methodTest2 {
    public static void main(String[] args) {
        //定义一个方法求一个整数是奇数还是偶数
        check(10);
        check(11);

    }
    public static void check(int number){
        if(number % 2 == 0){
            System.out.println(number + "是偶数");
        }else {
            System.out.println(number + "是奇数");
        }

    }
}
