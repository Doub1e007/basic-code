package com.doub1e.math;

import java.util.Scanner;

public class RuntimeTest {
    public static void main(String[] args) {
        //1.public static Runtime getRuntime() 返回与当前Java应用程序相关联的运行时对象
        Runtime jre = Runtime.getRuntime();

        //2.public void exit(int status) 终止当前运行的虚拟机 该参数用作状态代码 非零状态表示异常终止
//        jre.exit(0);
//        System.out.println("结束");

        //3.public static int availableProcessors() 获取虚拟机能使用的处理器数
        System.out.println("处理器数量" + jre.availableProcessors());

        //4.public long totalMemory() 返回Java虚拟机中内存总量 字节数
        System.out.println("Java虚拟机中的内存数量" + jre.totalMemory()/1024.0/1024.0 + "MB");

        //5.public long freeMemory() 返回Java虚拟机中的可用内存量
        System.out.println("Java虚拟机中的可用内存量：" + jre.freeMemory()/1024.0/1024.0 + "MB");

        //6.public Process exec(String command) 执行命令 启动程序
        //jre.exec("calc");
        //启动QQ后会返回一个进程对象 代表启动的QQ软件
//        Process process = jre.exec("QQ");
//        Scanner sc = new Scanner(System.in);
//        String command = sc.next();
//        switch (command){
//            case "y":
//            case "Y":
//                process.destroy();
//                break;
//            default:
//                System.out.println("取消！");
//        }
    }
}
