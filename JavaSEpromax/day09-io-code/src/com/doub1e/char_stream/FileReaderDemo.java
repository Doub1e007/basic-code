package com.doub1e.char_stream;

import java.io.FileReader;
import java.io.Reader;

public class FileReaderDemo {
    public static void main(String[] args) throws Exception {
        // 文件字符输入流的使用 每次读取一个字符
        //1.创建文件字符输入流管道与源文件接通
        Reader fr = new FileReader("day09-io-code\\src\\diaomao.txt");
        //2. 读取一个字符编号回来 没有字符可读返回-1
        //public int read()
//        int c1 = fr.read();
//        System.out.println((char)c1);
//
//        int c2 = fr.read();
//        System.out.println((char)c2);
//
//        int c3 = fr.read();
//        System.out.println(c3);

        //3.使用循环解决
        int c;
        while ((c = fr.read()) != -1) {
            char ch = (char) c;
            System.out.print(ch);
        }
        fr.close();
        //拓展
        //    是否解决乱码问题  解决√
        //    性能较差



    }
}
