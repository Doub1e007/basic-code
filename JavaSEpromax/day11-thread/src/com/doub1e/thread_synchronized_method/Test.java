package com.doub1e.thread_synchronized_method;

public class Test {
    public static void main(String[] args) {
        // 同步代码块
        // 1.创建一个账户对象 两个人共享
        Account acc  = new Account("ICBC-110",100000);

        // 2.创建两个线程代表两个人 同时去同一个账户取钱
        new DrawThread("一号",acc).start();
        new DrawThread("二号",acc).start();
    }
}
