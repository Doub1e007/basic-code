package com.doub1e.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo2 {
    public static void main(String[] args) {
        //List的遍历方式
        //1.创建一个List集合对象(经典代码
        List<String> list = new ArrayList<>();//多态
        list.add("莫德里奇");
        list.add("克罗斯");
        list.add("恩佐");
        list.add("阿尔瓦雷斯");
        System.out.println(list); //[莫德里奇, 克罗斯, 恩佐, 阿尔瓦雷斯]

        // for循环
        for (int i = 0; i < list.size(); i++) {
            String ele = list.get(i);
            System.out.println(ele);
        }

        //迭代器
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String ele = it.next();
            System.out.println(ele);
        }
    }
}
