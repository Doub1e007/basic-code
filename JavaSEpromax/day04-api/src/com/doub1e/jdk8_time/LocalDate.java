package com.doub1e.jdk8_time;

public class LocalDate {
    public static void main(String[] args) {
        //LocalDate常用方法
        //获取本地日期对象（不可变对象
        java.time.LocalDate ld = java.time.LocalDate.now();
        System.out.println(ld);

        //2.单独获取年月日
        System.out.println(ld.getYear());
        System.out.println(ld.getMonth());
        System.out.println(ld.getDayOfMonth());
        System.out.println(ld.getDayOfYear());

        //获取星期几
        System.out.println(ld.getDayOfWeek());

        //直接修改某个信息：withYear withMonth withDayOfYear
        java.time.LocalDate ld2 = ld.withYear(2050);
        java.time.LocalDate ld3 = ld.withMonth(8);
        System.out.println(ld2);
        System.out.println(ld3);
        System.out.println(ld);

        //把某个信息加多少 plusYears plusMonths plusDays plusWeeks
        java.time.LocalDate ld4 = ld.plusYears(2);
        java.time.LocalDate ld5 = ld.plusMonths(2);
        System.out.println(ld4);

        //把某个信息减多少 minusYears minusMonths minusDays minusWeeks
        java.time.LocalDate ld6 = ld.minusYears(2);
        java.time.LocalDate ld7 = ld.minusMonths(2);

        //获取指定日期的LocalDate对象 public static LocalDate of(int year,int month,ind dayofmonth
        java.time.LocalDate ld8 = java.time.LocalDate.of(2099,12,12);
        java.time.LocalDate ld9 = java.time.LocalDate.of(2099,12,12);

        //判断两个日期对象是否相等 在前还是在后 equals isBefore isAfter
        System.out.println(ld8.equals(ld9));
        System.out.println(ld8.isAfter(ld));
        System.out.println(ld8.isBefore(ld));

    }
}
