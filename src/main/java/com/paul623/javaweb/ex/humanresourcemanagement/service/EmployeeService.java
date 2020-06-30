package com.paul623.javaweb.ex.humanresourcemanagement.service;

import com.paul623.javaweb.ex.humanresourcemanagement.entity.Dept;
import com.paul623.javaweb.ex.humanresourcemanagement.entity.Employee;
import com.paul623.javaweb.ex.humanresourcemanagement.entity.Job;
import com.paul623.javaweb.ex.humanresourcemanagement.mapper.DeptMapper;
import com.paul623.javaweb.ex.humanresourcemanagement.mapper.EmployeeMapper;
import com.paul623.javaweb.ex.humanresourcemanagement.mapper.JobMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeMapper employeeMapper;
    @Autowired
    JobMapper jobMapper;
    @Autowired
    DeptMapper deptMapper;

    public List<Employee> get_EmployeeList() {
        /**
         * 将部门，职位id中的信息提取出来
         */
        List<Employee> list = employeeMapper.get_List();
        int size = list.size();
        List<Employee> list2 = new ArrayList<>();
        for(int i = 0;i<size;i++){
            Employee data = list.get(i);
            Dept dept = deptMapper.get_Info(data.getDept_id());
            data.setDept(dept);
            Job job = jobMapper.get_Info(data.getJob_id());
            data.setJob(job);
            list2.add(i,data);
        }
        return list2;
    }

    public List<Employee> get_EmployeeLikeList(String content) {
        /**
         * 将部门，职位id中的信息提取出来
         */
        List<Employee> list = employeeMapper.get_LikeList(content);
        int size = list.size();
        List<Employee> list2 = new ArrayList<>();
        for(int i = 0;i<size;i++){
            Employee data = list.get(i);
            Dept dept = deptMapper.get_Info(data.getDept_id());
            data.setDept(dept);
            Job job = jobMapper.get_Info(data.getJob_id());
            data.setJob(job);
            list2.add(i,data);
        }
        return list2;
    }

    public Employee get_EmployeeInfo(Integer id) {
        // TODO Auto-generated method stub
        Employee data = employeeMapper.get_Info(id);
        Dept dept = deptMapper.get_Info(data.getDept_id());
        data.setDept(dept);
        Job job = jobMapper.get_Info(data.getJob_id());
        data.setJob(job);
        return data;
    }

    public void update_EmployeeInfo(Employee data) {
        employeeMapper.update_Info(data);
    }

    public void insert_EmployeeInfo(Employee data) {
        /**
         * 将职位id和部门id提取，或者不管，因为直接存到数据库了，不管
         */
        Date date = new Date();
        String year = String.format("%tY", date);
        String month = String.format("%tB", date);
        String day = String.format("%te", date);
        data.setCreate_date(year+month+day);
        employeeMapper.insert_Info(data);
    }
    public void delete_EmployeeInfo(Integer id) {
        // TODO Auto-generated method stub
        employeeMapper.delete_Info(id);
    }
}
