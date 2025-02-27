package com.doub1e.stringbuilder;

public class StringBuilderTest {
    public static void main(String[] args) {
        //使用StringBuilder完成字符串拼接操作
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(getArrayData(arr));

    }
    public static String getArrayData(int[] arr){
        if (arr == null || arr.length == 0) {
            return null;
        }
        //1.创建StringBuilder对象
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        //2.遍历数组中的内容
        for (int i = 0; i < arr.length; i++) {
            int data = arr[i];
            sb.append(data).append(i == arr.length - 1 ? "" : ",");
        }
        sb.append("]");
        return sb.toString();
    }
}
