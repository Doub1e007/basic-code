package com.doub1e.buffer_stream;

import java.io.*;

public class BufferedInputStreamDemo {
    public static void main(String[] args) {
        //使用字节缓冲流提升原始字节流读写数据的性能
        try(
                // 1. 创建字节输入流管道与源文件接通
                InputStream is = new FileInputStream("C:\\Users\\34778\\Pictures\\Saved Pictures\\girl.jpg");

                //使用高级的缓冲字节输入流包装低级的字节输入流
                InputStream bis = new BufferedInputStream(is);

                // 2. 创建一个字节输出流管道与目标文件接通
                OutputStream os = new FileOutputStream("C:\\Users\\34778\\Pictures\\Saved Pictures\\girl-bak.txt");
                //使用高级的缓冲字节输出流包装低级的字节输出流
                OutputStream bos = new BufferedOutputStream(os);
        ){
            // 3.准备一个字节数组
            byte[] buffer = new byte[1024];
            // 4.转移数据
            int len;
            while ((len = bis.read(buffer)) != -1){
                bos.write(buffer,0,len);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
