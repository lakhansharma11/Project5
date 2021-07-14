package com.AutomationProject.Project5.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/SBA")

public class ApplicationController {
	
	@GetMapping("/SBA1")
	public String hello()
	{
		return "Welcome to java spring boot appication";
	}

}
