package com.doub1e.controller;

import com.doub1e.entity.Dept;
import com.doub1e.entity.Result;
import org.apache.commons.io.IOUtils;
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
@RestController //等价于@Controller + @ResponseBody
//@Controller
//@ResponseBody  //作用 将返回的对象或者集合自动转换成json格式返回
public class DeptController {
    /**
     * 部门列表查询
     * @return
     */
//    @RequestMapping("/depts")
//    public List<Dept> getAll() {
//        // 1.加载并读取dept.txt文件
//        //通过类加载器获取到类路径下的所有资源
//        InputStream input = this.getClass().getClassLoader().getResourceAsStream("dept.txt");
//        List<String> strings = IOUtils.readLines(input, "UTF-8");
//
//        // 2.解析文本中的数据 并将其封装成集合
//        List<Dept> depts = strings.stream().map((str)->{
//            String[] parts = str.split(",");
//            Integer id = Integer.valueOf(parts[0]);
//            String name = parts[1];
//            LocalDateTime updateTime = LocalDateTime.parse(parts[2],
//                    DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
//            return new Dept(id, name, updateTime);
//        }).toList();
//        // 3.响应数据(json
//        return depts;
//    }
    //@RequestMapping(value = "/depts",method = RequestMethod.GET)
    @GetMapping("/depts") //限制请求方式为Get
    public Result getAll() {
        // 1.加载并读取dept.txt文件
        //通过类加载器获取到类路径下的所有资源
        InputStream input = this.getClass().getClassLoader().getResourceAsStream("dept.txt");
        List<String> strings = IOUtils.readLines(input, "UTF-8");

        // 2.解析文本中的数据 并将其封装成集合
        List<Dept> depts = strings.stream().map((str)->{
            String[] parts = str.split(",");
            Integer id = Integer.valueOf(parts[0]);
            String name = parts[1];
            LocalDateTime updateTime = LocalDateTime.parse(parts[2],
                    DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            return new Dept(id, name, updateTime);
        }).toList();
        // 3.响应数据(json
        return Result.success(depts);
    }
}
