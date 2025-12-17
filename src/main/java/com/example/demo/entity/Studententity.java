package com.example.demo.entity;
public class Studententity{
    private Long id;
    private String name;
    private int age;
    private String email;
    public Studententity(){

    }
    public Studententity(Long id,String name,int age,String email){
        this.id=id;
        this.name=name;
        this.age=age;
        this.email=email;
    }
    public Long getId(){
        return id;
    }
    public void setID(Long id)
}