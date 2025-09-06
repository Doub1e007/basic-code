package com.doub1e.mapper;

import com.doub1e.entity.Emp;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface EmpMapper {
    /**
     * 统计员工总记录数
     * @return
     */
    @Select("select count(*) from emp")
    Long count();

    /**
     * 分页查询
     * @param start
     * @param pageSize
     * @return
     */
    @Select("select e.*,d.name deptName from emp e  left join dept d on e.dept_id = d.id limit #{start},#{pageSize}")
    List<Emp> page(Integer start, Integer pageSize);
}
