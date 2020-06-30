package com.paul623.javaweb.ex.humanresourcemanagement.mapper;

import com.paul623.javaweb.ex.humanresourcemanagement.entity.Dept;
import com.paul623.javaweb.ex.humanresourcemanagement.mapper.provider.DeptDynaSqlProvider;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;

import static com.paul623.javaweb.ex.humanresourcemanagement.utils.Constants.DEPTTABLE;


@Mapper
public interface DeptMapper {
    //查询
    @Select("select * from "+DEPTTABLE+" ")
    public List<Dept> selectAllDept();
    @Select("select * from "+DEPTTABLE+" where name like CONCAT('%',#{content},'%')")
    public List<Dept> selectLikeAllDept(String content);


    @SelectProvider(type= DeptDynaSqlProvider.class,method="insertDept")
    public void save(Dept dept);

    @Select("select * from "+DEPTTABLE+" where id = #{id}")
    public Dept get_Info(Integer id);

    @SelectProvider(type=DeptDynaSqlProvider.class,method="updateDept")
    public void update_Info(Dept dept);
    // 根据id删除部门
    @Delete(" delete from "+DEPTTABLE+" where id = #{id} ")
    public void delete_Info(Integer id);

    @Select("select count(*) from "+DEPTTABLE+" ")
    public int getNum();
}
