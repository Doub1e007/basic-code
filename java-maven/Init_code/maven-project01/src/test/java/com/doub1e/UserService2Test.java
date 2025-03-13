package com.doub1e;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

/**
 * 注解 参数化测试
 */
@DisplayName("测试用户信息类")
public class UserService2Test {
    @DisplayName("测试年龄")
    @ParameterizedTest //参数化测试
    @ValueSource(strings = {"101010200010101111","101010200010101121","101010200110101111"})
    public void testGetAge(String id){
        Integer age = new UserService().getAge(id);
        System.out.println("age = " + age);//24
    }

    @DisplayName("测试性别")
    @ParameterizedTest //参数化测试
    @ValueSource(strings = {"101010200010101111","101010200010101121","101010200110101111"})
    public void testGetGender(String id){
        String gender = new UserService().getGender(id);
        System.out.println("gender = " + gender);
    }
}
