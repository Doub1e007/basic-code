package com.doub1e.jdk8_time;

import java.time.LocalDateTime;

public class DateTimeFormatter {
    public static void main(String[] args) {
        /*
        * DateTimeFormatter时间格式化器的使用
        * */
        //1.创建一个日期时间格式化器对象
        java.time.format.DateTimeFormatter dtf = java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss EEE a");

        //2.对时间进行格式化
        LocalDateTime ldt = LocalDateTime.now();
        String result = dtf.format(ldt);
        System.out.println(result);

        //3.格式化时间 方案二
        String result1 = ldt.format(dtf);
        System.out.println(result1);

        //4.解析时间 解析时间一般使用LocalDateTime提供的解析方法来解析
        String dateStr = "2025-02-28 10:00:00";

        //步骤一 写一个日期时间格式化器与这个时间格式一模一样
        java.time.format.DateTimeFormatter dtf2 = java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime ldt2 = LocalDateTime.parse(dateStr, dtf2);
        System.out.println(ldt2);
    }
}
