package com.doub1e.thread_pool;

import java.util.concurrent.*;

public class ThreadPoolExecutorDemo {
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
        Runnable target = new MyRunnable();
        pool.execute(target); //自动创建线程并处理任务
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);
        pool.execute(target); //到了临时线程时机
        pool.execute(target); //到了临时线程时机
        pool.execute(target); //到了任务拒绝策略

        // 3.线程池没有死亡
//        pool.shutdownNow();//立即关闭 不管是否完成任务！返回没有完成的任务
//        pool.shutdown(); //等待全部任务执行完毕后再关闭
    }
}
