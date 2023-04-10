package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	//http://localhost/test1
	@GetMapping(value = "test1")
	public String m1() {
		System.out.println("--------m1()");
		return "m1() 출력";
	}
}
