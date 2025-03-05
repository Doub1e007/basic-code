package com.doub1e.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *Collections集合工具类的使用
 */

public class CollectionsTest {
    public static void main(String[] args) {
        //1.public static <T> boolean addAll(Collection<? super T> c, T...elements):为集合批量添加数据
        List<String> names = new ArrayList<>();
        Collections.addAll(names,"张无忌","周星驰","刘宇");
        System.out.println(names);

        //2.public static void shuffle(List<?> list) 打乱List集合中的元素顺序
        Collections.shuffle(names);
        System.out.println(names);

        //3.public static <T> void sort(List<T> list)：对List集合中的元素进行升序排列

        List<Student> students = new ArrayList<>();
        Student s1 = new Student("赵敏",19,169.5);
    }
}
