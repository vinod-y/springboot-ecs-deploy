package com.mycompany.springboot_ecs_deploy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ecs")
public class ECSDemoController {
	
	
	@GetMapping("/getData")
	public String getData() {
		
		return "Hello there";
	}

}
