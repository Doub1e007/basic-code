package com.doub1e.scanner;
//导包 告诉程序Scanner类在哪个包下
import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {
        //创建Scanner对象 东西
        Scanner sc = new Scanner(System.in);

        //使用扫描器去接收键盘输入的数据
        System.out.println("请输入你的年龄：");
        int age = sc.nextInt();//暂停等待接收整数
        System.out.println("您今年："+age+"岁");

        System.out.println("请输入你的姓名：");
        String name = sc.next();//暂停等待接收字符串
        System.out.println("欢迎你"+name);
    }
}
