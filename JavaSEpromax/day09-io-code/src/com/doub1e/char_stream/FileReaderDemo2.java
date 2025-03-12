package com.doub1e.char_stream;

import java.io.FileReader;
import java.io.Reader;

public class FileReaderDemo2 {
    public static void main(String[] args) {
        // 文件字符输入流的使用 每次读取多个字符
       try(
               //1.创建文件字符输入流管道与源文件接通
               Reader fr = new FileReader("day09-io-code\\src\\diaomao3.txt");
               ){
           //2.定义一个】字符数组用于读取多个字符
           char[] buffer = new char[3];
           int len; //记住每次读取几个字符
           while ((len = fr.read(buffer)) != -1) {
               String rs = new String(buffer, 0, len);
               System.out.print(rs);
           }
           //拓展
           // 可以避免乱码
           // 性能较好

       } catch (Exception e) {
           e.printStackTrace();
       }
    }
}
