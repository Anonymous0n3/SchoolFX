package com.example.schoolfx;

import com.example.schoolfx.logic.IOLogic;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Application extends javafx.application.Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("Main.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Main Menu");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File myFile = new File("src\\main\\java\\com\\example\\schoolfx\\output\\file.ser");
        myFile.createNewFile();
        IOLogic.readFromFile();
        launch();
    }
}