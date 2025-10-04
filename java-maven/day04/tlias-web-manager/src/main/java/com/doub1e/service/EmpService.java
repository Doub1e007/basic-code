package com.example.service;

import com.example.entity.EmpQueryParam;
import com.example.entity.PageBean;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

public interface EmpService {
    /**
     * 分页查询
     * @param page
     * @param pageSize
     * @return
     */
    PageBean page(EmpQueryParam param);

}
