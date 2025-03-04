package com.doub1e.param;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        //可变参数的使用
        //求任意个整数数据的和
        sum();//可以不传参数
        sum(10);//可以传一个参数
        sum(20,30,40);//可以传多个参数
        sum(new int[]{10,20,30,40});//可以传一个数组

    }
    //作用 接收数据灵活
    //注意事项：
    //  可变参数在形参列表中只能出现一个
    //  可变参数必须放到形参列表最后面
    public static void sum(int... nums) {
        //可变参数在方法内部本质就是一个数组
        System.out.println("个数" + nums.length);
        System.out.println("内容" + Arrays.toString(nums));
    }
}
