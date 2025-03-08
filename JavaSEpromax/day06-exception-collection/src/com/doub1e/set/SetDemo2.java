package com.doub1e.set;

public class SetDemo2 {
    public static void main(String[] args) {
        //对象的哈希值
        String name1 = "abc";
        String name2 = "acB";

        //不同对象的哈希值大概率不相同 但存在相同的情况
        System.out.println(name1.hashCode());
        System.out.println(name1.hashCode());
        System.out.println(name2.hashCode());

    }
}
