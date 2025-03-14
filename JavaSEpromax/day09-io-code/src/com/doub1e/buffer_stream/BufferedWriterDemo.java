package com.doub1e.buffer_stream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;

public class BufferedWriterDemo {
    public static void main(String[] args) {
        try(
                // 掌握缓冲字符输出流的作用
                //1.创建一个文件字符输出流管道与目标文件接通
                // Writer fw = new FileWriter("路径")
                Writer fw = new FileWriter("day09-io-code\\src\\diaomao5.txt",true);
                BufferedWriter bw = new BufferedWriter(fw);
        ){
            //2.写字符数据出去
            // a.写一个字符出去 public void write(int c)
            bw.write(97);
            bw.write('王');
            //bw.write("\r\n"); //换行
            bw.newLine(); //换行

            // b.写一个字符串出去 public void write(String s)
            bw.write("abc我爱你中国666");
            bw.write("\r\n"); //换行

            // c.写字符串的一部分出去 public void write(String s,int pos,int len)
            bw.write("abc我爱你中国666",3,3);
            bw.write("\r\n"); //换行

            // d.写一个字符数组出去 public void write(char[] chars)
            char[] chars = "abc我爱你中国666".toCharArray();
            bw.write(chars);
            bw.write("\r\n"); //换行

            // e.写字符数组的一部分出去 public void write(char[] chars,int pos,int len)
            bw.write(chars,6,2);
            bw.write("\r\n"); //换行

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
