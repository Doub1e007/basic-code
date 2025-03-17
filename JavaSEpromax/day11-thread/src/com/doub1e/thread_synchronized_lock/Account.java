package com.doub1e.thread_synchronized_lock;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

@Data
@NoArgsConstructor

public class Account {
    private String cardId;
    private double money; //余额
    private final Lock lk = new ReentrantLock();

    public Account(String cardId, double money) {
        this.cardId = cardId;
        this.money = money;
    }

    //一号 二号拿同一个账户取钱
    public void drawMoney(double money) {
        String name = Thread.currentThread().getName();
        lk.lock(); //加锁
        try {
            if(this.money >= money) {
                System.out.println(name + "取钱成功，取出：" + money);
                //更新金额
                this.money -= money;
                System.out.println(name + "取钱成功后，账户余额为：" + this.money);
            }else{
                System.out.println(name + "来取钱：余额不足!");
            }
        } finally {
            lk.unlock(); //解锁
        }

    }
}
