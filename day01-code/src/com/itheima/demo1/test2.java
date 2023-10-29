package com.itheima.demo1;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        //创建对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入一个数");
        int x = sc.nextInt();
        int temp = x;
        int num = 0;

        while(x != 0){
            //从右往左获取每一位数字
            int ge = x % 10;
            //修改一下x记录的值
            x = x / 10;
            //把当前获取到的值拼接到最右边
            num = num * 10 + ge;
        }

        System.out.println(num == temp);

        // ctrl + alt + l 格式化代码对齐

    }

}
