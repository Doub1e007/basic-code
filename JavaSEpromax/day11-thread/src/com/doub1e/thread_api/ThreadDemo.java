package com.doub1e.thread_api;

public class ThreadDemo {
    public static void main(String[] args) {
        Thread t1 = new MyThread();
        t1.setName("1号线程");
        t1.start();
        System.out.println(t1.getName()); //Thread-0

        Thread t2 = new MyThread();
        t2.setName("2号线程");
        t2.start();
        System.out.println(t2.getName()); //Thread-1

        // 这个代码是哪个线程在执行 就会得到哪个线程的对象
        Thread m = Thread.currentThread();
        m.setName("最屌的线程");
        System.out.println(m.getName()); // main

        for (int i = 0; i < 4; i++) {
            System.out.println(m.getName() + "线程输出：" + i);
        }
    }
}

// 1.定义一个类继承Thread类 成为线程类
class MyThread extends Thread{
//    public MyThread(String name) {
//        super(name);
//    }
    // 2.重写run方法 声明线程要做的事情
    @Override
    public void run() {
        for (int i = 0; i < 4; i++) {
            //当前线程对象的名字
            System.out.println(Thread.currentThread().getName() + " => 线程输出：" + i);
        }
    }
}


