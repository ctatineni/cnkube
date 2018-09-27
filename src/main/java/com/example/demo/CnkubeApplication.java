package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CnkubeApplication {

	public static void main(String[] args) {
		SpringApplication.run(CnkubeApplication.class, args);
	}
	
	@GetMapping("/")
	public String hello() {
		return "hello Spring Kube app";
	}
}
