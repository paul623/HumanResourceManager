package com.paul623.javaweb.ex.humanresourcemanagement.service;

import com.paul623.javaweb.ex.humanresourcemanagement.entity.Document;
import com.paul623.javaweb.ex.humanresourcemanagement.mapper.DocumentMapper;
import com.paul623.javaweb.ex.humanresourcemanagement.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocumentService {
    @Autowired
    DocumentMapper documentMapper;
    @Autowired
    UserMapper userMapper;
    /**
     * 文档管理
     */
    public List<Document> get_DocumentList() {
        List<Document> documents=documentMapper.get_List();
        for(Document document:documents){
            if(document.getUserId()!=null){
                document.setUser(userMapper.get_Info(document.getUserId()));
            }
        }
        return documents;
    }

    public List<Document> get_DocumentLikeList(String content) {
        List<Document> documents=documentMapper.get_LikeList(content);
        for(Document document:documents){
            if(document.getUserId()!=null){
                document.setUser(userMapper.get_Info(document.getUserId()));
            }
        }
        return documents;
    }

    public Document get_DocumentInfo(Integer id) {
        return documentMapper.get_Info(id);
    }

    public void update_DocumentInfo(Document notice) {
        documentMapper.update_Info(notice);
    }

    public void insert_DocumentInfo(Document notice) {
        documentMapper.insert_Info(notice);
    }

    public void delete_DocumentInfo(Integer id) {
        documentMapper.delete_Info(id);
    }

}
