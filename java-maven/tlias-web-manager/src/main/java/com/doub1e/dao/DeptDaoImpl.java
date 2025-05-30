package com.doub1e.dao;

import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.io.InputStream;
import java.util.List;

/**
 * 数据访问层
 */
@Component //程序启动时，自动创建该类对象并交由IOC容器管理
public class DeptDaoImpl implements DeptDao {
    public List<String> list(){
        //1.加载并读取dept.txt文件 获取原始数据
        //通过类加载器获取到类路径下面的所有资源
        InputStream input = this.getClass().getClassLoader().getResourceAsStream("dept.txt");
        List<String> strings = IOUtils.readLines(input, "UTF-8");
        return strings;
    }
}
