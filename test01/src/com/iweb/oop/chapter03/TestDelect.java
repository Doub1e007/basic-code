package com.iweb.oop.chapter03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class TestDelect {
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

            //编写sql语句
            String sql = "delete from t_user where uid=?";
            PreparedStatement ps = connection.prepareStatement(sql);

            //参数1 占位符索引位置 从1开始 参数2 实际参数
            ps.setInt(1, 1);



            //执行sql  增删改都使用此方法
            //count:代表影响的记录数
            int count = ps.executeUpdate();
            System.out.println(count);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
