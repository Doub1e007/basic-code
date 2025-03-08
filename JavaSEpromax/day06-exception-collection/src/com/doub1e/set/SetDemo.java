package com.doub1e.set;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        //Set特点 无序 不重复 无索引
        Set<String> set = new HashSet<>();//多态
        //Set<String> set = new LinkedHashSet<>();//多态
        set.add("莫德里奇");
        set.add("克罗斯");
        set.add("克罗斯");
        set.add("恩佐");
        set.add("阿尔瓦雷斯");
        System.out.println(set);
    }
}
