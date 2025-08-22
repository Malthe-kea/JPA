package com.example.demo.repositories;

import com.example.demo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Integer> {
    // Additional query methods can be defined here if needed

}
