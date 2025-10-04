package com.example.controller;

import com.example.entity.Dept;
import com.example.entity.Result;
import com.example.service.DeptService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 请求处理类
 */
@RestController
public class DeptController  {

    @Resource(name = "deptServiceImpl")
    private DeptService deptService;

    /**
     * 获取部门列表
     * @return
     */
    @GetMapping("/depts")
    public Result list(){
        // 1.调用service获取数据
        List<Dept> depts = deptService.list();


        // 3.响应数据 (json
        return Result.success(depts);
    }
}
