package com.doub1e.set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo5 {
    public static void main(String[] args) {
        //TreeSet排序对象
        //法二 TreeSet集合自带比较器对象Comparator
        Set<Girl> set = new TreeSet<Girl>(new Comparator<Girl>() {
            @Override
            public int compare(Girl o1, Girl o2) {
                return Double.compare(o2.getHeight(), o1.getHeight());
            }
        }); //排序 不重复 无索引
        set.add(new Girl("赵敏",'女',21,169));
        set.add(new Girl("赵今麦",'女',27,166));
        set.add(new Girl("李若彤",'女',37,163.5));
        set.add(new Girl("马嘉祺",'女',37,168));
        set.add(new Girl("杨幂",'女',47,172.5));
        System.out.println(set);

    }
}
