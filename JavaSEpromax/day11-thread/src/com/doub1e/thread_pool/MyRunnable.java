package com.doub1e.thread_pool;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 3 ; i++) {
            System.out.println(Thread.currentThread().getName() + "输出：" + i);
            System.out.println(Thread.currentThread().getName() + "线程进行休眠");
            try {
                Thread.sleep(Integer.MAX_VALUE);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
