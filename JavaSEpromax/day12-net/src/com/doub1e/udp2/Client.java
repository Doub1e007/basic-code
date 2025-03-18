package com.doub1e.udp2;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/**
 * 需求：多发 多收
 */
public class Client {
    public static void main(String[] args) throws Exception {
        //发送端实现 客户端
        // 1.创建发送端对象 抛韭菜的人
        DatagramSocket socket = new DatagramSocket(); //默认会分配端口

        Scanner sc = new Scanner(System.in);
        while (true) {
            // 2.创建一个数据包对象 用来封装要发送的数据
            System.out.println("请说：");
            String msg = sc.nextLine();

            if("exit".equals(msg)) {
                System.out.println("退出成功！");
                socket.close();
                break;
            }

            byte[] buffer = msg.getBytes();
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length, InetAddress.getLocalHost(),
                    8888); //盘子

            // 3.把这一包数据发出去 （抛出去韭菜
            socket.send(packet);
        }


    }
}
