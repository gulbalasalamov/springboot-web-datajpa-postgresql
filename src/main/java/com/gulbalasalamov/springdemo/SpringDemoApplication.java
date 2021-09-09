package com.gulbalasalamov.springdemo;

import com.gulbalasalamov.springdemo.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
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
    public List<Student> hello2() {
        return List.of(
                new Student(
                        1L,
                        "Gulbala",
                        "gulbala@gmail.com",
                        LocalDate.of(1990, Month.NOVEMBER, 20),
                        30
                ),
				new Student(
						2L,
						"Ahmet",
						"ahmet@gmail.com",
						LocalDate.of(1989,Month.SEPTEMBER,9),
						31
				)
        );
    }

}
