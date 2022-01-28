package com.example.schoolfx.controllers;

import com.example.schoolfx.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    @FXML
    private Button addMark;

    @FXML
    private Button addStudent;

    @FXML
    private Button addClass;

    @FXML
    private Button seeMark;

    @FXML
    private Button changeMark;

    @FXML
    private Button changeStudent;

    @FXML
    private Button changeClass;

    @FXML
    private Button end;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    @FXML
    public void switchToAddClass(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("AddClass.fxml"));
        Parent parent = fxmlLoader.load();

        Scene scene = new Scene(parent);
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setScene(scene);
        stage.showAndWait();
    }

}
