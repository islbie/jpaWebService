package com.ace.jpaWebService.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebRestController {
	
	@GetMapping
	public String hello() {
		
		
		return "hello world";

	}
}
