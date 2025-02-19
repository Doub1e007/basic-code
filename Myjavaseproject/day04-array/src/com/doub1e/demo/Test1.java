package com.doub1e.demo;

public class Test1 {
    public static void main(String[] args) {
        //目标：数组求最值
        //1.把数据拿到程序中
        int[] facescore = {15,9000,10000,20000,9500,-5};
        //                 0   1    2     3     4    5

        //2.定义一个变量记录当前最大值，默认使用第一个作参照
        int max = facescore[0];

        //3.从数组第二个位置开始遍历数组的每个数据
        for (int i = 1; i < facescore.length; i++) {
            //获取到当前遍历到的数据 高效
            int score = facescore[i];
            //判断当前遍历到的数据是否大于最大值变量记录的数据 若大于则替换
            if(score > max){
                max = score;
            }
        }
        //输出最大值变量即为所求
        System.out.println(max);
    }
}
