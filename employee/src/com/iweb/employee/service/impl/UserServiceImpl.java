package com.iweb.employee.service.impl;

import com.iweb.employee.dao.Impl.UserDaoImpl;
import com.iweb.employee.dao.UserDao;
import com.iweb.employee.pojo.User;
import com.iweb.employee.service.UserService;

public class UserServiceImpl implements UserService {
    private UserDao userDao = new UserDaoImpl();
    @Override
    public boolean login(User user) {
        return userDao.login(user);
    }

    @Override
    public boolean updatePwd(User user) {
        return userDao.updatePwd(user);
    }
}
