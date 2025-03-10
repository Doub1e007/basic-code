package com.doub1e.byte_stream;

import java.io.FileInputStream;
import java.io.InputStream;

public class FileInputStreamDemo {
    public static void main(String[] args) throws Exception {
        //文件字节输入流每次读取一个字节的形式
        //1.创建文件字节输入流管道与目标文件接通
        //InputStream is = new FileInputStream(new File("day09-io-code\\src\\diaomao.txt"));//完整写法
        InputStream is = new FileInputStream("day09-io-code\\src\\diaomao.txt");//简洁写法

        //2.每次读取一个字节返回
        //public int read()：每次读取一个字节返回 没有字节可读返回-1
//        int b1 = is.read();
//        System.out.println((char)b1);//97
//
//        int b2 = is.read();
//        System.out.println((char)b2);
//
//        int b3 = is.read();
//        System.out.println(b3);//-1

        //3.使用循环改进
        int b;//用于记录每次读到的一个字节
        while ((b = is.read()) != -1) {
            System.out.print((char) b);
        }

        //拓展
        // 性能差 每次一个一个读取
        // 无法避免读入汉字输出乱码的问题 会截断汉字的字节


    }
}
