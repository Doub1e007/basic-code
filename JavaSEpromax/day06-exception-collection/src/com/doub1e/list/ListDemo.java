package com.doub1e.list;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        //List的特有方法
        //1.创建一个List集合对象(经典代码
        List<String> list = new ArrayList<>();//多态
        list.add("莫德里奇");
        list.add("克罗斯");
        list.add("恩佐");
        list.add("阿尔瓦雷斯");
        System.out.println(list); //[莫德里奇, 克罗斯, 恩佐, 阿尔瓦雷斯]

        //2.给某个位置插入一个数据
        list.add(1,"蒿俊闵");
        System.out.println(list); //[莫德里奇, 蒿俊闵, 克罗斯, 恩佐, 阿尔瓦雷斯]

        //3.根据索引删除数据
        System.out.println(list.remove(2));
        System.out.println(list); //[莫德里奇, 蒿俊闵, 恩佐, 阿尔瓦雷斯]

        //4.修改索引处数据
        System.out.println(list.set(2, "武磊"));
        System.out.println(list); //[莫德里奇, 蒿俊闵, 武磊, 阿尔瓦雷斯]

        //5.根据索引取数据
        System.out.println(list.get(2));

    }
}
