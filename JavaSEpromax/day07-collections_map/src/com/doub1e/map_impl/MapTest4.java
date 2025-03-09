package com.doub1e.map_impl;

import java.util.*;

public class MapTest4 {
    public static void main(String[] args) {
        //集合的嵌套
        //1.定义一个Map集合存储全部省份和城市信息
        Map<String, List<String>> provinces = new HashMap<>();

        //2.存入省份信息
        List<String> cities1 = new ArrayList<>();
        Collections.addAll(cities1,"南京市","扬州市","苏州市","无锡市","常州市");
        provinces.put("江苏省",cities1);

        List<String> cities2 = new ArrayList<>();
        Collections.addAll(cities2,"武汉市","孝感市","十堰市","宜昌市","鄂州市");
        provinces.put("湖北省",cities2);

        List<String> cities3 = new ArrayList<>();
        Collections.addAll(cities3,"石家庄市","保定市","唐山市","邢台市","张家口市");
        provinces.put("河北省",cities3);

        System.out.println(provinces);

        List<String> jscities = provinces.get("江苏省");
        for (String j : jscities) {
            System.out.println(j);
        }

    }
}
