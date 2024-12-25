module com.example.javafx_switchscene {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafx_switchscene to javafx.fxml;
    exports com.example.javafx_switchscene;
}