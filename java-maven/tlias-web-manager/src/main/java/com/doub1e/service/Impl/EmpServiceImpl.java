package com.doub1e.service.Impl;

import com.doub1e.entity.Emp;
import com.doub1e.entity.PageBean;
import com.doub1e.mapper.EmpMapper;
import com.doub1e.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpMapper empMapper;

    /**
     * 分页查询
     * @param page  页码 1 2 3
     * @param pageSize  每页记录数 5 、10
     * @return
     */
    @Override
    public PageBean page(Integer page, Integer pageSize) {
        // 1.调用mapper获取总记录数 total
        // select count(*) from emp
        Long total = empMapper.count();

        // 2.调用mapper获取分页列表数据 rows
        // select e.name,e.gender,e.image,d.name,e.job from emp e  left join dept d on e.dept_id = d.id limit 0,5
        Integer start = (page - 1) * pageSize; //计算起始索引
        List<Emp> empList = empMapper.page(start,pageSize);

        // 3.封装PageBean对象并返回
        return new PageBean(total,empList);
    }
}
