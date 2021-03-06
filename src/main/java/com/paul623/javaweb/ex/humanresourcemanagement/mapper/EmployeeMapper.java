package com.paul623.javaweb.ex.humanresourcemanagement.mapper;

import com.paul623.javaweb.ex.humanresourcemanagement.entity.Employee;
import com.paul623.javaweb.ex.humanresourcemanagement.mapper.provider.EmployeeDynaSqlProvider;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;

import static com.paul623.javaweb.ex.humanresourcemanagement.utils.Constants.EMPLOYEETABLE;
import static com.paul623.javaweb.ex.humanresourcemanagement.utils.Constants.USERTABLE;


@Mapper
public interface EmployeeMapper {
    /**
     *
     * @return
     */
    //查询
    @Select("select * from "+EMPLOYEETABLE+" ")
    List<Employee> get_List();

    @Select("select * from "+EMPLOYEETABLE+"  where name like CONCAT('%',#{content},'%')")
    List<Employee> get_LikeList(String content);

    @SelectProvider(type=EmployeeDynaSqlProvider.class,method="insert_Employee")
    void insert_Info(Employee employee);

    @Select("select * from "+EMPLOYEETABLE+" where id = #{id}")
    public Employee get_Info(String id);

    @SelectProvider(type= EmployeeDynaSqlProvider.class,method="update_Employee")
    void update_Info(Employee employee);
    // 根据id删除部门
    @Delete(" delete from "+EMPLOYEETABLE+" where id = #{id} ")
    void delete_Info(Integer id);

    @Select("select count(*) from "+EMPLOYEETABLE+" ")
    public int getNum();

    @Select("select * from "+EMPLOYEETABLE+"  where id = #{id} OR phone=#{id} AND password = #{password}")
    public Employee get_login(String id,String password);
}
