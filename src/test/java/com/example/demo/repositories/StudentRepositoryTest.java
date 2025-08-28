package com.example.demo.repositories;

import com.example.demo.model.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentRepositoryTest {

    @Autowired
    StudentRepository studentRepository;

    @Test
    void testOneTim() {
        List<Student> studentList = studentRepository.findAllByName("Tim");
        assertEquals(1, studentList.size());
    }

    @Test
    void testOneViggo() {
        Student s1 = new Student();
        s1.setName("Viggo");
        s1.setDateOfBirth(LocalDate.of(2019,11,12));
        studentRepository.save(s1);
        List<Student> studentList = studentRepository.findAllByName("Viggo");
        assertEquals(1, studentList.size());
    }
}