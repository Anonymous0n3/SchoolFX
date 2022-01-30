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

public class AddStudentController implements Initializable {

    @FXML
    private ComboBox<String> classList;

    @FXML
    private TextField studentName;

    @FXML
    private Button addStudent;

    @FXML
    private Button menu;

    @FXML
    private Label info;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        for (Class className: ValuesNeedeForAll.classes) {
            classList.getItems().add(className.getName());
        }
    }

    public void switchToMainMenu (ActionEvent event){
        Node source = (Node)  event.getSource();
        Stage stage  = (Stage) source.getScene().getWindow();
        stage.close();
    }

    public void checkInput(){
        if(studentName.getText().isEmpty()){
            addStudent.setDisable(true);
        }else{
            addStudent.setDisable(false);
        }
    }

    public void addStudent(){
        for(Class classOne : ValuesNeedeForAll.classes) {
            if (classOne.getName().equals(classList.getValue())) {
                ArrayList<Student> students = classOne.getStudents();
                Student student = new Student(studentName.getText());
                students.add(student);
                classOne.setStudents(students);
                info.setText("Student added successfully");
            }
        }
    }
}
