package com.doub1e.map_impl;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapTest2 {
    public static void main(String[] args) {
        //Map集合的特点
        //Map体系整体特点：HashMap：按照键，无序，不重复，无索引。值不作要求，键和值都可以是null
        Map<String,Integer> map = new LinkedHashMap<>(); //LinkedHashMap 按照键，有序，不重复，无索引。值不作要求，键和值都可以是null
        map.put("手表",2);
        map.put("iphone",31);
        map.put("huawei",365);
        map.put("iphone",1);
        map.put("娃娃",31);
        map.put("安全入门到放弃",1);
        map.put(null,null);
        System.out.println(map); //{手表=2, iphone=1, huawei=365, 娃娃=31, 安全入门到放弃=1, null=null}

    }
}
