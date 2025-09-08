package com.doub1e.mapper;

import com.doub1e.entity.EmpExpr;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EmpExperMapper {
    /**
     * 批量插入员工经历数据
     * @param exprList
     */
    // 基于xml开发 -- 动态sql -- <foreach>
    void insertBatch(List<EmpExpr> exprList);
}
