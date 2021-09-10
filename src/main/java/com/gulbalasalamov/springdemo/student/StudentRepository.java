package com.gulbalasalamov.springdemo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * The interface responsible for accessing database - Database layer
 */

/**
 * Type the resository to work on, and id
 */
@Repository
public interface StudentRepository
        extends JpaRepository<Student,Long> {
}
