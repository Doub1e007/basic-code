package com.iweb.service.impl;

import com.iweb.dao.UserDao;
import com.iweb.dao.impl.UserDaoImpl;
import com.iweb.pojo.User;
import com.iweb.service.UserService;

import java.security.Provider;

public class UserServiceImpl implements UserService {

    private UserDao userDao = new UserDaoImpl();
    @Override
    public boolean register(User user) {
        return userDao.register(user);
    }

    @Override
    public boolean login(User user) {
        return userDao.login(user);
    }
}
