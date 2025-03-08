package com.doub1e.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo4 {
    public static void main(String[] args) {
        //Set特点 无序 不重复 无索引
        //Set<String> set = new HashSet<>();
        Set<String> set = new LinkedHashSet<>();//有序 不重复 无索引

        set.add("莫德里奇");
        set.add("克罗斯");
        set.add("克罗斯");
        set.add("恩佐");
        set.add("阿尔瓦雷斯");
        System.out.println(set);
    }
}
