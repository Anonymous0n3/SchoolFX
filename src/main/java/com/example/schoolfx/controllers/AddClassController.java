package com.example.schoolfx.controllers;

import com.example.schoolfx.logic.Class;
import com.example.schoolfx.logic.ValuesNeedeForAll;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class AddClassController implements Initializable {
    @FXML
    private TextField className;

    @FXML
    private Button addClass;

    @FXML
    private Button menu;

    @FXML
    private Label info;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void switchToMainMenu (ActionEvent event){
        Node source = (Node)  event.getSource();
        Stage stage  = (Stage) source.getScene().getWindow();
        stage.close();
    }

    public void checkInput(){
        if(className.getText().isEmpty()){
            addClass.setDisable(true);
        }else{
            addClass.setDisable(false);
        }
    }

    public void addClass(){
        boolean classIn = false;
        for(Class classOne : ValuesNeedeForAll.classes){
            if (classOne.getName().equals(className.getText())){
                classIn = true;
            }
        }

        if (classIn){
            info.setText("Class already exists");
        } else {
            Class classObj = new Class(className.getText());
            ValuesNeedeForAll.classes.add(classObj);
            info.setText("Class added successfully");
        }

    }
}
