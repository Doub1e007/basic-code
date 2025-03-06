package com.doub1e.collection_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionApiDemo1 {
    public static void main(String[] args) {
        //Collection提供的常用方法，全部单列集合都可以直接使用
        Collection<String> list = new ArrayList<String>();//多态

        //1.添加数据 boolean add(E e)
        list.add("java1");
        list.add("java1");
        list.add("哈兰德");
        list.add("哈兰德");
        list.add("格拉利什");
        list.add("京多安");
        System.out.println(list); //[java1, java1, 哈兰德, 哈兰德, 格拉利什, 京多安]

        //2.清空集合
//        list.clear();
//        System.out.println(list); //[]

        //3.判断集合是否为空
        System.out.println(list.isEmpty()); //true

        //4.直接删除集合中某个数据 默认只能删除一个java1
        System.out.println(list.remove("java1"));
        System.out.println(list);

        //5.判断集合中是否包含某个数据
        System.out.println(list.contains("java1")); //true
        System.out.println(list.contains("Java1")); //false

        //6.获取集合大小 元素个数
        System.out.println(list.size());

        //7.把集合转化成数组
        Object[] array = list.toArray();
        System.out.println(Arrays.toString(array));
        //拓展
        String[] arrays = list.toArray(String[]::new);
        System.out.println(Arrays.toString(arrays));

        //8.把别人的集合加到自己
        Collection<String> c1 = new ArrayList<>();
        c1.add("java1");
        c1.add("java2");

        Collection<String> c2 = new ArrayList<>();
        c2.add("java2");
        c2.add("java3");
        //把c2集合的数据全部导入给c1的集合
        c1.addAll(c2);

        System.out.println(c1);
        System.out.println(c2);
    }
}
