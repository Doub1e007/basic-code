package com.doub1e.create;

public class arraydemo7 {
    public static void main(String[] args) {
        //多个变量指向同一个数组对象
        int[] arr1 = {11,22,33};

        //把整型数组变量arr1赋值给整形数组变量arr2
        int[] arr2 = arr1;

        //实现多个变量指向同一个数组对象
        System.out.println(arr1);
        System.out.println(arr2);

        arr2[1] = 99;
        System.out.println(arr1[1]);

        //注意空指针异常
        arr2 = null;
        System.out.println(arr2[0]);
    }
}
