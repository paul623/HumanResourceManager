package com.paul623.javaweb.ex.humanresourcemanagement.mapper;

import com.paul623.javaweb.ex.humanresourcemanagement.entity.User;
import com.paul623.javaweb.ex.humanresourcemanagement.mapper.provider.UserDynaSqlProvider;
import org.apache.ibatis.annotations.*;

import java.util.List;

import static com.paul623.javaweb.ex.humanresourcemanagement.utils.Constants.USERTABLE;

@Mapper
public interface UserMapper {
    @Select("select * from "+USERTABLE+" ")
    List<User> get_List();
    @Select("select * from "+USERTABLE+"  where title like CONCAT('%',#{content},'%')")
    List<User> get_LikeList(String content);

    @Select("select * from "+USERTABLE+"  where loginname = #{loginname} AND password = #{password}")
    User get_login(@Param("loginname") String loginname,
                   @Param("password") String password);

    @SelectProvider(type= UserDynaSqlProvider.class,method="insert_Notice")
    void insert_Info(User employee);

    @Select("select * from "+USERTABLE+" where id = #{id}")
    User get_Info(Integer id);

    @SelectProvider(type=UserDynaSqlProvider.class,method="update_Notice")
    void update_Info(User employee);
    // 根据id删除部门
    @Delete(" delete from "+USERTABLE+" where id = #{id} ")
    void delete_Info(Integer id);
}
