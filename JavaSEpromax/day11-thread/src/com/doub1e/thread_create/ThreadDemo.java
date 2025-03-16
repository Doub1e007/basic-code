package com.doub1e.thread_create;

public class ThreadDemo {
    //注：main方法本身就是由一条主线程负责执行的
    public static void main(String[] args) {
        // 线程创建方式一 继承Thread类
        // 3.创建线程对象代表具体的线程
        Thread t = new MyThread();

        // 4.启动线程 会自动执行线程的run方法
        // 如果直接调用run CPU不会注册新线程执行 此时还是单线程
        t.start();

        for (int i = 0; i < 4; i++) {
            System.out.println("main线程输出：" + i);
        }
    }
}

// 1.定义一个类继承Thread类 成为线程类
class MyThread extends Thread{
    // 2.重写run方法 声明线程要做的事情
    @Override
    public void run() {
        for (int i = 0; i < 4; i++) {
            System.out.println("子线程输出：" + i);
        }
    }
}
