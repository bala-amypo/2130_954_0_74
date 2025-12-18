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
    private Studentservice service; // so this the object for the services folder

    @PostMapping("/add") //to do what is the process for that we need to give the anotations

    public Studententity addStudent(@RequestBody Studententity student){
        //requestbody is need for the conversion 
        //  then the student is the object that is to store the value in that and the student collects the data as the tempervary variable
        return service.addStudent(student);
        //and this is the line were to insert the value to the student files so we have created tjis 
    }
    @PostMapping("/all")
    public List<Studententity>getAllStudent(){
    // to list all the value of getAllstudent is the function to get all the data from the 
        return service.getAllStudent();
    }
    @GetMapping("/id")
    public Studententity getStuentById(@PathVariable Long id){
        //so we have created the 5 path variable now need to send the http://student/user/5 so this will goes to the path to fetch the required variable
        
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