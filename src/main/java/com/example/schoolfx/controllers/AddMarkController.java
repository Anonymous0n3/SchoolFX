package com.example.schoolfx.controllers;

import com.example.schoolfx.logic.Class;
import com.example.schoolfx.logic.Student;
import com.example.schoolfx.logic.ValuesNeedeForAll;
import com.example.schoolfx.logic.enums.MarkWeight;
import com.example.schoolfx.logic.enums.Subjects;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class AddMarkController implements Initializable {
    @FXML
    private TextField mark;

    @FXML
    private ComboBox<Subjects> subject;

    @FXML
    private ComboBox<MarkWeight> weight;

    @FXML
    private ComboBox<String> classID;

    @FXML
    private ComboBox<String> student;

    @FXML
    private Label info;

    @FXML
    private Button menu;

    @FXML
    private Button addMark;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        subject.getItems().addAll(Subjects.values());
        weight.getItems().addAll(MarkWeight.values());
        for (Class className: ValuesNeedeForAll.classes) {
            classID.getItems().add(className.getName());
        }

    }
}