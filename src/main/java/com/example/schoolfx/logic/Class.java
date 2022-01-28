package com.example.schoolfx.logic;

import java.util.ArrayList;

public class Class {
    private String name;
    private ArrayList<Student> students;

    public Class(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
}
