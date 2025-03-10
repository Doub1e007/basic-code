package com.doub1e.file;

import java.io.File;

/*
*   File提供的遍历文件夹的方法
* */
public class FileTest3 {
    public static void main(String[] args) {
        File f = new File("D:\\tutorial");
        //1. public String[] list() 获取当前目录下所有的 “一级文件名称” 到一个字符串数组中去返回
        String[] names = f.list();
        for (String name : names) {
            System.out.println(name);
        }

        //2. public File[] listFiles() 获取当前目录下所有的 “一级文件对象”到一个文件对象数组中去返回 important
        File[] files = f.listFiles();
        for (File file : files) {
            System.out.println(file.getAbsolutePath());
        }

    }
}
