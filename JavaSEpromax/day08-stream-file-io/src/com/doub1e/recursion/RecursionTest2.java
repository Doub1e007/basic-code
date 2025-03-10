package com.doub1e.recursion;

public class RecursionTest2 {
    public static void main(String[] args) {
        //递归算法基础 阶乘问题
        System.out.println(f(5));

    }
    public static int f(int n) {
        if(n == 1){
            return 1;
        }
        return f(n-1) * n;//递归
    }
}
