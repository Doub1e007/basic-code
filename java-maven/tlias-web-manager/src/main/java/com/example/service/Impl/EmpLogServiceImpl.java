package com.example.service.Impl;

import com.example.entity.EmpLog;
import com.example.mapper.EmpLogMapper;
import com.example.service.EmpLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmpLogServiceImpl implements EmpLogService {
    @Autowired
    private EmpLogMapper empLogMapper;

    /**
     * 插入操作日志
     * @param empLog
     */
//    @Transactional(propagation = Propagation.REQUIRED)  // 开启事务，默认值，有则加入 无则创建
    @Transactional(propagation = Propagation.REQUIRES_NEW) // 开启事务，开启新事务
    @Override
    public void insertLog(EmpLog empLog) {
        empLogMapper.insert(empLog);
    }
}
