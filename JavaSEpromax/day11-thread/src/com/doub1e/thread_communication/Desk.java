package com.doub1e.thread_communication;

import lombok.Data;

@Data
public class Desk {
    private String data;//放包子数据

    //小懒牛 小萝莉
    public synchronized void get() throws Exception {
        String name = Thread.currentThread().getName();
        if(data == null){
            //没有包子 暂停自己 唤醒别人
            this.notifyAll();
            this.wait();
        }else {
            //有包子 开始吃
            System.out.println(name + "吃了：" + data);
            data = null;
            this.notifyAll();
            this.wait();
        }

    }
    //大肚婆 小李子 狗不理
    public synchronized void put() throws Exception {
        String name = Thread.currentThread().getName();
        if(data == null){
            //没有包子 做包子
            data = name + "做的包子";
            System.out.println(name + "做的一个包子");
            this.notifyAll();
            this.wait();
        }else {
            //有包子
            this.notifyAll();
            this.wait();
        }
    }
}
