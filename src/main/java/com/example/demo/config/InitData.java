package com.example.demo.config;

import com.example.demo.model.Student;
import com.example.demo.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalTime;


@Component
public class InitData implements CommandLineRunner {

    @Autowired
    StudentRepository studentRepository;
    @Override
    public void run(String... args) throws Exception {
        Student s1 = new Student();
        s1.setName("John Doe");
        s1.setTimeOfBirth(LocalTime.of(10, 30));
        s1.setDateOfBirth(LocalDate.of(2000, 1, 1));
        studentRepository.save(s1);
        studentRepository.save(s1);
        studentRepository.save(s1);
        studentRepository.save(s1);
    }
}
