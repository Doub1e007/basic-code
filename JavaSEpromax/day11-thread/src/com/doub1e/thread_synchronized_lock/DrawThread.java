package com.doub1e.thread_synchronized_lock;

//取钱线程类
public class DrawThread extends Thread {
    private Account acc;

    public DrawThread(String name, Account acc) {
        super(name);
        this.acc = acc;
    }
    // 一号 二号
    @Override
    public void run() {
        //一号 二号拿同一个账户取钱
        acc.drawMoney(100000);
    }
}
