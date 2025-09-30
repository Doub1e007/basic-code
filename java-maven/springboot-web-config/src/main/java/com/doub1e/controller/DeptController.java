package com.doub1e.controller;

import com.doub1e.pojo.Dept;
import com.doub1e.pojo.Result;
import com.doub1e.service.DeptService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Lazy           // 延迟加载
@Scope("singleton")     // 设置作用域 默认是singleton（单例  prototype（非单例
@Slf4j
@RequestMapping("/depts")
@RestController
public class DeptController {

    // 测试、检查bean对象的创建时机
    public DeptController(){
        System.out.println("RestController...创建...");
    }

    @Autowired
    private DeptService deptService;
    /**
     * 查询全部部门
     */
    @GetMapping
    public Result list(){
        List<Dept> deptList = deptService.queryDeptList();
        return Result.success(deptList);
    }

    /**
     * 根据ID删除部门
     */
    @DeleteMapping
    public Result delete(Integer id){
        log.info("根据ID删除部门: {}", id);
        deptService.delete(id);
        return Result.success();
    }

    /**
     * 添加部门 - json格式参数接收
     */
    @PostMapping
    public Result add(@RequestBody Dept dept){
        log.info("添加部门: {}", dept);
        deptService.add(dept);
        return Result.success();
    }

    /**
     * 根据ID查询部门数据
     */
    @GetMapping("/{id}")
    public Result getInfo(@PathVariable Integer id){
        log.info("根据ID查询部门数据: {}", id);
        Dept dept = deptService.getInfo(id);
        return Result.success(dept);
    }

    /**
     * 修改部门数据
     */
    @PutMapping
    public Result update(@RequestBody Dept dept){
        log.info("修改部门数据: {}", dept);
        deptService.update(dept);
        return Result.success();
    }
}
