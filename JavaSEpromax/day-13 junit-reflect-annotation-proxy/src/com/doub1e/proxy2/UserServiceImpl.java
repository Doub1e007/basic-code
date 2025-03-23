package com.doub1e.proxy2;

public class UserServiceImpl implements UserService {
    @Override
    public void login(String loginName, String password) throws Exception {
        long start = System.currentTimeMillis(); //记录开始时间 1970-1-1

        if("admin".equals(loginName) && "123456".equals(password)) {
            System.out.println("您登录成功，欢迎莅临本系统");
        }else {
            System.out.println("您登录失败，用户名或密码错误");
        }
        Thread.sleep(1000);

        long end = System.currentTimeMillis();
        System.out.println("login cost time: " + (end - start)/1000.0 + "s");
    }

    @Override
    public void deleteUser() throws Exception {
        long start = System.currentTimeMillis();

        System.out.println("成功删除了1万个用户");
        Thread.sleep(1500);

        long end = System.currentTimeMillis();
        System.out.println("deleteUser cost time: " + (end - start)/1000.0 + "s");
    }

    @Override
    public String[] selectUser() throws Exception {
        long start = System.currentTimeMillis();

        System.out.println("查询出了三个用户");
        String[] names = {"张全蛋","李二狗","牛爷爷"};
        Thread.sleep(500);

        long end = System.currentTimeMillis();
        System.out.println("selectUser cost time: " + (end - start)/1000.0 + "s");
        return names;
    }
}
