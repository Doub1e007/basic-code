package com.doub1e.map_travesal;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class MapDemo3 {
    public static void main(String[] args) {
        //Map集合遍历方式三 Lambda
        Map<String,Integer> map = new HashMap<>();
        map.put("蜘蛛精",1000);
        map.put("小龙女",23);
        map.put("木婉清",31);
        map.put("黄蓉",35);
        System.out.println(map);
        // map = {蜘蛛精=1000, 小龙女=23, 黄蓉=35, 木婉清=31}

        map.forEach(new BiConsumer<String, Integer>() {
            @Override
            public void accept(String key, Integer value) {
                System.out.println(key + "===>" + value);
            }
        });

        map.forEach((key,value) -> {
                System.out.println(key + "===>" + value);
        });
    }
}
