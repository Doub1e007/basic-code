package com.iweb.chapter02;

import com.iweb.chapter01.DruidUtil;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class TestQueryAll {
    public static void main(String[] args) throws SQLException {
        QueryRunner qr = new QueryRunner(DruidUtil.getDataSource());
        String sql = "select * from t_user";
        List<Student> students = qr.query(sql, new BeanListHandler<>(Student.class));
        System.out.println(students);
    }
}
