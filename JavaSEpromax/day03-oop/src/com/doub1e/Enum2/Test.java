package com.doub1e.Enum2;

public class Test {
    public static void main(String[] args) {
        //泛型的应用场景：信息标志和信息分类
        //需要提供一个方法 可以完成向下取整 向上取整 四舍五入 去掉小数部分
        //常数值信息标准和分类虽然优雅 但是参数不被约束!
        System.out.println(handleData(3.9999,Constant.DOWN));
    }
    public static double handleData(double number,int flag) {
        switch (flag) {
            case Constant.DOWN:
                //向下取整
                number = Math.floor(number); //3.9999 == 3
                break;
            case Constant.UP:
                //向上取整
                number = Math.ceil(number);
                break;
            case Constant.HALF_UP:
                //四舍五入
                number = Math.round(number);
                break;
            case Constant.DELETE_LEFT:
                //去掉小数部分
                number = (int)number;
                break;
        }
        return number;
    }
}
