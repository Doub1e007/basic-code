package com.doub1e.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
public class ServiceA {
    @Lazy       // 解决循环依赖问题
    @Autowired
    private ServiceB serviceB;

    public void add(){
        serviceB.getById();
    }
}
