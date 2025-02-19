package com.doub1e.create;

import java.util.Scanner;

public class arraytest6 {
    public static void main(String[] args) {
        double[] scores = new double[6];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) {
            System.out.println("请输入第"+(i+1)+"个评委打分：");
            scores[i] = sc.nextDouble();
        }
        double sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        //输出平均分
        System.out.println("平均分是："+sum/scores.length);
    }
}
