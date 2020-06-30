package com.paul623.javaweb.ex.humanresourcemanagement.service;

import com.paul623.javaweb.ex.humanresourcemanagement.entity.Notice;
import com.paul623.javaweb.ex.humanresourcemanagement.mapper.NoticeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoticeService {
    @Autowired
    NoticeMapper noticeMapper;

    public List<Notice> get_NoticeList() {
        return noticeMapper.get_List();
    }

    public List<Notice> get_NoticeLikeList(String content) {
        return noticeMapper.get_LikeList(content);
    }

    public Notice get_NoticeInfo(Integer id) {
        return noticeMapper.get_Info(id);
    }

    public void update_NoticeInfo(Notice notice) {
        noticeMapper.update_Info(notice);
    }

    public void insert_NoticeInfo(Notice notice) {
        noticeMapper.insert_Info(notice);
    }

    public void delete_NoticeInfo(Integer id) {
        noticeMapper.delete_Info(id);
    }
}
