package com.example.send_data;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class `  `Scene1Controller {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}