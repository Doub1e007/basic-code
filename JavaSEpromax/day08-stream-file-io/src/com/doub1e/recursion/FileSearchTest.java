package com.doub1e.recursion;

import java.io.File;

public class FileSearchTest {
    public static void main(String[] args) throws Exception {
        //文件搜索
        File dir = new File("C:/");
        searchFile(dir,"QQ.exe");
    }

    /**
     * 文件搜索
     * @param dir 被搜索的文件夹
     * @param fileName 被搜索的文件名
     */
    private static void searchFile(File dir, String fileName) throws Exception {
        //1.极端判断
        if(dir ==null || !dir.exists() || dir.isFile()){
            return;//不搜索
        }

        //2.用户思维
        //提取当前目录下的全部一级文件对象
        File[] files = dir.listFiles();

        //3.判断这个文件夹是否可以提取一级文件对象，以及是否存在一级文件对象，存在才可以搜索
        if(files==null || files.length==0){
            return;
        }

        //3.遍历全部一级文件对象
        for(File file : files){
            //4.判断当前file对应的文件对象是文件还是文件夹
            if(file.isFile()){
                //是文件 看这个文件是不是想要的
                if(file.getName().contains(fileName)){
                    System.out.println(file.getAbsolutePath());
                    //启动这个程序
                    Runtime r = Runtime.getRuntime();
                    r.exec(file.getAbsolutePath());
                }
            }else {
                //是文件夹
                // 继续递归这个文件夹 进去接着找
                searchFile(file,fileName);
            }
        }
    }
}
