package com.example.controller;

import com.example.entity.Dept;
import com.example.entity.Result;
import com.example.service.DeptService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 请求处理类
 */
@Slf4j // 自动生成log对象 用于打日志
@RestController
public class DeptController  {

    @Autowired
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

    //原始方式获取请求参数
    //@RequestMapping(value = "/depts",method = RequestMethod.DELETE)
//    @DeleteMapping("/depts")
//    public Result delete(HttpServletRequest request){
//        String id = request.getParameter("id");
//        int idInt = Integer.parseInt(id);
//
//        System.out.println("id = " + idInt);
//
//        return Result.success();
//    }

    // 方式二：通过spring提供的@RequestParam注解获取请求参数
    //@RequestParam加上后，required默认值为true 代表前端必须要传递该参数 否则报错400 Bad Request
    @DeleteMapping("/depts")
//    public Result delete(@RequestParam(value = "id",required = false) Integer deptId){
    public Result delete(Integer id){
        System.out.println("deptId = " + id);
        log.info("id = {}",id);
        //调用service的删除方法
        deptService.delete(id);
        return Result.success();
    }

    /**
     * 新增部门
     * @param dept
     * @return
     */
    // @RequestBody 用来接收json格式数据
    @PostMapping("/depts")
    public Result save(@RequestBody Dept dept){
        log.info("dept = {}" ,dept);
        // 调用Service
//        try {
            deptService.save(dept);
//        } catch (Exception e) {
////            throw new RuntimeException(e);
//            return Result.error("出错了，请联系管理员!!!");
//        }
        return Result.success();
    }

    /**
     * 回显
     * @param id
     * @return
     */
    // @PathVariable用于接收路径参数值
    @GetMapping("/depts/{id}")
    public Result getById(@PathVariable Integer id){
        log.info("id = {}" , id);

        //调用Service方法
        Dept dept = deptService.getById(id);
        return Result.success(dept);
    }

    /**
     * 修改部门
     * @param dept
     * @return
     */
    @PutMapping("/depts")
    public Result update(@RequestBody Dept dept){
        log.info("dept = {}" , dept);
        deptService.update(dept);
        return Result.success();
    }
}
