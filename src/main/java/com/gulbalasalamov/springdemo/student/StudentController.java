package com.gulbalasalamov.springdemo.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

/**
 * API layer: The class that have all resources for API
 */

@RestController // to make this class serve as REST serve point
@RequestMapping(path = "api/v1/student")
public class StudentController {

    @GetMapping //	//Annotate it to get something out of from server. This is rest point
    public List<Student> getStudents() {
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
