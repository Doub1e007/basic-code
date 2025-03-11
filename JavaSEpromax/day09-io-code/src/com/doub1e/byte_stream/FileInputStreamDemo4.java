package com.doub1e.byte_stream;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class FileInputStreamDemo4 {
    public static void main(String[] args) throws Exception {
        //文件字节输出流的使用
        //1.创建一个文件字节输出流管道与目标文件接通
        //OutputStream os = new FileOutputStream("day09-io-code/src/diaomao4.txt"); //覆盖管道
        OutputStream os = new FileOutputStream("day09-io-code/src/diaomao4.txt",true); //追加管道

        //2.开始写字节数据出去
        // public void write(int a) 每次写出去一个字节
        os.write('a');
        os.write(97);
        //os.write('王');//[ooo] 只取第一个字节会乱码
        os.write("\r\n".getBytes());//换行

        // public void write(byte[] buffer) 每次写一个字节数组的数据出去
        byte[] bytes = "abc我爱你中国666".getBytes();
        os.write(bytes);
        os.write("\r\n".getBytes());//换行

        // public void write(byte[] buffer,int pos,int len) 写一个字节数组的一部分出去
        //参数一 字节数组
        //参数二 写出去的第一个字节索引
        //参数三 总共写出去多少个字节
        os.write(bytes,3,15);
        os.write("\r\n".getBytes());//换行

        //IO流管道属于系统资源 会占用内存和相应的IO资源
        //用完之后必须关闭管道 以释放占用的系统资源
        //os.flush(); //刷新缓存中的数据到磁盘文件中去
        os.close(); //关闭包含刷新

    }
}
