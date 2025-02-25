package com.doub1e.objects;

import com.doub1e.object.Student;

import java.util.Objects;

public class Test {
    public static void main(String[] args) {
        //Objects的常用方法
        Student t1 = null;
        Student t2 = new Student("蜘蛛侠",300,85.5);
        //System.out.println(t1.equals(t2));//如果主调对象是null，直接报空指针异常
        System.out.println(Objects.equals(t1, t2));//false 更安全可靠
        //比较两个对象时，建议用Objects的equals来判断

        System.out.println(Objects.isNull(t1));
        System.out.println(t1 == null);//true

        System.out.println(Objects.nonNull(t1));
        System.out.println(t1 != null);//false
    }
}
