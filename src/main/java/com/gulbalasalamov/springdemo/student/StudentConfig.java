package com.gulbalasalamov.springdemo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.NOVEMBER;

@Configuration
/**
 * Configuration file having bean
 */
public class StudentConfig {

    @Bean
        //
    CommandLineRunner commandLineRunner(
            StudentRepository repository) { //having access to repository. StudentRepository injected
        return args -> {
            Student gulbala = new Student(
                    "Gulbala",
                    "gulbala@gmail.com",
                    LocalDate.of(1990, NOVEMBER, 20)

            );

            Student alex = new Student(
                    "Alex",
                    "alex@gmail.com",
                    LocalDate.of(2004, NOVEMBER, 5)

            );
            repository.saveAll(
                    List.of(gulbala, alex)
            );
        };
    }
}
