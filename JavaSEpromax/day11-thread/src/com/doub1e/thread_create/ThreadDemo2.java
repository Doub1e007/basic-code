package com.doub1e.thread_create;

public class ThreadDemo2 {
    public static void main(String[] args) {
        // 线程创建方式二 实现Runnable接口的方式
        // 3.创建任务类的一个对象
        Runnable target = new MyRunnable();

        // 4.把任务对象交给线程对象
        Thread t = new Thread(target);

        // 5.启动线程
        t.start();

        for (int i = 0; i < 4; i++) {
            System.out.println("main线程输出：" + i);
        }
    }
}

/**
 * 1.定义一个任务类实现Runnable接口
 */
class MyRunnable implements Runnable {
    // 2.重写run方法 声明线程要做的事情
    @Override
    public void run() {
        for (int i = 0; i < 4; i++) {
            System.out.println("子线程输出：" + i);
        }
    }
}