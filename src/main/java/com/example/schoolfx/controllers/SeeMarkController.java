package com.example.schoolfx.controllers;

import com.example.schoolfx.Application;
import com.example.schoolfx.logic.enums.Subjects;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class SeeMarkController implements Initializable {

    @FXML
    private ComboBox<String> className;

    @FXML
    private ComboBox<String> studentName;

    @FXML
    private ComboBox<Subjects> subjectName;

    @FXML
    private TextField finalNum;

    @FXML
    private Button doMath;

    @FXML
    private Button menu;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }
}
