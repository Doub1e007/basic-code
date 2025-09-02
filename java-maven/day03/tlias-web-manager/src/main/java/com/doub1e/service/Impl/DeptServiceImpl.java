package com.doub1e.service.Impl;

import com.doub1e.entity.Dept;
import com.doub1e.mapper.DeptMapper;
import com.doub1e.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 业务逻辑处理层
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptMapper deptMapper;

    public List<Dept> list(){
        // 1.调用mapper的方法，获取列表数据并返回
        return deptMapper.list();
    }
}
