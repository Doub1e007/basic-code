package com.iweb.employee.dao.Impl;

import com.iweb.employee.dao.UserDao;
import com.iweb.employee.pojo.User;
import com.iweb.employee.util.DruidUtil;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.SQLException;

public class UserDaoImpl implements UserDao {

    private QueryRunner qr =
            new QueryRunner(DruidUtil.getDataSource());
    @Override
    public User login(User user) {
        String sql = "select * from t_user where username=? and password=?";
        try {
            user = qr.query(sql, new BeanHandler<>(User.class), user.getUsername(), user.getPassword());
            //把包装类型转换为基本类型
            return user;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean updatePwd(User user) {
        String sql = "update t_user set password=? where username=?";
        try {
            int update =

                    qr.update(sql, user.getPassword(), user.getUsername());
            return update > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
