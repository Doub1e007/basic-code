package com.doub1e.integer;

public class Test {
    public static void main(String[] args) {
        //包装类
        int a = 12;

        //1.把基本类型通过包装类包装成对象
        //Integer it1 = new Integer(a);
        Integer it1 = Integer.valueOf(a); //手动包装
        System.out.println(it1);

        //2.自动装箱机制 基本类型的数据可以直接变成对象赋值给包装类
        Integer it2 = 12;
        Integer it3 = 12;
        System.out.println(it3 == it2);

        //3.自动拆箱机制 包装类的对象可以直接赋值给基本数据类型
        int it4 = it3;
        System.out.println(it4);

        System.out.println("---------------Java为包装类提供的新功能--------------------");
        //1.功能一 包装类可以把基本类型的数据转换成字符串
        int a1 = 23;
        String rs = Integer.toString(a1);//"23"
        System.out.println(rs+1);//231

        Integer i = 23;
        String rs2 = i.toString(); //"23"
        System.out.println(rs2+1);//231

        int a2 = 23;
        String rs3 = a2 + "";
        System.out.println(rs3+1);

        //2.功能二 把字符串数据转换成对应的基本数据类型(很有用)
        String ageStr = "23";
        //int age = Integer.parseInt(ageStr);
        int age = Integer.valueOf(ageStr);
        System.out.println(age + 1);//24

        String scoreStr = "99.5";
        double score = Double.parseDouble(scoreStr);
        System.out.println(score + 0.5);//100.0

        //3.功能三 由于泛型和集合都不支持基本数据类型 所以集合泛型中大量使用包装类
    }
}
