package com.example.demo.config;

import com.example.demo.model.Student;
import com.example.demo.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;


@Component
public class InitData implements CommandLineRunner {

    @Autowired
    StudentRepository studentRepository;
    @Override
    public void run(String... args) throws Exception {
        Student s1 = new Student();
        s1.setName("Tim");
        s1.setTimeOfBirth(LocalTime.of(10, 30));
        s1.setDateOfBirth(LocalDate.of(2000, 1, 1));
        studentRepository.save(s1);
//
//        Student s2 = new Student();
//        s2.setName("hej");
//        s2.setDateOfBirth(LocalDate.of(1999, 5, 15));
//        s2.setTimeOfBirth(LocalTime.of(14, 45));
//        studentRepository.save(s2);

//        Student s3 = new Student();
//        s3.setName("Michael Johnson");
//        s3.setDateOfBirth(LocalDate.of(2001, 3, 22));
//        s3.setTimeOfBirth(LocalTime.of(8, 10));
//        studentRepository.save(s3);
//
//        Student s4 = new Student();
//        s4.setName("Emily Davis");
//        s4.setDateOfBirth(LocalDate.of(2002, 7, 9));
//        s4.setTimeOfBirth(LocalTime.of(16, 55));
//        studentRepository.save(s4);
//
//        Student s5 = new Student();
//        s5.setName("Daniel Brown");
//        s5.setDateOfBirth(LocalDate.of(1998, 11, 30));
//        s5.setTimeOfBirth(LocalTime.of(6, 25));
//        studentRepository.save(s5);
//
//        Student s6 = new Student();
//        s6.setName("Sophia Wilson");
//        s6.setDateOfBirth(LocalDate.of(2000, 9, 18));
//        s6.setTimeOfBirth(LocalTime.of(12, 5));
//        studentRepository.save(s6);
//
//        Student s7 = new Student();
//        s7.setName("James Miller");
//        s7.setDateOfBirth(LocalDate.of(2001, 12, 3));
//        s7.setTimeOfBirth(LocalTime.of(19, 40));
//        studentRepository.save(s7);
//
//        Student s8 = new Student();
//        s8.setName("Olivia Taylor");
//        s8.setDateOfBirth(LocalDate.of(1999, 2, 20));
//        s8.setTimeOfBirth(LocalTime.of(9, 15));
//        studentRepository.save(s8);
//
//        Student s9 = new Student();
//        s9.setName("William Anderson");
//        s9.setDateOfBirth(LocalDate.of(2003, 4, 11));
//        s9.setTimeOfBirth(LocalTime.of(11, 50));
//        studentRepository.save(s9);
//
//        Student s10 = new Student();
//        s10.setName("Ava Martinez");
//        s10.setDateOfBirth(LocalDate.of(1997, 8, 27));
//        s10.setTimeOfBirth(LocalTime.of(20, 20));
//        studentRepository.save(s10);
    }
}
