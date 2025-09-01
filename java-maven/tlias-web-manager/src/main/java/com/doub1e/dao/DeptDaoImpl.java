package com.doub1e.dao;

import org.apache.commons.io.IOUtils;

import java.io.InputStream;
import java.util.List;

/**
 * 数据访问层
 */
public class DeptDaoImpl {
    public List<String> list(){
        // 1.加载并读取dept.txt文件 获取原始数据
        // 通过类加载器获取类路径下的所有资源
        InputStream input = this.getClass().getClassLoader().getResourceAsStream("dept.txt");
        List<String> strings = IOUtils.readLines(input, "UTF-8");
        return strings;
    }
}
