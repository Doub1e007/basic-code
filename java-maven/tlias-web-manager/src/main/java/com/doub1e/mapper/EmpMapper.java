package com.doub1e.mapper;

import com.doub1e.entity.Emp;
import com.doub1e.entity.EmpQueryParam;
import org.apache.ibatis.annotations.*;

import java.time.LocalDate;
import java.util.List;

@Mapper
public interface EmpMapper {
    /**
     * 统计员工总记录数
     * @return
     */
//    @Select("select count(*) from emp")
//    Long count();

    /**
     * 分页查询
     * @param start
     * @param pageSize
     * @return
     */
//    @Select("select e.*,d.name deptName from emp e  left join dept d on e.dept_id = d.id limit #{start},#{pageSize}")
//    List<Emp> page(Integer start, Integer pageSize);

    /**
     * 列表查询
     * @return
     */
//    @Select("select e.*,d.name deptName from emp e  left join dept d on e.dept_id = d.id")
    // 基于xml开发 -- 动态sql
    List<Emp> list(EmpQueryParam param);

    /**
     * 新增员工基本信息
     * @param emp
     */
    @Options(useGeneratedKeys = true,keyProperty = "id")  //获取主键的值并赋给id属性
    @Insert("insert into emp values (null,#{username},#{password},#{name},#{gender},#{phone},#{job},#{salary},#{image}," +
"#{entryDate},#{deptId},#{createTime},#{updateTime})")
    void insert(Emp emp);

    /**
     * 批量删除员工信息
     * @param ids
     */
//    @Delete("delete from emp where id in (1,2,3)")
    // 基于xml开发 -- 动态sql -- foreach
    void deleteBatch(List<Integer> ids);
}
