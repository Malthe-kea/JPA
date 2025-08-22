package com.example.demo.controller;

import com.example.demo.model.Student;
import com.example.demo.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class StudentRestController {
    @Autowired
    StudentRepository studentRepository;
    @GetMapping("/students")
    public List<Student> students() {
        var obj = studentRepository.findAll();
        return obj;
    }
}

