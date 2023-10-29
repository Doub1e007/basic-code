package com.itheima.demo6;

import java.util.ArrayList;

public class test1 {
    public static void main(String[] args) {
        //泛型：限定集合中存储数据的类型
        //jdk7   ArrayList<String> list = new ArrayList<String>();

        //1.创建一个集合
        ArrayList<String> list = new ArrayList<>();
       //2.添加元素
        list.add("点赞");
        list.add("收藏");
        list.add("关注");
        System.out.println(list);
        //3.遍历元素
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if(i== list.size()-1){
                System.out.print(list.get(i));
            }else{
                System.out.print(list.get(i)+",");
            }
        }
        System.out.println("]");
    }
}
