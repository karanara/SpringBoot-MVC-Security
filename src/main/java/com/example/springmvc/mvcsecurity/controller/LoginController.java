package com.example.springmvc.mvcsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

	@GetMapping("/showCustomLoginForm")
	public String showCustomLoginForm() {
		return "login-form.html";
	}
}
