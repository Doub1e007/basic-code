package com.doub1e.inetAddress;

import java.net.InetAddress;

public class InetAddressDemo {
    public static void main(String[] args) throws Exception {
        //InetAddress类代表IP地址对象 用来操作IP地址
        // 1.获取本地IP地址对象
        InetAddress ip = InetAddress.getLocalHost();
        System.out.println(ip.getHostAddress());
        System.out.println(ip.getHostName());

        // 2.指定获取对方主机的IP地址对象
        InetAddress ip2 = InetAddress.getByName("www.baidu.com");
        System.out.println(ip2.getHostAddress());
        System.out.println(ip2.getHostName());

        // 3.判断主机与该主机是否能联通 ping
        System.out.println(ip2.isReachable(5000));
    }
}
