package com.doub1e;

import java.util.ArrayList;
import java.util.Random;
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
                    login();
                    break;
                case 2:
                    //用户开户
                    createAccount();
                    break;
                default:
                    System.out.println("没有该操作");
            }
        }
    }

    /** 完成用户的登录操作 */
    private void login(){
        System.out.println("==系统登录==");
        // 1.判断系统中是否存在账户对象 存在才可以登录；如果不存在 结束登录操作
        if(accounts.size() == 0){
            System.out.println("当前系统中无账户，请先开户");
            return;//跳出登录
        }
        //2.系统中存在账户对象 进行登录操作
        while (true) {
            System.out.println("请您输入你的登录卡号：");
            String cardId = sc.next();
            //3.判断这个卡号是否存在
            Account acc = getAccountByCardId(cardId);
            if(acc == null){
                //卡号不存在
                System.out.println("您输入的登录卡号不存在，请确认");
            }else {
                while (true) {
                    //卡号存在
                    System.out.println("请您输入登录密码：");
                    String passWord = sc.next();
                    // 4.判断密码是否正确
                    if(acc.getPassword().equals(passWord)){
                        //密码正确 登录成功了
                        System.out.println("恭喜你：" + acc.getUserName() + "成功登录了，您的卡号是：" + acc.getCardId());
                        //....
                    }else {
                        System.out.println("您输入的密码错误，请重新输入");
                    }
                }
            }
        }
    }
    /** 完成用户开户操作 **/
    private void createAccount(){
        System.out.println("==系统开户操作==");
        // 1.创建一个账户对象 用于封装用户的开户信息
        Account acc = new Account();

        // 2.需要用户输入自己的开户信息 赋值给账户对象
        System.out.println("请您输入您的账户名称：");
        String name = sc.next();
        acc.setUserName(name);

        while (true) {
            System.out.println("请您输入您的性别：");
            char sex = sc.next().charAt(0);//男
            if(sex == '男' || sex == '女'){
                acc.setSex(sex);
                break;
            }else {
                System.out.println("您输入的性别有误");
            }
        }

        while (true) {
            System.out.println("请您输入你的账户密码：");
            String password = sc.next();
            System.out.println("请您确认你的账户密码：");
            String okPassword = sc.next();
            //判断两次密码是否相同
            if(okPassword.equals(password)){
                acc.setPassword(okPassword);
                break;
            }else {
                System.out.println("您输入的两次密码不一致 请检查后重新输入~");
            }
        }

        System.out.println("请你输入你的提现额度：");
        double limit = sc.nextDouble();
        acc.setLimit(limit);

        //key point 需要每次为这个账户生成一个卡号(系统自动生成8位卡号 且不能重复
        String newCardId = creatCardId();
        acc.setCardId(newCardId);

        // 3.把账户对象存入到账户集合中去
        accounts.add(acc);
        System.out.println("恭喜" + acc.getUserName() + "开户成功！您的卡号是：" + acc.getCardId());
    }
    /** 返回一个8位数字的卡号 且卡号不能重复 */
    private String creatCardId(){
        while (true) {
            // 1.定义一个String类型变量记住8位卡号
            String cardId = "";
            // 2.使用循环 每次产生一个随机数给cardId连接起来
            Random r = new Random();
            for (int i = 0; i < 8; i++) {
                int data = r.nextInt(10); //0~9
                cardId += data ;
            }
            // 3.判断CardId中记住的卡号是否与其他账户的卡号重复
            Account acc = getAccountByCardId(cardId);
            //
            if (acc == null) {
                //cardId没有和其他账户卡号重复
                return cardId;
            }
        }
    }
    /** 根据卡号查找账户对象返回 accounts = [c1,c2,c3...]*/
    private Account getAccountByCardId(String cardId){
        // 遍历全部的账户对象
        for (int i = 0; i < accounts.size(); i++) {
            Account acc = accounts.get(i);
            //判断这个账户对象acc的卡号是否是要找的卡号
            if(acc.getCardId().equals(cardId)){
                return acc;
            }
        }
        return null; //卡号不存在
    }

}
