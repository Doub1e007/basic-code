package com.doub1e.bigdecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimal1 {
    public static void main(String[] args) {
        //处理浮点型运算失真的问题
        double a = 0.1;
        double b = 0.2;
        double c = a + b;
        System.out.println(c); //0.30000000000000004

        //1.把两个数据包装成BigDecimal对象
        //public BigDecimal(String val)：这个接收字符串构造器才可以处理失真问题
        BigDecimal a1 = new BigDecimal(Double.toString(a));
        BigDecimal b1 = new BigDecimal(Double.toString(b));

        //阿里巴巴更推荐使用valueof方法包装浮点型数据成为BigDecimal对象
        BigDecimal a11 = BigDecimal.valueOf(a);
        BigDecimal b11 = BigDecimal.valueOf(b);

        //2.调用方法进行精度计算
//        BigDecimal c11 = a11.add(b11);//加
//        BigDecimal c12 = a11.subtract(b11);//减
//        BigDecimal c13 = a11.multiply(b11);//乘
        BigDecimal c11 = a11.divide(b11);//除

        //3.BigDecimal是处理精度问题的手段，结果必须还是基本类型
        double result = c11.doubleValue();
        System.out.println(result);

        System.out.println("--------------------------------------");
        BigDecimal i = BigDecimal.valueOf(0.1);
        BigDecimal j = BigDecimal.valueOf(0.3);
        /*
        * 参数一：除数
        * 参数二：保留位数
        * 参数三：舍入模式
        * */
        BigDecimal k = i.divide(j,2, RoundingMode.HALF_UP);
        System.out.println(k);

    }
}
