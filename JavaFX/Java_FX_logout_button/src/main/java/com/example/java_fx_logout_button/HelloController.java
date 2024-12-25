package com.example.java_fx_logout_button;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class HelloController {
    @FXML
    private Button LogOutButton;

    @FXML
    private AnchorPane scenepane;

    Stage stage;

    public void logout(ActionEvent e){

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);

        alert.setTitle("Logout");
        alert.setHeaderText("You are about to logout!");
        alert.setContentText("Do you want to save before exiting?: ");

        if(alert.showAndWait().get()== ButtonType.OK){
            stage = (Stage) scenepane.getScene().getWindow();
            System.out.println("You successfully logged out!");
            stage.close();
        }

    }
}