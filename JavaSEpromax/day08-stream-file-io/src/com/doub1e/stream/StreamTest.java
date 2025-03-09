package com.doub1e.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {
    public static void main(String[] args) {
        //Stream流的使用
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");

        //1.拿出姓张的到新集合中
        List<String> newList = new ArrayList<>();
        for (String s : list) {
            if(s.startsWith("张") && s.length() == 3){
                newList.add(s);
            }
        }
        System.out.println(newList);

        //2.使用stream流改进
        List<String> newList2 = list.stream().filter(s -> s.startsWith("张") && s.length() == 3).collect(Collectors.toList());
        System.out.println(newList2);
    }
}
