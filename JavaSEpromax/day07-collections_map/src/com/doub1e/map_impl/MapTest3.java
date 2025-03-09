package com.doub1e.map_impl;

import java.util.Map;
import java.util.TreeMap;

public class MapTest3 {
    public static void main(String[] args) {
        //TreeMap集合 按照键升序排列 不重复 无索引
        //方式二 TreeMap集合自带比较器对象指定比较规则
        Map<Movie,String> map = new TreeMap<>((m1,m2) ->Double.compare(m2.getScore(), m1.getScore()));

        //方式一 Movie类实现Comparable接口指定比较规则
        map.put(new Movie("哪吒之魔童闹海",9.5,"饺子"),"19:00");
        map.put(new Movie("三傻大闹宝莱坞",8.5,"阿米尔汗"),"20:50");
        map.put(new Movie("三傻大闹宝莱坞",9.5,"阿米尔汗"),"21:50");
        map.put(new Movie("阿甘正传",7.5,"汤姆汉克斯"),"21:00");
        System.out.println(map);
    }
}
