package com.example.Trainingjava.repository;

import com.example.Trainingjava.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Student_repository extends JpaRepository<Student,Integer> {

}
