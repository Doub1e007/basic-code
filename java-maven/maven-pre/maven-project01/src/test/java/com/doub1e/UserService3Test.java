package com.doub1e;

import com.example.UserService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * 测试类 测试UserService方法
 */
public class UserService3Test {
    @Test
    public void testGetAge() {
        Integer age = new UserService().getAge("101010200010101111");
        System.out.println("age = " + age);
    }

    @Test
    public void testGetGender() {
        String gender = new UserService().getGender("101010200010101111");
//        System.out.println("gender = " + gender);
        assertEquals("男",gender,"性别获取错误");
    }
}
