package com.doub1e.buffer_stream;

import java.io.*;

public class TimeTest {
    public static final String SRC_VIDEO = "";
    public static final String DEST_PATH = "D:\\repo\\";
    public static void main(String[] args) {
        //原始流和缓冲流性能测试
        //copy01(); //非常慢 禁止使用
        copy02(); //还可以 相对较慢
        //copy03(); //特别慢 不推荐使用
        copy04(); //极快
    }
    // 4. 使用高级的缓冲字节流按照字节数组的形式复制文件
    public static void copy04() {
        long start = System.currentTimeMillis();
        try(
                // 1. 创建字节输入流管道与源文件接通
                InputStream is = new FileInputStream(SRC_VIDEO);
                BufferedInputStream bis = new BufferedInputStream(is);
                // 2. 创建一个字节输出流管道与目标文件接通
                OutputStream os = new FileOutputStream("DEST_PATH" + "04.avi");
                OutputStream bos = new BufferedOutputStream(os);
        ){
            // 3.转移数据
            byte[] buffer = new byte[1024]; //1KB
            int len ;
            while ((len = bis.read(buffer)) != -1){
                bos.write(buffer, 0, len);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("使用高级的缓冲字节流按照字节数组的形式复制文件：" + (end - start) / 1000.0 + "s");
    }

    // 3. 使用高级的缓冲字节流一个一个字节的形式复制文件
    public static void copy03() {
        long start = System.currentTimeMillis();
        try(
                // 1. 创建字节输入流管道与源文件接通
                InputStream is = new FileInputStream(SRC_VIDEO);
                BufferedInputStream bis = new BufferedInputStream(is);
                // 2. 创建一个字节输出流管道与目标文件接通
                OutputStream os = new FileOutputStream("DEST_PATH" + "03.avi");
                OutputStream bos = new BufferedOutputStream(os);
        ){
            // 3.转移数据
            int b;
            while ((b = bis.read()) != -1){
                bos.write(b);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("使用高级的缓冲字节流一个一个字节的形式复制文件：" + (end - start) / 1000.0 + "s");
    }

    // 2. 使用低级的字节流按照字节数组的形式复制文件
    public static void copy02() {
        long start = System.currentTimeMillis();
        try(
                // 1. 创建字节输入流管道与源文件接通
                InputStream is = new FileInputStream(SRC_VIDEO);
                // 2. 创建一个字节输出流管道与目标文件接通
                OutputStream os = new FileOutputStream("DEST_PATH" + "02.avi");
        ){
            // 3.转移数据
            byte[] buffer = new byte[1024]; //1KB
            int len ;
            while ((len = is.read(buffer)) != -1){
                os.write(buffer, 0, len);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("用低级的字节流按照字节数组的形式复制文件：" + (end - start) / 1000.0 + "s");
    }

    // 1. 使用低级的字节流一个一个字节的形式复制文件
    public static void copy01() {
        long start = System.currentTimeMillis();
        try(
                // 1. 创建字节输入流管道与源文件接通
                InputStream is = new FileInputStream(SRC_VIDEO);
                // 2. 创建一个字节输出流管道与目标文件接通
                OutputStream os = new FileOutputStream("DEST_PATH" + "01.avi");
        ){
            // 3.转移数据
            int b;
            while ((b = is.read()) != -1){
                os.write(b);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("使用低级的字节流一个一个字节的形式复制文件：" + (end - start) / 1000.0 + "s");
    }
}
