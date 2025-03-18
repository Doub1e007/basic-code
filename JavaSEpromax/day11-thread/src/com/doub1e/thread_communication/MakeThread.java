package com.doub1e.thread_communication;

//生产者线程
public class MakeThread extends Thread {
    private Desk desk;

    public MakeThread(Desk desk, String name) {
        super(name);
        this.desk=desk;
    }
    @Override
    public void run() {
        //大肚婆 小李子 狗不理
        while(true){
            try {
                Thread.sleep(1000);
                desk.put();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
