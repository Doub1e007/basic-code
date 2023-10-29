package com.iweb.oop.chapter01;

import javax.swing.*;

public class MyWindow extends JFrame {
    public MyWindow(){
        setSize(300,200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MyWindow();
    }

}
