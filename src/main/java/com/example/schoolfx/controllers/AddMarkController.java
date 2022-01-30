package com.example.schoolfx.controllers;

import com.example.schoolfx.logic.Class;
import com.example.schoolfx.logic.Student;
import com.example.schoolfx.logic.ValuesNeedeForAll;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class AddMarkController implements Initializable {
    @FXML
    private TextField mark;

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
        for (Class className: ValuesNeedeForAll.classes) {
            classID.getItems().add(className.getName());
        }

    }

    public void switchToMainMenu (ActionEvent event){
        Node source = (Node)  event.getSource();
        Stage stage  = (Stage) source.getScene().getWindow();
        stage.close();
    }

    public void setStudentList(){
        student.getItems().clear();
        for (Class classOne : ValuesNeedeForAll.classes){
            if (classOne.getName().equals(classID.getValue())){
                for (Student studentName : classOne.getStudents()){
                    student.getItems().add(studentName.getName());
                }
            }
        }
    }

    public void addMark(){
        for (Class classOne : ValuesNeedeForAll.classes){
            if (classOne.getName().equals(classID.getValue())){
                for (Student studentName : classOne.getStudents()){
                    if (studentName.getName().equals(student.getValue())){
                        ValuesNeedeForAll.classes.remove(classOne);
                        ArrayList<Student> studentsList = classOne.getStudents();

                        studentsList.remove(studentName);

                        int value = Integer.parseInt(mark.getText().trim());
                        studentName.addMark(value);

                        studentsList.add(studentName);

                        classOne.setStudents(studentsList);

                        ValuesNeedeForAll.classes.add(classOne);
                    }
                }
            }
        }
    }

    public void checkNum (){
        try{int checkNumNum = Integer.parseInt(mark.getText());
            addMark.setDisable(false);
        } catch (NumberFormatException e){
            addMark.setDisable(true);

        }

    }


}