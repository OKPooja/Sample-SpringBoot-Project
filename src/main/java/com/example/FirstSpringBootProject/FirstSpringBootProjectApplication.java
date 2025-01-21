package com.example.FirstSpringBootProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FirstSpringBootProjectApplication {
	public static void main(String[] args) {
		//Dependency injection
		ApplicationContext context = SpringApplication.run(FirstSpringBootProjectApplication.class, args);
		Dev dev = context.getBean(Dev.class);
		dev.build();
	}
}
