package com.doub1e.create;

public class methodDemo1 {
    public static void main(String[] args) {
        //方法的定义格式
        //调用方法
        int max = getMax(10,30);
        System.out.println("较大值是" + max);

    }
    public static int getMax(int a,int b){
        int max = a > b ? a : b;
        return max;
    }
}
