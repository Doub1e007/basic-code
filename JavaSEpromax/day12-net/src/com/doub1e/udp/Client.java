package com.doub1e.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * 需求：一发 一收
 */
public class Client {
    public static void main(String[] args) throws Exception {
        //发送端实现 客户端
        // 1.创建发送端对象 抛韭菜的人
        DatagramSocket socket = new DatagramSocket(); //默认会分配端口

        // 2.创建一个数据包对象 用来封装要发送的数据
        /**
         * 参数一：要发送的数据，字节数组、
         * 参数二：要发送的数据大小
         * 参数三：目的IP地址
         * 参数四：接收端口号
         */
        byte[] buffer = "今晚一起啤酒、小龙虾，约不约？".getBytes();
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length, InetAddress.getLocalHost(),
                8888); //盘子

        // 3.把这一包数据发出去 （抛出去韭菜
        socket.send(packet);

        // 4.释放资源
        socket.close();

        System.out.println("客户端已发送完毕！");

    }
}
