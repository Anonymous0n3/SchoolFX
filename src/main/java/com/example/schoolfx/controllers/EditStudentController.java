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
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class EditStudentController implements Initializable {

    @FXML
    private ComboBox<String> classID;

    @FXML
    private ComboBox<String> studentID;

    @FXML
    private TextField newName;

    @FXML
    private Button confirmEdit;

    public void switchToMainMenu (ActionEvent event){
        Node source = (Node)  event.getSource();
        Stage stage  = (Stage) source.getScene().getWindow();
        stage.close();
    }

    public void setStudentList(){
        studentID.getItems().clear();
        for (Class classOne : ValuesNeedeForAll.classes){
            if (classOne.getName().equals(classID.getValue())){
                for (Student studentName : classOne.getStudents()){
                    studentID.getItems().add(studentName.getName());
                }
            }
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        for (Class className: ValuesNeedeForAll.classes) {
            classID.getItems().add(className.getName());
        }
    }

    public void changeName(){
        for (Class classOne : ValuesNeedeForAll.classes){
            if (classOne.getName().equals(classID.getValue()))
                for (Student studentName : classOne.getStudents()){
                    if (studentName.getName().equals(studentID.getValue())){
                        studentName.setName(newName.getText());
                    }
                }
            }
        }

    public void checkInput(){
        if(newName.getText().isEmpty()){
            confirmEdit.setDisable(true);
        }else{
            confirmEdit.setDisable(false);
        }
    }

    }
