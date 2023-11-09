package com.iweb.chapter02;

import com.iweb.chapter01.DruidUtil;
import org.apache.commons.dbutils.QueryRunner;

import java.sql.SQLException;

public class TestAdd {

	public static void main(String[] args) throws SQLException {
        QueryRunner qr = new QueryRunner(DruidUtil.getDataSource());
        String sql = "insert into t_user(username,password,gender,hobby,description) values(?,?,?,?,?)";

        int count = qr.update(sql, "张三", "123456", "男", "篮球", "篮球爱好者");
        System.out.println(count);
    }
}
