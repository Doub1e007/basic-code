package com.doub1e.array;

import java.util.Arrays;
import java.util.Comparator;

public class Array2 {
    public static void main(String[] args) {
        //给存储对象排序
        Student[] students = new Student[4];//students = [null,null,null.null]
        //                                                 0    1    2    3
        students[0] = new Student("马龙",35,'男',178);
        students[1] = new Student("王皓",33,'男',168);
        students[2] = new Student("张继科",30,'男',182);
        students[3] = new Student("樊振东",27,'男',175);

        //自定义排序规则一 让对象所在的类实现比较规则接口Comparable,重写compareTo方法 来指定排序规则
        Arrays.sort(students);

        //自定义排序规则二 sort存在重载方法，支持自带Comparator比较器对象来直接指定比较规则(优先
        //public static <T> void sort(T[] o,Comparator<? super T> c)
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                //return o1.getAge() - o2.getAge(); //升序
                if(o1.getHeight()>o2.getHeight()){
                    return 1;
                } else if (o1.getHeight()<o2.getHeight()) {
                    return -1;
                }
                return 0;
            }
        });

        System.out.println(Arrays.toString(students));
    }
}
