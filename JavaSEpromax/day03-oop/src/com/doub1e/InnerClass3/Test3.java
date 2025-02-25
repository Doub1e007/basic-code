package com.doub1e.InnerClass3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test3 {
    public static void main(String[] args) {
        //匿名内部类真实场景
        //GUI SWING编程 桌面编程
        //1.创建一个窗口
        JFrame win = new JFrame("登录");

        JPanel panel = new JPanel();
        win.add(panel);

        JButton btn = new JButton("登录");
        panel.add(btn);

        //给按钮绑定单击事件监听器对象 用来监听用户的点击 以便做出反应
        //匿名内部类是作为一个对象参数传输给方法的
        //重要作用：简化代码（新技术的基础
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("点击了 我要进行登录了");
                JOptionPane.showMessageDialog(win,"没事别点我");
            }
        });

        //2.设计大小 居中显示
        win.setSize(400,300);
        win.setLocationRelativeTo(null);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.setVisible(true);
    }
}
