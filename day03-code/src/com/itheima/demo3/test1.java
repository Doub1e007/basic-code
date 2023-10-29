package com.itheima.demo3;

import java.util.Scanner;

public class test1 {/*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //录入机票原价、月份、舱位
        System.out.println("请输入机票原价");
        int ticket = sc.nextInt();
        System.out.println("请输入当前月份");
        int month = sc.nextInt();
        System.out.println("请输入当前购买的舱位 0 头等舱 1 经济舱");
        int seat = sc.nextInt();
        //判断月份是旺季还是淡季
        if(month >=5 && month <=10){
            //旺季
            if(seat == 0){
                ticket =(int) (ticket * 0.9);
            }else if(seat == 1){
                ticket =(int) (ticket * 0.85);
            }else {
                System.out.println("没有这个舱位");
            }
        } else if((month >=1 && month <= 4) ||(month >= 11 && month <= 12 )){
            //淡季
            if(seat == 0){
                ticket =(int) (ticket * 0.72);
            }else if(seat == 1){
                ticket =(int) (ticket * 0.65);
            }else {
                System.out.println("没有这个舱位");
            }


        }else{
            System.out.println("录入数据非法");
        }
        System.out.println(ticket);

    }
    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //录入机票原价、月份、舱位
        System.out.println("请输入机票原价");
        int ticket = sc.nextInt();
        System.out.println("请输入当前月份");
        int month = sc.nextInt();
        System.out.println("请输入当前购买的舱位 0 头等舱 1 经济舱");
        int seat = sc.nextInt();
        //判断月份是旺季还是淡季
        if (month >= 5 && month <= 10) {
            //旺季
            ticket = getPrice(ticket, seat, 0.9, 0.85);
        } else if ((month >= 1 && month <= 4) || (month >= 11 && month <= 12)) {
            //淡季
            ticket = getPrice(ticket, seat, 0.7, 0.65);
        } else {
            System.out.println("录入数据非法");
        }
        System.out.println(ticket);

    }

    //我要干啥 根据舱位和折扣计算票价
    //干这些需要啥才能完成 原价 舱位 折扣
    //方法调用处是否需要这个结果
    public static int getPrice(int ticket, int seat, double vo, double v1) {

        if (seat == 0) {
            ticket = (int) (ticket * vo);
        } else if (seat == 1) {
            ticket = (int) (ticket * v1);
        } else {
            System.out.println("没有这个舱位");
        }
        return ticket;


    }
}
