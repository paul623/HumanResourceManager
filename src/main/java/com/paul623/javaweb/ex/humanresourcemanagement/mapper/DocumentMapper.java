package com.paul623.javaweb.ex.humanresourcemanagement.mapper;

import com.paul623.javaweb.ex.humanresourcemanagement.entity.Document;
import com.paul623.javaweb.ex.humanresourcemanagement.mapper.provider.DocumentDynaSqlProvider;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;

import static com.paul623.javaweb.ex.humanresourcemanagement.utils.Constants.DOCUMENTTABLE;


@Mapper
public interface DocumentMapper {
    //查询
    @Select("select * from " + DOCUMENTTABLE + " ")
    List<Document> get_List();

    @Select("select * from " + DOCUMENTTABLE + " where title like CONCAT('%',#{content},'%')")
    List<Document> get_LikeList(String content);


    @SelectProvider(type = DocumentDynaSqlProvider.class, method = "insert")
    void insert_Info(Document dept);

    @Select("select * from " + DOCUMENTTABLE + " where id = #{id}")
    Document get_Info(Integer id);

    @SelectProvider(type = DocumentDynaSqlProvider.class, method = "update")
    void update_Info(Document dept);

    // 根据id删除部门
    @Delete(" delete from " + DOCUMENTTABLE + " where id = #{id} ")
    void delete_Info(Integer id);

    @Select("select count(*) from " + DOCUMENTTABLE + " ")
    public int getNum();
}
