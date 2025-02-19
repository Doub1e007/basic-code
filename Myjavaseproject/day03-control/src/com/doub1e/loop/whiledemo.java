package com.doub1e.loop;

public class whiledemo {
    public static void main(String[] args) {
        //1.数据拿到程序中
        double peakHeight = 8848860;
        double paper = 0.1;

        //定义一个计数器
        int count = 0;

        //2.使用while循环控制纸张进行折叠
        while(paper < peakHeight){
            //3.纸张折叠
            paper *= 2;
            count++;
        }
        //输出结果
        System.out.println("折叠了" + count + "次，才能不低于山峰");
        System.out.println("纸张最后厚度："+paper);
    }
}
