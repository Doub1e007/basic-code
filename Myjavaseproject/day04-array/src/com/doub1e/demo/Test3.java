package com.doub1e.demo;

import java.util.Random;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        //数组的随机排名
        //1.创建一个整形数组存储5名员工的工号
        int[] code = new int[5];

        //2.录入工号
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < code.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个员工的工号");
            code[i] = sc.nextInt();
        }
        //3.打乱工号顺序
        Random r = new Random();
        for (int i = 0; i < code.length; i++) {
            //遍历的位置 code[i]
            //随机一个位置 code[j]
            int j = r.nextInt(code.length);
            //让当前位置和随机位置的数据交换
            int temp = code[j];
            code[j] = code[i];
            code[i] = temp;
        }
        //4.打印工号
        for (int i = 0; i < code.length; i++) {
            System.out.print(code[i] + " ");
        }

    }
}
