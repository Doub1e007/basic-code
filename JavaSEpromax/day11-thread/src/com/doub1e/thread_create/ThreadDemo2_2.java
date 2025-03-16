package com.doub1e.thread_create;

public class ThreadDemo2_2 {
    public static void main(String[] args) {
        // 线程创建方式二 实现Runnable接口的方式
        // 1.创建任务类的一个对象
        Runnable target = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 4; i++) {
                    System.out.println("子线程1输出：" + i);
                }
            }
        };
        Thread t = new Thread(target);
        t.start();

        new Thread( new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 4; i++) {
                    System.out.println("子线程2输出：" + i);
                }
            }
        }).start();
    }
}
