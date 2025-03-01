package com.doub1e.exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo {
    public static void main(String[] args) throws ParseException {
        //异常
        System.out.println("====开始====");
        int[] arr = {11,22,33};
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        //System.out.println(arr[3]); //ArrayIndexOutOfBoundsException数组索引越界异常

        String name = null;
        //System.out.println(name.length()); //NullPointerException空指针异常

        //System.out.println(10 / 0); //ArithmeticException 数学操作异常

        Object o = "张三丰";
        //Integer i = (Integer) o; //ClassCastException 类型转换异常

        String s = "23a";
        //int it = Integer.valueOf(s);
        //System.out.println(it); //NumberFormatException 数字格式化异常

        parseDate("2025-03-01 16:42:00");

        System.out.println("====结束====");
    }
    public static void parseDate(String s) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d = sdf.parse(s); //编译时异常 写代码时报错
        System.out.println(d);
    }
}
