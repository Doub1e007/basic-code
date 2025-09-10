package com.doub1e.controller;

import com.doub1e.entity.EmpQueryParam;
import com.doub1e.entity.PageBean;
import com.doub1e.entity.Result;
import com.doub1e.service.EmpService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

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
}
