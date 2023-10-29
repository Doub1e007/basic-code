package com.itheima.a01staticdemo2;

import java.util.ArrayList;

public class Testdemo {
    public static void main(String[] args) {
        //测试工具类
        int[] arr1 = {1,2,3,4,5,6};
        String str = ArrayUtil.printArr(arr1);
        System.out.println(str);

        double[] arr2 = {1.1,2.2,3.3,4.4,5.5,6.6};
        double average = ArrayUtil.getAverage(arr2);
        System.out.println(average);
    }
}
