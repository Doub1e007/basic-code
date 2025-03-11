package com.doub1e.Finally;

public class FinallyDemo {
    public static void main(String[] args) {
        //finally作用
        //try后或者catch后 最终一定要执行一次 除非JVM挂了
        try{
            System.out.println(10 / 2);
            return;
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("=======================finally=======================");
        }
    }
    public static int divide(){
        try{
            return 10 / 2;
        }catch (Exception e){
            e.printStackTrace();
            return -1;
        }finally {
            System.out.println("=======================finally=======================");
            return 100; //不要在finally中返回数据 会覆盖前面所有的数据
        }
    }
}
