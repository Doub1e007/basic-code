package com.doub1e.proxy2;

/**
 * 用户业务接口
 */
public interface UserService {
    // 登录功能
    void login(String loginName, String password) throws Exception;
    // 删除用户
    void deleteUser() throws Exception;
    // 查询用户 返回数组的格式
    String[] selectUser() throws Exception;
}
