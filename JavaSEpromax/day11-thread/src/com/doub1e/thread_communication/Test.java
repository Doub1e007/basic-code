package com.doub1e.thread_communication;

public class Test {
    public static void main(String[] args) {
        // 线程通信
        // 1.竞争一张桌子
        Desk desk = new Desk();

        // 2.创建两个消费者线程
        new ConsumerThread(desk,"小懒牛").start();
        new ConsumerThread(desk,"小萝莉").start();

        // 3.创建三个生产者线程
        new MakeThread(desk,"大肚婆").start();
        new MakeThread(desk,"小李子").start();
        new MakeThread(desk,"狗不理").start();


    }
}
