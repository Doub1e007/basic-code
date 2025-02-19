package com.doub1e.string;

public class StringDemo2 {
    public static void main(String[] args) {
        //熟悉String类的常用方法
        String name = "666哪吒2";

        //1.获取字符串的长度
        System.out.println("字符串长度：" + name.length());

        //2.提取字符串中某个索引位置处的字符
        System.out.println(name.charAt(4));

        System.out.println("-------------------");
        
        //字符串遍历
        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            System.out.print(c);
        }

        System.out.println("-------------------");

        //3.把字符串转换成字符数组，再进行遍历
        char[] chars = name.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            System.out.println(c);
        }

        //4.判断字符串内容 内容一样返回true equals
        String s1 = new String("哪吒666");
        String s2 = new String("哪吒666");
        System.out.println(s1 == s2); //false 比较的是地址值
        System.out.println(s1.equals(s2));

        //5.忽略大小写比较字符串内容（验证码常用
        String t1 = "a12G4f";
        String t2 = "A12g4F";
        System.out.println(t1.equals(t2)); //false
        System.out.println(t1.equalsIgnoreCase(t2)); //true

        //6.获取字符串内容（包前不包后
        String st = "哪吒2魔童闹海";
        String rs = st.substring(0, 2);
        System.out.println(rs); //哪吒

        //7.从当前索引位置一直截取到字符串的末尾
        String rs2 = st.substring(4);
        System.out.println(rs2); //魔童闹海

        //8.把字符串中某个内容替换成新内容，并返回新的字符串对象给我们
        String info = "这个游戏简直是个垃圾，sb，草你玛，还我血汗钱，垃圾！";
        String rs3 = info.replace("垃圾", "**").replace("sb", "**").replace("草你玛", "**");
        System.out.println(rs3);

        //9.判断字符串中是否包含某个关键字
        String st2 = "哪吒2魔童闹海";
        System.out.println(st2.contains("哪吒")); //
        System.out.println(st2.contains("2")); //
        System.out.println(st2.contains("魔童脑海")); //

        //10.判断字符串是否以某个关键字开头
        System.out.println(st2.startsWith("哪吒")); //true
        System.out.println(st2.startsWith("哪吒1")); //false

        //判断字符串是否以某个关键字结尾
        System.out.println(st2.endsWith("魔童闹海")); //true
        System.out.println(st2.endsWith("魔童")); //false

        //11.把字符串按照某个指定内容分割成多个字符串 放到一个字符串数组中返回给我们
        String result = "梅西，内马尔，伊布";
        String[] names = result.split(",");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

    }
}
