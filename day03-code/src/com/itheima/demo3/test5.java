package com.itheima.demo3;

import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
        int[] scoresArr = getScores();
        for (int i = 0; i < scoresArr.length; i++) {
            System.out.println(scoresArr[i]);
        }
        int max = getMax(scoresArr);
        int min = getMin(scoresArr);
        int sum = getSum(scoresArr);
        int avg = (sum - max - min) / (scoresArr.length - 2);
        System.out.println("最终得分为" + avg);
    }

    public static int getSum(int[] scoresArr) {
        int sum = 0;
        for (int i = 0; i < scoresArr.length; i++) {
            sum = sum + scoresArr[i];
        }
        return sum;
    }

    public static int getMax(int[] scoresArr) {
        int max = scoresArr[0];
        for (int i = 0; i < scoresArr.length; i++) {
            if (scoresArr[i] > max) {
                max = scoresArr[i];
            }
        }
        return max;
    }

    public static int getMin(int[] scoresArr) {
        int min = scoresArr[0];
        for (int i = 1; i < scoresArr.length; i++) {
            if (scoresArr[i] < min) {
                min = scoresArr[i];
            }
        }
        return min;
    }

    public static int[] getScores() {
        int[] scores = new int[6];
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i < scores.length; ) {
            System.out.println("请输入评委打分");
            int score = sc.nextInt();
            if (score >= 0 && score <= 100) {
                scores[i] = score;
                i++;
            } else {
                System.out.println("成绩超出了范围,继续录入，当前的i为" + i);
            }

        }
        return scores;
    }
}
