package com.AutomationProject.Project5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class Project5Application extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(Project5Application.class, args);
		System.out.println("Service Started");
	}

}
