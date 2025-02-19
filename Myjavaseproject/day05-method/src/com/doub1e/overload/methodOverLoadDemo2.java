package com.doub1e.overload;

public class methodOverLoadDemo2 {
    public static void main(String[] args) {
        //方法重载的应用场景
        fire();
        fire("美国");
        fire("美国",1000);

    }
    public static void fire(){
        System.out.println("默认给日本发射一枚炮弹");
    }
    public static void fire(String location){
        System.out.println("默认给" + location + "发射一枚炮弹");
    }
    public static void fire(String location,int number){
        System.out.println("默认给" + location + "发射" + number + "枚炮弹");
    }
}
