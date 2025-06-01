package com.doub1e;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.sql.*;

/**
 * JDBC测试
 */
public class JDBCTest {
    @Test
    public void testUpdate() throws Exception {
        //1.准备工作
        //1.1 注册驱动
//        Class.forName("com.mysql.cj.jdbc.Driver"); //固定步骤

        //1.2 获取数据库连接对象 Connection
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java147_db02", "root", "123456");

        //1.3 获取SQL语句执行对象 Statement
        Statement statement = connection.createStatement();

        //2.执行SQL语句
        //需求 修改用户表id为1的密码为12345678
        int i = statement.executeUpdate("update user set password= 123456789 where id = 1");
        System.out.println("i == " + i);

        //3.释放资源
        statement.close();
        connection.close();
    }

    /**
     * 存在SQL注入问题
     * @param uname
     * @param pwd
     * @throws Exception
     */
    @ParameterizedTest //参数化测试
    @CsvSource(value = {"xiaoqiao,123456","zhangsan,' or '1' = '1"})
    public void testSelect(String uname,String pwd) throws Exception {
        //1.准备工作
        //1.1 注册驱动
        Class.forName("com.mysql.cj.jdbc.Driver"); //固定步骤

        //1.2 获取数据库连接对象 Connection
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java147_db02", "root", "123456");

        //1.3 获取SQL语句执行对象 Statement
        Statement statement = connection.createStatement();

        //2.执行SQL语句
        //需求 根据用户名和密码查询用户信息，模拟用户登录
        ResultSet resultSet = statement.executeQuery("select * from user where username = '"+uname+"' and password = '"+pwd+"'");
//        ResultSet resultSet = statement.executeQuery("select * from user where username = 'zhangsan' and password = '' or '1' = '1'");
        //判断是否有值
        while (resultSet.next()) {
            // 输出结果 解析ResultSet
//            int id = resultSet.getInt(1); //下标从1开始
            int id = resultSet.getInt("id");
            String username = resultSet.getString("username");
            String password = resultSet.getString("password");
            String name = resultSet.getString("name");
            int age = resultSet.getInt("age");

            User user = new User(id, username, password, name, age);
            System.out.println(user);

        }

        //3.释放资源
        statement.close();
        connection.close();
    }

    /**
     * 预编译SQL，解决SQL注入问题
     * @param uname
     * @param pwd
     * @throws Exception
     */
    @ParameterizedTest //参数化测试
    @CsvSource(value = {"xiaoqiao,123456","zhangsan,' or '1' = '1"})
    public void testSelect2(String uname,String pwd) throws Exception {
        //1.准备工作
        //1.1 注册驱动
        Class.forName("com.mysql.cj.jdbc.Driver"); //固定步骤

        //1.2 获取数据库连接对象 Connection
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java147_db02", "root", "123456");

        //1.3 获取SQL语句执行对象 Statement -- 问号代表占位符
        PreparedStatement ps = connection.prepareStatement("select * from user where username = ? and password = ?");

        //1.4 设置参数值
        ps.setString(1, uname);
        ps.setString(2, pwd);

        //2.执行SQL语句
        //需求 根据用户名和密码查询用户信息，模拟用户登录
        ResultSet resultSet = ps.executeQuery();

        //判断是否有值
        while (resultSet.next()) {
            // 输出结果 解析ResultSet
//            int id = resultSet.getInt(1); //下标从1开始
            int id = resultSet.getInt("id");
            String username = resultSet.getString("username");
            String password = resultSet.getString("password");
            String name = resultSet.getString("name");
            int age = resultSet.getInt("age");

            User user = new User(id, username, password, name, age);
            System.out.println(user);

        }

        //3.释放资源
        ps.close();
        connection.close();
    }
}
