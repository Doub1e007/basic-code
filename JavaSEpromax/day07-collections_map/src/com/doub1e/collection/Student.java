package com.doub1e.collection;

public class Student implements Comparable<Student>{
    private String name;
    private int age;
    private double height;

    //重写compare比较方法
    //s1.compareTo(s2)
    //左边对象 s1 == this
    //右边对象 s2 == o
    @Override
    public int compareTo(Student o) {
//        if (this.age > o.age){
//            return 1;
//        }else if (this.age < o.age){
//            return -1;
//        }
//        return 0;
//        //return this.age - o.age //升序
        return o.age - this.age; //降序
    }
}
