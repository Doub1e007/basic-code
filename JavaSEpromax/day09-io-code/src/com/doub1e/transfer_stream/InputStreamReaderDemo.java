package com.doub1e.transfer_stream;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputStreamReaderDemo {
    public static void main(String[] args) {
        //字符输入转换流
        try(
                // 1.先提取文件的原始字节输入流
                InputStream is = new FileInputStream("");
                // 2.使用字符输入转换流把字节输入转换成字符输入流
                //Reader isr = new InputStreamReader(is) //使用平台默认UTF-8
                Reader isr = new InputStreamReader(is,"GBK");
                ){

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
