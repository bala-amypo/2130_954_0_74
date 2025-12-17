package com.example.demo.service;
import java.util.List;
import com.example.demo.entity.Studententity;
public interface Studentservice{
    Studententity addStudent(Studententity Student);
    List<Studententity>getAllStudent();
    Studententity getStudentById(Long id);
    Studententity updateStudent(Long id,Studententity Student);
}