package com.doub1e.create;

public class arraydemo3 {
    public static void main(String[] args) {
        //数组遍历
        int[] arr = new int[]{12,24,36,48};

        //原始遍历
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println("------------------");

        //增强for循环  arr.fori
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("------------------");

    }
}
