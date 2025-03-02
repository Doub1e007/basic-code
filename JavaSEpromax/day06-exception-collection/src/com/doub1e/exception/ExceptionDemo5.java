package com.doub1e.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo5 {
    public static void main(String[] args)  {
        //异常处理机制
        System.out.println("====开始====");

        try {
            parseDate("2018-11-11 11:11:11");
            System.out.println("成功了");
        } catch (Exception e) {
           e.printStackTrace();
            System.out.println("失败了");
        }


        System.out.println("====结束====");
    }
    public static void parseDate(String s) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d = sdf.parse(s); //编译时异常 写代码时报错
        System.out.println(d);

        InputStream is = new FileInputStream("C:\\Users\\34778\\Pictures\\Camera Roll\\storm.jpg");
    }
}
