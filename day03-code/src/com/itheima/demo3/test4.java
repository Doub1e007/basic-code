package com.itheima.demo3;

public class test4 {
    public static void main(String[] args){
        //把一个数组中的元素复制到新数组中
        int[] arr = {1,2,3,4,5};
        int[] newArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            //i表示老数组索引
            //arr[i]表示老数组元素
            newArr[i] = arr[i];
        }
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }
    }
}
