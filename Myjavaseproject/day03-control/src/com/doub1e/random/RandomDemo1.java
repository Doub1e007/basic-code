package com.doub1e.random;

import java.util.Random;

public class RandomDemo1 {
    public static void main(String[] args) {
        //1.导包
        //2.创建对象
        Random r = new Random();

        //3.调用方法
        int num = r.nextInt(10); //包前不包后

        System.out.println(num);
    }
}
