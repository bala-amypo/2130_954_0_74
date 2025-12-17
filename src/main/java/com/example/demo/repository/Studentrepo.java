package com.example.demo.repository;
import org.springframework.data.jpa.repository.jparepository;
import org.springframework.stereotype.repository;
import com.example.demo.entity.Student;
@repository
public interface Studentrepo extends Jparepository<Student.Long>{
    
}