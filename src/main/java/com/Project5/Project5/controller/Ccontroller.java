package com.Project5.Project5.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ccontroller {
	
	@RequestMapping("/")
	public String c () {
		return "hello world!";
	}

	
}
