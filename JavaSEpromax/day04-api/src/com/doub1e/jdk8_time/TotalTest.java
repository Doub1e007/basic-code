package com.doub1e.jdk8_time;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TotalTest {
    public static void main(String[] args) {
        //倒计时
        //1.考试时间
        String startTime = "2025-06-07 09:30:00";
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime ldt = LocalDateTime.parse(startTime, dtf);


        //2.此刻离考试时间差多少天 多少时 多少分 多少秒
        LocalDateTime ldt2 = LocalDateTime.now();

        //3.计算时间差
        Duration duration = Duration.between(ldt2, ldt);
        System.out.println(duration.toDays() + "天" + duration.toMinutesPart() + "分" + duration.toSecondsPart() + "秒");
    }
}
