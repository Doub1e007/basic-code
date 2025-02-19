package com.doub1e.string;

import java.util.Scanner;

public class StringDemo4 {
    public static void main(String[] args) {
        //完成用户登录功能
        //登录功能是独立功能（独立功能独立成方法
        //最多给用户三次登录机会
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            System.out.println("第" + i + "次登录开始");
            System.out.println("请输入登录名称:");
            String loginName = sc.next();

            System.out.println("请输入密码:");
            String password = sc.next();

            String result = login(loginName, password);
            if("success".equals(result)){
                System.out.println("登录成功，欢迎进入系统");
                break;
            }else {
                System.out.println("登录失败，"+result);
            }

        }
    }
    public static String login(String loginName,String password){
        //1.先拿到正确的登录名和密码
        String okLoginName = "admin";
        String okPassword = "123456";

        //2.让用户传进来的登录名和密码与正确的登录名和密码进行对比
        if(okLoginName.equals(loginName)){
            //登录名正确
            //判断密码是否正确
            if(okPassword.equals(password)){
                //登录成功
                return "success";
            }else {
                //密码错误
                return "密码错误,请检查";
            }
        }else {
            return "用户名错误,请检查";
        }
    }
}
//b1分支下进行测试

