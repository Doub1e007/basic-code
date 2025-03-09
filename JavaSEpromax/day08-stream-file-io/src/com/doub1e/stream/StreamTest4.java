package com.doub1e.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StreamTest4 {
    public static void main(String[] args) {
        //Stream流常用终结方法
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("哪吒之魔童闹海",9.5,"饺子"));
        movies.add(new Movie("三傻大闹宝莱坞",8.5,"阿米尔汗"));
        movies.add(new Movie("三傻大闹宝莱坞",8.5,"阿米尔汗"));
        movies.add(new Movie("阿甘正传",7.5,"汤姆汉克斯"));

        //1.forEach
        movies.stream().forEach(System.out::println);

        //2.count
        long count = movies.stream().skip(2).count();
        System.out.println(count);

        //3.取最大值
        Optional<Movie> max = movies.stream().max((o1, o2) -> Double.compare(o1.getScore(), o2.getScore()));
        Movie m = max.get();
        System.out.println(m);

        Movie min = movies.stream().min((o1, o2) -> Double.compare(o1.getScore(), o2.getScore())).get();
        System.out.println(min);
    }
}
