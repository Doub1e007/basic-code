package com.doub1e.controller;

import com.doub1e.entity.Dept;
import com.doub1e.entity.Result;
import com.doub1e.service.DeptService;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 请求处理类
 */
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
        //调用service的删除方法
        deptService.delete(id);
        return Result.success();
    }

}
