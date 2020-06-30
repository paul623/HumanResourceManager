package com.paul623.javaweb.ex.humanresourcemanagement.mapper;

import com.paul623.javaweb.ex.humanresourcemanagement.entity.User;
import com.paul623.javaweb.ex.humanresourcemanagement.mapper.provider.UserDynaSqlProvider;
import org.apache.ibatis.annotations.*;

import java.util.List;

import static com.paul623.javaweb.ex.humanresourcemanagement.utils.Constants.USERTABLE;


@Mapper
public interface UserMapper {
    @Select("select * from "+USERTABLE+" ")
    public List<User> get_List();
    @Select("select * from "+USERTABLE+"  where title like CONCAT('%',#{content},'%')")
    public List<User> get_LikeList(String content);

    @Select("select * from "+USERTABLE+"  where loginname = #{loginname} AND password = #{password}")
    public User get_login(@Param("loginname") String loginname,
                   @Param("password") String password);

    @SelectProvider(type= UserDynaSqlProvider.class,method="insert_Notice")
    public void insert_Info(User employee);

    @Select("select * from "+USERTABLE+" where id = #{id}")
    public User get_Info(Integer id);

    @SelectProvider(type=UserDynaSqlProvider.class,method="update_Notice")
    public void update_Info(User employee);
    // 根据id删除部门
    @Delete(" delete from "+USERTABLE+" where id = #{id} ")
    public void delete_Info(Integer id);

    @Select("select count(*) from "+USERTABLE+" ")
    public int getNum();
}
