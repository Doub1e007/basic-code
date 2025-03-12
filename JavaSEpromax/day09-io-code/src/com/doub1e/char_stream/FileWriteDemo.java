package com.doub1e.char_stream;

import java.io.FileWriter;
import java.io.Writer;

public class FileWriteDemo {
    public static void main(String[] args) {
        try(
                // 掌握文件字符输出流的作用
                //1.创建一个文件字符输出流管道与目标文件接通
                // Writer fw = new FileWriter("路径")
                Writer fw = new FileWriter("day09-io-code\\src\\diaomao.txt",true);
                ){
                    //2.写字符数据出去
                    // a.写一个字符出去 public void write(int c)
                    fw.write(97);
                    fw.write('王');
                    fw.write("\r\n"); //换行

                    // b.写一个字符串出去 public void write(String s)
                    fw.write("abc我爱你中国666");
                    fw.write("\r\n"); //换行

                    // c.写字符串的一部分出去 public void write(String s,int pos,int len)
                    fw.write("abc我爱你中国666",3,3);
                    fw.write("\r\n"); //换行

                    // d.写一个字符数组出去 public void write(char[] chars)
                    char[] chars = "abc我爱你中国666".toCharArray();
                    fw.write(chars);
                    fw.write("\r\n"); //换行

                    // e.写字符数组的一部分出去 public void write(char[] chars,int pos,int len)
                    fw.write(chars,6,2);
                    fw.write("\r\n"); //换行

//            fw.flush(); //刷新
//            fw.close();//关闭包含刷新
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
