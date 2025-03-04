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

        List<Student> students = new ArrayList<>();
    }
}
