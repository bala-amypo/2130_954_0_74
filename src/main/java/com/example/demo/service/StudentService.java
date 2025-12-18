package com.example.demo.service;

import java.util.List;
import com.example.demo.entity.StudentEntity;

public interface StudentService {

    StudentEntity addStudent(StudentEntity student);

    List<StudentEntity> getAllStudent();

    StudentEntity getStudentById(Long id);

    StudentEntity updateStudent(Long id, StudentEntity student);
}