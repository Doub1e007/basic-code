package com.doub1e.service;

import com.doub1e.entity.Dept;

import java.util.List;

public interface DeptService {
    /**
     * 查询部门列表
     * @return
     */
    public List<Dept> list();

    /**
     * 根据id删除
     * @param id
     */
    void delete(Integer id);

    /**
     * 新增部门
     * @param dept
     */
    void save(Dept dept);
}
