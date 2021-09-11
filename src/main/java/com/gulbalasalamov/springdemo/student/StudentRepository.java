package com.gulbalasalamov.springdemo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * The interface responsible for accessing database - Database layer
 */

/**
 * Type the resository to work on, and id
 */
@Repository
public interface StudentRepository
        extends JpaRepository<Student,Long> {

    //sql query: SELECT * FROM student WHERE email = ?
    //jpql query: @Query("SELECT s FROM Student s WHERE s.email = ?1")
    Optional<Student> findStudentByEmail(String email);
}
