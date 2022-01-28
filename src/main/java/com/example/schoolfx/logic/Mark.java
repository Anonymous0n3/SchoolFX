package com.example.schoolfx.logic;

import com.example.schoolfx.logic.enums.MarkWeight;
import com.example.schoolfx.logic.enums.Subjects;

public class Mark {
    private int value;
    private Subjects subject;
    private MarkWeight weight;

    public Mark(int value, Subjects subject, MarkWeight weight) {
        this.value = value;
        this.subject = subject;
        this.weight = weight;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Subjects getSubject() {
        return subject;
    }

    public void setSubject(Subjects subject) {
        this.subject = subject;
    }

    public MarkWeight getWeight() {
        return weight;
    }

    public void setWeight(MarkWeight weight) {
        this.weight = weight;
    }
}
