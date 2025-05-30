package com.doub1e.controller;

import com.doub1e.entity.Dept;
import com.doub1e.entity.Result;
import com.doub1e.service.DeptService;
import com.doub1e.service.DeptServiceImpl;
import jakarta.annotation.Resource;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.InputStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 请求处理类
 */
//@Component //注意：controller不能用1@Component代替
@RestController
//@Controller
//@ResponseBody  //将返回的对象或集合自动转换成json格式返回
public class DeptController {

//    private DeptService deptService = new DeptServiceImpl();
    @Autowired //从IOC容器中自动寻找bean对象，为该变量赋值
    //@Qualifier("service") //根据bean名字注入

    //@Resource(name = "deptServiceImpl") //根据bean名字注入对象，等价于@Autowired + @Qualifier
    private DeptService deptService;

    /**
     * 部门列表查询
     * @return
     */
//    @RequestMapping("/depts")
//    public List<Dept> getAll(){
//        //1.加载并读取dept.txt文件
//        //通过类加载器获取到类路径下面的所有资源
//        InputStream input = this.getClass().getClassLoader().getResourceAsStream("dept.txt");
//        List<String> strings = IOUtils.readLines(input, "UTF-8");
//
//        //2.解析文本数据 并封装成集合
//        List<Dept> depts = strings.stream().map((str)->{
//            String[] parts = str.split(",");
//            Integer id = Integer.valueOf(parts[0]);
//            String name = parts[1];
//            LocalDateTime updateTime = LocalDateTime.parse(parts[2], DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
//            Dept dept = new Dept(id, name, updateTime);
//            return dept;
//        }).toList();
//
//        //3.响应数据 json格式
//        return depts;
//    }

//    @RequestMapping(value = "/depts",method = RequestMethod.GET)
//    @GetMapping(value = "/depts", produces = "application/json") //限制请求方式为Get
//    public Result getAll(){
//        //1.加载并读取dept.txt文件
//        //通过类加载器获取到类路径下面的所有资源
//        InputStream input = this.getClass().getClassLoader().getResourceAsStream("dept.txt");
//        List<String> strings = IOUtils.readLines(input, "UTF-8");
//
//        //2.解析文本数据 并封装成集合
//        List<Dept> depts = strings.stream().map((str)->{
//            String[] parts = str.split(",");
//            Integer id = Integer.valueOf(parts[0]);
//            String name = parts[1];
//            LocalDateTime updateTime = LocalDateTime.parse(parts[2], DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
//            return new Dept(id, name, updateTime);
//        }).collect(Collectors.toList());
//
//        //3.响应数据 json格式
//        return Result.success(depts);

    @GetMapping(value = "/depts", produces = "application/json") //限制请求方式为Get
    public Result list(){
        //1.调用service获取数据
        List<Dept> depts = deptService.list();

        //3.响应数据 json格式
        return Result.success(depts);
    }
}
