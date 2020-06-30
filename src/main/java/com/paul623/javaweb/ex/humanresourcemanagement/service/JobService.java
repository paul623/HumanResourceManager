package com.paul623.javaweb.ex.humanresourcemanagement.service;

import com.paul623.javaweb.ex.humanresourcemanagement.entity.Job;
import com.paul623.javaweb.ex.humanresourcemanagement.mapper.JobMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {
    @Autowired
    JobMapper jobMapper;

    public List<Job> findAllJob() {
        return jobMapper.get_List();
    }

    public List<Job> findAllJob(String content) {
        return jobMapper.get_LikeList(content);
    }

    public Job get_JobInfo(Integer id) {
        return jobMapper.get_Info(id);
    }

    public void update_JobInfo(Job job) {
        jobMapper.update_Info(job);
    }

    public void insert_JobInfo(Job job) {
        jobMapper.insert_Info(job);
    }

    public void delete_JobInfo(Integer id) {
        jobMapper.delete_Info(id);
    }
}
