package com.springbootpro.SpringBootProject.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class Hello {
	
	
	@GetMapping("/hii")
	public String hello()
	{
		return "Hello springBoot";
	}
	
	@GetMapping("/bye")
	public String Bye()
	{
		return "Bye from springBoot";
	}

}
