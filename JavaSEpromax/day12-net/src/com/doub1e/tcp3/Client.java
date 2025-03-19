package com.doub1e.tcp3;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws Exception {
        // 实现TCP通信下 多发多收 支持多个客户端开发
        System.out.println("客户端启动--------------------");
        // 1.创建Socket管道对象 请求与服务端Socket连接 可靠连接
        Socket socket = new Socket("127.0.0.1",9999);

        // 2.从socket通信管理中得到一个字节输出流
        OutputStream os = socket.getOutputStream();

        // 3.特殊数据流
        DataOutputStream dos = new DataOutputStream(os);

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请说：");
            String msg = sc.nextLine();
            if("exit".equals(msg)){
                System.out.println("退出成功");
                socket.close();
                break;
            }
            dos.writeUTF(msg); //发送数据
            dos.flush();
        }



    }
}
