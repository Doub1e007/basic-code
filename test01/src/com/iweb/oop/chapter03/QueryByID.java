package com.iweb.oop.chapter03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class QueryByID {
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
            String sql = "select * from t_user where uid = ?";
            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setInt(1, 1);
            ResultSet rs = ps.executeQuery();
            rs.next();
            int uid = rs.getInt("uid");
            String user = rs.getString("username");
            String pass = rs.getString("password");
            String gender = rs.getString("gender");
            String hobby = rs.getString("hobby");
            String description = rs.getString("description");
            System.out.println(uid + " " + user + " " + pass + " " + gender + " " + hobby + " " + description);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
