package com.doub1e.service;

import com.doub1e.entity.EmpQueryParam;
import com.doub1e.entity.PageBean;
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
