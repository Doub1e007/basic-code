package com.itheima.demo1;

import java.util.Random;

public class test3 {
    public static void main(String[] args){
    int[] arr = new int[10];
    Random r = new Random();
    for (int i = 0; i < arr.length; i++) {
        //每循环一次生成一个新随机数
        int number = r.nextInt(100)+1;
        arr[i] = number;
    }
    int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            //循环打印数组每个数并加到sum中
            sum+=arr[i];
        }
        System.out.println("数组中所有数的和为"+sum);

        int avg = sum / arr.length;
        System.out.println("数组中平均数为"+avg);

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<avg)
                count++;

        }
        System.out.println("数组中有"+count+"个数比平均值小");
        //遍历数组验证
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }


    }
}
