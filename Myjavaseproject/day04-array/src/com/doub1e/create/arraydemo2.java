package com.doub1e.create;

public class arraydemo2 {
    public static void main(String[] args) {
        int[] arr = new int[]{12,24,36};

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        System.out.println("------------------");
        //访问数组的长度
        System.out.println(arr.length);
        //获取数组的最大索引
        System.out.println(arr.length-1);
    }
}
