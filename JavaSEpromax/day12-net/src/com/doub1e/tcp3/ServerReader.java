package com.doub1e.tcp3;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.Socket;

public class ServerReader extends Thread {
    private Socket socket;

    public ServerReader(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        // 读取管道的消息
        try {
            // 3.获取输入流 读取客户端发送数据
            InputStream is = socket.getInputStream();

            // 4.把输入流包装成特殊数据输入流
            DataInputStream dis = new DataInputStream(is);

            while (true) {
                // 5.读取数据
                String msg = dis.readUTF(); //等待读取客户端发送的数据
                System.out.println("收到的客户端msg = " + msg);

                // 6.客户端的IP和端口
                System.out.println("客户端的IP：" + socket.getInetAddress().getHostAddress());
                System.out.println("客户端的接口" + socket.getPort());
                System.out.println("-------------------------------------");
            }

        } catch (Exception e) {
            System.out.println("服务端下线了：" + socket.getInetAddress().getHostAddress());
        }
    }
}
