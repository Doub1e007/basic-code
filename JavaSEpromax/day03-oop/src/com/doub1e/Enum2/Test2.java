package com.doub1e.Enum2;

public class Test2 {
    public static void main(String[] args) {
        //泛型的应用场景：信息标志和信息分类
        //需要提供一个方法 可以完成向下取整 向上取整 四舍五入 去掉小数部分
        //枚举信息标准和分类 优雅 参数受到约束! 信息标志和分类的理想方案
        System.out.println(handleData(3.9999,Constant2.DOWN));
    }
    public static double handleData(double number,Constant2 flag) {
        switch (flag) {
            case Constant2.DOWN:
                //向下取整
                number = Math.floor(number); //3.9999 == 3
                break;
            case Constant2.UP:
                //向上取整
                number = Math.ceil(number);
                break;
            case Constant2.HALF_UP:
                //四舍五入
                number = Math.round(number);
                break;
            case Constant2.DELETE_LEFT:
                //去掉小数部分
                number = (int)number;
                break;
        }
        return number;
    }
}
