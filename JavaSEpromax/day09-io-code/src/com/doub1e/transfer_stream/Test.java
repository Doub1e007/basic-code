package com.doub1e.transfer_stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class Test {
    public static void main(String[] args) {
        //不同编码下 字符流读取文本内容问题
        try(
                // 代码编码 UTF-8  文件编码 UTF-8  a我m ==> o [ooo] o 不乱码
                // 代码编码 UTF-8  文件编码 GBK    a我m ==> o [oo] o   乱码
                // 1.创建一个文件字符输入流和源文件接通
                Reader fr = new FileReader("day09-io-code\\src\\diaomao5.txt");
                //把原始的字符输入流包装成高级的缓冲字符输入流
                BufferedReader br = new BufferedReader(fr);
                ){
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
