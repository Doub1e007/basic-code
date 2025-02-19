package com.doub1e.arraylist;

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        //掌握从容器中删除数据的技巧
        //1.准备一个集合 存储一堆商品
        ArrayList<String> list = new ArrayList<>();
        list.add("Java入门");
        list.add("宁夏枸杞");
        list.add("黑枸杞");
        list.add("人字拖");
        list.add("特级枸杞");
        list.add("枸杞子");
        System.out.println(list);

        //遍历集合中的每个数据 只有这个数据包含枸杞 我们就从集合中删除这个数据
        for (int i = 0; i < list.size(); i++) {
            String name = list.get(i);
            if(name.contains("枸杞")){
                list.remove(name);
                i--;//删除元素后 集合的长度发生了变化 需要重新遍历
            }
        }
        System.out.println(list);

        System.out.println("------------------------------------------------");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Java入门");
        list2.add("宁夏枸杞");
        list2.add("黑枸杞");
        list2.add("人字拖");
        list2.add("特级枸杞");
        list2.add("枸杞子");
        //解决方案2 从后往前遍历并删除
        for (int i = list2.size() - 1; i >= 0; i--) {
            String name = list2.get(i);
            if(name.contains("枸杞")) {
                list2.remove(name);
            }
        }
        System.out.println(list2);
    }
}
