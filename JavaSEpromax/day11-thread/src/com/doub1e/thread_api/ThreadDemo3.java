package com.doub1e.thread_api;

public class ThreadDemo3 {
    public static void main(String[] args) throws Exception {
        //  线程join
        Thread t = new MyThread2();
        t.start();
        // 线程的休眠
        for (int i = 0; i < 4; i++) {
            System.out.println("main线程输出：" + i);
            if(i == 2){
                t.join();//让t插队执行完毕
            }
            // 作用 让当前线程执行的慢一点
            //Thread.sleep(1000); //休眠1s后再执行
        }
    }
}
//定义一个类继承Thread类 成为线程类
class MyThread2 extends Thread {
    // 重写run方法 声明线程要干的事情
    @Override
    public void run() {
        for (int i = 0; i < 4; i++) {
            System.out.println("子线程输出：" + i);
        }
    }
}