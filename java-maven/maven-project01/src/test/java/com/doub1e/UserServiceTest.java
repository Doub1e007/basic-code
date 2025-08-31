package com.doub1e;

import org.junit.jupiter.api.Test;

/**
 * 测试类
 */
public class UserServiceTest {
    @Test
    public void testGetAge(){
        Integer age = new UserService().getAge("101010200010101111");
        System.out.println("age = " + age);
    }

    @Test
    public void testGetGender(){
        String gender = new UserService().getGender("101010200010101111");
        System.out.println("gender = " + gender);
    }
}
