package com.doub1e.collection_travesal;

import java.util.ArrayList;
import java.util.Collection;

public class Test {
    public static void main(String[] args) {
        //1.创建集合
        Collection<Movie> movies = new ArrayList<>();

        //2.存入电影对象
        movies.add(new Movie("《肖申克的救赎》","摩根·弗里曼",9.8));
        movies.add(new Movie("《哪吒之魔童闹海》","饺子",8.5));
        movies.add(new Movie("《让子弹飞》","周润发",9.5));

        //3.遍历集合中每个电影对象
        for (Movie m : movies) {
            System.out.println(m);
        }
    }
}
