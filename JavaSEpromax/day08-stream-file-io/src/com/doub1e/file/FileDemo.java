package com.doub1e.file;

import java.io.File;

public class FileDemo {
    public static void main(String[] args) {
        //file对象的创建 来代表具体的文件
        //1.创建File对象
        File f1 = new File("C:\\Users\\34778\\Pictures\\Camera Roll\\storm.jpg");
        //File f1 = new File("C:/Users/34778/Pictures/Camera Roll/storm.jpg");
        System.out.println(f1.length()); //字节个数

        //2.File对象可以代表文件 也可以代表文件夹
        File f2 = new File("D:\\Burpsuite\\BurpSuite V2024.10");
        System.out.println(f2.length()); //拿的是文件夹本身的大小 不是里面全部内容的大小

        //3.File对象代表的文件路径可以是不存在的
        File f3 = new File("D:\\Burpsuite\\Abc123");
        //以后可以创建出来

        //4.File对象的路径可以支持绝对路径和相对路径
        //绝对路径 依赖于当前操作系统
        File f4 = new File("C:\\Users\\34778\\Pictures\\Camera Roll\\storm.jpg");

        //相对路径 默认相对到相当工程下寻找文件 不带盘符 直接到Project工程下找文件
        //一般用于找项目中资源文件
        File f5 = new File("day08-stream-file-io/src/storm.jpg");
        System.out.println(f5.length());

    }
}
