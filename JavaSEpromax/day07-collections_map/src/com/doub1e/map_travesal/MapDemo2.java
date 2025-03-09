package com.doub1e.map_travesal;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {
    public static void main(String[] args) {
        //Map集合的遍历方式二 键值对赋值（
        Map<String,Integer> map = new HashMap<>();
        map.put("蜘蛛精",1000);
        map.put("小龙女",23);
        map.put("木婉清",31);
        map.put("黄蓉",35);
        System.out.println(map);
        //map = {蜘蛛精=1000, 小龙女=23, 黄蓉=35, 木婉清=31}

        //1.一开始是想通过增强for直接遍历Map集合 但是无法遍历 因为键值对直接来看不存在数据类型
//        for (元素类型 变量: map){
//
//        }

        //2.调用Map集合的一个方法 把Map集合转成Set集合遍历
        /*
        *  map = {蜘蛛精=1000, 小龙女=23, 黄蓉=35, 木婉清=31}
        *  ↓
        *  map.entrySet()
        *  ↓
        *  Set<Map.Entry<String,Integer>> entries = [(蜘蛛精=1000), (小龙女=23), (黄蓉=35), (木婉清=31)]
        *
        * */
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + "===>" + value);
        }
    }
}
