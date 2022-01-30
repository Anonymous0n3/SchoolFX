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

public class SeeMarkController implements Initializable {

    @FXML
    private ComboBox<String> className;

    @FXML
    private ComboBox<String> studentName;

    @FXML
    private TextField finalNum;

    @FXML
    private Button doMath;

    @FXML
    private Button menu;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        for (Class classID : ValuesNeedeForAll.classes) {
            className.getItems().add(classID.getName());
        }
    }

    public void switchToMainMenu(ActionEvent event) {
        Node source = (Node) event.getSource();
        Stage stage = (Stage) source.getScene().getWindow();
        stage.close();
    }

    public void setStudentList() {
        studentName.getItems().clear();
        for (Class classOne : ValuesNeedeForAll.classes) {
            if (classOne.getName().equals(className.getValue())) {
                for (Student student : classOne.getStudents()) {
                    studentName.getItems().add(student.getName());
                }
            }
        }
    }

    public void doMath() {
        boolean classNotFound = true;
        for (Class classID : ValuesNeedeForAll.classes) {
            if (classID.getName().equals(className.getValue())) {
                classNotFound = false;
                boolean studentNotFound = true;
                for (Student student : classID.getStudents()) {
                    if (student.getName().equals(studentName.getValue())) {
                        studentNotFound = false;
                        double totalNum = student.totalNumOfMarks();
                        finalNum.setText("" + totalNum);

                    }
                }
                if (studentNotFound) {
                    int studentNum = 0;
                    double totalNum = 0;
                    for (Student student : classID.getStudents()) {
                        studentNum++;
                        totalNum = totalNum + student.totalNumOfMarks();
                    }

                    totalNum = totalNum / studentNum;
                    finalNum.setText("" + totalNum);
                }
            }

            if (classNotFound) {
                int studentNum = 0;
                double totalNum = 0;
                for (Class classID1 : ValuesNeedeForAll.classes) {
                    for (Student student : classID1.getStudents()) {
                        studentNum++;
                        totalNum = totalNum + student.totalNumOfMarks();
                    }
                }
                totalNum = totalNum / studentNum;
                finalNum.setText("" + totalNum);
            }
        }
    }
}
