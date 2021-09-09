package com.gulbalasalamov.springdemo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

/**
 * API layer: The class that have all resources for API
 */

@RestController // to make this class serve as REST serve point and also specify type of component
@RequestMapping(path = "api/v1/student")
public class StudentController {

    private final StudentService studentService;

    @Autowired //This student service should be automatically instantiated and injected to the constructor
    //But to do this, StudentService class must be a bean. So we have to add @Component annotation
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping //	//Annotate it to get something out of from server. This is rest point
    public List<Student> getStudents() {
        return studentService.getStudents();
    }
}