package com.paul623.javaweb.ex.humanresourcemanagement.service;

import com.paul623.javaweb.ex.humanresourcemanagement.entity.User;
import com.paul623.javaweb.ex.humanresourcemanagement.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public User login(String loginname, String password) {
        User user = userMapper.get_login(loginname,password);
        return user;
    }

    public List<User> get_UserList() {
        return userMapper.get_List();
    }

    public List<User> get_UserLikeList(String content) {
        return userMapper.get_LikeList(content);
    }

    public User get_UserInfo(Integer id) {
        return userMapper.get_Info(id);
    }

    public void update_UserInfo(User notice) {
        userMapper.update_Info(notice);
    }

    public void insert_UserInfo(User notice) {
        userMapper.insert_Info(notice);
    }

    public void delete_UserInfo(Integer id) {
        userMapper.delete_Info(id);
    }
}
