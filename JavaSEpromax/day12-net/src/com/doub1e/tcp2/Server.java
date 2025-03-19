package com.doub1e.tcp2;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws Exception {
        // 实现TCP通信下 一发一收 服务端开发
        System.out.println("服务端启动--------------------");
        // 1.创建服务端ServerSocket对象 绑定端口号 监听服务器连接
        ServerSocket ss = new ServerSocket(9999);

        // 2.调用accept方法 阻塞等待客户端连接 一旦客户端连接返回一个Socket对象
        Socket socket = ss.accept();

        // 3.获取输入流 读取客户端发送数据
        InputStream is = socket.getInputStream();

        // 4.把输入流包装成特殊数据输入流
        DataInputStream dis = new DataInputStream(is);

        while (true) {
            // 5.读取数据
            String msg = dis.readUTF(); //等待读取客户端发送的数据
            System.out.println( "收到的客户端msg = " + msg);

            // 6.客户端的IP和端口
            System.out.println("客户端的IP：" + socket.getInetAddress().getHostAddress());
            System.out.println("客户端的接口" + socket.getPort());
            System.out.println("-------------------------------------");
        }


    }
}
