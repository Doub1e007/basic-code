package com.iweb.dao.impl;

import com.iweb.dao.UserDao;
import com.iweb.pojo.User;
import com.iweb.util.DruidUtil;
import org.apache.commons.dbutils.QueryRunner;

import java.sql.SQLException;
import java.util.Arrays;

public class UserDaoImpl implements UserDao {
    private QueryRunner qr = new QueryRunner(DruidUtil.getDataSource());
    @Override
    public boolean register(User user) {
        String sql =
                "insert into t_user(username,password,gender,hobby,description) values(?,?,?,?,?)";

        try {
            int update =
                    qr.update(sql, user.getUsername(), user.getPassword(), user.getGender(), Arrays.toString(user.getHobby()), user.getDescription());
            return update > 0;
        } catch (SQLException e) {
            //throw new RuntimeException(e);
            e.printStackTrace();
        }

        return false;
    }
}
