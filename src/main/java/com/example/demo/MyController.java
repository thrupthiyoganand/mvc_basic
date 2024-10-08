package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
	
		@GetMapping("/")
		public String loadHome(ModelMap map) {
			map.put("k", "123");
			return "home.html";
		}

		
		@GetMapping("/hello")
		public String loadHello() {
			return "hello.html";
		}
		
		@GetMapping("/demo")
		public String hello() {
			return "hello.html";
		}
		

}
