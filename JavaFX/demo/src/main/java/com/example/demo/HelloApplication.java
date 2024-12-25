package com.example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    public ImageView logo;
    @Override
    public void start(Stage stage) throws IOException {
       FXMLLoader loader = new FXMLLoader(getClass().getResource("HelloApplication.fxml"));
        logo = new ImageView();
        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage.setTitle("Hi Motherfuck!");
        stage.setHeight(800);
        stage.setWidth(800);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}