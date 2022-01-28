package com.example.schoolfx.logic;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Mark> marks;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Mark> getMarks() {
        return marks;
    }

    public void setMarks(ArrayList<Mark> marks) {
        this.marks = marks;
    }
}
