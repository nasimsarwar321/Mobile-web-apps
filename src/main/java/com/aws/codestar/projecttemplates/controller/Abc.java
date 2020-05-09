package com.aws.codestar.projecttemplates.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Abc {
	
	
	@GetMapping(path = "/abc", produces = "application/json")
	public String helloWorldGetNasim() {
		return "Welcome to Mobile - Web - Application";
	}

}
