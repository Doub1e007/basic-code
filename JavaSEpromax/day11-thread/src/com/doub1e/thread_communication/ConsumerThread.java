package com.doub1e.thread_communication;

//消费者线程
public class ConsumerThread extends Thread {
    private Desk desk;

    public ConsumerThread(Desk desk, String name) {
        super(name);
        this.desk=desk;
    }

    @Override
    public void run() {
        //小懒牛 小萝莉
        while(true){
            try {
                Thread.sleep(1000);
                desk.get();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
