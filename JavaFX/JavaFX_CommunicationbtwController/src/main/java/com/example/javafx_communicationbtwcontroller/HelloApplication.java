package com.example.javafx_communicationbtwcontroller;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Scene1.fxml"));
       Parent root = fxmlLoader.load();
       Scene scene = new Scene(root);
       stage.setScene(scene);
       stage.setWidth(500);
       stage.setHeight(700);
       stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
