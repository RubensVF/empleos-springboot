package com.ruben.empleossite.controllers;

import java.util.List;

import com.ruben.empleossite.models.Job;
import com.ruben.empleossite.service.JobService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/jobs")
public class JobController {

    @Autowired
    private JobService jService;

    @GetMapping("/")
    public String Jobs(Model model){
        List<Job> jobs = jService.findAll();
        model.addAttribute("jobs", jobs);
        System.out.println(jobs);
        return "index";
    }

    @GetMapping("/job/{id}")
    public String SingleJob(@PathVariable("id") Long id ,Model model){
        Job job = jService.findById(id);
        model.addAttribute("job", job);
        return "job";
    }

}
