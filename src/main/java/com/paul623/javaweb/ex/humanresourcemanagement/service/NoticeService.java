package com.paul623.javaweb.ex.humanresourcemanagement.service;

import com.paul623.javaweb.ex.humanresourcemanagement.entity.Notice;
import com.paul623.javaweb.ex.humanresourcemanagement.mapper.NoticeMapper;
import com.paul623.javaweb.ex.humanresourcemanagement.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoticeService {
    @Autowired
    NoticeMapper noticeMapper;
    @Autowired
    UserMapper userMapper;

    public List<Notice> get_NoticeList() {
        List<Notice> notices=noticeMapper.get_List();
        for(Notice i:notices){
            if(i.getUserId()!=null){
                i.setUser(userMapper.get_Info(i.getUserId()));
            }
        }
        return notices;
    }

    public List<Notice> get_NoticeLikeList(String content) {
        List<Notice> notices=noticeMapper.get_LikeList(content);
        for(Notice i:notices){
            if(i.getUserId()!=null){
                i.setUser(userMapper.get_Info(i.getUserId()));
            }
        }
        return notices;
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
