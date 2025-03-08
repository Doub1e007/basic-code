package com.doub1e.set;

import java.util.HashSet;
import java.util.Set;

public class SetDemo3 {
    public static void main(String[] args) {
        //HashSet集合去重复
        Set<Student> sets = new HashSet<>();//无序 不重复 无索引
        Student s1 = new Student("张继科",'男',"乒乓球");
        Student s2 = new Student("林丹",'男',"羽毛球");
        Student s3 = new Student("王冰冰",'女',"张继科");
        Student s4 = new Student("王冰冰",'女',"张继科");

        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());

        sets.add(s1);
        sets.add(s2);
        sets.add(s3);
        sets.add(s4);

        System.out.println(sets);
    }
}
