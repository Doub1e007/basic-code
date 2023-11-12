package com.iweb.employee.dao;

import com.iweb.employee.pojo.User;

public interface UserDao {
    boolean login(User user);

    boolean updatePwd(User user);
}
