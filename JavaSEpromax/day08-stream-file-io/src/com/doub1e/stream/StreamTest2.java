package com.doub1e.stream;

import java.util.*;
import java.util.stream.Stream;

public class StreamTest2 {
    public static void main(String[] args) {
        //获取stream流
        //1.获取集合的Stream流：default Stream<E> stream()
        Collection<String> list = new ArrayList<>();
        Collections.addAll(list,"张无忌","周芷若","赵敏","张强","张三丰");
        Stream<String> s1 = list.stream();
        System.out.println(s1.count()); //5

        //2.获取Map集合的Stream流
        Map<String,Integer> map = new HashMap<>();
        // a.获取键流
        Stream<String> ks1 = map.keySet().stream();
        // b.获取值流
        Stream<Integer> vs2 = map.values().stream();
        // c.键值对流
        Stream<Map.Entry<String, Integer>> kvs3 = map.entrySet().stream();

        //3.获取数组的Stream流
        String[] names = {"赵敏","王菲","小昭"};
        Stream<String> as1 = Arrays.stream(names);
        Stream<String> as2 = Stream.of(names);
    }
}
