package com.doub1e.thread_pool;

import java.util.concurrent.Callable;

// 1.定义一个类实现Callable接口
public class MyCallable implements Callable<String> {
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
        return Thread.currentThread().getName() + "求和1-" + n + "的结果是：" + sum;
    }
}
