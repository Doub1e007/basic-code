package com.doub1e.jdk8_time;

import java.time.Duration;
import java.time.LocalDateTime;

/*
* 用于计算两个时间对象相差的天数 小时数 分数 秒数 纳秒数
* */
public class duration {
    public static void main(String[] args) {
        LocalDateTime start = LocalDateTime.of(2025,2,28,0,0);
        LocalDateTime end = LocalDateTime.of(2025,6,20,0,0);

        //1.得到Duration对象
        Duration duration = Duration.between(start, end);

        //2.获取两个时间对象间隔的信息
        System.out.println(duration.toDays());//天
        System.out.println(duration.toHours());//小时
        System.out.println(duration.toMinutes());//分
        System.out.println(duration.toSeconds());//秒
        System.out.println(duration.toMillis());//毫秒
        System.out.println(duration.toNanos());//纳秒
    }
}
