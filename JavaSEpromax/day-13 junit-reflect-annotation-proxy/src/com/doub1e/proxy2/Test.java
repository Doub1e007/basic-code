package com.doub1e.proxy2;

import java.util.Arrays;

/**
 * 使用动态代理解决实际问题
 */
public class Test {
    public static void main(String[] args) throws Exception {
        // 1.创建用户业务对象
        UserService userService = ProxyUtil.creatProxy(new UserServiceImpl());

        // 2.调用用户业务的功能
        userService.login("admin","123456");

        userService.deleteUser();

        String[] names = userService.selectUser();
        System.out.println("查询到的用户是：" + Arrays.toString(names));
    }
}
