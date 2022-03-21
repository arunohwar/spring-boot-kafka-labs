package com.springboot.basics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AppController2 {
	
	@GetMapping("/employees")
	public String greeting() {
		
		
		
		return  "hello" ;
	}

}
