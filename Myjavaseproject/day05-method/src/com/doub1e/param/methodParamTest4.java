package com.doub1e.param;

public class methodParamTest4 {
    public static void main(String[] args) {
        //使用方法判断两个整形数组是否一样
        int[] a1 = null;
        int[] a2 = {11,22,33};
        System.out.println(compare(a1,a2));

        int[] b1 = {11,22};
        int[] b2 = {11,22,33,44};
        System.out.println(compare(b1,b2));

        int[] c1 = {11,22,33};
        int[] c2 = {11,24,33};
        System.out.println(compare(c1,c2));

        int[] d1 = {11,22,33};
        int[] d2 = {11,22,33};
        System.out.println(compare(d1,d2));
    }
    public static boolean compare(int[] arr1,int[] arr2){
        if(arr1 == null || arr2 == null){
            return false;
        }
        if(arr1.length != arr2.length){
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i] != arr2[i]){
                return false;
            }
        }
        return true;
    }
}
