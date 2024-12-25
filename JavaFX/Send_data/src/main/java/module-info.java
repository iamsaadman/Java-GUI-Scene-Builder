module com.example.send_data {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.send_data to javafx.fxml;
    exports com.example.send_data;
}