package com.doub1e.byte_stream;

import java.io.FileInputStream;
import java.io.InputStream;

public class FileInputStreamDemo3 {
    public static void main(String[] args) throws Exception {
        //使用文件字节输入流一次性读取完文本全部字节 以避免读取汉字乱码的问题
        //1.创建一个文件字节输入流管道与源文件接通
        InputStream is = new FileInputStream("day09-io-code\\src\\diaomao3.txt");

        //2.定义一个字节数组与源文件一样大小
//        File f = new File("day09-io-code\\src\\diaomao3.txt");
//        long size = f.length();
//        System.out.println("文件的大小是：" + size);
//        byte[] buffer = new byte[(int)size];
//
//        int len = is.read(buffer);
//        System.out.println("读取的字节：" + len );
//
//        System.out.print(new String(buffer));

        byte[] buffer = is.readAllBytes();
        System.out.print(new String(buffer));
        is.close();

    }
}
