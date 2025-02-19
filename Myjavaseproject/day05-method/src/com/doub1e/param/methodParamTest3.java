package com.doub1e.param;

public class methodParamTest3 {
    public static void main(String[] args) {
        //输出数组的内容
        int[] arr = {1,2,3,4,5};
        printArray(arr);

        int[] arr2 = {};
        printArray(arr2);


    }
    public static void printArray(int[] arr){
        if(arr == null){
            System.out.println(arr);
            return;         //卫语句风格代码
        }
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i == arr.length - 1 ? arr[i] : arr[i] + ",");
//            if(i == arr.length - 1){
//              System.out.print(arr[i]);
//            }else{
//                System.out.print(arr[i] + ",");
//            }
        }
        System.out.println("]");
    }
}
