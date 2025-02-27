package com.doub1e.stringjoiner;

import java.util.StringJoiner;

public class StringJoinerTest {
    public static void main(String[] args) {
        //使用StringJoiner完成字符串拼接操作
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(getArrayData(arr));
    }
    public static String getArrayData(int[] arr){
        if (arr == null || arr.length == 0) {
            return null;
        }
        //1.创建StringJoiner对象
        //参数一：间隔符 参数二：开始符号 参数三：结束符号
        StringJoiner sb = new StringJoiner(",","[","]");

        //2.遍历数组中的内容
        for (int i = 0; i < arr.length; i++) {
            sb.add(Integer.toString(arr[i]));
        }

        return sb.toString();
    }
}
