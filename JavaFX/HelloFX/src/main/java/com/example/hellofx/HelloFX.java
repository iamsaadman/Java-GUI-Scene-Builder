package com.example.hellofx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.ImageCursor;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloFX extends Application {


    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage primarystage) throws Exception {

        Stage stage = new Stage();

        Group root = new Group();
        Scene scene = new Scene(root, Color.BLACK);

//        Image icon = new Image("D://Java codes//JavaFX//HelloFX//src//main//java//icon.jpg");
//        stage.getIcons().add(icon);
        stage.setTitle("Stage Demo Program");
        stage.setScene(scene);
        stage.setWidth(420);
        stage.setHeight(420);
        stage.setResizable(false);
//        stage.setX(50);
//        stage.setY(50);

        stage.setFullScreen(true);
        stage.setFullScreenExitHint("You Can't Escape Unless you press q");
        stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));
        stage.show();
    }
}