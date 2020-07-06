package com.paul623.javaweb.ex.humanresourcemanagement.service;

import com.paul623.javaweb.ex.humanresourcemanagement.entity.SumData;
import com.paul623.javaweb.ex.humanresourcemanagement.mapper.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SumDataService {
    @Autowired
    DeptMapper deptMapper;
    @Autowired
    UserMapper userMapper;
    @Autowired
    JobMapper jobMapper;
    @Autowired
    EmployeeMapper employeeMapper;
    @Autowired
    NoticeMapper noticeMapper;
    @Autowired
    DocumentMapper documentMapper;

    public SumData getSumData(){
        SumData sumData=new SumData();
        sumData.setDeptNum(deptMapper.getNum());
        sumData.setDocumentNum(documentMapper.getNum());
        sumData.setEmployeeNum(employeeMapper.getNum());
        sumData.setJobNum(jobMapper.getNum());
        sumData.setNoticeNum(noticeMapper.getNum());
        sumData.setRootUserNum(userMapper.getNum());
        return sumData;
    }

    public String getDeptName(int id){
        return deptMapper.get_Info(id).getName();
    }
    public String getJobName(int id){
        return jobMapper.get_Info(id).getName();
    }

}
