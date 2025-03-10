package com.doub1e.recursion;

public class RecursionTest3 {
    public static void main(String[] args) {
        //递归算法基础 求和问题
        System.out.println("1-5的和" + f(5));

    }
    public static int f(int n) {
        if(n == 1){
            return 1;
        }else {
            return f(n-1) + n;
        }

    }
}
