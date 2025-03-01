package com.doub1e.exception;

public class ExceptionDemo2 {
    public static void main(String[] args) {
        //异常的作用
        System.out.println("开始-------------");
        try {
            //监视代码
            System.out.println(divide(10, 0));
            System.out.println("成功了");
        } catch (Exception e) {
            System.out.println("失败了");
            //捕获异常 并打印出异常信息
            e.printStackTrace();//打出异常信息
        }
        System.out.println("结束-------------");

    }
    public static int divide(int a, int b) {
        if(b == 0){
            System.out.println("参数有问题");
            //抛出一个异常作为返回值通知出现了bug
            throw new RuntimeException("/ by zero ");
        }
        int c = a/b;
        return c;
    }
}
