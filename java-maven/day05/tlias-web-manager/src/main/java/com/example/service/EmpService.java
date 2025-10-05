package com.example.service;

import com.example.entity.Emp;
import com.example.entity.EmpLoginInfo;
import com.example.entity.EmpQueryParam;
import com.example.entity.PageBean;

import java.util.List;

public interface EmpService {
    /**
     * 分页查询
     * @param page
     * @param pageSize
     * @return
     */
    PageBean page(EmpQueryParam param);

    /**
     * 新增员工
     * @param emp
     */
    void save(Emp emp);

    /**
     * 删除员工
     * @param ids
     */
    void delete(List<Integer> ids);

    /**
     * 员工回显
     * @param id
     * @return
     */
    Emp getById(Integer id);

    /**
     * 修改员工
     * @param emp
     */
    void update(Emp emp);

    /**
     * 员工登录
     * @param emp
     * @return
     */
    EmpLoginInfo login(Emp emp);
}
