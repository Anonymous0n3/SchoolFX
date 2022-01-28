package com.example.schoolfx.controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class AddClassController implements Initializable {
    @FXML
    private TextField className;

    @FXML
    private TextField firstStudent;

    @FXML
    private Button addClass;

    @FXML
    private Button menu;

    @FXML
    private Label info;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }


}
