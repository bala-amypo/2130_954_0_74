package com.example.demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.StudentEntity;
import com.example.demo.repository.StudentRepo;
import com.example.demo.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepo repo;

    public StudentServiceImpl(StudentRepo repo) {
        this.repo = repo;
    }

    @Override
    public StudentEntity addStudent(StudentEntity student) {
        return repo.save(student);
    }

    @Override
    public List<StudentEntity> getAllStudent() {
        return repo.findAll();
    }

    @Override
    public StudentEntity getStudentById(Long id) {
        return repo.findById(id)
                   .orElseThrow(() -> new RuntimeException("Student not found"));
    }

    @Override
    public StudentEntity updateStudent(Long id, StudentEntity student) {
        StudentEntity existing = getStudentById(id);

        existing.setName(student.getName());
        existing.setAge(student.getAge());
        existing.setEmail(student.getEmail());

        return repo.save(existing);
    }
}
