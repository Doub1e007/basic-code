package com.iweb.oop.chapter03;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBC {
    public static void main(String[] args) {
        try {
            //加载驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            //获取数据库链接
            String url = "jdbc:mysql://localhost:3306/web_soft?serverTimezone=UTC";
            String username = "root";
            String password = "123456";
            Connection connection =
                    DriverManager.getConnection(url, username, password);
            System.out.println(connection);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
