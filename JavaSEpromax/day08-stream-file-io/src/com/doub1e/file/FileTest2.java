package com.doub1e.file;

import java.io.File;

/*
*   File创建和删除文件相关的方法
* */
public class FileTest2 {
    public static void main(String[] args) throws Exception{
        File f = new File("D:\\JAVA\\fileTest.txt");
        //1. public boolean creatNewFile() 创建一个新文件（文件内容为空）创建成功返回true
        System.out.println(f.createNewFile());

        //2. public boolean mkdir() 用于创建文件夹 （只能创建一级文件夹
        File f2 = new File("D:\\JAVA\\fileTest");
        System.out.println(f2.mkdir());

        //2. public boolean mkdirs() 用于创建文件夹 （可创建多级文件夹
        File f3 = new File("D:\\JAVA\\aaa\\bbb\\ccc");
        System.out.println(f3.mkdirs());

        //3. public boolean delete() 只能删除文件和空文件夹
        f.delete();
        f2.delete();
    }
}
