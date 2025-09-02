package com.doub1e.service;

import com.doub1e.dao.DeptDao;
import com.doub1e.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 业务逻辑处理层
 */
//@Component //程序启动时 会自动创建该类对象 并交由IOC容器管理
@Service("service2")  // 用来标识当前类属于逻辑处理类 -- 效果也是将该类交由IOD容器管理
// 可通过value属性设置Bean的名字 默认是类名首字母小写
public class DeptServiceImpl2 implements DeptService{

//    private DeptDao deptDao = new DeptDaoImpl();
    @Autowired // 从IOC容器中自动寻找bean对象 为该变量赋值 -- 依赖注入DI的实现
    private DeptDao deptDao ;

    public List<Dept> list(){
        // 1.获取原始数据
        List<String> stringList =  deptDao.list();

        // 2.处理数据 -- 将数据封装成List<Dept>
        List<Dept> depts =  stringList.stream().map((str)->{
            String[] parts = str.split(",");
            Integer id  = Integer.valueOf(parts[0]);
            String name = parts[1];
            LocalDateTime updateTime = LocalDateTime.parse(parts[2], DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            return new Dept(id, name, updateTime);
        }).collect(Collectors.toList());

        // 3.返回封装好的数据
        return depts;
    }
}
