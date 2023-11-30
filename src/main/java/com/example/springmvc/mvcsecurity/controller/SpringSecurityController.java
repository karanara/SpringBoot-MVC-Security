package com.example.springmvc.mvcsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SpringSecurityController {

    @GetMapping("/home")
    public String showHome() {

        return "home";
    }
    
    @GetMapping("/leaders")
    public String getLeaders() {

        return "leaders";
    }
    
    @GetMapping("/systems")
    public String getSystems() {

        return "systems";
    }
}