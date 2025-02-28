package com.doub1e.jdk8_time;

import java.time.Clock;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class ZoneId_ZoneDateTime {
    public static void main(String[] args) {
        //时区和带时区的时间
        //1.ZoneId(用于获取时区的）常见方法
        //public static ZoneId systemDefault()：获取系统默认的时区
        ZoneId zoneId = ZoneId.systemDefault();
        String name = zoneId.getId();
        System.out.println(name);

        //public static Set<String> getAvailableZoneIds(): 获取Java支持的全部时区ID
        Set<String> zoneIds = ZoneId.getAvailableZoneIds();
        System.out.println(zoneIds);

        //public static ZoneId of(String zoneId):把某个时区id封装成ZoneId对象
        //America/Los_Angeles
        ZoneId an = ZoneId.of("America/Los_Angeles");

        //2.ZoneDateTime：带时区的时间
        //public static ZoneDateTime now(ZoneId zone)：获取某个时区的ZoneDateTime对象
        //public static ZoneDateTime now() 获取系统默认时区的ZoneDateTime对象
        //ZoneDateTime的功能和LocalDateTime一样了

        ZonedDateTime zdt = ZonedDateTime.now(an);
        System.out.println(zdt);

        //世界标准时间 很多服务器需要世界时间
        ZonedDateTime utcNow = ZonedDateTime.now(Clock.systemUTC());
        System.out.println(utcNow);

    }
}
