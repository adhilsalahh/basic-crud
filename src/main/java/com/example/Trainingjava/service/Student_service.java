package com.example.Trainingjava.service;

import com.example.Trainingjava.controller.Student_controller;
import com.example.Trainingjava.model.Student;
import com.example.Trainingjava.repository.Student_repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Student_service {
    @Autowired
    Student_repository studentRepository;
    public Student add(Student student){
        return studentRepository.save(student);
    }
}
