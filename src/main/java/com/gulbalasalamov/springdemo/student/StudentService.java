package com.gulbalasalamov.springdemo.student;

import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

/**
 * Service layer - Class to serve as business logic for managing students
 */
public class StudentService {
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
