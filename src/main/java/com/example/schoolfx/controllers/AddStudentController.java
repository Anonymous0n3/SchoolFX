package com.example.schoolfx.controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
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

    }
}
