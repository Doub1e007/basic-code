package com.doub1e.proxy2;

public class UserServiceImpl implements UserService {
    @Override
    public void login(String loginName, String password) throws Exception {

        if("admin".equals(loginName) && "123456".equals(password)) {
            System.out.println("您登录成功，欢迎莅临本系统");
        }else {
            System.out.println("您登录失败，用户名或密码错误");
        }
        Thread.sleep(1000);
    }

    @Override
    public void deleteUser() throws Exception {
        System.out.println("成功删除了1万个用户");
        Thread.sleep(1500);
    }

    @Override
    public String[] selectUser() throws Exception {

        System.out.println("查询出了三个用户");
        String[] names = {"张全蛋","李二狗","牛爷爷"};
        Thread.sleep(500);
        return names;
    }
}
