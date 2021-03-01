package com.ashley.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/* @RestController - a stereotype annotation that provides 
 * hints for people reading the code and for Spring 
 * that the class plays a specific role. In this case,
 *  our class is a web @Controller, so Spring considers
 *   it when handling incoming web requests.*/

@RestController
public class MainController {
/* @RequestMapping - annotation provides “routing” information.
 *  It tells Spring that any HTTP request with the " /" path 
 *  should be mapped to the home() method. The @RestController
 *   annotation tells Spring to render the resulting string 
 *   directly back to the caller. In our case, the home 
 *   method is called and  a string is returned.*/
	
	@RequestMapping("/")
	public String home() {
		return "Hello World!";
	}
	/*public static void main(String[] args) {
		
	}*/
}
