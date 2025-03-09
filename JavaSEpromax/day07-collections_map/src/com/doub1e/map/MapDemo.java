package com.doub1e.map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        //Map集合特点
        //HashMap 按照键 无序 不重复 无索引。值不做要求 键和值都可以是null
        Map<String,Integer> map = new HashMap<>(); //多态

        map.put("iphone16", 1);
        map.put("iwatch", 3);
        map.put("ipad", 2);
        map.put("ipad", 10); //后面重复的键会覆盖整个数据
        map.put("mate70 pro", 10);
        map.put(null, null);
        System.out.println(map);
        //{null=null, iwatch=3, iphone16=1, ipad=10, mate70 pro=10}

    }

}
