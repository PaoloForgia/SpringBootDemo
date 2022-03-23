package com.springboot.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@GetMapping("/")
	public String index() {
		return "Index page";
	}

	@GetMapping("/helloWorld")
	public String helloWorld() {
		return "Hello World";
	}
}
