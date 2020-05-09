package com.mobilewebapps.ui.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class UserController {
	
	@GetMapping(path="/hello", produces = "application/json")
    public String helloWorldGetNasim() {
        return "Hello Nasim Sarwar"; 
    }
 

}
