package com.gulbalasalamov.springdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController // to make this class serve as REST serve point
public class SpringDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDemoApplication.class, args);
	}

//	@GetMapping
//	public String hello(){
//		return "HelloWorld";
//	}

	@GetMapping //	//Annotate it to get something out of from server. This is rest point
	public List<String> hello2(){
		return List.of("Hello", "World","Gulbala","Salamov");
	}

}
