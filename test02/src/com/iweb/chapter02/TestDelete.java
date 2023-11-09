package com.iweb.chapter02;

import com.iweb.chapter01.DruidUtil;
import org.apache.commons.dbutils.QueryRunner;

import java.sql.SQLException;

public class TestDelete {
    public static void main(String[] args) throws SQLException {
        QueryRunner qr = new QueryRunner(DruidUtil.getDataSource());
        String sql = "delete from t_user where uid = ?";
        qr.update(sql,3);

    }
}
