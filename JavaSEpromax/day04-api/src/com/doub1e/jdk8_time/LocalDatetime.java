package com.doub1e.jdk8_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDatetime {
    public static void main(String[] args) {
        //最重要的一个类
        //获取本地日期和时间对象
        LocalDateTime ldt = LocalDateTime.now();//年 月 日 时 分 秒 纳秒 不可变
        System.out.println(ldt);

        //可以获取日期和时间的全部信息
        int year = ldt.getYear();
        int month = ldt.getMonthValue();
        int day = ldt.getDayOfMonth();
        int hour = ldt.getHour();
        int minute = ldt.getMinute();
        int second = ldt.getSecond();
        int nano = ldt.getNano();

        //修改时间信息
        // withYear withMonth withDayOfMonth withDayOfYear withHour
        // withMinute withSecond withNano
        LocalDateTime ldt2 = ldt.withYear(2029);
        LocalDateTime ldt3 = ldt.withMinute(59);

        //可以把 LocalDatetime 转化成LocalDate和LocalTime
        //public LocalDate toLocalDate()
        //public LocalTime toLocalTime()
        //public static LocalDateTime of(LocalDate date,LocalTime time)
        LocalDate ld = ldt.toLocalDate();
        LocalTime lt = ldt.toLocalTime();

        //分久必合
        LocalDateTime ldt10 = LocalDateTime.of(ld,lt);


    }
}
