package com.doub1e.service;

import com.doub1e.entity.PageBean;

public interface EmpService {
    /**
     * 分页查询
     * @param page
     * @param pageSize
     * @return
     */
    PageBean page(Integer page, Integer pageSize);

}
