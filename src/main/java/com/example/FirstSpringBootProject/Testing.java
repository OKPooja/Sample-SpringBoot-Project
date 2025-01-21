package com.example.FirstSpringBootProject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Testing {
	@RequestMapping("/test")
	public String Greet() {
		return "Hello, it is working!!";
	}
}
