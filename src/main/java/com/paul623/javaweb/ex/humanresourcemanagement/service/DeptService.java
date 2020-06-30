package com.paul623.javaweb.ex.humanresourcemanagement.service;

import com.paul623.javaweb.ex.humanresourcemanagement.entity.Dept;
import com.paul623.javaweb.ex.humanresourcemanagement.mapper.DeptMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptService {
    @Autowired
    DeptMapper deptMapper;

    public List<Dept> findAllDept() {
        return deptMapper.selectAllDept();
    }
    public List<Dept> findAllDept(String content){
        return deptMapper.selectLikeAllDept(content);
    }

    public void addDept(Dept dept){
        deptMapper.save(dept);
    }

    public Dept get_Info(Integer id){
        return deptMapper.get_Info(id);
    }

    public void update_Info(Dept dept){
        deptMapper.update_Info(dept);
    }

    public void delete_Info(Integer id){
        deptMapper.delete_Info(id);
    }


}
