package com.doub1e;

import java.util.ArrayList;
import java.util.Scanner;

public class ATM {
    private ArrayList<Account> accounts = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    /** 启动ATM系统 展示欢迎页 **/
    public void start(){
        while (true) {
            System.out.println("========欢迎您进入到ATM系统==========");
            System.out.println("1、用户登录");
            System.out.println("2、用户开户");
            System.out.println("请选择：");
            int command = sc.nextInt();
            switch (command){
                case 1:
                    //用户登录
                    break;
                case 2:
                    //用户开户
                    break;
                default:
                    System.out.println("没有该操作");
            }
        }
    }
    /** 完成用户开户操作 **/
    private void createAccount(){
        // 1.创建一个账户对象 用于封装用户的开户信息
        Account acc = new Account();

        // 2.需要用户输入自己的开户信息 赋值给账户对象
        System.out.println("请您输入您的账户名称：");
        String name = sc.next();
        acc.setUserName(name);

        System.out.println("请您输入您的性别：");
        char sex = sc.next().charAt(0);//男

        // 3.把账户对象存入到账户集合中去
    }
}
