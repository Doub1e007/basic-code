package com.iweb.chapter02;

import com.iweb.chapter01.DruidUtil;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.SQLException;

public class TestQueryByID {
    public static void main(String[] args) throws SQLException {
        QueryRunner qr = new QueryRunner(DruidUtil.getDataSource());
        String sql = "select * from t_user where uid = ?";
        Student student =
                qr.query(sql, new BeanHandler<>(Student.class), 1);
        System.out.println(student);
    }

}
