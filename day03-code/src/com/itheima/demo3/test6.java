package com.itheima.demo3;

public class test6 {
    public static void main(String[] args) {
       /*
       数字加密 每位数加上5
               再对10求余
               最终将数字反转得到一串新数
       */
        //把整数放到一个数组里
        int[] arr = {1, 9, 8, 3};
        //加密码
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 5;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] % 10;
        }
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

        }
        //把数组加密后的数字拼接
        int number = 0;
        for (int i = 0; i < arr.length; i++) {
            number = number * 10 + arr[i];
        }
        System.out.println(number);
    }
}
