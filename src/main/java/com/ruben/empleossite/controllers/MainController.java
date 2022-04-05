package com.ruben.empleossite.controllers;

import java.util.List;

import com.ruben.empleossite.models.Job;
import com.ruben.empleossite.service.JobService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    
    @Autowired
    private JobService jService;

    @GetMapping({"/","index.html","index","home.html","home"})
    public String Index(Model model){
        List<Job> jobs = jService.findAll();
        model.addAttribute("jobs", jobs);
        System.out.println(jobs);
        return "index";
    }
}
