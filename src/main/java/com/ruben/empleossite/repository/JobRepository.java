package com.ruben.empleossite.repository;

import com.ruben.empleossite.models.Job;

import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends  JpaRepository<Job,Long>{
    
}
