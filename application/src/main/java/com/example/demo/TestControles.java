package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestControles {
	
	@RequestMapping("welcome/{message}")
	
	public String welcome(@PathVariable String message) {
		
		/*return "welcome to IBM india";*/
		return message;
	}

}
