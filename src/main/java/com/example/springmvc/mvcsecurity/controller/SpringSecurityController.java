package com.example.springmvc.mvcsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SpringSecurityController {

    @GetMapping("/home")
    public String showHome() {

        return "home";
    }
}