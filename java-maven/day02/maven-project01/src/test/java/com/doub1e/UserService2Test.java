package com.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

/**
 * 参数化测试
 */
public class UserService2Test {
    @DisplayName("测试年龄")
    @Test
    public void testGetAge(){
        Integer age = new UserService().getAge("101010200010101111");
        System.out.println("age = " + age);
    }

    @DisplayName("测试性别")
    @ParameterizedTest
    @ValueSource(strings = {"101010200010101111","101010200010101121"})
    public void testGetGender(String id){
        String gender = new UserService().getGender(id);
        System.out.println("gender = " + gender);
    }
}
