package com.doub1e;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * 测试类 测试UserService业务方法
 */
public class UserServiceTest {
    @Test
    public void testGetAge(){
        Integer age = new UserService().getAge("101010200010101111");
        System.out.println("age = " + age);//24
    }

    @Test
    public void testGetGender(){
        String gender = new UserService().getGender("101010200010101111");//男
        //System.out.println("gender = " + gender);
        assertEquals("male", gender, "性别获取错误!!!");
    }
}
