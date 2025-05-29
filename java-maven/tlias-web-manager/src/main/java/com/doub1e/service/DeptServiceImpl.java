package com.doub1e.service;

import com.doub1e.dao.DeptDaoImpl;
import com.doub1e.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 * 业务逻辑处理层
 */
@Service
public class DeptServiceImpl {
    private DeptDaoImpl deptDao = new DeptDaoImpl();

    public List<Dept> list(){
        //1.获取原始数据
        List<String> stringList = deptDao.list();

        //2.处理数据--将数据封装成List<Dept>
        List<Dept> depts = stringList.stream().map((str)->{
            String[] parts = str.split(",");
            Integer id = Integer.valueOf(parts[0]);
            String name = parts[1];
            LocalDateTime updateTime = LocalDateTime.parse(parts[2], DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            return new Dept(id, name, updateTime);
        }).toList();

        //3.返回封装好的数据
        return depts;
    }
}
