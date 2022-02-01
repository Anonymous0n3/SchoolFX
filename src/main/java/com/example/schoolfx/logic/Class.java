package com.example.schoolfx.logic;

import java.io.Serializable;
import java.util.ArrayList;

public class Class implements Serializable {
    private String name;
    private ArrayList<Student> students = new ArrayList<Student>();

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
