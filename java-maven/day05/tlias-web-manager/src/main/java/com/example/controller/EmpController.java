package com.example.controller;

import com.example.entity.Emp;
import com.example.entity.EmpQueryParam;
import com.example.entity.PageBean;
import com.example.entity.Result;
import com.example.service.EmpService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
public class EmpController {
    @Autowired
    private EmpService empService;

    /**
     * 分页查询
     * @param page
     * @param pageSize
     * @return
     */
//    @GetMapping("/emps")
//    public Result page(@RequestParam(defaultValue = "1") Integer page,
//                       @RequestParam(defaultValue = "10") Integer pageSize){
//        log.info("分页查询：{},{}",page,pageSize);
//        PageBean pageBean = empService.page(page,pageSize);
//        return Result.success(pageBean);
//    }

//    @GetMapping("/emps")
//    public Result page(String name,Integer gender,
//                        @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate begin,
//                        @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate end,
//                        @RequestParam(defaultValue = "1") Integer page,
//                       @RequestParam(defaultValue = "10") Integer pageSize){
//        log.info("分页查询：{},{},{},{},{},{}",name,gender,begin,end,page,pageSize);
////        PageBean pageBean = empService.page(name,gender,begin,end,page,pageSize);
//        return Result.success();
//    }


    @GetMapping("/emps")
    public Result page(EmpQueryParam param){
        log.info("分页查询：{},{},{},{},{},{}",param.getName(),param.getGender(),param.getBegin(),param.getEnd(),param.getPage(),param.getPageSize());
        PageBean pageBean = empService.page(param);
        return Result.success(pageBean);
    }

    /**
     * 新增员工
     * @param emp
     * @return
     */
    @PostMapping("/emps")
    public Result save(@RequestBody Emp emp){
        log.info("新增员工：{}",emp);
        empService.save(emp);
        return Result.success();
    }

    @DeleteMapping("/emps")
    // 直接通过数组即可接收前端传递的数组值
//    public Result delete(Integer[] ids){
    // 通过集合类型接收前端传递的数组值，需要加注解@RequestParam
    public Result delete(@RequestParam List<Integer> ids){
        log.info("删除员工，ids = {}", ids);
        empService.delete(ids);
        return Result.success();
    }

    /**
     * 员工回显
     * @param id
     * @return
     */
    @GetMapping("/emps/{id}")
    public Result getByID(@PathVariable Integer id){
        log.info("回显员工，id = {}",id);
        Emp emp = empService.getById(id);
        return Result.success(emp);
    }

    /**
     * 修改员工
     * @param emp
     * @return
     */
    @PutMapping("/emps")
    public Result update(@RequestBody Emp emp){
        log.info("修改员工：emp = {}",emp);
        empService.update(emp);
        return Result.success();
    }
}
