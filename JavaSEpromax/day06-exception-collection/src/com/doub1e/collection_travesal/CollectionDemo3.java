package com.doub1e.collection_travesal;

import java.util.ArrayList;
import java.util.function.Consumer;

public class CollectionDemo3 {
    public static void main(String[] args) {
        //Collection集合的遍历方式三：lambda表达式
        //1.准备一个集合
        ArrayList<String> list = new ArrayList<>();
        list.add("梅西");
        list.add("C罗");
        list.add("内马尔");

        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        list.forEach(s -> System.out.println(s));

        list.forEach(System.out::println);

    }
}
