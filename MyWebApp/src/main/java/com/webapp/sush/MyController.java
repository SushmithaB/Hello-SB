package com.webapp.sush;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller	
public class MyController {	

@RequestMapping("home")
	public String home() {
		System.out.println("Welcome to home!");
		return "index";
	}

}
