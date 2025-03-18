package com.doub1e.thread_pool;

import java.util.concurrent.*;

public class ThreadPoolExecutorDemo2 {
    public static void main(String[] args) {
        //创建线程池对象 处理Runnable任务
        // 1.创建线程池
        /*public ThreadPoolExecutor(int corePoolSize,
        *                   int maximumPoolSize,
        *                   long keepAliveTime
        *                   TimeUnit unit
        *                   BlockingQueue<Runnable> workQueue,
        *                   ThreadFactory threadFactory,
        *                   RejectedExecutionHandle handle */
        /**
         * ThreadPoolExecutor.AbortPolicy() 丢弃任务并抛出异常 默认~
         * ThreadPoolExecutor.DiscardPolicy() 丢弃任务 不抛出异常
         * ThreadPoolExecutor.DiscardOldestPolicy() 抛弃队列中等待最久的任务 然后吧当前任务加入队列
         * ThreadPoolExecutor.CallerRunsPolicy() 由主线程负责调用任务的run()方法绕过线程池执行
         */
        ExecutorService pool = new ThreadPoolExecutor(3,5,1, TimeUnit.MINUTES,
                new ArrayBlockingQueue<>(3), Executors.defaultThreadFactory(),new ThreadPoolExecutor.DiscardPolicy());

        // 2.处理任务
        Future<String> f1 = pool.submit(new MyCallable(100));
        Future<String> f2 = pool.submit(new MyCallable(200));
        Future<String> f3 = pool.submit(new MyCallable(300));

        try {
            String s = f1.get();
            System.out.println(s);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            String s = f2.get();
            System.out.println(s);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            String s = f3.get();
            System.out.println(s);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
