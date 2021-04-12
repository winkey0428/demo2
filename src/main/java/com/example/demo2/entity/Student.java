package com.example.demo2.entity;

import java.util.Date;

public class Student {

    private int id;
    private String name;
    private Date birth;

    public Student(int id, String name, Date birth) {
        this.id = id;
        this.name = name;
        this.birth = new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
