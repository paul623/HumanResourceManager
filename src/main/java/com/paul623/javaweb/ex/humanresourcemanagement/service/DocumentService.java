package com.paul623.javaweb.ex.humanresourcemanagement.service;

import com.paul623.javaweb.ex.humanresourcemanagement.entity.Document;
import com.paul623.javaweb.ex.humanresourcemanagement.mapper.DocumentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocumentService {
    @Autowired
    DocumentMapper documentMapper;
    /**
     * 文档管理
     */
    public List<Document> get_DocumentList() {
        return documentMapper.get_List();
    }

    public List<Document> get_DocumentLikeList(String content) {
        return documentMapper.get_LikeList(content);
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
