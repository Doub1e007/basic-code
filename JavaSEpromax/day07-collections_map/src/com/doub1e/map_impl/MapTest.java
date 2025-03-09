package com.doub1e.map_impl;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        //Map集合（键）去重复的机制
        Map<Movie,String> map = new HashMap<>();
        map.put(new Movie("哪吒之魔童闹海",9.5,"饺子"),"19:00");
        map.put(new Movie("三傻大闹宝莱坞",8.5,"阿米尔汗"),"20:50");
        map.put(new Movie("三傻大闹宝莱坞",9.5,"阿米尔汗"),"21:50");
        map.put(new Movie("阿甘正传",7.5,"汤姆汉克斯"),"21:00");
    }
}
