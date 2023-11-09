package com.iweb.chapter01;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class QueryAll {
    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            //加载驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            //获取数据库链接
            String url = "jdbc:mysql://localhost:3306/web_soft?serverTimezone=UTC";
            String username = "root";
            String password = "123456";
            connection =
                    DriverManager.getConnection(url, username, password);
            String sql = "select * from t_user";
            ps = connection.prepareStatement(sql);


            rs = ps.executeQuery();
            List<Student> students = new ArrayList<>();

            while (rs.next()) {

                String uid = rs.getString("uid");
                String user = rs.getString("username");
                String pass = rs.getString("password");
                String gender = rs.getString("gender");
                String hobby = rs.getString("hobby");
                String description = rs.getString("description");
                //alt + 回车
                Student student = new Student();
                student.setUid(uid);
                student.setUsername(user);
                student.setPassword(pass);
                student.setGender(gender);
                student.setHobby(hobby);
                student.setDescription(description);

                students.add(student);
                System.out.println(student);

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
                ps.close();
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
    }
}
