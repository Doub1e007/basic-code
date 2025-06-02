package com.doub1e;

import com.doub1e.entity.User;
import com.doub1e.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest //加载spring环境（IOC容器  注意：默认测试类所在包必须与启动类所在包或子包一致
public class UserMapperTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void testList(){
        List<User> list = userMapper.list();
        for (User user : list) {
            System.out.println(user);
        }
    }
}
