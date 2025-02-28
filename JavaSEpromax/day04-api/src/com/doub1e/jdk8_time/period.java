package com.doub1e.jdk8_time;
/*
 * Period的作用 计算机两个日期相差的年数 月数 天数
 * */

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class period {
    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2025,2,28);
        LocalDate end = LocalDate.of(2025,6,20);

        //1.创建Period对象 封装两个日期对象
        Period period = Period.between(start, end);

        //2.通过Period对象获取两个日期对象相差的信息
        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());
    }
}
