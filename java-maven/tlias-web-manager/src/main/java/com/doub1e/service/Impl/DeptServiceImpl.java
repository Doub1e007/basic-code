package com.doub1e.service.Impl;

import com.doub1e.entity.Dept;
import com.doub1e.mapper.DeptMapper;
import com.doub1e.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

/**
 * 业务逻辑处理层
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptMapper deptMapper;

    /**
     * 查询部门列表
     * @return
     */
    public List<Dept> list(){
        // 1.调用mapper的方法，获取列表数据并返回
        return deptMapper.list();
    }

    /**
     * 根据id删除部门
     * @param id
     */
    @Override
    public void delete(Integer id) {
        // 调用mapper的删除方法
        deptMapper.delete(id);
    }

    /**
     * 新增部门
     * @param dept
     */
    @Override
    public void save(Dept dept) {
        // 1.补充基础属性
        dept.setCreateTime(LocalDateTime.now());
        dept.setUpdateTime(LocalDateTime.now());

        // 2.调用mapper的新增方法
        deptMapper.insert(dept);
    }
}
