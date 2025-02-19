package com.doub1e.create;

public class arraydemo5 {
    public static void main(String[] args) {
        //1.数据类型[] 数组名 = new 数据类型[数组长度];
        String[] names = new String[50];
        int[] ages = new int[50];
        double[] scores = new double[50];
        boolean[] flags = new boolean[50];

        //2.默认值规则
        System.out.println(names[0]);
        System.out.println(ages[0]);
        System.out.println(scores[0]);
        System.out.println(flags[0]);

        scores[0] = 99.9;
        scores[1] = 100;
        System.out.println(scores[0]);
        System.out.println(scores[1]);

    }
}
