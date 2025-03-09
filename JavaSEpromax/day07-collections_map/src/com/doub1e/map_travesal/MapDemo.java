package com.doub1e.map_travesal;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        //Map集合遍历方式一 键找值
        Map<String,Integer> map = new HashMap<>();
        map.put("iphone", 6);
        map.put("小米", 3);
        map.put("huawei", 3);
        map.put("诺基亚", 31);
        System.out.println(map); //{huawei=3, 诺基亚=31, iphone=6, 小米=3}

        //1.获取map集合的全部键
        Set<String> keys = map.keySet();
        for (String key : keys) {
            //2.根据键获取对应的值
            Integer value = map.get(key);
            System.out.println(key + "--->" + value);
        }
    }
}
