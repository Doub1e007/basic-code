package com.example.controller;

import com.example.entity.Emp;
import com.example.entity.EmpLoginInfo;
import com.example.entity.Result;
import com.example.service.EmpService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class LoginController {
    @Autowired
    private EmpService empService;

    /**
     * 员工登录
     * @param emp
     * @return
     */
    @PostMapping("/login")
    public Result login(@RequestBody Emp emp){
        log.info("员工登录： {}" ,emp);
        EmpLoginInfo loginInfo = empService.login(emp);
        if(loginInfo==null){
            return Result.error("用户名或密码错误");
        }
        return Result.success(loginInfo);
    }
}
