package com.example.assignment_0112230100;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.List;

public class ClientController {

    @FXML
    private TextField num1Field;

    @FXML
    private TextField num2Field;

    @FXML
    private ComboBox<String> operationComboBox;

    @FXML
    private Label resultLabel;

    @FXML
    private Label logLabel;

    @FXML
    public void calculate() {
        double number1 = Double.parseDouble(num1Field.getText());
        double number2 = Double.parseDouble(num2Field.getText());
        String operation = operationComboBox.getValue();

        try (Socket socket = new Socket("127.0.0.1", 8888);

             ObjectOutputStream output = new ObjectOutputStream(socket.getOutputStream());
             ObjectInputStream input = new ObjectInputStream(socket.getInputStream())) {
             Request request = new Request(number1, number2, operation);
             output.writeObject(request);

            Response response = (Response) input.readObject();
            resultLabel.setText("Result: " + response.getResult());

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void getAllLogs() {
        try (Socket socket = new Socket("127.0.0.1", 8888);
             ObjectOutputStream output = new ObjectOutputStream(socket.getOutputStream());
             ObjectInputStream input = new ObjectInputStream(socket.getInputStream())) {
            output.writeObject(new GetAllLogsRequest());

            List<String> logs = (List<String>) input.readObject();
            logLabel.setText("All Logs:\n");

            for (String log : logs) {
                logLabel.setText(logLabel.getText() + log + "\n");
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
