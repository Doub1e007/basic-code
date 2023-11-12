package com.iweb.service;

import com.iweb.pojo.User;

public interface UserService {
    boolean register(User user);

    boolean login(User user);
}
