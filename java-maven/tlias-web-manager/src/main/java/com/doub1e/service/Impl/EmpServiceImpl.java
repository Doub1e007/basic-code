package com.doub1e.service.Impl;

import com.doub1e.entity.*;
import com.doub1e.mapper.EmpExperMapper;
import com.doub1e.mapper.EmpLogMapper;
import com.doub1e.mapper.EmpMapper;
import com.doub1e.service.EmpLogService;
import com.doub1e.service.EmpService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;

@Slf4j
@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpMapper empMapper;

    @Autowired
    private EmpExperMapper empExperMapper;

    @Autowired
    private EmpLogService empLogService;

    /**
     * 分页查询
     * @param page  页码 1 2 3
     * @param pageSize  每页记录数 5 、10
     * @return
     */
//    @Override
//    public PageBean page(Integer page, Integer pageSize) {
//        // 1.调用mapper获取总记录数 total
//        // select count(*) from emp
//        Long total = empMapper.count();
//
//        // 2.调用mapper获取分页列表数据 rows
//        // select e.name,e.gender,e.image,d.name,e.job from emp e  left join dept d on e.dept_id = d.id limit 0,5
//        Integer start = (page - 1) * pageSize; //计算起始索引
//        List<Emp> empList = empMapper.page(start,pageSize);
//
//        // 3.封装PageBean对象并返回
//        return new PageBean(total,empList);
//    }

//    @Override
//    public PageBean page(Integer page, Integer pageSize) {
//        // 1.设置分页参数
//        PageHelper.startPage(page, pageSize);
//
//        // 2.调用mapper的列表查询方法
//        // 分页只会对PageHelper.startPage()下面的第一条select进行处理
//        List<Emp> empList = empMapper.list();
//        Page p = (Page) empList; // 强转对象 Page继承了ArrayList
//
//        // 3.封装PageBean对象并返回
//        return new PageBean(p.getTotal(),p.getResult());
//    }


    @Override
    public PageBean page(EmpQueryParam param) {
        // 1.设置分页参数
        PageHelper.startPage(param.getPage(), param.getPageSize());

        // 2.调用mapper的列表查询方法
        List<Emp> empList = empMapper.list(param);
        Page p = (Page) empList; // 强转对象 Page继承了ArrayList

        // 3.封装PageBean对象并返回
        return new PageBean(p.getTotal(),p.getResult());
    }
    @Transactional(rollbackFor = Exception.class)  // 开启事务，rollbackFor指定处理所有异常信息 默认情况下只能处理运行时异常
    @Override
    public void save(Emp emp) {
        try {
            // 1.调用mapper，保存员工的基本信息到emp表
            // 1.1 补充缺失的字段（前端没传的数据
            emp.setPassword("123456");
            emp.setCreateTime(LocalDateTime.now());
            emp.setUpdateTime(LocalDateTime.now());
            // 1.2调勇mapper
            empMapper.insert(emp);

            Integer id = emp.getId();
            log.info("id={}",id);

            // 模拟异常
//        int i = 1 / 0;

            // 2.保存员工的工作经历到emp_expr表
            List<EmpExpr> exprList = emp.getExprList();
            // 2.1 关联员工id
            if(!CollectionUtils.isEmpty(exprList)){
                exprList.forEach((expr)->{
                    expr.setEmpId(id);
                });
                // 2.2 调用mapper，批量保存工作经历数据
                empExperMapper.insertBatch(exprList);
            }
        } finally {
            // 无论新增员工成功与否都需要添加操作日志
            EmpLog empLog = new EmpLog();
            empLog.setOperateTime(LocalDateTime.now());
            empLog.setInfo("插入员工信息：" + emp);
            empLogService.insertLog(empLog);
        }
    }

    @Transactional // 开启事务 （涉及多张表的删除
    public void delete(List<Integer> ids) {
        // 1.删除员工的基本信息数据 emp表
        empMapper.deleteBatch(ids);

        // 2.删除员工的经历信息数据 emp_expr表
        empExperMapper.deleteBatch(ids);
    }
}
