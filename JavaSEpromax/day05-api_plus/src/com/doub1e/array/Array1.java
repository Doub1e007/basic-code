package com.doub1e.array;

import java.util.Arrays;
import java.util.function.IntToDoubleFunction;

public class Array1 {
    public static void main(String[] args) {
        //操作数组工具类arrays的使用
        //1.返回数组内容 public static String toString(类型[] a)
        int[] arr = {11,55,33,22,99};
        //System.out.println(arr);
        String result = Arrays.toString(arr);
        System.out.println(result);

        //2.拷贝数组内容到一个新的数组 并返回新数组
        //public static 类型[] copyOfRange(类型[] original,int form,int to)
        int[] arr2 = Arrays.copyOfRange(arr, 1, 4);//包前不包后
        System.out.println(Arrays.toString(arr2));

        //3.给数组扩容
        //public static 类型[] copyOf(类型[] original,int newLength)
        int[] arr3 = Arrays.copyOf(arr, 10);
        System.out.println(Arrays.toString(arr3));

        //4.修改数组中的每个数据 在存入
        double[] scores = {99.5,100,95,66.5,95,55};
        //需求 为每个分数加10分
        Arrays.setAll(scores, new IntToDoubleFunction() {
            @Override
            public double applyAsDouble(int index) {
                return scores[index] + 10;
            }
        });
        System.out.println(Arrays.toString(scores));

        //5.Arrays类提供的对象数组进行排序操作
        Arrays.sort(scores);//升序排序
        System.out.println(Arrays.toString(scores));

    }
}
