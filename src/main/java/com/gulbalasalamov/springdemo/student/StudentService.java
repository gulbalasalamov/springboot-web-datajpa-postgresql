package com.gulbalasalamov.springdemo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

/**
 * Service layer - Class to serve as business logic for managing students
 */
@Service // type of component
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired // Dependency injection
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudents() {
        return studentRepository.findAll(); // returns list
    }
}
