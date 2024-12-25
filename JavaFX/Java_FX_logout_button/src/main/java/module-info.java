module com.example.java_fx_logout_button {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.java_fx_logout_button to javafx.fxml;
    exports com.example.java_fx_logout_button;
}