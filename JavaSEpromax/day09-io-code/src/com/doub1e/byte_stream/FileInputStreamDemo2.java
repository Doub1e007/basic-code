package com.doub1e.byte_stream;

import java.io.FileInputStream;
import java.io.InputStream;

public class FileInputStreamDemo2 {
    public static void main(String[] args) throws Exception {
        //文件字节输入流每次读取多个字节
        //1.创建一个文件字节输入流管道与源文件接通
        InputStream is = new FileInputStream("day09-io-code\\src\\diaomao2.txt");//简洁写法

        //2.每次读取一个字节数组的字节 会返回读取的字节个数 没有字节可读返回-1
        // public int read(byte[] buffer)
//        byte[] buffer = new byte[3];
//        int len1 = is.read(buffer);
//        System.out.println("内容：" + new String(buffer));
//        System.out.println("个数：" + len1);
//
//        int len2 = is.read(buffer);
//        //读取多少就倒出多少
//        System.out.println("内容：" + new String(buffer,0,len2));
//        System.out.println("个数：" + len2);
//
//        int len3 = is.read(buffer);
//        System.out.println(len3);

        //3.使用循环改进
        byte[] buffer = new byte[3];
        int len;//记住每次读取的字节个数
        while ((len = is.read(buffer)) != -1){
            String rs = new String(buffer, 0, len);
            System.out.print(rs);
        }
        is.close();
        //拓展
        //性能较好 但是还是无法避免读取汉字输出乱码的问题
    }
}
