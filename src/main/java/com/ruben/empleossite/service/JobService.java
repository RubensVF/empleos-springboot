package com.ruben.empleossite.service;

import java.util.List;
import java.util.Optional;

import com.ruben.empleossite.models.Job;
import com.ruben.empleossite.repository.JobRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobService {
    
    @Autowired
    private JobRepository jRepo;

    public List<Job> findAll(){
        return jRepo.findAll();
    }

    public Job findById(Long id){
        Optional<Job> job = jRepo.findById(id);
        if(job.isPresent())
            return job.get();
        return null;
    }
    public Job save(Job job){
        return jRepo.save(job);
    }


}
