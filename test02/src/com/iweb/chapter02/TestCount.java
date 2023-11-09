package com.iweb.chapter02;

import com.iweb.chapter01.DruidUtil;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.SQLException;

public class TestCount {
    public static void main(String[] args) throws SQLException {
        QueryRunner qr = new QueryRunner(DruidUtil.getDataSource());
        String sql = "select count(*) from t_user";
        Long count = qr.query(sql, new ScalarHandler<>());
        System.out.println(count);
    }
}
