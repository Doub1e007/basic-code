package com.doub1e.param;

public class methodParamDemo2 {
    public static void main(String[] args) {
        //引用类型的参数传递类型机制
        int[] arr = new int[]{10,20,30};
        change(arr);
        System.out.println("main方法：" + arr[1]);

    }
    public static void change(int arr[]){
        System.out.println("change方法1：" + arr[1]);
        arr[1] = 200;
        System.out.println("change方法2：" + arr[1]);
    }
}
