package com.example.demo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class Demo2Application extends SpringBootServletInitializer {
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		// TODO Auto-generated method stub
		return builder.sources(Demo2Application.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(Demo2Application.class, args);
	}
	
	@RequestMapping(value="/hello")
	public String hello() {
		System.out.println("Hello Demo");
	return "Hello Heman World Again";
	}

}
