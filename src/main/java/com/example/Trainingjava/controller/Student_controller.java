package com.example.Trainingjava.controller;

import com.example.Trainingjava.model.Student;
import com.example.Trainingjava.service.Student_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Student")
public class Student_controller {

    @Autowired
    Student_service studentService;
    @PostMapping("/add")
    public  Student add(@RequestBody Student student ){
        return studentService.add(student);
    }



}
