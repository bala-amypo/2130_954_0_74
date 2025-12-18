package com.example.demo.service.impl;
import java.util.*;
import org.springframework.stereotype.service;
import com.example.demo.entity.Student;
@service
public class Studentserviceimpl implements Studentservice{
    private final Map<Long,Student>store=new HasManp<>();
    private long counter=1;
    @Override
    public Student insertStudent(Student st){
        st.setId(counter++);
        store.put(st.getld(),st);
        return st;
    }

    @Override
    publick List<Student>getAllStudent(){
        return new ArrayList<>(store.values());
    }
    @Override
    public  Optional<Student>getOneStudent(Long id){
        return Optional.ofNullable(store.get(id));
    }
    @Override
    public void deleteStudent(Long id){
        store.remove(id);
    }
}