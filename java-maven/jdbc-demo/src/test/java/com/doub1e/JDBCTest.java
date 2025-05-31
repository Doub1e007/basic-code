package com.doub1e;

import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * JDBC测试
 */
public class JDBCTest {
    @Test
    public void testUpdate() throws Exception {
        //1.准备工作
        //1.1 注册驱动
        Class.forName("com.mysql.cj.jdbc.Driver"); //固定步骤

        //1.2 获取数据库连接对象 Connection
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java147_db02", "root", "123456");

        //1.3 获取SQL语句执行对象 Statement
        Statement statement = connection.createStatement();

        //2.执行SQL语句
        //需求 修改用户表id为1的密码为12345678
        int i = statement.executeUpdate("update user set password= 12345678 where id = 1");
        System.out.println("i == " + i);

        //3.释放资源
        statement.close();
        connection.close();
    }
}
