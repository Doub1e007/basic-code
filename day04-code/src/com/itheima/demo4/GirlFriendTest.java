package com.itheima.demo4;

public class GirlFriendTest {
    public static void main(String[] args) {
        GirlFriend gf1 = new GirlFriend();
        gf1.setAge(20);
        gf1.setGender("甜妹");
        gf1.setName("who is she");

        System.out.println(gf1.getAge());
        System.out.println(gf1.setGender());
        System.out.println(gf1.getName());

        gf1.sleep();
        gf1.eat();
    }
}
