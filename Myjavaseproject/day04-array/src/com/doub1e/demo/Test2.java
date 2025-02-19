package com.doub1e.demo;

public class Test2 {
    public static void main(String[] args) {
        //掌握数组元素交换算法
        //1.定义数组 存入数据
        int[] arr = {10,20,30,40,50};

        //2.定义循环 控制一个变量在前 一个变量在后 同步交换
        for (int i = 0,j = arr.length - 1; i < j; i++, j--) {
            //3.交换数据
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
