package com.paul623.javaweb.ex.humanresourcemanagement.mapper;

import com.paul623.javaweb.ex.humanresourcemanagement.entity.Notice;
import com.paul623.javaweb.ex.humanresourcemanagement.mapper.provider.NoticeDynaSqlProvider;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;

import static com.paul623.javaweb.ex.humanresourcemanagement.utils.Constants.NOTICETABLE;

@Mapper
public interface NoticeMapper {
    @Select("select * from "+NOTICETABLE+" ")
    List<Notice> get_List();
    @Select("select * from "+NOTICETABLE+"  where title like CONCAT('%',#{content},'%')")
    List<Notice> get_LikeList(String content);

    @SelectProvider(type= NoticeDynaSqlProvider.class,method="insert_Notice")
    void insert_Info(Notice employee);

    @Select("select * from "+NOTICETABLE+" where id = #{id}")
    Notice get_Info(Integer id);

    @SelectProvider(type=NoticeDynaSqlProvider.class,method="update_Notice")
    void update_Info(Notice employee);
    // 根据id删除部门
    @Delete(" delete from "+NOTICETABLE+" where id = #{id} ")
    void delete_Info(Integer id);
}
