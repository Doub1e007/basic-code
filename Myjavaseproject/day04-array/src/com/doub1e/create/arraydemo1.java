package com.doub1e.create;

public class arraydemo1 {
    public static void main(String[] args) {
        //创建一个数组
        //格式 数据类型[] 数组名 = new 数组类型[]{元素1，元素2，元素3...}
        int[] ages = new int[]{12,23,34,45,56};
        double[] scores = new double[]{12.5,23.5,34,45.5,56.5};
        System.out.println(ages);
        System.out.println(scores);

        //简化形式
        //数据类型[] 数组名 = {元素1，元素2，元素3...}
        int[] ages2 = {12,23,34,45,56};
        double[] scores2 = {12.5,23.5,34,45.5,56.5};

        String[] names = {"张三","李四","王五"};
    }
}
