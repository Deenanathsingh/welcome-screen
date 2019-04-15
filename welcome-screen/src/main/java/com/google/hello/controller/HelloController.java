package com.google.hello.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/{name}")
	public String sayHello(@PathVariable("name")  String name) {
		return "Hello "+name;
	}
	
	@RequestMapping("/")
	public String defaulty() {
		return "main";
	}

}
