package com.doub1e.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

//菜品操作对象
public class FoodOperator {
    //1.准备一个容器负责存储上架的全部菜品
    private ArrayList<Food> allFoods = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);
    //private      int        age    =   24

    public void addFood() {
        System.out.println("=======上架菜品=======");
        //a.用户每上架一次菜品实际上就是在集合中新增一个菜品对象
        Food f = new Food();
        //b.为菜品注入菜品数据
        System.out.println("菜品名称：");
        String name = sc.next();
        f.setName(name);

        System.out.println("菜品价格：");
        double price  = sc.nextDouble();
        f.setPrice(price);

        System.out.println("菜品描述：");
        String desc = sc.next();
        f.setDec(desc);

        //c.把菜品对象添加到集合容器中
        allFoods.add(f);
        System.out.println("菜品上架成功");
    }

    public void showAllFoods() {
        System.out.println("=======全部菜品=======");
        for (int i = 0; i < allFoods.size(); i++) {
            Food food = allFoods.get(i);
            System.out.println(food.getName() + "\t" + food.getPrice() + "\t" + food.getDec());
        }
    }

    public void start() {
        while (true) {
            System.out.println("=======商家管理系统=======");
            System.out.println("1.上架菜品");
            System.out.println("2.下架菜品（空）");
            System.out.println("3.展示菜品");
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入你的选择：");
            int command = sc.nextInt();

            switch (command) {
                case 1:
                    //上架 独立功能独立成方法
                    addFood();
                    break;
                case 2:
                    //下架
                    break;
                case 3:
                    //展示
                    showAllFoods();
                    break;
                default:
                    System.out.println("输入有误，请重新输入");
            }
        }

    }




}
