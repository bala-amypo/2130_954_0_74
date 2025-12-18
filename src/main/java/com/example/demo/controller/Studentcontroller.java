package com.example.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Studententity;
import com.example.demo.service.Studentservice;

@RestController
@RequestMapping("/student") //the things that are in the "" double quoutes will comes in the API that is the swagger
public class Studentcontroller{
    @Autowired
    private Studentservice service; // so this the object for the services

    @PostMapping("/add") //to do what is the process for that we need to give the anotations

    public Studententity addStudent(@RequestBody Studententity student){
        return service.addStudent(student);
    }
    @PostMapping("/all")
    public List<Studententity>getAllStudent(){
        return service.getAllStudent();
    }
    @GetMapping("/id")
    public Studententity getStuentById(@PathVariable Long id){
        return service.getStuentId(id);
    }
    @PutMapping("/update/{id}")
    public Studententity updateStudent(
        @PathVariable Long id;
        @RequestBody Studententity student

    ){
        return service.updateStudent(id,student);
    }
}