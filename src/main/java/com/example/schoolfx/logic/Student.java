package com.example.schoolfx.logic;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> marks = new ArrayList<Integer>();

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Integer> getMarks() {
        return marks;
    }

    public void setMarks(ArrayList<Integer> marks) {
        this.marks = marks;
    }

    public void addMark(int value){
        marks.add(value);

    }

    public double totalNumOfMarks(){
        double totalNum = 0;
        for (int i:marks) {
            totalNum = totalNum + i;
        }
        return totalNum/marks.size();
    }
}
