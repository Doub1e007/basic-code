package com.doub1e.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest3 {
    public static void main(String[] args) {
        //Stream流常见方法
        List<String> list = new ArrayList<>();
        Collections.addAll(list,"张无忌","周芷若","赵敏","张强","张三丰");

        //1.过滤方法
        list.stream().filter(s -> s.startsWith("张")).filter(s -> s.length() == 3).forEach(System.out::println);

        //2.准备一个集合 排序
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("哪吒之魔童闹海",9.5,"饺子"));
        movies.add(new Movie("三傻大闹宝莱坞",8.5,"阿米尔汗"));
        movies.add(new Movie("三傻大闹宝莱坞",8.5,"阿米尔汗"));
        movies.add(new Movie("阿甘正传",7.5,"汤姆汉克斯"));

        //集合中如果存储对象 法一：对象类可以实现Comparable接口 指定比较规则
        movies.stream().sorted().forEach(System.out::println);
        System.out.println("----------------------------------------");
        movies.stream().sorted((m1,m2) -> Double.compare(m2.getScore(), m1.getScore())).forEach(System.out::println);

        //3.limit取前几个
        System.out.println("-----------------------------------------");
        movies.stream().sorted((m1,m2) -> Double.compare(m2.getScore(), m1.getScore())).limit(3).forEach(System.out::println);

        //4.跳过前几个skip
        System.out.println("-----------------------------------------");
        movies.stream().sorted((m1,m2) -> Double.compare(m2.getScore(), m1.getScore())).skip(3).forEach(System.out::println);

        //5.distinct去重复
        System.out.println("----------------------------------------");
        movies.stream().sorted((m1,m2) -> Double.compare(m2.getScore(), m1.getScore())).distinct().forEach(System.out::println);

        //6.map加工方法 把流上的数据加工成新数据
        System.out.println("-----------------------------------------");
        movies.stream().map(m -> m.getName() + " " + m.getScore()).forEach(System.out::println);

        //7.合并流
        //把两个流连接起来
        Stream<String> s1 = Stream.of("橙留香","东方不败","小果叮");
        Stream<String> s2 = Stream.of("老王","西门吹雪");

        Stream<String> allStream = Stream.concat(s1, s2);
        System.out.println(allStream.count());
    }
}
