package com.doub1e.jdk8_time;

public class LocalTime {
    public static void main(String[] args) {
        //获取本地时间对象
        java.time.LocalTime lt = java.time.LocalTime.now(); //时分秒 不可变
        System.out.println(lt);

        //获取时间中的信息
        int hour = lt.getHour(); //时
        int minute = lt.getMinute(); //分
        int second = lt.getSecond(); //秒
        int nano = lt.getNano(); //纳秒

        //修改时间 withHour withMinute withSecond withNano
        java.time.LocalTime lt3 = lt.withHour(21);
        java.time.LocalTime lt4 = lt.withMinute(10);
        java.time.LocalTime lt5 = lt.withSecond(10);
        java.time.LocalTime lt6 = lt.withNano(10);
        System.out.println(lt);

        //加多少 plusHours plusMinutes plusSeconds plusNanos
        java.time.LocalTime lt7 = lt.plusHours(10);
        java.time.LocalTime lt8 = lt.plusMinutes(10);
        java.time.LocalTime lt9 = lt.plusSeconds(10);

        //减多少 minusHours minusMinutes minusSeconds minusNanos
        java.time.LocalTime lt10 = lt.minusHours(10);
        java.time.LocalTime lt11 = lt.minusMinutes(10);
        java.time.LocalTime lt12 = lt.minusSeconds(10);
        java.time.LocalTime lt13 = lt.minusSeconds(10);

        //获取指定日期的LocalTime对象
        // public static LocalTime of(int hour,int minute,ind second
        java.time.LocalTime lt15 = java.time.LocalTime.of(12,12,12);
        java.time.LocalTime lt16 = java.time.LocalTime.of(12,12,12);

        //判断两个日期对象是否相等 在前还是在后 equals isBefore isAfter
        System.out.println(lt15.equals(lt16));
        System.out.println(lt15.isAfter(lt));
        System.out.println(lt15.isBefore(lt));
    }
}
