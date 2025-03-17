package com.doub1e.Synchronized;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account {
    private String cardId;
    private double money; //余额
//
//    public static void test(){
//        synchronized (Account.class){
//
//        }
//    }

    //一号 二号拿同一个账户取钱
    public void drawMoney(double money) {
        String name = Thread.currentThread().getName();
        synchronized (this) {
            if(this.money >= money) {
                System.out.println(name + "取钱成功，取出：" + money);
                //更新金额
                this.money -= money;
                System.out.println(name + "取钱成功后，账户余额为：" + this.money);
            }else{
                System.out.println(name + "来取钱：余额不足!");
            }
        }
    }
}
