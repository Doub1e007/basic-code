package com.doub1e.InnerClass;

public class People {
    private int heartBeat = 110;
    //成员内部类
    public class Heart{
        private int heartBeat = 95;
        public void show(){
            int heartBeat = 80;
            System.out.println(heartBeat);  //80
            System.out.println(this.heartBeat);  //95
            System.out.println(People.this.heartBeat);  //110
        }
    }
}
