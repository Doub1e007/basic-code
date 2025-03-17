package com.doub1e.thread_create;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class ThreadDemo3 {
    public static void main(String[] args) {
        // 线程创建方式三 可以返回线程执行
        // 3.创建Callable对象
        Callable<String> call = new MyCallable(100);
        // 4.把Callable对象 封装成FutureTask对象
        // 未来任务对象的两个作用
        //  它是一个Runnable对象
        //  它可以获取线程执行后的结果
        FutureTask<String> task = new FutureTask<String>(call);

        // 5.把未来任务对象交给线程对象
        Thread t = new Thread(task);
        // 6.启动线程
        t.start();

        Callable<String> call2 = new MyCallable(200);
        FutureTask<String> task2 = new FutureTask<String>(call2);
        Thread t2 = new Thread(task2);
        t2.start();

        try {
            //如果第一个线程没有执行完毕 会在这里等待第一个线程执行完毕后 再取结果
            String rs = task.get();
            System.out.println(rs);
        } catch (Exception e) {
            e.printStackTrace();
        }


        try {
            String rs = task2.get();
            System.out.println(rs);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
// 1.定义一个类实现Callable接口
class MyCallable implements Callable<String> {
    // 2.重写call方法 声明任务和返回的结果
    private int n;
    public MyCallable(int n) {
        this.n = n;
    }
    @Override
    public String call() throws Exception {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return "子线程求和1-" + n + "的结果是：" + sum;
    }
}
