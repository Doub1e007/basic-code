package com.doub1e.genericity_method;

import com.doub1e.genericity_interface.Student;

public class Test {
    public static void main(String[] args) {
        //认识泛型方法
        //需求： 要求接收任意对象数组
        String[] name = {"谢霆锋","陈羽凡","王宝强","贾乃亮"};
        String rs1 = printArray(name);

        Student[] students = new Student[60];
        Student rs2 = printArray(students);

    }
    public static <T> T printArray(T[] array){
        return array[0];
    }
}
