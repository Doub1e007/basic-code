package com.doub1e.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {
    public static void main(String[] args) {
        //Map集合常用API
        //HashMap 按照键 无序 不重复 无索引。值不做要求 键和值都可以是null
        Map<String,Integer> map = new HashMap<>(); //多态

        map.put("iphone16", 1);
        map.put("iwatch", 3);
        map.put("ipad", 2);
        map.put("ipad", 10);
        map.put("mate70_pro", 10);
        map.put(null, null);
        System.out.println(map);
        //{null=null, iwatch=3, iphone16=1, ipad=10, mate70 pro=10}

        //1.获取集合大小（元素个数
        System.out.println(map.size()); //5

        //2.清空集合
        //map.clear();
        System.out.println(map);

        //3.判断集合是否为空
        System.out.println(map.isEmpty()); //true

        //4.根据键获取对应的值（key
        System.out.println(map.get("iphone16"));
        System.out.println(map.get("mate60")); //若没有这个键 返回null

        //5.根据键删除整个数据，返回删除数据对应的值（key
        System.out.println(map.remove("iphone16"));
        System.out.println(map);
        System.out.println("---------------------------------------");

        //6.判断是否包含某个键
        //map = {mate70_pro=10, null=null, iwatch=3, ipad=10}
        System.out.println(map.containsKey("iphone16")); //false
        System.out.println(map.containsKey("iwatch")); //true

        //7.判断是否包含某个值
        System.out.println(map.containsValue(3)); //true
        System.out.println(map.containsValue("3")); //false

        //8.获取Map集合中全部键 到一个Set集合中返回
        //public Set<K> keySet();
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key);
        }

        //9.获取Map集合的全部值，到一个Collection集合中返回
        Collection<Integer> values = map.values();
        for (Integer value : values) {
            System.out.println(value);
        }


    }

}
