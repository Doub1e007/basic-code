package com.doub1e.mapper;

import com.doub1e.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper // 作用：程序启动时自动生成该接口的代理对象，交由IOC容器管理
public interface UserMapper {
    // 查询所有用户数据 -- 基于注解开发
    //@Select("select * from user")
    public List<User> list();

}
